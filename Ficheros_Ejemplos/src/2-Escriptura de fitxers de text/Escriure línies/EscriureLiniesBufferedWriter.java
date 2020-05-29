import java.io.*;

// https://docs.oracle.com/javase/8/docs/api/java/io/BufferedWriter.html
public class EscriureLiniesBufferedWriter {
    public static void main(String[] args) {
        try {
			long temps = System.currentTimeMillis();  // Comptem el temps d'execució
			// No comprovem si el fitxer existeix.  Es reescriurà.
            BufferedWriter bf = new BufferedWriter(new FileWriter("filewriter.txt"));
            for (int n=0; n<50000; n++){
				bf.write(String.format("Linia %5d:  ",n));
				bf.write(String.format("    Valor: %8.3f",1000*Math.random()));
				bf.newLine();		// Nova línia
			}
            bf.close();				// No tanquem el fitxer en cas d'error
            System.out.println("Temps: "+ (System.currentTimeMillis()-temps)+ " ms" );
            System.out.println("S'ha escrit el fitxer correctament");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}

