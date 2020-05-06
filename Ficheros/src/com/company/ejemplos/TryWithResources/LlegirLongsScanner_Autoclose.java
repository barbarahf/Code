import java.io.*;			// Importem les classes necessàries
import java.util.Scanner;	// Importem la classe Scanner
public class LlegirLongsScanner_Autoclose {
    public static void main( String args[] ) {
        int numValors=0;	// Nombre de valors al fitxer
        long l;		// Valor long llegit del fitxer
        long suma=0;	// Suma dels valors presents al fitxer.  Suposem que no desborda
        long min=0, max=0;	// Valors mín i max llegits del fitxer
        String nomFitxer = "C:\\Java\\Fitxers\\numlong.txt";	// Nom del fitxer que llegirem
        try (Scanner sc = new Scanner(new File(nomFitxer))){
            // Llegim el primer valor del fitxer separadament
            if (sc.hasNextLong()){
                    min = sc.nextLong();
                    max = min;      // el primer valor serà el màxim i el mínim
                    suma = min;				
                    numValors++;    // Un valor llegit del fitxer
            }			
            while (sc.hasNextLong()) {
                // Aquí dintre fem el tractament als valors long llegits del fitxer
                numValors++;	// Comptem un valor més al fitxer
                l = sc.nextLong();
                if (l>max)
					max = l;
                else if (l<min)
					min = l;
                suma += l;
            }
            System.out.println("Analitzat el fitxer  " + nomFitxer);
            System.out.println("Valor maxim:  " + max + "    Valor minim:  " + min);
            System.out.println("Numero de valors:    " + numValors);
            System.out.println("Mitja dels valors:   " + ((double) suma / numValors));
        } catch( Exception e) {
			System.out.println("S'ha produït un error en llegir el fitxer: " + nomFitxer);    
            System.out.println(e.getMessage());	// Escriu el missatge d'error 
        }
    }
}
