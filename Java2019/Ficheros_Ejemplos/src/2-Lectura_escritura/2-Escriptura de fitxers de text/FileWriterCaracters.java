//import java.io*;
//
//public class FileWriterCaracters {
//    public static void main(String[] args) {
//		String sFitxer = "noufitxer.txt";
//		File fitxer = new File(sFitxer);
//		if (fitxer.exists()){
//			System.out.println("El fitxer  \"" + sFitxer + "\"  ja existeix al disc");
//			System.out.println("Esborri previament aquest fitxer abans de continuar");
//			System.exit(-1);
//		}
//        try {
//           // Obrim el fitxer noufitxer.txt per escriure en ell.
//           FileWriter fw = new FileWriter(fitxer);
//           // Escrivim les lletres majúscules de la 'A' a la 'Z' (alfabet anglès).
//           for(char c='A'; c<='Z'; c++)
//               fw.write(c);
//           // Indiquem a l'usuari que s'ha creat el fitxer
//           System.out.println("S'ha creat el fitxer  \"" + sFitxer +"\"");
//           fw.close();		// Tanquem el fitxer
//        } catch (Exception e) {
//            System.out.println("ERROR en escriure al fitxer " + sFitxer);
//            System.out.println(e.getMessage());
//        }
//    }
//}
//
//
//
