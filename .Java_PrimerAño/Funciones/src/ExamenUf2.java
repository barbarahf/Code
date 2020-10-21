import java.util.Arrays;

/**
 * @author "Barbara Herrera Flores"
 */

public class ExamenUf2 {
    // Exercici 1
    public static int numEspacios(String s) {
        int cont = 0;
        for (int i = 0; i < s.length(); i++)
            if (s.charAt(i) == ' ')
                cont++;
        return cont;
    }

    // Exercici 2
    public static String minEspacios(String s1, String s2, String s3) {
        if (numEspacios(s1) == numEspacios(s2)) {
            return s1 + "\n" + s2;
        } else if (numEspacios(s1) == numEspacios(s3)) {
            return s1 + "\n" + s3;
        } else if (numEspacios(s2) == numEspacios(s3)) {
            return s2 + "\n" + s3;
        } else if (numEspacios(s1) < numEspacios(s2)) {
            if (numEspacios(s1) < numEspacios(s3)) {
                return s1;
            } else {
                return s3;
            }
        } else if (numEspacios(s2) < numEspacios(s3)) {
            return s2;
        } else {
            return s3;
        }
    }

    // Exercici 3
    public static int residuoDiv2(int n) {
        if (n % 2 == 0) {
            return residuoDiv2(n / 2);
        }
        return n;
    }

    // Exercici 4
    public static int[] transformaV(int[] v) {
        int[] re = new int[v.length];
        System.arraycopy(v, 0, re, 0, v.length);
        for (int i = 0; i < v.length; i++) {
            if (i == 0) { //Excepcion podria salir
                re[i] = re[i] * 2;
            }
            if (i % 2 == 0 && i != 0) {
                re[i] = re[i] * 2;
            } else if (i % 2 != 0) {
                re[i] = re[i] * 3;
            }
        }
        return re;
    }

    // Exercici 5
    public static boolean restoSuma(int[] v) {
        boolean respu = false;
        int suma = 0;
        for (int i = 0; i < v.length; i++) { //Mi editor me cambia auto el for por foreach
            suma += i;
        }
        for (int n = 0; n < v.length; n++) {
            System.out.println(suma);
            if (suma - v[n] == v[n])
                respu = true;
        }
        return respu;
    }

    // Exercici 6
    public static boolean deficiente(int num) {
        boolean aux = false;
        int suma = 0;
        for (int i = 1; i < num / 2; i++) {
            if (num % i == 0) {
                if (num / i == i) {
                    suma += i;
                } else {
                    suma += i;
                    suma += (num / i);
                }
            }
        }
        if (suma < 2 * num) {
            aux = true;
        }
        return aux;
    }

    public static void main(String[] args) {
        //Ejercicio 1
        System.out.println("Ejercicio 1");
        System.out.println("numEspacios(\"Hola que tal est�s\") =   " + numEspacios("Hola que tal est�s"));
        System.out.println("numEspacios(\"CadenaSinEspacios\")  =   " + numEspacios("CadenaSinEspacios"));
        System.out.println("numEspacios(\"\") =                     " + numEspacios(""));
        // Ejercicio 2
        System.out.println("Ejercicio 2");
        System.out.println("minEspacios(\"No se\", \"A B C DOS\", \"Solo yo\") =  " + minEspacios("No se", "A B C DOS", "Solo yo"));
        System.out.println("minEspacios(\"A B C DOS\", \"Solo yo\", \"No se\") =  " + minEspacios("A B C DOS", "Solo yo", "No se"));
        // Ejercicio 3
        System.out.println("Ejercicio 3");
        System.out.println("residuoDiv2(5)   = " + residuoDiv2(5));
        System.out.println("residuoDiv2(24)  = " + residuoDiv2(24));
        System.out.println("residuoDiv2(40)  = " + residuoDiv2(40));
        System.out.println("residuoDiv2(128) = " + residuoDiv2(128));
        // Ejercicio 4
        System.out.println("Ejercicio 4");
        int[] vx = {1, 5, 3, 7, 8, 2, 9, 4, 6};
        System.out.println("Si v = " + Arrays.toString(vx));
        System.out.println("transformaV(v) =   " + Arrays.toString(transformaV(vx)));
        // Ejercicio 5
        System.out.println("Ejercicio 5");
        int[] v2 = {1, 3, 15, 2, 5, 4};
        int[] va = {5};
        int[] vb = {8, 8};
        int[] vc = {};
        System.out.println("Si v = " + Arrays.toString(v2) + "      restoSuma(v) = " + restoSuma(v2));
//        v2[0] = 0;
        System.out.println("Si v = " + Arrays.toString(v2) + "      restoSuma(v) = " + restoSuma(v2));
        System.out.println("Si v = " + Arrays.toString(va) + "\t\t\trestoSuma(v) = " + restoSuma(va));
        System.out.println("Si v = " + Arrays.toString(vb) + "\t\t\trestoSuma(vb) = " + restoSuma(vb));
        System.out.println("Si v = " + Arrays.toString(vc) + "\t\t\trestoSuma(v) = " + restoSuma(vc));
        // Ejercicio 6
        System.out.println("Ejercicio 6");
        System.out.println("deficiente(12) = " + deficiente(12) + "   deficiente(14) = " + deficiente(14));

    }
}




