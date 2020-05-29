import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

// https://docs.oracle.com/javase/8/docs/api/java/io/FileWriter.html
public class EscriureLiniesFileWriter {
    public static void main(String[] args) {
        try {
			long temps = System.currentTimeMillis();	// Comptem el temps d'execució
			// No comprovem si el fitxer existeix.  Es reescriurà.
            FileWriter fw = new FileWriter(new File("filewriter.txt"));
            for (int n=0; n<50000; n++){
				fw.write(String.format("Linia %5d:  ",n));
				fw.write(String.format("    Valor: %8.3f",1000*Math.random()));
				fw.write(System.lineSeparator()); 	//Nova línia
			}
            fw.close();				// No tanquem el fitxer en cas d'error
            System.out.println("Temps: "+ (System.currentTimeMillis()-temps)+ " ms" );
            System.out.println("S'ha escrit el fitxer correctament");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}


