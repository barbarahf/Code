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
    //11 nanosegundos
    static int max(int v[]) {
        int[] value = new int[v.length];
        System.arraycopy(v, 0, value, 0, v.length);
        Arrays.sort(value);
        int max = value[value.length - 1];
        return max;
    }


    //8 nanosegundos
    static int max_sort(int v[]) {
        int maxValue = v[0];
        for (int i = 0; i < v.length; i++) {
            if (v[i] > maxValue)
                maxValue = v[i];
        }
        return maxValue;
    }

    //Sobrecarga de metodos
    static double max_sort(double v[]) {
        double maxValue = v[0];
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
    static double vecMillon() {
        double[] vecMillion = new double[1000000];
        for (int n = 0; n < vecMillion.length; n++) {
            vecMillion[n] = (int) (Math.random() * (1 - 0 + 1) + 0);
        }
        return max(vecMillion);
    }

    //Ejercicio 21
    static int[] gira_vector(int[] vec) {
        int n, m = 0;
        int aux;
        for (n = 0, m = vec.length - 1; n < vec.length / 2; n++, m--) {
            aux = vec[n];
            vec[n] = vec[m];
            vec[m] = aux;
        }
        return vec;
    }

    //Ejercicio 22
    public static int[] add(int[] first, int[] second) {
        int lengthMax = first.length > second.length ? first.length : second.length;
        int lengthMin = first.length < second.length ? first.length : second.length;
        int[] result = new int[lengthMax];
        int[] copiaMax = new int[lengthMax];
        if (first.length > second.length)
            System.arraycopy(first, 0, copiaMax, 0, first.length);
        else
            System.arraycopy(second, 0, copiaMax, 0, second.length);
        for (int i = 0; i < lengthMin; i++) {
            result[i] = first[i] + second[i];
            for (int j = lengthMin; j < lengthMax; j++) {
                result[j] = copiaMax[j];

            }
        }

        return result;
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
    //Ejemplo
    static boolean isPrime(int n, int i) {
        if (n <= 2)
            return (n == 2) ? true : false;
        if (n % i == 0)
            return false;
        if (i * i > n)
            return true;
        // Recursividad para calular el siguiente
        return isPrime(n, i + 1);
    }
//        String numeros = Integer.toString(num_primers);
//        for (int i = 0; i < numeros.length(); i++) {
//            char charNumbers = numeros.charAt(i);
//            int n = Character.getNumericValue(charNumbers);

    static long[] vec_primers(int num_primers) {
        long[] primos = new long[0];
        for (int i = 1; i < num_primers; i++) {
            int contador = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0)
                    contador++;
            }
            if (contador == 2) {
                System.out.println(i);
                primos = new long[i];
                for (int k = 0; k < primos.length; k++) {
                    primos[k] = i;
                }
            }
        }
        return primos;
    }

    public static void main(String[] args) {
        int holi[] = {1, 2, 8, 9, 2, 2};
//        System.out.println(posicio(holi, 0));
//        System.out.println(quants(holi, 2));
//        int n = 7;
//        if (isPrime(n, 2)) System.out.println("Yes");
//        else
//            System.out.println("No");
        System.out.println(Arrays.toString(vec_primers(10)));
    }
}
