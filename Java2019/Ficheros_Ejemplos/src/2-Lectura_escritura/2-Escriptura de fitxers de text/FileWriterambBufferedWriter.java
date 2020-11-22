import java.io.*;

public class FileWriterambBufferedWriter {
	public static void main(String[] args) {
		long intervalo = System.currentTimeMillis();	// Per comptar el temps d'execució
		BufferedWriter bw = null;						// Creem el BufferedWriter
		try {
			File fitxer = new File("C:/Java/Fitxers/fitxer.txt");
			bw = new BufferedWriter(new FileWriter(fitxer));
			for (int lines = 0; lines < 2048; lines++){
				for (int columnes = 0; columnes < 50; columnes++)
					// Escriu lletres 'A' a 'Z' aleatòriament
					bw.write((int)(Math.random()*26)+65);
				bw.newLine();		// Escriu un retorn de carro	
			}
			System.out.println("S'ha creat el fitxer");
			System.out.println("Temps: "+ (System.currentTimeMillis()-intervalo)+ " ms" );
		} catch (IOException ioe) {
			System.out.println(ioe.getMessage());
		}
		finally
		{ 				// Per tancar el fitxer encara que hagi hagut un error.
			try{		
				if(bw!=null)
					bw.close();
			}catch(Exception ex){
				System.out.println("Error en tancar el fitxer:  " + ex);
			}
		}
	}
}

