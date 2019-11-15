import java.util.Scanner;

public class strings {
    public static void main(String[] arg) {
//Ejercicio 1
        Scanner practicas = new Scanner(System.in);
//        final String NOMBRES;
        System.out.println("Introduce tu nombre");
        String introduceNombre = practicas.next(); //Acepta numeros y letras como string
//        NOMBRES = practicas.nextLine();
        System.out.println("Hola " + "\"" + introduceNombre + "\"" + " jo em dic \"programa\"");
        //Ejercicio 2
        System.out.println("Introduce tu nombre:");

        String nombre1 = practicas.next();

        System.out.println("Introduce tu apellido");

        String apellido1 = practicas.next();

        System.out.println("Introduce tu segundo apellido");

        String apellido2 = practicas.next();

        String nombreCompleto = nombre1 + apellido1 + apellido2;

        System.out.println(nombreCompleto);
        //Ejercicio 3
        System.out.println("Ejercicio 3, introduce tu nombre:");
        String stringLegth = practicas.next();
        System.out.println(stringLegth.charAt(0));
        System.out.println(stringLegth.charAt(stringLegth.length() - 1));
        //Ejercicio4

    }
}
