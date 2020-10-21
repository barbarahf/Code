import java.util.Scanner;

public class cajero {
    public static void main(String[] arg) {
        //Declaracion de variable para almacenar la cantidad solicitada.
        Scanner teclado = new Scanner(System.in);
        System.out.println("IMPORTANTE: Nuestro cajero solo dispone de billetes de 50€ y 20€" + "\n" + "¿Cuanto dinero deseas retirar?:");

        int cantidadIntro = teclado.nextInt();

        System.out.println("Procesando transaccion... ");

        int billetes50 = cantidadIntro / 50;
        int resto = cantidadIntro % 50;
        int billetes20 = resto / 20; //Utilizando el resto, 50 tiene prioridad

        if (cantidadIntro == billetes50 * 50 + billetes20 * 20) {

            //Operador condicional, solo mostrar billetes de 50 o 20 si es necesario.
            System.out.println(billetes20 >= 1 ? "Recibes la cantidad de " + billetes20 + " billetes de 20€" : "");
            System.out.println(billetes50 >= 1 ? "Recibes la cantidad de " + billetes50 + " billetes de 50€" : "");

        } else if (billetes50 >= 1) { //Comprobar si hay billetes de 50
            billetes50 -= 1; //Quitar un billete de 50, añadirlo al resto y dividirlo entre 20.
            resto += 50;
            billetes20 = resto / 20;
            System.out.println(billetes20 >= 1 ? "Recibes la cantidad de " + billetes20 + " billetes de 20€" : "");
            System.out.println(billetes50 >= 1 ? "Recibes la cantidad de " + billetes50 + " billetes de 50€" : "");
        } else {
            System.out.println("No se puede extraer la cantidad ingresada");
        }
    }
}