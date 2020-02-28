import java.util.Arrays;
import java.util.Random;

public class Vecinos {
    //    public static String[] shuffle() {
//        String[] characters = text.toCharArray();
//        for (int i = 0; i < characters.length; i++) {
//            int randomIndex = (int) (Math.random() * characters.length);
//            String temp[] = characters[i];
//            characters[i] = characters[randomIndex];
//            characters[randomIndex] = temp;
//        }
//        return new String(characters);
//    }
//    private static void shuffleArray(int[] array) {
//        int index, temp;
//        Random random = new Random();
//        for (int i = array.length - 1; i > 0; i--) {
//            index = random.nextInt(i + 1);
//            temp = array[index];
//            array[index] = array[i];
//            array[i] = temp;
//        }
//    }

    /*
    public static void shuffle() {
        int index;
        String temp;
        String[] v = new String[]{"Adam", "Cora", "Dale", "Bill", "Erin"};
        for (int i = v.length -1; i >0; i++) {
            index = (int) (Math.random() * v.length);
            temp = v[index];

            String aux = v[randomIndex];
            v[randomIndex] = v[randomIndex2];
            v[randomIndex2] = aux;
            System.out.println("Real prime numbers : " + Arrays.toString(v));

        }

    }
*/
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
                            System.out.println(vecinoTexto + " " + vecinoTexto2 + " " + vecinoTexto3 + " " + vecinoTexto4 + " " + vecinoTexto5);
                        }
                    }
                }
            }
        }
        return null;
    }

    /*
    * Adam no viu a l’últim pis !v[4].equals(“Adam”) o pis(“Adam”) != 5
    Bill no viu al primer pis !v[0].equals(“Bill”) o pis(“Bill”) != 1
    Cora no viu ni al primer ni a l’últim pis
    * /////////////
    Dale viu en un pis que està per sobre del de Bill
    Erin no viu en un pis al costat del pis on viu Cora (ni a sobre ni a sota d’ella)
    Cora no viu en un pis al costat del pis de Bill (ni a sobre ni a sota d’aquest)
    */
    static boolean satisfa(String[] v) {
        if (!v[4].equals("Adam") && !v[0].equals("Bill") && v[0].equals("Cora") && v[4].equals("Cora")) {
            return true;
        }
        for (int i = 0; i < v.length; i++) {
            for (int j = i + 1; j < v.length; j++) {
                if(v[i].equals("Adam")) {

                }
            }
        }

        return true;
    }
//    static int piso (String [] v, String ve){
//
//    }


    public static void main(String[] args) {
        encontrarVecinos();
//        System.out.println(encontrarVecinos());
        //shuffle();
    }
}
