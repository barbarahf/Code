public class VecinosPosibles {
    static String[] encontrarVecinos() {
        String[] vecinos = new String[]{"Adam", "Cora", "Dale", "Bill", "Erin"};
        String[] vecinosEncontrados = new String[]{};//Array vacio para almacenar los elementos encontrados
        for (String vecinoTexto : vecinos) {    //for each para almacenar los posibles valores
            for (String vecinoTexto2 : vecinos) {
                if (vecinoTexto.equals(vecinoTexto2))
                    continue;                   //Continuar hasta que se cumpla la sentencia
                for (String vecinoTexto3 : vecinos) {
                    if (vecinoTexto3.equals(vecinoTexto2) || vecinoTexto.equals(vecinoTexto3))
                        continue;
                    for (String vecinoTexto4 : vecinos) {
                        if (vecinoTexto4.equals(vecinoTexto) || vecinoTexto4.equals(vecinoTexto2) ||
                                vecinoTexto4.equals(vecinoTexto3))
                            continue;
                        for (String vecinoTexto5 : vecinos) {
                            if (vecinoTexto5.equals(vecinoTexto) || vecinoTexto5.equals(vecinoTexto2) ||
                                    vecinoTexto5.equals(vecinoTexto3) || vecinoTexto5.equals(vecinoTexto4))
                                continue;
                            String[] posibles = new String[]{vecinoTexto, vecinoTexto2, vecinoTexto3, vecinoTexto4, vecinoTexto5};
                            //Crear array para almacenar todas la combinaciones posibles.
                            if (satisfa(posibles)) { //Aplicar filtro de satisfa
                                vecinosEncontrados = posibles;
                                return vecinosEncontrados;
                            }
                        }
                    }
                }
            }
        }
        return null; //Si no se cumplen las condiciones, la funcion retornará null
    }

    static boolean satisfa(String[] v) { //Funcion para filtrar el array
        return !v[4].equals("Adam") && !v[0].equals("Bill") && !v[0].equals("Cora") && !v[4].equals("Cora") &&
                piso(v, "Dale") > piso(v, "Bill")
                && piso(v, "Erin") != piso(v, "Cora") + 1
                && piso(v, "Erin") != piso(v, "Cora") - 1
                && piso(v, "Cora") != piso(v, "Bill") + 1
                && piso(v, "Cora") != piso(v, "Bill") - 1;

    }

    static int piso(String[] v, String veContString) {
        for (int i = 0; i < v.length; i++)
            if (v[i].equals(veContString))
                return i + 1;
        return -1;
    }

    public static void main(String[] args) {
        System.out.print("Los vecinos viven en el siguite orden:  ");
        System.out.println(java.util.Arrays.toString(encontrarVecinos()));
    }
}

