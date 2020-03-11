import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class DesplazarArray {
    public int find(double[] array, double value) {
        for (int i = 0; i < array.length; i++)
            if (array[i] == value)
                return i;
        return 0;
    }

    public static void main(String[] args) {
        int[] v = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(v);
        int ultimo = v[9];//Ultimo elemento
        for (int i = v.length - 2; i >= 0; i--) {//Avanzar posiciones
            v[i + 1] = v[i];
        }
        v[0] = ultimo;//Ultimo elemento como primero
//        System.out.println(Arrays.toString(v));
//        Array.get(v).indexOf(8);
//        String[] hola = new String[]{"barb", "dos", "tetas"};
//        List<String> list = Arrays.asList(hola);
//        int index;
//        index = hola.indexOf("barb");
//
        int[] array = {45, 12, 85, 32, 89, 39, 69, 44, 42, 1, 6, 8};
        int temp;
        for (int i = 1; i < array.length; i++) {
            for (int j = i; j > 0; j--) {
                if (array[j] < array[j - 1]) {
                    temp = array[j];
                    array[j] = array[j - 1];
//                    array[j - 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
//        for (int i = 0; i < array.length; i++) {
//            System.out.println(array[i]);
//        }


    }
}
