
import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Scanner;
import javax.swing.JFileChooser;
import java.io.BufferedWriter;
import java.io.FileWriter;

/**
 * Mostra com fer servir la classe JFileChooser per escriure a un fitxer
 * @author Administrador
 */
public class ProvesJFileChooserWrite {

    public static void main(String[] args) {
        
        JFileChooser selector = new JFileChooser();
        selector.showOpenDialog(null);
        selector.setFileSelectionMode(JFileChooser.FILES_ONLY); 
        // Obtenim l'objecte File directament  
        if (selector.getSelectedFile() != null) { 
        File fitxer = selector.getSelectedFile();
			try {
				if (fitxer.exists()) {
					System.out.println("El fitxer ja existeix...");
					System.out.print("El vols sobreescriure [S/N] ? : ");
					// No fem un control estricte de la resposta de l'usuari
					Scanner in = new Scanner(System.in);
					char resp = in.next().toUpperCase().charAt(0);
					if (resp != 'S') {
						System.out.println("Sortint...");
						System.exit(0);
					}
				}  
				else {    
					// Crearem el fitxer si no existeix ja al disc
					fitxer.createNewFile();
				}
				// Podríem afegir el paràmetre true/false per controlar el resultat
				FileWriter fw = new FileWriter(fitxer.getAbsoluteFile());
				fw.write("Escrivim el que vulguem dins del fitxer\n");
				// Tanquem el fitxer
				fw.close();
				// BufferedWriter bw = new BufferedWriter(fw);
				// bw.write("Escrivim el que vulguem dins del fitxer\n");
				// Tanquem el fitxer
				// bw.close();
				// Mostrem missatge indicant que tot ha anat correctament
				System.out.println("Fet !");
			} catch (Exception e) {
				System.out.println("Error inesperat !");
				// Mostrem el missatge associat a l'excepció.
				System.out.println(e);
			}
		}
    }
}
