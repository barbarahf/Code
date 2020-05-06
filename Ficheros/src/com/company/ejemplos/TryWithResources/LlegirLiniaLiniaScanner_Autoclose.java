/**
 * Lectura d'un fitxer de text línia a línia. Fa una crida al mètode 
 * System.currentTimeMillis() per quantificar el temps que es triga en llegir 
 * l'arxiu línia a línia.
 */

import java.io.*;			// Importem les classes que necessitem per treballar amb fitxers
import java.util.Scanner;	// Importem la classe Scanner
public class LlegirLiniaLiniaScanner_Autoclose {
    public static void main( String args[] ) {
        long intervalo = System.currentTimeMillis();	// Per comptar el temps d'execució
        int numLines=0;					// Nombre de Línies al fitxer
        String linia;					// Línia llegida del fitxer
        String nomFitxer = "palabras.txt";		// Nom del fitxer que llegirem
        try (Scanner sc = new Scanner(new File(nomFitxer))){    // ,"UTF-8");	// Indiquem la codificació
			// Llegim les línies del fitxer
            while (sc.hasNextLine()) {
				// Aquí dintre fem el tractament a les línies del fitxer
				numLines++;			// Comptem una línia més al fitxer
				linia = sc.nextLine();
			}
			System.out.println("Temps: "+ (System.currentTimeMillis()-intervalo)+ " ms" );
			System.out.println("El fitxer  " + nomFitxer + "  te un nombre de linies igual a " + numLines);
        } catch( Exception e ) {
            System.out.println("S'ha produït un error en llegir el fitxer: " + nomFitxer);
            System.out.println(e.getMessage());		// Escriu el missatge en anglès
        }
    }
}


