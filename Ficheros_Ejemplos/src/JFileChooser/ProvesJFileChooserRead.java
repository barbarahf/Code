package JFileChooser;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Scanner;
import javax.swing.JFileChooser;

/**
 * Mostra com fer servir la classe JFileChooser per llegir d'un fitxer
 * @author Administrador
 */
public class ProvesJFileChooserRead {
    
    public static void main(String[] args) {
        
        JFileChooser selector = new JFileChooser();
        selector.showOpenDialog(null);
        selector.setFileSelectionMode(JFileChooser.FILES_ONLY); 
        // Quan sortim obtenim el nom del fitxer seleccionat amb el mètode: getName() 
        if (selector.getSelectedFile() != null) {
			System.out.println("El nom del fitxer seleccionat és: "+selector.getSelectedFile().getName());
			// Obtenim l'objecte File directament     
			File fitxer = selector.getSelectedFile();
			try {
				// Fem servir la classe Scanner per llegir del fitxer
				Scanner entrada = new Scanner(fitxer);
				// Se suposa que el fitxer és de text. 
				String linia = entrada.nextLine();
				// Només mostrem la primera línia del fitxer
				System.out.println("Primera línia del fitxer = " + linia);
				// Després el tanquem 
				entrada.close();
			} catch (FileNotFoundException e) {
				System.out.println("Fitxer no trobat");
			} catch (NoSuchElementException e) {
				System.out.println("No és un format correcte d'arxiu !!!");
				System.out.println("S'esperava un fitxer de text.");
			} catch (Exception e) {
				System.out.println("S'ha produit un error inesperat");
				System.out.println(e.toString());
			} 
		}
		else {
			System.out.println("No s'ha seleccionat cap fitxer");
		}
    }
}
