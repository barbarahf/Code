import java.io.*;
import java.util.Scanner;

public class Mesnota {
    public static boolean checkNota(String s, String input) {
        int i = 0;
        while (!Character.isDigit(s.charAt(i)))
            i++;
        s = s.replace(",", ".");
        String value = s.substring(s.indexOf(s.charAt(i)));
        float check;
        if (value.contains("."))
            check = Float.parseFloat(value);
        else
            check = Integer.parseInt(value);
        return check > Float.parseFloat(input);
    }

    public static void main(String[] args) {
        String inputFile = "";
        String nota = "";
        if (args.length >= 1) {
            nota = args[1];
            inputFile = args[0];
        }
        try (Scanner sc = new Scanner(new File(inputFile), "UTF-8")) {
            while (sc.hasNextLine()) {
                String linea = sc.nextLine();
                if (checkNota(linea, nota)) {
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
}
