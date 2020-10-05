import java.util.Arrays;

class Dado {
    int resultado;

    public int lanzarDado() {
        this.resultado = (int) (Math.random() * (6 - 1 + 1) + 1);
        return this.resultado;
    }

    @Override
    public String toString() {
        return "" + resultado;
    }


}

class Caballo {
    private Dado myDado = new Dado();
    private final String nombre;

    public int getNumJugada() {
        return numJugada;
    }

    private int numJugada = 0;
    private int[] puntos = new int[10];

    public int getPuntos(int numJugada) {
        return puntos[numJugada];

    }

    public Caballo(String nombre) {
        this.nombre = nombre;
    }

    public void jugar() {
        if (numJugada <= 10) {
            puntos[numJugada] = this.myDado.lanzarDado();
            numJugada++;
        }
    }

    @Override
    public String toString() {
        return nombre + " dado:" + myDado;
    }

}


public class Partida {
    //Aumentar movida
//    static int count = Caballo.numJugada;
    static Caballo tablero[][] = new Caballo[3][20];

    static int move(int numMove, int y) {//Move debe ser de caballo
        //Y desplazamiento horizontal
        while (y < numMove) {
            y++;
        }
        return y;
    }

    public static void move() {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                if (tablero[i][j] != null) {
                    Caballo temp = tablero[i][j];
                    int save = move(tablero[i][j].getPuntos(0), j);
                    tablero[i][j] = null;
                    tablero[i][save] = temp;
                }
            }
        }
    }

    static public void printTablero() {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                if (tablero[i][j] == null) {
                    System.out.print("  *****  ");
                } else {
                    System.out.print(tablero[i][j] + " ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Caballo a1 = new Caballo("a1");
        Caballo a2 = new Caballo("a2");
        Caballo a3 = new Caballo("a3");


        tablero[0][0] = a1;
        tablero[1][0] = a2;
        tablero[2][0] = a3;
        System.out.println(a1 + "  " + a2 + "  " + a3);
        a1.jugar();
        a2.jugar();
        a3.jugar();//Jugar en loop?
        move();
       /* Caballo.numJugada++;*/
        System.out.println(a1 + "  " + a2 + "  " + a3);
        a1.jugar();
        a2.jugar();
        a3.jugar();//Jugar en loop?
        move();
      /*  Caballo.numJugada++;*/
        System.out.println(a1 + "  " + a2 + "  " + a3);

        printTablero();

    }
}
