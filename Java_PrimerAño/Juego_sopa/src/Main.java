import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static int numPal = 2;

    public static void main(String[] args) {
        String pal = "Algoritmo Bases de datos";
        /* String pal = "Algoritmo Base de datos Boolean Chip Compilador Computador Directorio Encriptar Gigabyte
        Hardware Interfaz Kilobyte Programación Megabyte Memoria Microprocesador Protocolo Pseudocódigo Red Software";*/

        String sopa = "NAELOOBSAZIIMPEPROTOCOLOCMMOTAERAWDRAHILZEDERWWYRNFCUGYTJFQCAQPCPHIPBIUBRORBFBSOBOQRZFAOLIERA" +
                "WTFOSDEPFQUDROGOCQMTKHÑIHBPPCUAAXUÑMFUILÑÑPPNOCÑWCSKOQOSKAKSDCGFOIUUPMÑEEMESHMXEEOBBSTAGOYTKÑTONQWU" +
                "DGFJNÑCTOQQBKWNAÑHIXCCBDAFEWOGSOYXUYJÑRDGURIRAAODATIIZMORAYTJSJONAONIISCIMYYCUNQQPOELQPRXCGTPGEORCB" +
                "PAATUUFOECPUDRULETNDDEIAAMIUNJVTRODMACAARAUEICIGRAMRLPFORCUODJIIFRWDGTYEYRFQULADOUIIIQOIANBAOOOMCGU" +
                "GXEIGDGMMKJHYZEOTHRLITOYJDJONENONTIICXPGOAIDEORYFAÑJAYVZDRBIJQIUSCOYEEPLYETUDCUEBKXLZUAIROMEMRBZOUJ" +
                "QGYAXGQEFAT";


        String palabras[] = new String[numPal * 2];
        trobaPalabras(palabras, pal);
        char ar[][] = new char[20][25];
        fillAray(ar, sopa);
        ArayPrint(ar);
        System.out.println(Arrays.toString(palabras));
        int contador[] = new int[numPal];

    }

    static String treuEspaisAccents(String s) {
        String cad = "";
        String accents = "ÀÈÌÒÙÁÉÍÓÚÄËÏÖÜÂÊÎÔÛ";
        String sense = "AEIOUAEIOUAEIOUAEIOU";
        char c;
        for (int i = 0; i < s.length(); i++) {
            c = s.charAt(i);
            int p = accents.indexOf(c);
            if (p != -1) {
                cad += sense.charAt(p);
            } else if (c != ' ') {
                cad += c;
            }
        }
        return cad;
    }

    static String girarCadenas(String s) {
        String cad = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            cad += s.charAt(i);
        }
        return cad;
    }


    public static void trobaPalabras(String[] palabras, String pal) {
        String s = "";
        int p = 0;
        for (int i = 0; i <= pal.length(); i++) {
            if (i == pal.length() || pal.charAt(i) == ' ' && Character.isUpperCase(pal.charAt(i + 1))) {
                s = treuEspaisAccents(s.toUpperCase());
                palabras[p] = s;
                palabras[p + numPal] = girarCadenas(s);
                p++;
                s = "";
            } else {
                s += pal.charAt(i);
            }
        }
    }


    static void fillAray(char ar[][], String s) {
        int i = 0;
        for (int row = 0; row < ar.length; row++) {
            for (int col = 0; col < ar[row].length; col++, i++) {
                ar[row][col] = s.charAt(i);
            }
        }

    }

    static void ArayPrint(char ar[][]) {
        for (int row = 0; row < ar.length; row++) {
            for (int col = 0; col < ar[row].length; col++) {
                System.out.print(ar[row][col] + " ");
            }
            System.out.println(" ");
        }
    }


    public static void trobaHorizontales(String palabra) {

    }
}
