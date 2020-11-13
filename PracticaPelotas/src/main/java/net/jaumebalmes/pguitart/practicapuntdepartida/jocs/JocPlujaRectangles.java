/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.jaumebalmes.pguitart.practicapuntdepartida.jocs;

import net.jaumebalmes.pguitart.practicapuntdepartida.figures.Rectangle;

/**
 *
 * @author pereg
 */
public class JocPlujaRectangles extends JocProcessing {

    @Override
    public void prepararJoc() {
        setSize(600, 400);
    }

    @Override
    public void iniciarJoc() {
        background(0);
    }

    @Override
    public void jugada() {
        Rectangle r = Rectangle.getRectangleRandom(this);
        r.dibuixa(this);
    }

    @Override
    public boolean esFinal() {
        return false;
    }

    @Override
    public void finalJoc() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public static void main(String[] args) {
        JocProcessing.runSketch(
                new String[]{"Quina passada"},
                new JocPlujaRectangles());
    }
    
}
