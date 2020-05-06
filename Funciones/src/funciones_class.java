public class funciones_class {
    //Ejercicio 1
    public static int max2(int a, int b) {
        if (a > b)
            return a;
        return b;
    }

    public static int max3(int a, int b, int c) {
        return max2(max2(a, b), c);
    }

    public static int max4(int a, int b, int c, int d) {

        return max2(max2(a, b), max2(c, d));
    }

    static boolean satisfa(String[] v) {
        return piso(v, "Adam") == piso(v, "Adams")+1;

    }

    static int piso(String[] v, String veContString) {
        for (int i = 0; i < v.length; i++)
            if (v[i].equals(veContString))
                return i + 1;
        return -1;
    }

    static String[] encontrarVecinos() {
        String[] vecinosEncontrados = new String[]{};
        String[] vecinos = new String[]{"hol","Adams","Adam"};
        if (satisfa(vecinos)) {
            vecinosEncontrados = vecinos;
            return vecinosEncontrados;
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println(java.util.Arrays.toString(encontrarVecinos()));
    }
}
