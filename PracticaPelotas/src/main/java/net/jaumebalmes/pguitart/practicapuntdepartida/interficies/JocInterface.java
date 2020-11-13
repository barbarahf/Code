/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.jaumebalmes.pguitart.practicapuntdepartida.interficies;

/**
 *
 * @author pereg
 */
public interface JocInterface {
    public void prepararJoc();
    public void iniciarJoc();
    public void jugada();
    public boolean esFinal();
    public void finalJoc();     
}
