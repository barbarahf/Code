//import java.util.Scanner;
//
///**
// * Exemple de classe Jugador
// * @author J.C.
// */
//
//public class Jugador {
//
//    // Propietats del jugador (atributs)
//    private String nom;
//    private int dorsal;
//    private String posicion;
//    private int edad;
//    private boolean titular;
//    private Fecha fechaContrato;
//
//    // Constructor
//    public Jugador(String nom, int dorsal, String posicion, int edad, boolean titular, Fecha fechaContrato) {
//        this.nom = nom;
//        this.dorsal = dorsal;
//        this.posicion = posicion;
//        this.edad = edad;
//        this.titular = titular;
//        this.fechaContrato = fechaContrato;
//    }
//
//    // Getters/Setters
//    public boolean isTitular() {
//        return titular;
//    }
//
//    public int getEdad() {
//        return edad;
//    }
//
//    public int getDorsal() {
//        return dorsal;
//    }
//
//    public String getNom() {
//        return nom;
//    }
//
//    public Fecha getFechaContrato() {
//        return fechaContrato;
//    }
//
//    // Mètode toString
//    /*
//    @Override
//    public String toString() {
//        return "Jugador{" + "nom=" + nom + ", dorsal=" + dorsal + ", posicion=" + posicion + ", edad=" + edad + ", titular=" + titular + '}';
//    }
//    */
//
//    @Override
//    public String toString() {
//        String retornat="Nom: " + nom + ", Dorsal: " + dorsal + ", Posició: " + posicion + ", Edat: "+ edad;
//        /*
//        +"Contratado en fecha: ["+fechaContrato;
//        */
//        if (titular)
//            return retornat+"]. És titular";
//        else
//            return retornat+"]. NO és titular";
//    }
//
//    // Constructor sense paràmetres
//    public Jugador() {
//        Scanner entrada = new Scanner(System.in);
//        // Comencem a demanar pels Strings
//        System.out.print("Donam el nom del jugador: ");
//        nom = entrada.nextLine();
//        System.out.print("Donam la posició del jugador: ");
//        posicion = entrada.next();
//        System.out.print("Donam el dorsal del jugador: ");
//        dorsal = entrada.nextInt();
//        System.out.print("Donam l'edat del jugador: ");
//        edad = entrada.nextInt();
//        System.out.print("És titular ? [S/N] : ");
//        char resp = entrada.next().toUpperCase().charAt(0);
//        while (resp != 'S' && resp != 'N') {
//            System.out.print("S'esperava S o N. Torni a introduir la dada: ");
//            resp = entrada.next().toUpperCase().charAt(0);
//        }
//        System.out.println("Quina és la data d'inici del seu contracte ?: ");
////        fechaContrato=new Fecha();
//        titular = resp == 'S';
//    }
//}