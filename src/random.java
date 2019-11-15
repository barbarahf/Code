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
        System.out.println("Introduce un numero entero del 1 al 6");
        int userGetNum = input.nextInt();
        System.out.println(userGetNum == getNumber ? "Yassss " + userGetNum + "  " + getNumber : "Sorry, the machine wins " + userGetNum + "  " + getNumber);
        /*
        public class EjemploIF {
    public static void main(String args[]) {
        int i = 1;
        int j = 2;
        int numeroMayor = 0;
        numeroMayor = i > j ? i : j;
        System.out.println("numeroMayor: " + numeroMayor);
    }

        * */
    }
}
