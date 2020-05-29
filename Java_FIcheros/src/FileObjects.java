import java.io.Serializable;        // Hem realitzat únicament els import que fem servir
import java.io.File;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;
import java.util.Scanner;

// Classe que gravarem al disc.  (només afegir: implements Serializable)
class Persona implements Serializable {
    private String nom;
    private int edat;
    private char sexe;      // 'H'-Home  o 'D'-Dona
    private long dni;       // Número sense la lletra

    public long getDni() {  // Faltarien procediments de propietat i altres mètodes
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public Persona(String nom, int edat, char sexe, long dni) {
        this.nom = nom;
        this.edat = edat;
        this.sexe = sexe;
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Persona{" + "nom=" + nom + ", edat=" + edat + ", sexe=" +
                (sexe == 'H' ? "Home" : "Dona") + ", dni=" + dni + '}';
    }
}

public class FileObjects {
    // numPersones, indica quantes persones a l'organització (a l'exemple només 5)
    private static int numPersones = 5;
    // Creem un vector d'objectes de la classe Persona (amb 2 objectes més buits = null)
    private static Persona[] vPersona = new Persona[7];    // Posarem 5 persones només
    // Fitxer que emmagatzema el vector de persones com un únic objecte
    private static String fitxerPersonal = "C:/Java/Fitxers/Personal.bin";
    // Fitxer que emmagatzema el vector de persones com objectes Persona individuals
    private static String fitxerIndividuals = "C:\\Java\\Fitxers\\Persones.bin";

    // Funció que espera una resposta S o N de part de l'usuari, escriu la pregunta i
    // no acaba fins que l'usuari respón de forma adequada  (Si, S, N, No, etc...)
    private static boolean siNo(String pregunta) {
        Scanner entrada = new Scanner(System.in);
        char car;
        do {
            System.out.print(pregunta + " [S/N] ? ");
            car = entrada.next().toUpperCase().charAt(0);
            if (car != 'N' && car != 'S')
                System.out.println("S'esperava una resposta S/N ...");
        }
        while (car != 'N' && car != 'S');
        return car == 'S';
    }

    private static boolean escriuVectorPersonesDeCop(String nomFitxer, Persona[] vp) {
        // Escriu al fitxer un vector sencer de persones (un objecte). Sobreescriu el fitxer
        try {
            // Si el fitxer existeix, pregunta si el volem reescriure
            File fitxer = new File(nomFitxer);
            if (fitxer.exists())
                if (!siNo("El fitxer ja existeix.  Vol reescriure'l?"))
                    return false;    // No s'ha escrit el fitxer
        } catch (Exception e) {
            System.out.println("Error accedint al sistema de fitxers");
            System.out.println(e.getMessage());
            return false;           // No s'ha escrit el fitxer
        }
        // Si estem aquí, el fitxer no existeix o be el volem reescriure
        try (FileOutputStream fo = new FileOutputStream(nomFitxer, false);
             ObjectOutputStream obo = new ObjectOutputStream(fo)) {
            // Escrivim totes les persones del vector com un únic objecte (vector)
            obo.writeObject(vp);
            return true;        // Indiquem que el procés s'ha completat correctament
        } catch (Exception e) {
            System.out.println("Error en escriure el vector de persones al fitxer");
            System.out.println(e.getMessage());
            return false;       // Indiquem que el procés no s'ha completat correctament
        }
    }

    private static Persona[] llegeixVectorPersones(String nomFitxer) {
        // Llegeix totes les persones del fitxer com un únic objecte (un vector)
        try (FileInputStream fi = new FileInputStream(nomFitxer);
             ObjectInputStream obi = new ObjectInputStream(fi)) {
            // Llegim totes les persones de cop, i les retornem directament
            // El vector llegit es crearà de la mateixa longitud que es va
            // escriure, amb 2 elements null al final (7 persones de capacitat).
            return (Persona[]) obi.readObject();
        } catch (FileNotFoundException e) {
            System.out.println("Fitxer no trobat: " + nomFitxer);
        } catch (EOFException e) {
            System.out.println("Hem arribat al final del fitxer");
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("Format de fitxer incompatible");
        } catch (Exception e) {
            System.out.println("Error accedint al fitxer: " + nomFitxer);
            System.out.println(e.getMessage());
        }
        return null;
    }

    private static boolean escriuVectorPersonesIndividuament(String nomFitxer, Persona[] vp) {
        // Escriu al fitxer un vector sencer de persones, però una a una. Sobreescriu aquest
        try {
            File fitxer = new File(nomFitxer);
            if (fitxer.exists())
                if (!siNo("El fitxer ja existeix.  Vol reescriure'l?"))
                    return false;   // No s'ha escrit el fitxer
        } catch (Exception e) {
            System.out.println("Error accedint al sistema de fitxers");
            System.out.println(e.getMessage());
            return false;           // No s'ha escrit el fitxer
        }
        // Si estem aquí, el fitxer no existeix o el volem reescriure
        try (FileOutputStream fo = new FileOutputStream(nomFitxer, false);
             ObjectOutputStream obo = new ObjectOutputStream(fo)) {
            // Escrivim les persones del vector una a una al fitxer, però no els null
            // Només escrivim les 5 persones reals que hi ha al vector
            for (int n = 0; n < numPersones; n++)
                obo.writeObject(vp[n]);
            return true;
        } catch (Exception e) {
            System.out.println("Error en escriure les persones al fitxer");
            System.out.println(e.getMessage());
            return false;
        }
    }

    // Funció per llegir el vector de persones una a una del fitxer
    private static Persona[] llegeixPersonesUnaAUna(String nomFitxer) {
        Persona[] vPerson = new Persona[8];    // Declarem del màxim esperat (abans 7)
        // Llegeix les persones del vector individualment.  No s'han escrit els null
        try (FileInputStream fi = new FileInputStream(nomFitxer);
             ObjectInputStream obi = new ObjectInputStream(fi)) {
            numPersones = 0;    // Indicarà el número de persones que hem llegit del fitxer
            // Es provocarà una excepció, només hi ha 5 persones al fitxer, mirem de llegir 8
            while (numPersones < 8) {
                // Llegim cada persona individualment e incrementem el nombre de llegits
                vPerson[numPersones] = (Persona) obi.readObject();
                numPersones++;      // Incrementem el nombre de persones llegides
            }
            return vPerson;     // La funció retornaria el vector llegit (no ho farà aquí)
        } catch (FileNotFoundException e) {
            System.out.println("Fitxer no trobat: " + nomFitxer);
        } catch (EOFException e) {
            // El fitxer no té tots els elements esperats (en té 5 únicament)
            System.out.println("Final del fitxer, contenia " + numPersones + " persones");
            // Aquí retornem el vector que hem declarat de 8 persones, amb únicament 5 elements
            return vPerson;
        } catch (ClassNotFoundException e) {
            System.out.println("Format de fitxer incompatible");
        } catch (Exception e) {
            System.out.println("Error accedint al fitxer: " + nomFitxer);
            System.out.println(e.getMessage());
        }
        return null;
    }

    private static void ompleVector(Persona[] vOmplir) {
        // Cridem al constructor per a les 5 persones de l'organització
        vOmplir[0] = new Persona("Felipe", 28, 'H', 11111111);
        vOmplir[1] = new Persona("Julian", 32, 'H', 22222222);
        vOmplir[2] = new Persona("Ana", 35, 'D', 33333333);
        vOmplir[3] = new Persona("Angela", 56, 'D', 44444444);
        vOmplir[4] = new Persona("Maria", 23, 'D', 55555555);
    }

    public static void main(String[] args) {
        // Omplim el vector de persones per treballar-ho
        ompleVector(vPersona);  // Només 5 persones, el vector té longitud 7 (2 null)
        // Creem el vector on llegirem les persones (Podria ser el mateix)
        Persona[] vLlegit;     // Vector de persones que llegirem (es farà de longitud 7)
        // Escrivim al disc tot el vector de persones de cop
        if (escriuVectorPersonesDeCop(fitxerPersonal, vPersona)) {
            // Si l'escriptura del vector s'ha realitzat correctament, ho indica i el llegeix
            System.out.println("Escrites un total de " + numPersones + " persones al vector");
            System.out.println("El vector té tanamateix longitud 7, escrivim també els 2 null");
            // Llegim del disc tot el vector de persones de cop, quedarà amb longitud 7
            vLlegit = llegeixVectorPersones(fitxerPersonal);
            // Escrivim les persones del vector, fixeu-vos que hi ha 2 null
            numPersones = 0;        // Per comptar les persones que hem llegit del vector
            for (int n = 0; n < vLlegit.length; n++) {
                System.out.println(vLlegit[n]);
                if (vLlegit[n] == null && numPersones == 0)
                    numPersones = n;
            }
            System.out.println("Llegides un total de " + numPersones + " persones del disc");
        }
        // El mateix, però escrivint les persones una a una al fitxer 
        if (escriuVectorPersonesIndividuament(fitxerIndividuals, vPersona)) {
            // Si s'han escrit les persones al vector correctament, ho indiquem
            System.out.println("Escrites un total de " + numPersones + " persones al vector");
            System.out.println("El vector tenia longitud de 8, no hem escrit els 3 null");
            // Aquí, el vector té longitud 8 (persones màximes que esperem llegir del fitxer)
            vLlegit = llegeixPersonesUnaAUna(fitxerIndividuals);
            // Escrivim les persones del vector, fixeu-vos que hi ha 3 null al final
            numPersones = 0;        // Per comptar les persones que hem llegit del vector
            for (int n = 0; n < vLlegit.length; n++) {
                System.out.println(vLlegit[n]);
                if (vLlegit[n] == null && numPersones == 0)
                    numPersones = n;
            }
        }
    }
}