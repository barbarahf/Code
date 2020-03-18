import java.util.Arrays;

public class Remaster {
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

    //Ejercicio 4
    static int quantesVegades(String cad, char c) {
        int contador = 0;
        for (int i = 0; i < cad.length(); i++)
            if (cad.charAt(i) == c)
                contador++;
        return contador;
    }

    //Ejercici 5
    static int quantsEspais(String cad) {
        return quantesVegades(cad, ' ');
    }

    //Ejercicio 6
    static int quantesVocals(String cad, String sonVocals) {
        int contador = 0;
        for (int i = 0; i < sonVocals.length(); i++) {
            quantesVegades(cad, sonVocals.charAt(i));
            contador++;
        }
        return contador;
    }

    //Ejercicio 7
    static String separa(String cad, String separador) {
        String content = "";
        for (int i = 0; i < cad.length(); i++) {
            content += cad.charAt(i) + separador;
        }
        return content.substring(0, content.length() - separador.length());
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
    static String explanadaBruixa(int n) {
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
    static int quantesBruixes(String explanada) {
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
        String cadena = "";
        if (n >= 50 && n < 1000 && numBuixes < 5) {
            do {
                cadena = explanada(n);
            } while ((quantesBruixes(cadena) < numBuixes));
            return cadena;
        }
        return "";
    }

    //Ejercicio 13
    static String mataBruixa(String explanada) {
        int bruixa = explanada.indexOf("=()=");
        return explanada.substring(0, bruixa) + explanada.substring(bruixa + 4);
    }

    //Ejercicio 14
    static int mataBruixes(String explanada) {
        int cuantas = 0;
        while (hiHaBruixa(explanada)) {
            explanada = mataBruixa(explanada);
            cuantas++;
        }
        return cuantas;
    }

    //Ejercicio 15
    static int max_sort(int v[]) {
        int[] value = new int[v.length];
        System.arraycopy(v, 0, value, 0, v.length);
        Arrays.sort(value);
        return value[value.length - 1];
    }

    static int max(int v[]) {
        int maxValue = v[0];
        for (int value : v) {
            if (value > maxValue)
                maxValue = value;
        }
        return maxValue;
    }

    //Ejercicio 16
    static double max(double v[]) {
        double maxValue = v[0];
        for (double value : v) {
            if (value > maxValue)
                maxValue = value;
        }
        return maxValue;
    }

    static double max_sort(double v[]) {
        double[] value = new double[v.length];
        System.arraycopy(v, 0, value, 0, v.length);
        Arrays.sort(value);
        return value[value.length - 1];
    }

    //Ejercicio 17
    static int min(int v[]) {
        int minValue = v[0];
        for (int value : v) {
            if (value < minValue)
                minValue = value;
        }
        return minValue;
    }

    static long min(long v[]) {
        long minValue = v[0];
        for (long value : v) {
            if (value < minValue)
                minValue = value;
        }
        return minValue;
    }

    //Ejercicio 18
    static double suma(double vector[]) {
        double sum = 0;
        for (double v : vector) {
            sum += v;
        }
        return sum;
    }

    //Ejercicio 19
    //Sobrecargar el metodo suma
    static long suma(long vector[]) {
        long sum = 0;
        for (long v : vector) {
            sum += v;
        }
        return sum;
    }

    static double mitja(long vector[]) {
        return suma(vector) / vector.length;
    }

    //Ejercicio 20
    static void vecMillon() {
        double[] vecMillion = new double[1000000];
        for (int n = 0; n < vecMillion.length; n++)
            vecMillion[n] = (int) (Math.random() * 2);
        long tiempoMs = System.currentTimeMillis();
        double max = max(vecMillion);
        System.out.println("Max()= " + max + " Tiempo invertido " + (System.currentTimeMillis() - tiempoMs));
        tiempoMs = System.currentTimeMillis();
        max = max_sort(vecMillion);
        System.out.println("Max_Sort()= " + max + " Tiempo invertido " + (System.currentTimeMillis() - tiempoMs));
    }

    //Ejercicio 21
    static int[] gira_vector(int[] vec) {
        int n, m, aux = 0;
        for (n = 0, m = vec.length - 1; n < vec.length / 2; n++, m--) {
            aux = vec[n];
            vec[n] = vec[m];
            vec[m] = aux;
        }
        return vec;
    }

    //Ejercicio 22
    public static int[] suma_vectors(int[] v1, int[] v2) {
        if (v1.length > v2.length) {
            int aux[] = v1;
            v1 = v2;
            v2 = aux;
        }
        int min = v1.length;
        int max = v2.length;
        int[] nuevo = new int[max];
        for (int i = 0; i < min; i++) {
            nuevo[i] = v1[i] + v2[i];
            System.arraycopy(v2, min, nuevo, min, max - min);
        }
        return nuevo;
    }

    //Ejercicio 23
    static int[] crea_vector(int min, int max, int num_valors) {
        int[] vector = new int[num_valors];
        if (min > max) {
            int aux = min;
            min = max;
            max = aux;
        }
        for (int n = 0; n < vector.length; n++) {
            vector[n] = (int) (Math.random() * (max - min + 1) + min);
        }
        return vector;
    }

    //Ejercicio 24
    static int posicio(int[] v, int x) {
        for (int i = 0; i < v.length; i++)
            if (v[i] == v[x])
                return v[i];
        return -1;
    }

    //Ejercicio 25
    static int quants(int[] v, int x) {
        int contador = 0;
        for (int i = 0; i < v.length; i++)
            if (v[i] == x)
                contador++;
        return contador;

    }

    //Ejercicio 26
    static boolean num_primers(long n) {
        if (n <= 2)
            return n == 2;
        if (n % 2 == 0)
            return false;
        long sq = (long) Math.sqrt(n);
        for (int m = 3; m <= sq; m += 2)
            if (n % m == 0)
                return false;
        return true;
    }

    static long[] vec_primers(int num_primers) {
        long[] primos = new long[num_primers];
        primos[0] = 2;
        long provar = 3;
        int num_primos = 1;
        while (provar <= num_primers) {
            if (num_primers(provar))
                primos[num_primos++] = provar;
            provar += 2;
        }
        return Arrays.copyOf(primos, num_primos);
    }

    //Ejercicio 27
    static void inserta(int[] v, int x, int p) {
        int[] save = Arrays.copyOf(v, v.length);
        if (0 == p) {
            v[0] = x;
            for (int i = 0; i < v.length - 1; i++) {
                v[i + 1] = save[i];
            }
        } else if (v.length - 1 == p) {
            v[v.length - 1] = x;
        } else {
            for (int i = p, k = p; i < v.length; i++, k++) {
                v[p] = x;
                v[i] = save[k - 1];
            }
        }
        System.out.println(Arrays.toString(v));
    }


    public static void main(String[] args) {
        int buscarEnV[] = {1, 2, 3, 4, 5, 15, 85, 9, 9, 8, 7, 5, 6, 7, 89, 78};
        inserta(buscarEnV, 666, 15);
    }
}
