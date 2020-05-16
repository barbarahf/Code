import java.io.*;
public class FitxerTemporal { 
	public static void main(String[] args) {
		BufferedWriter bw = null;
		try{
			 System.out.println("Directori temporal: " + System.getProperty("java.io.tmpdir"));
			 File tempFile = File.createTempFile("Temp_",null);
			 tempFile.deleteOnExit();
			 bw = new BufferedWriter(new FileWriter(tempFile));
			 bw.write("Escrivim aquest text al fitxer temporal");
			 bw.close();	// Tanquem el fitxer.  En cas d'error no el tanquem
		} catch (Exception e){						// Qualsevol error
			System.out.println(e.getMessage());		// Escrivim el missatge d'error
		}
	}
}        

