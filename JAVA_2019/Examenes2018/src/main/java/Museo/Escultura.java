package Museo;

import java.awt.image.BufferedImage;
import java.io.File;

public class Escultura extends Obra {
    private static int numeroEscutura;
    private static final int CODI_BASE = 555;
    private int peso;

    public Escultura(String nombreObra, String autor, File image, int peso) {
        super(nombreObra, autor, image);
        this.peso = peso;
        numeroEscutura++;

    }

    public Escultura(String nombreObra, File image, int peso) {
        super(nombreObra, image);
        this.peso = peso;
        numeroEscutura++;
    }

    public int getPeso() {
        return peso;
    }

    @Override
    public int generarCodi() {
        return Integer.parseInt(CODI_BASE + "" + numeroEscutura);
    }

    @Override
    public String toString() {
        return super.toString() + "Escultura{" +
                "peso=" + peso +
                '}';
    }

}
