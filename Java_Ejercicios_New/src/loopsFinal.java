import java.util.Scanner;

public class loopsFinal {
//    String numeros;

//    public static boolean Comprobar(String numeros) {
//        return numeros.matches("[1-9]*");
//    }

    public static void main(String[] args) {
        //Ejercicio 8
//        Scanner teclado = new Scanner(System.in);
//        System.out.println("Introduce el numero de días trabajados:");
//        String numeros = teclado.nextLine();
//        while (!Comprobar(numeros) || Integer.parseInt(numeros) >= 31) {
//            System.out.println("Los días introducidos son incorrectos, intentalo de nuevo:");
//            numeros = teclado.nextLine();
//        }
//
//        int retorna = Integer.parseInt(numeros);
//        System.out.println("Trabajó " + retorna + " dias");
//        //Ejercicio 9
//        int n1 = 99;
//        for (int i = 10; i <= n1; i++) {
//            System.out.println(i);
//        }
//        int n2 = 9, m2 = 9;
//        for (int i2 = 1; i2 <= n2; i2++) {
//            for (int j = 0; j <= m2; j++) {
//                System.out.println(i2 + "" + j);
//            }
//        }
//        //Ejercicio 10
//        for (int n = 100; n <= 500; n++) {
//            int aux = n;
//            String j = Integer.toString(n); //Longitud del bucle
//
//            int u, c, d, resto;
//            c = n / 100; // 3,5
//            resto = n % 100; //Resto //10
//            d = resto / 10; //0
//            u = resto % 10; //0
//            if (n == Math.pow(c,3) + Math.pow(d,3) + Math.pow(u,3)){
//                System.out.println(c +" " + d+" " + u);
//            }
            /*
            *
            * int n = 1000;
              int length = (int)(Math.log10(n)+1);
*
             quotient = 3660 / 1000;     //This will give you 3
             remainder = 3660 % 1000;    //This will give you 660
             Then,
             quotient1 = remainder/ 100;     //This will give you 6
             remainder1 = remainder % 100;    //This will give you 60
             And finally
            quotient2 = remainder1 / 10;     //This will give you 6

            Let's say we have the number 7354. To find the thousands:
            *
            variable a = 7354 / 1000
            variable b = a % 10
            The number which is stored in variable b now is the number if the thousands. To find the hundreds:

            variable c = 7354 / 100
            variable d = a % 10
            The number which is stored in variable d now is the number if the hundreds. To find the tens:

            variable e = 7354 / 10
            variable f = a % 10
            The number which is stored in variable f now is the number if the tens. To find the ones: 7354 % 10
*/

        //Ejercicio 11
        int proSuma = 0;
        for (int n = 10; n <= 99; n++) {
            for (int m = 10; m <= 99; m++) {
                if (!(n == m)) {
                    proSuma += m * n;
                    System.out.println(n + " x+ " + m + " = " + proSuma);

                }
            }
        }
        //Ejercicio 12
//        int[] numeros = {1, 2, 0};
//        int conunt = 0;
//        for (int i = 0; i < numeros.length; i++) {
//            int a = numeros[i];
//            for (int j = 0; j < numeros.length; j++) {
//                int b = numeros[j];
//                for (int k = 0; k < numeros.length; k++) {
//                    int c = numeros[k];
//                    if (a != 0) {
////                        System.out.println(a + " " + b + " " + c);
//                        conunt++;
//
//                    }
//                }
//            }
//        }


//        System.out.println(conunt);
//        //Ejercicio 13/*
//        for (int f = 1; f < 100; f++) {
//            int finalValue = (int) Math.pow(f, 2);
//            int varSuma = finalValue;
//            System.out.println(finalValue);
//            int n = finalValue;
//        }

        //Ejercicio 14
        /*Tenim un càmping amb 9 bungalous i tres famílies que cal ubicar en aquests. Si
numerem de 1 a 9 els bungalous i anomenem a, b i c a les famílies, indiqueu totes les ternes
de l’estil 1-a 2-b 3-c que descriguin com podem ubicar les tres famílies en els bungalous
disponibles. És fàcil determinar que hem de fer tres bucles niuats de 1 a 9 descartant
repeticions (un bucle per a cada família) i que hi ha un total de 504 combinacions possibles
d’ubicar les tres famílies als 9 bungalous (se suposa que tots estan lliures evidentment).
*/
/*for ( int i = 0; i <=10; i++)
{
    numbers[i] = i;
}*/
//        int []camBungalos = new int[8];
//        //¿Como mostrar el contenido de una array*/
////        String familiaA = "Mendez";
////        String familiaB = "Flores";
////        String familiaC = "Herrera";
//        for (int i = 0; i <= 9; i++) {
//           camBungalos[i] = 5;
//            System.out.println(camBungalos.length);
//        }
    }
}
