/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JuegoCaballos;

/**
 * @author pere
 */
public class Cavall {
    private String nomNen;
    private int posicio = 0;

    private final Dau[] dau = new Dau[2];


    public Cavall(String nomNen) {
        this.nomNen = nomNen;
        dau[0] = new Dau();
        dau[1] = new Dau();
    }

    /**
     * @param nPosicions
     */
    public void endavant(int nPosicions) {
        posicio += nPosicions;
    }

    /**
     * tira els daus
     *
     * @return la suma de puntuacions dels daus.
     */
    public short jugaDaus() {
        return (short) (dau[0].tirada() + dau[1].tirada());
    }

    public String getNomNen() {
        return nomNen;
    }

    public int getPosicio() {
        return posicio;
    }

    public short sumaDaus() {
        return (short) (dau[0].getPuntuacio() + dau[1].getPuntuacio());
    }


}
