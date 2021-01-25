package JFileChooser;// package uf3.fitxers_text;

import javax.swing.JOptionPane;

/**
 * Amb la classe JOPtionPane podem llegir dades i mostrar missatges curs 
 * @author SUPER
 */
public class ProvesJoptionPane {

    public static void main(String[] args) {
        boolean ok = true;
        do {
            ok = true;
            try {
				// Mostrem un diàleg per llegir un valor (String)
                String s = JOptionPane.showInputDialog("Edat");
                //System.out.println(s);
                // Verifiquem que ens han passat alguna cosa.
                if (s != null) {
					// Si hem llegit un valor numèric el podem convertir amb parseInt
                    int num = Integer.parseInt(s);
                    // Incrementem el valor llegit 
                    num++;
                    // Mostrem un altre finestra amb un altre missatge
                    JOptionPane.showMessageDialog(null, "Valor incrementat: " + num);
                }
                // else     System.exit(0);

            } catch (Exception e) {
                System.out.println("No es numero");
                JOptionPane.showMessageDialog(null, "Posa un numero, si us plau");
                ok = false;                             
            }
      } while (!ok); // (ok == false)
    }
}
