import java.io.*;
import java.util.Scanner;
 
public class EscriureLiniesPrintWriterFileWriter {
    public static void main(String[] args) {
		PrintWriter pw = null;
        try {
			Scanner sc = new Scanner(System.in);
			// No comprovem si el fitxer existeix.  Es reescriurà.
			File fitxer = new File("filewriter_printwriter.txt");
			char sino = 'N';
			while (fitxer.exists() && sino!='S') {
				System.out.println("El fitxer "  + fitxer + " ja existeix al directori");
				System.out.print("Desitja sobreescriure aquest fitxer i perdre el contingut previ [S/N]:  ");
				sino = sc.nextLine().toUpperCase().charAt(0);
				if (sino == 'N')
					System.exit(-1);		// Acabem l'execució del programa
			}
			long temps = System.currentTimeMillis();	// Comptem el temps d'execució
			FileWriter fw = new FileWriter(fitxer);
			BufferedWriter bw = new BufferedWriter(fw);
            pw = new PrintWriter(bw);
            
            for (int n=0; n<50000; n++){
				pw.print(String.format("Línia %5d:  ",n));
				pw.print(String.format("    Valor: %8.3f",1000*Math.random()));
				pw.println(); 			//Nova línia
			}
            System.out.println("Temps: "+ (System.currentTimeMillis()-temps)+ " ms" );
            if (!pw.checkError())
				System.out.println("S'ha escrit el fitxer correctament");
			else
				System.out.println("Error indeterminat en la creació del fitxer");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());	// Indiquem l'error
        }
        finally{
			try{
				if (pw != null)						// Controlem l'error en tancar el fitxer
					pw.close();
			}catch (Exception e){
				System.out.println(e.getMessage());	// Indiquem l'error
			}
		}
    }
}
