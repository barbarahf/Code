import java.util.ArrayList;
import java.util.List;

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
    List<Integer> puntos = new ArrayList<Integer>();
    private final String nombre;

    public Caballo(String nombre) {
        this.nombre = nombre;
    }

    void jugar() {
        puntos.add(this.myDado.lanzarDado());
    }

    public Integer getPuntos(int i) {
        return puntos.get(i);
    }

    @Override
    public String toString() {
        return nombre + " dado:" + myDado;
    }
}

public class Partida {
    Caballo[] jugadores;
    private final int numJugadores = 3;
    //    private int numeroPartida;//
    Caballo[][] tablero = new Caballo[4][20];
    private int contador = 0;

    public Partida(/*int numeroPartida,*/ Caballo[] jugadores) {
//        this.numeroPartida = numeroPartida;
        this.jugadores = jugadores;
    }

    private void iniTablero() {
        for (int i = 0; i < jugadores.length; i++) {
            tablero[i][0] = jugadores[i];
        }
    }


    private void partida() {

        if (contador == 0) {
            iniTablero();
        }
        for (int i = 0; i < jugadores.length; i++) {
            jugadores[i].jugar();

        }
        move();
        printTablero();
        contador++;

    }

    static int move(int numMove, int y) {
        while (y < numMove) {//Y desplazamiento horizontal
            y++;
        }
        return y;
    }

    private void move() {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                if (tablero[i][j] != null) {
                    Caballo temp = tablero[i][j];
                    tablero[i][j] = null;
                    tablero[i][temp.getPuntos(contador)/*Num jugada*/] = temp;
                }
            }
        }
    }

    void printTablero() {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }
    }

    //get ganador
    //Una partida tiene sus reglas
    //QUien se mueve antes
    //SI hay un empate

    public static void main(String[] args) {
        Caballo[] jugadores = {new Caballo("ju1"), new Caballo("ju2"), new Caballo("ju3")};

        Partida num1 = new Partida(jugadores);
        num1.partida();


    }
}
