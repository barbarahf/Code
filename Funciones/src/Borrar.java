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
        boolean aux = false;
        for (int p = 0; p < v.length; p++) {
            if (v[p] != v_dins[0]) {
                continue;
            }
            for (int j = 0; j < v_dins.length; j++, p++) {
                if (v[p] == v_dins[j]) {
                    aux = true;
                } else {
                    aux = false;
                    p--;
                    break;
                }
            }
        }
        return aux;
    }

    public static void main(String[] args) {
        int uno[] = {1,2,3,4,5,1,1,2,3,4,5,6};
        int dos[] = {1,2,3,4,5,6};
        System.out.println(conte(uno, dos));
    }
}
