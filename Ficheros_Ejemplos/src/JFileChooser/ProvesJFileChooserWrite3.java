// package fitxers;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Scanner;
import javax.swing.JFileChooser;
import java.io.BufferedWriter;
import java.io.FileWriter;
import javax.swing.JOptionPane;

/**
 * Mostra com fer servir la classe JFileChooser per escriure a un fitxer
 * @author Administrador
 */
public class ProvesJFileChooserWrite3 {

    
    public static void main(String[] args) {
        
        JFileChooser selector = new JFileChooser();
        selector.showOpenDialog(null);
        selector.setFileSelectionMode(JFileChooser.FILES_ONLY); 
        if (selector.getSelectedFile() != null) {
			// Creem l'objecte File directament    
			File fitxer = selector.getSelectedFile();
			if (fitxer.exists()) {
				int confirm = JOptionPane.showOptionDialog(null, 
					"El vols sobreescriure ?","El fitxer ja existeix", JOptionPane.YES_NO_OPTION,
					JOptionPane.QUESTION_MESSAGE, null, null, null);
				if (confirm != JOptionPane.YES_OPTION) {
					System.exit(1);
				}
				// Eliminem el fitxer per si de cas estem treballant en Windows
				fitxer.delete();
			}
			try {
				// Crearem el fitxer de text
				fitxer.createNewFile();
				// Podríem afegir el paràmetre true/false per controlar el resultat
				FileWriter fw = new FileWriter(fitxer.getAbsoluteFile());
				BufferedWriter bw = new BufferedWriter(fw);
				bw.write("Escrivim un altre cosa dins del fitxer en una única línia\n");
				// Tanquem el fitxer
				bw.close();
				// Mostrem missatge indicant que tot ha anat correctament
				JOptionPane.showMessageDialog(null, "S'ha escrit correctament el fitxer","Programa finalitzat",JOptionPane.INFORMATION_MESSAGE);
				// System.out.println("Fet !");
			} catch (FileNotFoundException e) {
				System.out.println("Fitxer no trobat");
			} catch (NoSuchElementException e) {
				System.out.println("No és un format correcte d'arxiu !!!");
				System.out.println("S'esperava un fitxer de text.");
			} catch (Exception e) {
				// System.out.println("Error inesperat !");
				// System.out.println(e.getMessage());
				// Podem mostrar també els missatges d'error d'aquesta manera...
				JOptionPane.showMessageDialog(null, e.getMessage(),"Error inesperat !",JOptionPane.ERROR_MESSAGE);
				
			}
		}
    }
}
