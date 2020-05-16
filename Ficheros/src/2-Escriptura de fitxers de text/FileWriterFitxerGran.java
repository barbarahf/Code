import java.io.*;

public class FileWriterFitxerGran {
	public static void main(String[] args) {
		long intervalo = System.currentTimeMillis();	// Per comptar el temps d'execució
		FileWriter fw = null;							// Creem el BufferedWriter
		try {
			fw = new FileWriter("C:/Java/Fitxers/fitxer.txt");
			for (int lines = 0; lines < 2048; lines++){
				for (int columnes = 0; columnes < 50; columnes++)
					// Escriu lletres 'A' a 'Z' aleatòriament
					fw.write((char)(Math.random()*26)+65);
				fw.write('\n');		// Escriu un retorn de carro	
			}
			System.out.println("S'ha creat el fitxer");
			System.out.println("Temps: "+ (System.currentTimeMillis()-intervalo)+ " ms" );
		} catch (IOException ioe) {
			System.out.println(ioe.getMessage());
		}
		finally
		{ 				// Per tancar el fitxer encara que hagi hagut un error.
			try{		
				if(fw!=null)
					fw.close();
			}catch(Exception ex){
				System.out.println("Error en tancar el fitxer:  " + ex);
			}
		}
	}
}

