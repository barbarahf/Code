public class Borrar {
    //Ejercicio 22
    public static int[] suma_vectors(int[] first, int[] second) {
        int lengthMax = first.length > second.length ? first.length : second.length;
        int lengthMin = first.length < second.length ? first.length : second.length;
        int[] result = new int[lengthMax];
        int[] copiaMax = new int[lengthMax];
        if (first.length > second.length)
            System.arraycopy(first, 0, copiaMax, 0, first.length);
        else
            System.arraycopy(second, 0, copiaMax, 0, second.length);
        for (int i = 0; i < lengthMin; i++) {
            result[i] = first[i] + second[i];
            for (int j = lengthMin; j < lengthMax; j++) {
                result[j] = copiaMax[j];

            }
        }

        return result;
    }

    public static void main(String[] args) {
        int ejemplo[] = {1, 5, 8, 10, 11, 12, 13, 14, 9, 6};
    }
}
