/**
 * Lectura d'un fitxer de text línia a línia. Fa una crida al mètode 
 * System.currentTimeMillis() per quantificar el temps que es triga en llegir 
 * l'arxiu línia a línia.
 */

import java.io.*;	// Importem les classes que necessitem per treballar amb fitxers
public class LlegirLiniaLiniaBuffer {
    public static void main( String args[] ) {
        long intervalo = System.currentTimeMillis();	// Per comptar el temps d'execució
        BufferedReader bReader = null;	// Farem servir un objecte de la classe BufferedReader
        int numLines=0;					// Nombre de Línies al fitxer
        String nomFitxer = "palabras.txt";		// Nom del fitxer que obrirem des del programa
        String linia;					// Línia llegida del fitxer
        try {
			// Creem el buffer i l'associem al fitxer
			bReader = new BufferedReader( new FileReader("palabras.txt") );  
			// Llegim les línies del fitxer
            while((linia = bReader.readLine()) != null ) 
				// Aquí dintre fem el tractament a les línies del fitxer
				numLines++;			// Comptem una línia més al fitxer
        }	// Podem indicar més excepcions, però per últim indiquem la genèrica
        catch (FileNotFoundException e) {
            System.out.println("Error: No s'ha trobat el fitxer: " + nomFitxer);
            System.out.println(e.getMessage());		// Escriu el missatge en anglès
        } catch( Exception e ) {
            System.out.println("S'ha produït un error en llegir el fitxer: " + nomFitxer);
            System.out.println(e.getMessage());		// Escriu el missatge en anglès
        } finally {
			System.out.println("Aquest codi s'executa sempre !");
            try {
                if( bReader != null )	// Al tancar el fitxer, també es pot produïr un error
                    bReader.close();
            } catch( Exception e ) {
                System.out.println(e.getMessage());		// Escriu el missatge en anglès
            }
        }
        System.out.println("Temps: "+ (System.currentTimeMillis()-intervalo)+ " ms" );
        System.out.println("El fitxer  " + nomFitxer + "  te un nombre de linies igual a " + numLines);
    }
}

