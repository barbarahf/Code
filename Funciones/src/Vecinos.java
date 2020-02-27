public class Vecinos {
    static String[] encontrarVecinos() {

        String[] vecinosArray = new String[]{"Bill", "Adam", "Cora", "Erin", "Dale"};
        satisfa(vecinosArray);
        return vecinosArray;
    }

    static boolean satisfa(String[] v) {
        if (!v[4].equals("Adam") && !v[0].equals("Bill")
                && v[0].equals("Cora") && v[4].equals("Cora")
//                && !v[0+].equals("Bill")

        )
            return true;
        return false;
    }

    public static void main(String[] args) {
        //String[] strArray3 = new String[3];
        //  String[] strArray1 = new String[]{"A", "B", "C"};

//   String[] vecionesArray = new String[]{"Paloma"}
//        vecinosArray ={"HOLA"}

    }

}
