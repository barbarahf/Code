package contenedor;

import java.util.ArrayList;

public class Coches {
    final public static int MAX_COCHES = 100;
    public static Coche[] alamacenCoches = new Coche[MAX_COCHES];
    private static int nCoche = 0;

    public void addCoche(Coche coche) {
        if (nCoche > MAX_COCHES)
            throw new IllegalArgumentException("No se pueden añair más coches en el almacen");
        alamacenCoches[nCoche++] = coche;
    }

    public Coche getCoche(int numCoche) {
        return alamacenCoches[numCoche];
    }

    public int sizeCochesList() {
        return alamacenCoches.length;
    }

    public Coche[] getCochesTable() {
        return alamacenCoches;
    }

    public void mostrarCoches() {
        for (int i = 0; i < alamacenCoches.length && alamacenCoches[i] != null; i++) {
            System.out.println(alamacenCoches[i]);
        }
    }
}
