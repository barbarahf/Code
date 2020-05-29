//import java.io.*;
//import java.util.Scanner;
//
//public class Serealizar {
//    public static void main(String[] args) {
//        File fitxer = new File("/home/barbara/Documentos/Java/Java_FIcheros/src/clients.txt");
//        leerFichero(fitxer);
//    }
//
//
//    public static void leerFichero(File file ) {
//        try {
//            String s = "";
//            String nam = "";
//            Scanner scanner = new Scanner(file, "UTF-8");
//            while (scanner.hasNext()) {
//                s = scanner.nextLine();
//                final String sep = "!¡;";
//                for (int i = 0; i < s.length(); i++) {
//                    if (!sep.contains(Character.toString(s.charAt(i)))) {
//                        nam += s.charAt(i);
//                    }
//                }
//                System.out.println(nam);
//            }
//
//            scanner.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//    }
//
//
//}
