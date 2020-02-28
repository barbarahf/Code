public class VecinosPosibles {
    static String[] encontrarVecinos() {
        String[] v = new String[]{"Adam", "Cora", "Dale", "Bill", "Erin"};
        for (String vecinoTexto : v) {
            for (String vecinoTexto2 : v) {
                if (vecinoTexto.equals(vecinoTexto2))
                    continue;
                for (String vecinoTexto3 : v) {
                    if (vecinoTexto3.equals(vecinoTexto2) || vecinoTexto.equals(vecinoTexto3))
                        continue;
                    for (String vecinoTexto4 : v) {
                        if (vecinoTexto4.equals(vecinoTexto) || vecinoTexto4.equals(vecinoTexto2) ||
                                vecinoTexto4.equals(vecinoTexto3))
                            continue;
                        for (String vecinoTexto5 : v) {
                            if (vecinoTexto5.equals(vecinoTexto) || vecinoTexto5.equals(vecinoTexto2) ||
                                    vecinoTexto5.equals(vecinoTexto3) || vecinoTexto5.equals(vecinoTexto4))
                                continue;
                            String[] posibles = new String[]{vecinoTexto, vecinoTexto2, vecinoTexto3, vecinoTexto4, vecinoTexto5};
//                            System.out.println(vecinoTexto + " " + vecinoTexto2 + " " + vecinoTexto3 + " " + vecinoTexto4 + " " + vecinoTexto5);
                            satisfa(posibles);
                        }
                    }
                }
            }
        }
        return null;
    }

    static boolean satisfa(String[] v) {
        if (!v[4].equals("Adam") && !v[0].equals("Bill") && v[0].equals("Cora") && v[4].equals("Cora") &&
                piso(v, "Dale") == piso(v, "Bill") + 1
                && piso(v, "Erin") != piso(v, "Cora") + 1
                && piso(v, "Erin") != piso(v, "Cora") - 1
                && piso(v, "Cora") != piso(v, "Bill") + 1
                && piso(v, "Cora") != piso(v, "Bill") - 1) {
            return true;
        }
        return false;

    }

    static int piso(String[] v, String veContString) {
        for (int i = 0; i < v.length; i++)
            if (v[i].equals(veContString))
                return i + 1;
        return -1;
    }

    public static void main(String[] args) {
        String[] v = new String[]{"hola", "adios"};
        System.out.println(piso(v, "adios"));

    }
}
