package Museo;

import java.io.File;

public abstract class Obra implements Comparable<Obra> {
    private String nombreObra;
    private static final String AUTOR_DAFAUL = "Anonimo";
    private String autor;
    public static int numObra;
    private final File IMAGE;
    private int codi;

    public Obra(String nombreObra, String autor, File image) {
        this.nombreObra = nombreObra;
        this.autor = autor;
        this.codi = generarCodi();
        IMAGE = image;
        numObra++;
    }

    public Obra(String nombreObra, File image) {
        this(nombreObra, AUTOR_DAFAUL, image);
        this.codi = generarCodi();
        numObra++;
    }

    // <editor-fold defaultstate="collapsed" desc=" GETTERS & SETTERS ">


    public String getNombreObra() {
        return nombreObra;
    }

    public void setNombreObra(String nombreObra) {
        this.nombreObra = nombreObra;
    }

    public String getAUTOR_DAFAUL() {
        return AUTOR_DAFAUL;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getImage() {
        return IMAGE.getAbsolutePath().toString();
    }

    // </editor-fold>
    public abstract int generarCodi();

    @Override
    public int compareTo(Obra o) {
        return o.codi - codi;
    }


    @Override
    public String toString() {
        return "Obra{" +
                "nombreObra='" + nombreObra + '\'' +
                ", autor='" + autor + '\'' +
                ", codi=" + codi +
                '}';
    }
}
