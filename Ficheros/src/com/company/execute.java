package com.company;

import java.io.FileReader;

public class execute {

        public static void main( String args[] ) {
            long intervalo = System.currentTimeMillis();	// Per comptar el temps d'execució
            FileReader fReader = null;		// Representarà el fitxer dintre del nostre programa
            int numLs=0;					// Nombre de caràcters l (minúscula) al fitxer
            String nomFitxer = "palabras.txt";		// Nom del fitxer que obrirem des del programa
            int c;							// Caràcter llegit, és de tipus int perquè pot ser -1

            try {
                // Referenciem el fitxer en disc a partir de l'objecte fReader creat.
                fReader = new FileReader(nomFitxer);
                System.out.println("Joc de caracters del fitxer:  " + fReader.getEncoding());
                while((c = fReader.read()) != -1 ) {
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
                    if( fReader != null )	// Al tancar el fitxer, també es pot produïr un error
                        fReader.close();
                } catch( Exception e ) {
                    e.printStackTrace();	// Escrivim el registre del stack on s'ha iniciat l'excepció
                }
            }
            System.out.println("Temps: "+ (System.currentTimeMillis()-intervalo)+ " ms" );
            System.out.println("Trobades  " + numLs + "  lletres 'l' en el fitxer " + nomFitxer);
        }
    }



