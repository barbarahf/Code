import java.util.Scanner;

public class casting {
    public static void main(String[] arg) {

        int kotlin;
        kotlin = (int) 5.5;
        System.out.println(kotlin);
        String javaScript = "el mejor lenguaje de programacion";
        System.out.println(javaScript.length());
        final float NOENTERO = 5.55f;
        System.out.println(NOENTERO);

        Scanner practica = new Scanner(System.in);
        int basico;
        System.out.println("Introduce un valor:");
        basico = practica.nextInt();
        System.out.println("El valor es " + basico);
        System.out.println("introduce un string");
        String nombres = practica.nextLine();
        System.out.println(nombres);

    }
}
