import java.io.*;

// https://docs.oracle.com/javase/8/docs/api/java/io/PrintStream.html
public class EscriureLiniesPrintStream {
    public static void main(String[] args) {
        try {
			long temps = System.currentTimeMillis();	// Comptem el temps d'execució
			// No comprovem si el fitxer existeix.  Es reescriurà.
            PrintStream ps = new PrintStream("printstream.txt");
            for (int n=0; n<50000; n++){
				ps.print(String.format("Línia %5d:  ",n));
				ps.print(String.format("    Valor: %8.3f",1000*Math.random()));
				ps.println(); 			//Nova línia
			}
            ps.close();				// No tanquem el fitxer en cas d'error
            System.out.println("Temps: "+ (System.currentTimeMillis()-temps)+ " ms" );
            System.out.println("S'ha escrit el fitxer correctament");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}

