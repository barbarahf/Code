/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.jaumebalmes.pguitart.museu;

/**
 *
 * @author pguitart
 */
public class Quadre extends Obra {
    public final static int CODI_BASE = 10001;
    private static int nQuadres;
    
    private double alt;
    private double ample;

    public Quadre(double alt, double ample, String nom, String autor) {
        super(nom, autor);
        this.alt = alt;
        this.ample = ample;
        nQuadres++;
    }

    public Quadre(double alt, double ample, String nom) {
        super(nom);
        this.alt = alt;
        this.ample = ample;
        nQuadres++;
    }
    
    

    @Override
    public int generarCodi() {
        return CODI_BASE + nQuadres;
    }
}
