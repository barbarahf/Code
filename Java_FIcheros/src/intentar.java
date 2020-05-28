//import java.util.Arrays;
//import java.util.Collections;
//import java.util.List;
//
//public class intentar {
//    public static boolean esSeparador(char c) {
//        final String separador = " .,;\n";
//        return separador.contains(Character.toString(c));
//    }
//
//    public static String transformaLinia(String linea) {
//        String palabra = "";
//        String line = "";
//        for (int i = 0; i < linea.length(); i++) {
//            char c = linea.charAt(i);
//            if (!esSeparador(c)) {
//                palabra += c;
//            } else {
//                if (!palabra.equals(""))
//                    line += shuffle(palabra);
//                line+=c;
//                palabra = "";
//            }
//
//        }
//        if (!palabra.equals("")) {
//            line += shuffle(palabra);
//        }
//        return line;
//    }
//
//    public static String shuffle(String palabra) {
//        String line = "";
//        String s = palabra.substring(1, palabra.length() - 1);
//        char[] characters = s.toCharArray();
//        for (int j = 0; j < characters.length; j++) {
//            int randomIndex = (int) (Math.random() * characters.length);
//            char temp = characters[j];
//            characters[j] = characters[randomIndex];
//            characters[randomIndex] = temp;
//        }
//        return palabra.charAt(0) + new String(characters) + palabra.charAt(palabra.length() - 1);
//    }
//    public static String shuffleString(String string)
//    {
//        List<String> letters = Arrays.asList(string.split(""));
//        Collections.shuffle(letters);
//        String shuffled = "";
//        for (String letter : letters) {
//            shuffled += letter;
//        }
//        return shuffled;
//    }
//
//    //¿Como ignorar el primer caracter de un archivo?
//    public static void main(String[] args) {
//        String palabra = "estudios";
//        System.out.println(shuffleString("escritas"));
//
//        String str = "geekss@for@geekss";
//        String[] arrOfStr = str.split("@", 2);
//
//        for (String a : arrOfStr)
//            System.out.println(a);
//    }
//}
