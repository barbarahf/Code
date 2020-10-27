/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExampleProcessing;

import java.awt.Point;
import processing.core.PApplet;

/**
 *
 * @author pere
 */
public class ExempleProcessing extends PApplet {
    
    private Circle cercle;

    public ExempleProcessing(int width, int height) {
        setSize(width, height);
        hideMenuBar(); //per a què no surti barra del costat  
    }

    public ExempleProcessing() {
        setSize(400, 600);
    }
    
    
    
    /**
     *  Com volem que sigui el papplet (abans de dibuixar la finestra)
     */
    @Override
    public void settings(){
    }
    
    /**
     * Quà volem posar al papplet (un cop ja tenim definida la finestra)
     * Si no hi ha el mètode draw, és el que mostra sempre
     */
    @Override
    public void setup(){
        background(0, 0, 0);
        cercle = new Circle(20, new Point(0, 0));

    }
    
    /**
     * Es va refrescant framerate vegades per segon (fps)
     * Per defecte són 10 fps
     * Permet fer el moviment
     */
    @Override
    public void draw(){
        background(0, 0, 0);
        cercle.dibuixa(this);
        cercle.mou(this);
     
        
    }
    
    
    public static void main(String[] args) {
        //cridem el mètode static runSketch
        ExempleProcessing.runSketch(
                new String[] {"prova1"}, 
                new ExempleProcessing(500, 800));
        //dos papplets en paral·l3l
        ExempleProcessing.runSketch(
                new String[] {"prova2"}, 
                new ExempleProcessing());
        
    }
    
}
