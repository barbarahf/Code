import java.util.Arrays;

public class TiempoEjecucion {
    static int maxim(int v[]) {
        int maxValue = v[0];
        for (int i = 0; i < v.length; i++) {
            if (v[i] > maxValue)
                maxValue = v[i];
        }
        return maxValue;
    }

    public static void main(String[] args) {
        long tiempoMs = System.currentTimeMillis();
        long tiempoNs = System.nanoTime();

        int vduo[] = {5, 8, 10, 5, 8, 10, 5, 8, 10, 5, 8, 10, 5, 8, 10, 5, 8, 105, 8, 10, 5, 8, 10};
        maxim(vduo);
        System.out.println("Tiempo invertido = " + (System.nanoTime() - tiempoNs));
        System.out.println("Tiempo invertido = " + (System.currentTimeMillis() - tiempoMs));
    }
}
