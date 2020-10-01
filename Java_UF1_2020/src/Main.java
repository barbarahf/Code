import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String ciclo, curso, nom;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ciclo?");
        ciclo = sc.nextLine();
        System.out.println("Curso?");
        curso = sc.nextLine();
        System.out.println("nom?");
        nom = sc.nextLine();
        System.out.println("Bienvenido a " + ciclo + curso + "! " + nom);

        int nMatriculats = 25;
        int edats[] = new int[nMatriculats];
        inicialitzaEdats(edats);
        mostrar(edats);//Arrays.ToString
        System.out.println();
        System.out.println("La media es: " + media(edats));
        System.out.println("La edad minima es: " + edatMaxima(edats));
        System.out.println(hiHaAlgunMenor(edats) ? "Hay menores de edad" : "No hay menores de edad");

    }

    public static void inicialitzaEdats(int[] edats) {
        for (int i = 0; i < edats.length; i++) {
            edats[i] = (int) ((Math.random() * (40 - 17)) + 17);
        }
    }

    public static void mostrar(int arr[]) {
        String sep = "";
        for (int i = 0; i < arr.length; i++) {
            System.out.print(sep + " " + arr[i]);
            sep = ",";
        }
    }

    public static int media(int edadt[]) {
        int values = 0;
        for (int i = 0; i < edadt.length; i++) {
            values += edadt[i];
        }
        return values / edadt.length;
    }

    static int edatMaxima(int edats[]) {
        //Java Arrays.sort(edats) edats[0]
        int sav = edats[0];
        for (int i = 0; i < edats.length; i++) {
            for (int j = 0; j < edats.length; j++) {
                if (edats[j] > edats[i] && edats[i] < sav) {
                    sav = edats[i];
                }
            }
        }
        return sav;
    }

    static boolean hiHaAlgunMenor(int edats[]) {
        if (edatMaxima(edats) < 18)
            return true;
        return false;
    }
}
