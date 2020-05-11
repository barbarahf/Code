/**
 * Lectura d'un fitxer de text caràcter a caràcter. Fa una crida al mètode 
 * System.currentTimeMillis() per quantificar el temps que es triga en llegir 
 * l'arxiu caràcter a caràcter.
 */

import java.io.*;	// Importem les classes que necessitem per treballar amb fitxers
public class LlegirCaraCarBuffer {
    public static void main( String args[] ) {
        long intervalo = System.currentTimeMillis();	// Per comptar el temps d'execució
        BufferedReader bReader = null;	// CANVIAT - Farem servir un objecte de la classe BufferedReader
        int numLs=0;					// Nombre de caràcters l (minúscula) al fitxer
        String nomFitxer = "palabras.txt";		// Nom del fitxer que obrirem des del programa
        int c;							// Caràcter llegit, és de tipus int perquè pot ser -1
        try {
			// CANVIAT - Creem el buffer i l'associem al fitxer
			bReader = new BufferedReader( new FileReader("palabras.txt"), 100000 );  
            while((c = bReader.read()) != -1 ) {
				// Aquí dintre fem el procés amb els caràcters del fitxer
				if ((char)c == 'l')
					numLs++;			// Comptem una 'l' minúscula més al fitxer
            }
        } catch( Exception e ) {
            System.out.println("S'ha produït un error en accedir al fitxer: " + nomFitxer);
            e.printStackTrace();		// Escrivim el registre del stack on s'ha iniciat l'excepció
        } finally {
			System.out.println("Aquest codi s'executa sempre !");
            try {
                if( bReader != null )	// Al tancar el fitxer, també es pot produïr un error
                    bReader.close();
            } catch( Exception e ) {
                e.printStackTrace();	// Escrivim el registre del stack on s'ha iniciat l'excepció
            }
        }
        System.out.println("Temps: "+ (System.currentTimeMillis()-intervalo)+ " ms" );
        System.out.println("Trobades  " + numLs + "  lletres 'l' en el fitxer " + nomFitxer);
    }
}

