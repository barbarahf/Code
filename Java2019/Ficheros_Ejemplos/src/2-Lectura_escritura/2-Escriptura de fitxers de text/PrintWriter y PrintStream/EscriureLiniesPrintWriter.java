import java.io.*;

// https://docs.oracle.com/javase/8/docs/api/java/io/PrintWriter.html
public class EscriureLiniesPrintWriter {
    public static void main(String[] args) {
        try {
			long temps = System.currentTimeMillis();	// Comptem el temps d'execució
			// No comprovem si el fitxer existeix.  Es reescriurà.
            PrintWriter pw = new PrintWriter("printwriter.txt");
            for (int n=0; n<50000; n++){
				pw.print(String.format("Línia %5d:  ",n));
				pw.print(String.format("    Valor: %8.3f",1000*Math.random()));
				pw.println(); 			//Nova línia
			}
            pw.close();				// No tanquem el fitxer en cas d'error
            System.out.println("Temps: "+ (System.currentTimeMillis()-temps)+ " ms" );
            System.out.println("S'ha escrit el fitxer correctament");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}

