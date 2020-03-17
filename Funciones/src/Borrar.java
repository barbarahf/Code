import java.util.Arrays;

public class Borrar {
    static int major2(int a, int b) {
        if (a > b)
            return a;
        return b;
    }

    //Ejercicio 22
    public static int[] suma_vectores(int[] first, int[] second) {
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

    public static int[] suma_vectors(int[] v1, int[] v2) {
        int[] nuevo = new int[v1.length > v2.length ? v1.length : v2.length];
        if (v1.length > v2.length) {
            int aux[] = v1;
            v1 = v2;
            v2 = aux;
        }
        int min = v1.length;
        int max = v2.length;
        for (int i = 0; i < min; i++) {
            nuevo[i] = v1[i] + v2[i];
            System.arraycopy(v2, min, nuevo, min, max - min);
        }
        return nuevo;
    }

    public static void main(String[] args) {

        int sum[] = {1, 2, 3, 5, 5, 0};
        int sum2[] = {1, 2, 3, 5, 5, 8, 9, 8, 78};
        long tiempoMs = System.currentTimeMillis();
        long tiempoNs = System.nanoTime();

        System.out.println(Arrays.toString(suma_vectors(sum2, sum)));
        System.out.println("Tiempo invertido = " + (System.nanoTime() - tiempoNs));
        System.out.println("Tiempo invertido = " + (System.currentTimeMillis() - tiempoMs));
    }
}
