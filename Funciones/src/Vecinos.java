import java.util.ArrayList;
import java.util.List;
public class Vecinos {
    static List<String> encontrarVecinos() {
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
//                            String[] posibles = new String[]{vecinoTexto, vecinoTexto2, vecinoTexto3, vecinoTexto4, vecinoTexto5};
                            List<String> lista = new ArrayList<>();
                            lista.add(vecinoTexto);
                            lista.add(vecinoTexto2);
                            lista.add(vecinoTexto3);
                            lista.add(vecinoTexto4);
                            lista.add(vecinoTexto5);
                            List<String> filters = new ArrayList<>();
                            if(satisfa(lista))
                            System.out.println("culito");
//                            filters.add(satisfa(list));
//                            System.out.println("Original List " + list);
////                            list.removeAll(filters);
//                            System.out.println("Filtered List " + list);

                        }
                    }
                }
            }
        }
        return null;
    }
    static boolean satisfa(List<String> v) {
        return piso(v, "Adam") != 5 && piso(v, "Bill") != 1 &&
                piso(v, "Cora") != 1 && piso(v, "Cora") != 5 &&
                piso(v, "Dale") == piso(v, "Bill") + 1
                && piso(v, "Erin") != piso(v, "Cora") + 1
                && piso(v, "Erin") != piso(v, "Cora") - 1
                && piso(v, "Cora") != piso(v, "Bill") + 1
                && piso(v, "Cora") != piso(v, "Bill") - 1;
    }

    static int piso(List<String> v, String veContString) {
        for (int i = 0; i < v.size(); i++)
            if (v.get(i).equals(veContString))
                return i + 1;
        return -1;
    }

    public static void main(String[] args) {
//        System.out.println(java.util.Arrays.toString(encontrarVecinos()));
    }
}

/*
*     return !v[4].equals("Adam") && !v[0].equals("Bill") && v[0].equals("Cora") && v[4].equals("Cora") &&
                v[piso(v, "Dale")].equals("Dale") == v[piso(v, "Bill") + 1].equals("Bill")
                && v[piso(v, "Erin")] != v[piso(v, "Cora") + 1]
                && v[piso(v, "Erin")] != v[piso(v, "Cora") - 1]
                && v[piso(v, "Cora")] != v[piso(v, "Bill") + 1]
                && v[piso(v, "Cora")] != v[piso(v, "Bill") - 1];*/