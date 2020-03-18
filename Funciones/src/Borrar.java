import java.util.Arrays;

/*
* 28o) – Programeu una funció static boolean conte(int[] v, int[] v_dins) que retornarà true si
el vector v conté el vector v_dins, és a dir, si tots els elements de v_dins estan consecutius
en v. El procés seria buscar en v l’element v_dins[0], i un cop trobat, entrar en un bucle per
buscar a continuació la resta dels elements de v_dins. Si algú dels elements següents no es
troba dins de v, trencaríem el bucle amb un break i compararíem el següent valor.
* */
public class Borrar {
    static boolean conte(int[] v, int[] v_dins) {
        int[] aux = new int[v_dins.length];
        for (int m = 0; m < v.length; m++) {
            while (v[m] != v_dins[0])
                m++;
            for (int v_din : v_dins) {
                if (v[m] == v_din) {
                    int auxi = v[m];
                    m++;
                }
            }
            break;
        }
        return false;
    }

    public static void main(String[] args) {
        int uno[] = {1, 5, 8, 10, 11, 12, 13, 14, 9, 6};
        int dos[] = {10, 11, 12, 13, 14};
    }
}
