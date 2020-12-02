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
public class Escultura extends Obra {
    public final static int CODI_BASE = 20001;
    
    private static int nEscultures = 0;
    
    private double pes;

    public Escultura(double pes, String nom, String autor) {
        super(nom, autor);
        this.pes = pes;
        nEscultures++;
    }

    public Escultura(double pes, String nom) {
        super(nom);
        this.pes = pes;
        nEscultures++;
    }
    

    @Override
    public int generarCodi() {
        return CODI_BASE + nEscultures;
    }
    
    
    
}
