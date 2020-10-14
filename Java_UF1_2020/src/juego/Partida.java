package juego;

import java.util.ArrayList;
import java.util.List;


class Dado {
    int resultado;

    public int lanzarDado() {
        this.resultado = (int) (Math.random() * (6 - 1 + 1) + 1);
        return this.resultado;
    }

}

class Caballo {
    private final Dado myDado = new Dado();
    private List<Integer> puntos = new ArrayList<Integer>();
    private int myCount = 0;//Contador, no acceder al array de puntos constantemente
    private final String nombre;

    public Caballo(String nombre) {
        this.nombre = nombre;
    }

    public List<Integer> getPuntos() {
        return puntos;
    }

    void jugar() {
        int temp = this.myDado.lanzarDado() + this.myDado.lanzarDado();//Al jugar debe lanzar dos dados simultaneamente
        puntos.add(temp);//Registor de puntos
        this.myCount += temp;//Contador total
    }

    public int getCount() {
        return myCount;
    }

    public int sumPuntos() {
        int sum = 0;
        for (int i = 0; i < puntos.size() - 1; i++) {//Sumar todos, menos el ultimo movimiento
            sum += puntos.get(i);
        }
        return sum;
    }

    public String getNombre() {
        return nombre;
    }

}

//Partida

public class Partida {
    private final int numGana = 100;
    Caballo[] jugadores;

    public Partida(Caballo[] jugadores) {
        this.jugadores = jugadores;
    }

    private void Iniciarpartida() {
        for (int i = 0; i < jugadores.length; i++) {
            jugadores[i].jugar();
        }

        if (!ganardor()) {
            Iniciarpartida();
        } else {//Configurar
            checkGanador();
        }
    }

    boolean ganardor() { //Busca si alguien alcanzo la puntuacion
        for (int i = 0; i < jugadores.length; i++) {
            if (jugadores[i].getCount() >= numGana)
                return true;
        }
        return false;
    }

    void checkGanador() {
        for (int i = 0; i < jugadores.length; i++) {
            for (int j = i + 1; j < jugadores.length; j++) {//Check ultima puntuacion para obtener a el ganador
                int jugI = jugadores[i].getPuntos().get(jugadores[i].getPuntos().size() - 1);
                int jugJ = jugadores[j].getPuntos().get(jugadores[j].getPuntos().size() - 1);
                if (jugI > jugJ) {//Ordenadar de menor a mayor (ultima jugada)
                    Caballo sav = jugadores[i];
                    jugadores[i] = jugadores[j];
                    jugadores[j] = sav;
                }
                if (jugI == jugJ) {//Check empate
                    if (jugadores[i].sumPuntos() > jugadores[j].sumPuntos()) {
                        Caballo sav = jugadores[i];
                        jugadores[i] = jugadores[j];
                        jugadores[j] = sav;
                    }
                    if (jugadores[i].sumPuntos() == jugadores[j].sumPuntos()) {
                        System.out.println("Existe un empate");
                    }
                }
            }
        }

        for (int i = 0; i < jugadores.length; i++) {
            if (jugadores[i].getCount() >= numGana) {
                System.out.println("El ganador es: " + jugadores[i].getNombre());
                break;
            }
        }

    }

    public static void main(String[] args) {
        Caballo[] jugadores = {new Caballo("Relampago"), new Caballo("Spirit"), new Caballo("Rayo")};
        Partida num1 = new Partida(jugadores);
        num1.Iniciarpartida();
        for (int i = 0; i < jugadores.length; i++) {
            System.out.println(jugadores[i].getPuntos() + " " + jugadores[i].getNombre());
        }

    }
}
