import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;

public class Mitja {
    public static ArrayList<Double> nota = new ArrayList<>();

    public static void main(String[] args) {
        String inputFile = "";
        if (args.length >= 1) {
            inputFile = args[0];
        }
        try (BufferedReader bRead = new BufferedReader(new FileReader(inputFile))) {
            String str;
            while ((str = bRead.readLine()) != null)
                check(str);
            Collections.sort(nota);
            double min = nota.get(0);
            double max = nota.get(nota.size() - 1);
            double media = media(nota);

            System.out.println("+---------------------------------------+\n" +
                    "|                 NOTAS                 | ");
            System.out.println("+---------------------------------------+");
            System.out.println("| Nota minima |  Nota maxima  |  Media  |");
            System.out.println("+-------------+---------------+---------+");
            System.out.println("|   " + String.format("%.2f", min) + "       |   " + String.format("%.2f", max) +
                    "    |   " + String.format("%.2f", media) + "    |");
            System.out.println("+-------------+---------------+---------+");


        } catch (FileNotFoundException e) {
            System.out.println("Error: No se ha encontrado el fichero: " + inputFile);
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Error al leer: " + inputFile);
            System.out.println(e.getMessage());
        }
    }

    public static void check(String s) {
        int i = 0;
        while (!Character.isDigit(s.charAt(i)))
            i++;
        s = s.replace(",", ".");
        String str = s.substring(s.indexOf(s.charAt(i)));
        nota.add(Double.parseDouble(str));
    }

    static double suma(ArrayList<Double> l) {
        double sum = 0;
        for (Double d : l)
            sum += d;
        return sum;
    }

    static double media(ArrayList<Double> l) {
        return suma(l) / l.size();
    }
}
