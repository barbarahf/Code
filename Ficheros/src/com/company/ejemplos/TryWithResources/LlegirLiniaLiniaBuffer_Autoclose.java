/**
 * Lectura d'un fitxer de text línia a línia. Fa una crida al mètode 
 * System.currentTimeMillis() per quantificar el temps que es triga en llegir 
 * l'arxiu línia a línia.
 */

import java.io.*;	// Importem les classes que necessitem per treballar amb fitxers
public class LlegirLiniaLiniaBuffer_Autoclose {
    public static void main( String args[] ) {
        long intervalo = System.currentTimeMillis();	// Per comptar el temps d'execució
        int numLines=0;					// Nombre de Línies al fitxer
        String nomFitxer = "palabras.txt";		// Nom del fitxer que obrirem des del programa
        String linia;					// Línia llegida del fitxer
        // bReader ens permet accedir al nostra fitxer (el llegirem línia a línia)
        try (FileReader fr = new FileReader("palabras.txt");
			 BufferedReader bReader = new BufferedReader(fr)) {
			// Llegim les línies del fitxer
            while((linia = bReader.readLine()) != null ) 
				// Aquí dintre fem el tractament a les línies del fitxer
				numLines++;			// Comptem una línia més al fitxer
			System.out.println("Temps: "+ (System.currentTimeMillis()-intervalo)+ " ms" );
			System.out.println("El fitxer  " + nomFitxer + "  te un nombre de linies igual a " + numLines);
        }	// Podem indicar més excepcions, però per últim indiquem la genèrica
        catch (FileNotFoundException e) {
            System.out.println("Error: No s'ha trobat el fitxer: " + nomFitxer);
            System.out.println(e.getMessage());		// Escriu el missatge d'error
        } catch( Exception e ) {
            System.out.println("S'ha produït un error en llegir el fitxer: " + nomFitxer);
            System.out.println(e.getMessage());		// Escriu el missatge d'error
        }
    }
}

