/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.jaumebalmes.pguitart.museu;

/**
 * @author pguitart
 */
public abstract class Obra implements Comparable<Obra> {
    public final static String AUTOR_PER_DEFECTE = "ANÒNIM";

    private static int nObres = 0;
    private String nom;
    private String autor;
    private int codi;

    public Obra(String nom, String autor) {
        this.nom = nom;
        this.autor = autor;
        codi = generarCodi();
        nObres++;

    }

    public Obra(String nom) {
        this(nom, AUTOR_PER_DEFECTE);
    }

    public abstract int generarCodi();

    @Override
    public String toString() {
        return "Obra{" + "nom=" + nom + ", autor=" + autor + ", codi=" + codi + '}';
    }

    public static int getnObres() {
        return nObres;
    }

    @Override
    public int compareTo(Obra o) {
        return o.codi - codi;
    }


}
