import java.util.Scanner;

public class random {
    public static void main(String[] arg) {
//System.out.println((int) Math.random() * (maxim-minim+1)) + minim);
        //Ejercicio1
        System.out.println(Math.random());
        System.out.println(Math.random());
        System.out.println(Math.random());
        //Ejerciocio 2
        System.out.println((int) (Math.random() * (9) - 3));
        //Ejercicio 3
        int getNumber = (int) ((Math.random() * 6) + 1);
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer from 1 to 6");
        int userGetNum = input.nextInt();
        //Operador condicional condicion ? sentencia : else:
        System.out.println(userGetNum == getNumber ? "You win " + "you have: " + userGetNum + "  " + "The machine has: " + getNumber
                : "Sorry, the machine wins " + "you have: " + userGetNum + "  " + "The machine has: " + getNumber);
        //Ejercicio 4
        String alfabeto = "AABCDEFGHIJALMNAOPERSTUVIOAU";
        int longitud = (alfabeto.length() - 1);
        int caracter1 = (int) (Math.random() * (longitud + 1) - 0);
        int caracter2 = (int) (Math.random() * (longitud + 1) - 0);
        int caracter3 = (int) (Math.random() * (longitud + 1) - 0);
        int caracter4 = (int) (Math.random() * (longitud + 1) - 0);
        char result1 = alfabeto.charAt(caracter1);
        char result2 = alfabeto.charAt(caracter2);
        char result3 = alfabeto.charAt(caracter3);
        char result4 = alfabeto.charAt(caracter4);
        System.out.println(result1 + " " + result2 + " " + result3 + " " + result4);
        //Ejercicio 5
        String porcentaje = "1111111XX2";
        int aleatorioPorcentaje = ((int) (Math.random() * (10)));
        char resultPorcentaje = porcentaje.charAt(aleatorioPorcentaje);
        System.out.println(resultPorcentaje);
    }
}
