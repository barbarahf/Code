import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class LecturaFactures {
    public static void main(String[] args) {
        int any,mes,dia;			// Data de la factura
        double valor;				// valor de la factura
        int pendents=0;				// Número de factures pendents
        double sumaPendents=0;		// Import a les factures pendents
        try {
            Scanner s = new Scanner(new File("factures.txt"));
            while (s.hasNextLine()) {
                String linea = s.nextLine();
                Scanner sl = new Scanner(linea);
                sl.useDelimiter("\\s*;\\s*");
                // Llegim l'any
                any=sl.nextInt();
                mes=sl.nextInt();
                dia=sl.nextInt();
                System.out.print("Data: "+dia+"/"+mes+"/"+any);
                valor = sl.nextDouble();	                // Llegim l'import
                System.out.print(" \tValor factura: " + valor);
                // Llegim uns S o una N
                char c = sl.next().toUpperCase().charAt(0);
                if (c == 'S')
					System.out.println("\tFactura cobrada");
				else {
					System.out.println("\tFactura pendent");
					pendents++;
					sumaPendents += valor;
				}
            }
            s.close();
            System.out.println("Tenim " + pendents + " factures pendents per un import de " + sumaPendents);
        } catch (FileNotFoundException e) {
            System.out.println("S'ha trobat l'error següent: " + e.toString());
        } catch (InputMismatchException e) {
            System.out.println("Errors en el fitxer.");
        } catch (Exception e) {
			System.out.println("Excepció inesperada. L'error reportat pel sistema és:");
			System.out.println(e);
		}
    }
}
