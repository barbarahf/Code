import java.io.*;
import java.nio.charset.Charset;
import java.util.Scanner;

public class NotaAlumne {

    public static void main(String[] args) {
        String inputFile = "";
        String input = "";
        if (args.length >= 1) {
            inputFile = args[0];
            input = args[1];
        }
        try (Scanner str = new Scanner(new File(inputFile), "UTF-8")) {
            while (str.hasNextLine()) {
                String linea = str.nextLine();
                String s = noAcentos(linea.toUpperCase().trim());
                if (s.contains(noAcentos(input.toUpperCase().trim()))) {
                    System.out.println(linea);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: No se ha encontrado el fichero: " + inputFile);
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Error al leer: " + inputFile);
            System.out.println(e.getMessage());
        }
    }

    private static String noAcentos(String s) {
        String acentos = "ÀÈÌÒÙÁÉÍÓÚÄËÏÖÜÂÊÎÔÛ";
        String sin = "AEIOUAEIOUAEIOUAEIOU";
        String cad = "";
        char c;
        int p;
        for (int n = 0; n < s.length(); n++) {
            c = s.charAt(n);
            p = acentos.indexOf(c);
            if ((p != -1)) {
                c = sin.charAt(p);
                cad += c;
            } else
                cad += c;
        }
        return cad.trim();
    }
}

