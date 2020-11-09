/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package  rebotar_pelota;

import java.awt.Point;
import processing.core.PApplet;

/**
 *
 * @author pere
 */
public class PelotaMove extends PApplet {

    private Circle cercle;

    public PelotaMove(int width, int height) {
        setSize(width, height);
        hideMenuBar(); //per a què no surti barra del costat
    }

    public PelotaMove() {
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
        cercle = new Circle(20, new Point(50, 0));

    }


    @Override
    public void draw(){
        background(0, 0, 0);
        cercle.dibuixa(this);
        cercle.mou();
        cercle.actualizar(this);

    }


    public static void main(String[] args) {
        //cridem el mètode static runSketch
        PelotaMove.runSketch(new String[] {"prova1"}, new PelotaMove(500, 800));//Medidas del canvas
        //dos papplets en paral·l3l
//        PelotaMove.runSketch(
//                new String[] {"prova2"},
//                new PelotaMove());

    }

}
