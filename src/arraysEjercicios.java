import java.util.Scanner;

public class arraysEjercicios {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Ejercicio 1
        //Se puede crear una varibale de comprobacion usando true and false(boolean)
        System.out.println("Introduce la longitud del array:");
        int arraySize = scan.nextInt();
        float socunArray[] = new float[arraySize];
        for (int var = 0; var < socunArray.length; var++) {
            if (socunArray[var] != 0) {
                //Print "n", esa es la posicion del elemento
                System.out.println("El elemento en la posicion"+ var + "es diferente de 0");
                break;
            }
        }
        //Ejercicio 2
        String[] cadenaArray = new String[10];
        for (int n = 0; n < cadenaArray.length; n++) {
            System.out.print("Introduce un elemento tipo string al array:");
            cadenaArray[n] = scan.nextLine();
        }
        for (int i = 0; i < cadenaArray.length; i++) {
            System.out.print("Elemento" + (i + 1) + " : ");
            System.out.print(cadenaArray[i] + "\n");
        }
        //Ejercicio 3

        //Varctor .legth % 2 == 0 -> par
        //How to get possitin no a vertor
        //Par o impares
//        int dosVec1 []= {8,9,5,3,4,6};
//
//        int dosVec2 []= {2,1,7,5,6,3};
//        System.out.println(dosVec2[4]);

    }
}
