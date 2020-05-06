/**
 * Llegeix un fitxer de text línia a línia fent servir la classe Scanner
 * Controla l'excepció: FileNotFoundException i altres que es produeixin
 */

import java.io.File;					// Importem el que necessitem únicament
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerText_1_Autoclose {
    public static void main(String[] args) {
        // Fitxer a llegir, trajectòria absoluta o relativa...
        // Exemple:  File file = new File("G:\\NetBeansProjects\\classeScanner\\data-ISO.txt");
        int n=0;		// Indica la línia llegida del fitxer
        String nomFitxer = "data.txt";
        try (Scanner sc = new Scanner(new File(nomFitxer),"UTF-8")){
			// El fitxer data.txt està format UTF-8
            // Scanner sc = new Scanner(file,"UTF-8");
            // El fitxer data-ISO.txt està en format ISO-8859-15
            // Mentre quedin coses per llegir dins del fitxer
            while (sc.hasNextLine()) {
                n++;
                String line = sc.nextLine();
                System.out.println("Linea: "+n+" = "+line);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("No s'ha pogut trobar el fitxer: " + nomFitxer);
            System.out.println(ex);
        } catch (Exception e){			// Qualsevol altre error
			System.out.println(e);		// Escrivim el missatge d'error
		}
    }
}

