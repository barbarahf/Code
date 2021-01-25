package contenedor_practica_0;

import java.util.Arrays;

public class Coches {
    final public static int MAX_COCHES = 100;
    //public static Coche[] alamacenCoches = new Coche[MAX_COCHES];
    private Coche[] alamacenCoches = new Coche[MAX_COCHES];
    private int nCoche;


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


    public void ordenarCoches() {
        Arrays.sort(alamacenCoches, 0, nCoche);
    }

//    public void ordenarCoches2() {
//        for (int i = 0; i <= nCoche; i++) {
//            if(alamacenCoches[i].getValor()>){
//
//            }
//        }
//    }

    public Coche[] getAlamacenCoches() {
        return alamacenCoches;
    }

    public int getnCoche() {
        return nCoche;
    }

    public void mostrarCoches() {
        for (int i = 0; i < alamacenCoches.length && alamacenCoches[i] != null; i++) {
            System.out.println(alamacenCoches[i]);
        }
    }
}
