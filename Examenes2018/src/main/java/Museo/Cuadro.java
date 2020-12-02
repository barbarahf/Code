package Museo;

import java.awt.image.BufferedImage;
import java.io.File;

public class Cuadro extends Obra {
    private static int numeroCuadro;
    private static final int CODI_BASE = 111;
    private int alto;
    private int ancho;

    public Cuadro(String nombreObra, String autor, int alto, int ancho, File image) {
        super(nombreObra, autor, image);
        this.alto = alto;
        this.ancho = ancho;
        numeroCuadro++;

    }

    public Cuadro(String nombreObra, int alto, int ancho, File image) {
        super(nombreObra, image);
        this.alto = alto;
        this.ancho = ancho;
        numeroCuadro++;
    }

    // <editor-fold defaultstate="collapsed" desc=" Getters & setters ">
    public float getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public float getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }


    // </editor-fold>

    @Override
    public int generarCodi() {
        return Integer.parseInt(CODI_BASE + "" + numeroCuadro);
    }

    @Override
    public String toString() {
        return super.toString() + "Cuadro{" +
                "alto=" + alto +
                ", ancho=" + ancho +
                '}';
    }

}
