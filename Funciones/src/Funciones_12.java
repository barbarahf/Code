import java.util.Arrays;

public class Funciones_12 {
    //Ejercicio 1
    static int major2(int a, int b) {
        if (a > b)
            return a;
        return b;
    }

    //Ejercicio 2
    static int major3(int a, int b, int c) {
        return major2(major2(a, b), c);
    }

    //Ejercicio 3
    static int major4(int a, int b, int c, int d) {
        return major2(major2(a, b), major2(c, d));
    }

    //Ejercicio 5
    static int quantsEspais(String cad) {
        return quantesVegades(cad, ' ');
    }

    //Ejercicio 4
    static int quantesVegades(String cad, char c) {
        int contador = 0;
        for (int i = 0; i < cad.length(); i++)
            if (cad.charAt(i) == c)
                contador++;
        return contador;
    }

    static int cuantasVocales(String cadena, String sonVocales) {
        int contador = 0;
        for (int i = 0; i < sonVocales.length(); i++) {
            quantesVegades(cadena, sonVocales.charAt(i));
            contador++;
        }
        return contador;
    }

    //Ejercicio 7
    static String separa(String cad, String separador) {
        String caractecres = "";
        for (int i = 0; i < cad.length(); i++) {
            caractecres += cad.charAt(i) + separador;
        }
        return caractecres.substring(0, caractecres.length() - separador.length());
    }

    //Ejercicio 8
    static boolean hiHaBruixa(String cad) {
        return cad.contains("=()=");
    }

    //Ejercicio 9

    static String explanada(int n) {
        String cadena = "()=";
        String aleatorio = "";
        for (int i = 0; i < n; i++)
            aleatorio += cadena.charAt((int) (Math.random() * cadena.length()));
        return aleatorio;
    }

    //Ejercicio 10
    static String explanadaBruizan(int n) {
        String contenido = "";
        if (n < 10 || n > 100) {
            return "";
        }
        while (!hiHaBruixa(contenido)) {
            contenido = explanada(n);
        }
        return contenido;
    }

    //Ejercicio 11
    static int cuaantasBruixes(String explanada) {
        int cuantas = 0;
        for (int n = 0; n <= explanada.length() - 4; n++) {
            if (explanada.substring(n, n + 4).equals("=()=")) {
                cuantas++;
                n += 3;
            }
        }
        return cuantas;

    }

    //Ejercicio 12
    static String explanadaBruixes(int n, int numBuixes) {
        if (n >= 50 && n < 1000 && numBuixes < 5) {
            String cadena = explanada(n);
            do {
                cadena = explanada(n);
            } while ((cuaantasBruixes(cadena) < numBuixes));
            return cadena;
        } else
            return "";
    }
    //Ejercicio 13

    static String mataBrujas(String explanada) {
        int pos = explanada.indexOf("=()=");
        return explanada.substring(0, pos) + explanada.substring(pos + 4);
    }

    //Ejercicio 14
    static int mataBruixes(String explanada) {
        int cuantas = 0;
        while (hiHaBruixa(explanada)) {
            explanada = mataBrujas(explanada);
            cuantas++;
            System.out.println(explanada);
        }
        return cuantas;
    }

    //Ejercicio 15
    static int max(int v[]) {
        int[] value = new int[v.length];
        System.arraycopy(v, 0, value, 0, v.length);
        Arrays.sort(value);
        int max = value[value.length - 1];
        return max;
    }

    static int maxim(int v[]) {
        int maxValue = v[0];
        for (int i = 0; i < v.length; i++) {
            if (v[i] > maxValue)
                maxValue = v[i];
        }
        return maxValue;
    }

    //Ejercicio 16
    static double max(double v[]) {
        double[] value = new double[v.length];
        System.arraycopy(v, 0, value, 0, v.length);
        Arrays.sort(value);
        double max = value[value.length - 1];
        return max;
    }

    //Ejercicio 17
    static int min(int v[]) {
        int[] value = new int[v.length];
        System.arraycopy(v, 0, value, 0, v.length);
        Arrays.sort(value);
        int min = value[0];
        return min;
    }

    static double min(double v[]) {
        double[] value = new double[v.length];
        System.arraycopy(v, 0, value, 0, v.length);
        Arrays.sort(value);
        double min = value[0];
        return min;
    }

    //Ejercicio 18
    static double suma(double vector[]) {
        double sum = 0;
        for (int i = 0; i < vector.length; i++) {
            sum += vector[i];
        }
        return sum;
    }

    //Ejercicio 19
    static double suma(long vector[]) {
        double sum = 0;
        for (int i = 0; i < vector.length; i++) {
            sum += vector[i];
        }
        return sum;
    }

    static double mitja(long[] vector) {
        return suma(vector) / vector.length;
    }
    //Ejercicio 20

    public static void main(String[] args) {

        System.out.println(mataBruixes("“=(=(=()=)=)="));
        long vduo[] = {5, 8, 10};
        System.out.println(mitja(vduo));
    }
}
