import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class matricesFinal {
    public static boolean Comprobar(String options) {
        return options.matches("piedra|papel|tijeras");
    }

    public static void main(String[] args) {
//        float[] firstArray = new float[1000];
//        firstArray[2] = 15;
//        for (int i = 0; i < firstArray.length; i++) {
//            if (firstArray[i] > 0) {
//                System.out.println("Primer elemento diferent de 0: " + firstArray[i]);
//            } else {
//                System.out.println(firstArray[i] == 0 ? "Todos son 0" : "");
//
//            }
//        }
        Scanner teclado = new Scanner(System.in);
        //Ejercicio 2
//        //Arrays.deepToString(twoDimensionArray)
//        String[] datoText = new String[10];
//        for (int i = 0; i < datoText.length; i++) {
//            System.out.print("Introduce el elemento " + (i + 1) + " del vector: ");
//            String content = teclado.nextLine();
//            datoText[i] = content;
//        }
//        for (int j = 0; j < datoText.length; j++) {
//
//            System.out.println("Elemento [" + (j + 1) + "] = " + datoText[j]);
//        }
        //Ejercicio 3
//        int[] divThis = {8, 9, 5, 2, 1, 4, 6, 7, 3};
//        int logitudAlmacen = divThis.length;
//        int[] vecA = new int[(logitudAlmacen + 1) / 2];
//        int[] vecB = new int[logitudAlmacen - vecA.length];
//        //Recorrer logitud
//        for (int j = 0; j < divThis.length; j++) {
//            if (j < vecA.length) {
//                vecA[j] = divThis[j];
//            } else
//                vecB[j - vecA.length] = divThis[j];
//        }
//        System.out.println(Arrays.toString(vecA));
//        System.out.println(Arrays.toString(vecB));
        /*int [] x= {8,7,5,6,2,4,3,1};
        int len = x.length;
        int a[] = Arrays.copyOfRange(mergeSort(x), 0, len/2);
        int b[] = Arrays.copyOfRange(mergeSort(x), (len/2), len);

        System.out.println("A: " + Arrays.toString(a));
        System.out.println("B: " + Arrays.toString(b));*/
//      int ALEATORIOS = (int)(Math.random()*(maxim-minim+1)+minim);
//      */
        //Ejercicio 4
//        int max = 1000;
//        int min = 1500;
//        int counter = 0;
//        int[] varEntero = new int[1000];
//        for (int vec = 0; vec < varEntero.length; vec++) {
//            varEntero[vec] = (int) (Math.random() * (max - min + 1) + min);
//            if (varEntero[vec] == 1250) {
//                System.out.println(varEntero[vec]);
//                counter++;
//                System.out.println(counter);
//            }
//        }
        //Ejercicio 5
/*
*      char a[] = {'G','f','G'};
       // Traversing the array
       for(int i = 0;i<3;i++){
          // Array.getChar() method
           char x = Array.getChar(a, i);
* */

//        char[] porcentajes = {'1', '1', '1', '1', '1', '1', '1', '1', '1', '1', 'X', 'X', 'X', '2', '2', '2'};
//        int firstNum = porcentajes[0];
//        int lastNum = porcentajes[porcentajes.length - 1];
//
//        for (int getAle = 0; getAle < porcentajes.length; getAle++){
////                    int getChar = (int) (Math.random() * (lastNum - firstNum + firstNum) + firstNum);
//                    char x = Array.getChar(porcentajes, getAle);
//        }
        //EJERCICIO 5
//        String separator = "";
//        char[] porcentajes = {'1', '1', '1', '1', '1', '1', '1', '1', '1', '1', 'X', 'X', 'X', '2', '2', '2'};
//        int lastNum = porcentajes.length - 1;
////        int firstNum = porcentajes[0];
//        System.out.print("[");
//        for (int recorre = 0; recorre < porcentajes.length; recorre++) {
////            Arrays.sort(porcentajes);
//            int getAleatory = (int) (Math.random() * (lastNum - 0 + 1) + 0);
//            System.out.print(separator + (porcentajes[getAleatory]));
//            separator = ", ";
//        }
//        System.out.print("]");
        //Ejercicio 6
        String[] cadenasVec = {"piedra", "papel", "tijeras"};
        String varInput = teclado.nextLine();
        String aleatory = cadenasVec[(int) (Math.random() * 3)];
        while (!Comprobar(varInput)) {
            System.out.println("Los valores introducidos son incorrectos, intentalo otra vez");
            varInput = teclado.nextLine();
        }
        System.out.println("Computadora: " + aleatory);
        System.out.println("Tu: " + varInput);
        switch (varInput) {
            case "piedra":
                if (aleatory.equalsIgnoreCase("tijeras")) {
                    System.out.println("ganas");
                } else if (aleatory.equalsIgnoreCase("papel")) {
                    System.out.println("pierdes");
                }
                break;
            case "papel":
                if (aleatory.equalsIgnoreCase("piedra")) {
                    System.out.println("ganas");
                } else if (aleatory.equalsIgnoreCase("tijeras")) {
                    System.out.println("pierdes");
                }
                break;
            case "tijeras":
                if (aleatory.equalsIgnoreCase("papel")) {
                    System.out.println("ganas");
                } else if (aleatory.equalsIgnoreCase("piedra")) {
                    System.out.println("pierdes");
                }
                break;
        }
        //Ejercicio 7
    }

}


