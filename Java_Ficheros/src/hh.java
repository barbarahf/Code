import java.io.*;
import java.util.*;

public class hh {

    public static void main(String[] args) {

        String palabras = "/home/barbara/Documentos/Java/Java_Ficheros/src/palabras.txt";
        File txt = new File(palabras);
        try (BufferedReader leer = new BufferedReader(new FileReader(palabras))) {
            String linea;
            int contador = 0;
            String sepa = " ";
            int palabsras = 0;
            while ((linea = leer.readLine()) != null) {
//                // System.out.println(linea);
//                String pal[] = linea.split(sepa);
//                contador += pal.length;
                char ch[] = new char[linea.length()];
                for (int i = 0; i < linea.length(); i++) {
                    ch[i] = linea.charAt(i);
                    if (((i > 0) && (ch[i] != ' ') && (ch[i - 1] == ' ')) || ((ch[0] != ' ') && (i == 0)))
                        palabsras++;
                }
            }
            System.out.println("Se han econtrado " + palabsras + " palabras.");

        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}