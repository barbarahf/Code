package JuegoCaballos;

public class Partida implements JocInterface {
    Cavall[] jugadores;
    static int numGana = 10;

    public Partida(Cavall[] jugadores) {
        this.jugadores = jugadores;
    }

    @Override
    public void iniciarJoc() {
        jugada();
        if (!esFinal()) {
            iniciarJoc();
        } else {
            finalJoc();
        }
    }

    @Override
    public void jugada() {
        for (Cavall jugadore : jugadores) {
            jugadore.jugaDaus();
            System.out.println("Comprobar " + jugadore.sumaDaus() + " " + jugadore.getNomNen()); //PARA COMPROBAR POR PANTALLA
            jugadore.endavant(jugadore.sumaDaus());
        }
    }

    @Override
    public boolean esFinal() {
        for (Cavall jugador : jugadores) {
            if (jugador.getPosicio() >= numGana) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void finalJoc() {
        boolean empate = false;
        for (int i = 0; i < jugadores.length; i++) {
            for (int j = i + 1; j < jugadores.length; j++) {
                if (jugadores[i].sumaDaus() > jugadores[j].sumaDaus()) {
                    Cavall sav = jugadores[i];
                    jugadores[i] = jugadores[j];//La primera posicion tendrá el ganador
                    jugadores[j] = sav;
                    empate = false;
                }
                if (jugadores[i].sumaDaus() == jugadores[j].sumaDaus()) {
                    if (jugadores[i].getPosicio() > jugadores[j].getPosicio()) {
                        Cavall sav = jugadores[i];
                        jugadores[i] = jugadores[j];
                        jugadores[j] = sav;
                        empate = false;
                    }
                    if (jugadores[i].getPosicio() == jugadores[j].getPosicio() &&
                            (jugadores[i].getPosicio() >= numGana && jugadores[j].getPosicio() >= numGana)) {
                        empate = true;
                    }
                }
            }
        }
        for (Cavall jugadore : jugadores) {
            if (jugadore.getPosicio() >= numGana) {
                System.out.println("El ganador es: " + ((empate) ? "Hay un empate " : jugadore.getNomNen()));
                break;
            }
        }
    }


    public static void main(String[] args) {
        long startTime = System.nanoTime();
        Cavall[] jugadores = {new Cavall("Relampago"), new Cavall("Spirit"), new Cavall("Rayo")};
        Partida newPartida01 = new Partida(jugadores);
        newPartida01.iniciarJoc();

        for (Cavall jugador : jugadores) {
            System.out.println(jugador.getPosicio() + " " + jugador.getNomNen());
        }
        long endTime = System.nanoTime();

        System.out.println(endTime - startTime);
    }

}
