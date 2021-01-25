import java.util.Arrays;
import java.util.Scanner;

class Alumne {
 
    private int edad;

    public Alumne(int edad) {
        this.edad = edad;
    }
}

class Alumnes {
    private int numEstudiantes;
    private static final int MINEDAT = 17;
    private static final int MAXEDAT = 40;
    private Scanner sc = new Scanner(System.in);

    public Alumne[] getClase() {
        return clase;
    }

    Alumne[] clase = new Alumne[numEstudiantes];

    public Alumnes() {
        this.numEstudiantes = sc.nextInt();
    }

    public Alumne[] setClase() {
        for (int i = 0; i < clase.length; i++) {
            clase[i] = new Alumne((int) ((Math.random() * (40 - 17)) + 17));
        }
        return clase;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Alumnes().setClase()));

    }
}
