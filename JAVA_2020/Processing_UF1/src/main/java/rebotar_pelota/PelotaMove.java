/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rebotar_pelota;

import java.awt.Point;

import processing.core.PApplet;

/**
 * @author pere
 */
public class PelotaMove extends PApplet {

    private Circle cercle;
    private Circle cercle2;

    public PelotaMove(int width, int height) {
        setSize(width, height);
        hideMenuBar(); //per a què no surti barra del costat
    }

    public PelotaMove() {
        setSize(400, 600);


    }

    /**
     * Com volem que sigui el papplet (abans de dibuixar la finestra)
     */
    @Override
    //No pasa nada si quito el override
    public void settings() {
    }

    /**
     * Quà volem posar al papplet (un cop ja tenim definida la finestra)
     * Si no hi ha el mètode draw, és el que mostra sempre
     */
    @Override
    public void setup() {//Preparar sketch before draw()
        background(0, 0, 0);
        cercle = new Circle(30, new Point(200, 200));//Carga el primer circulo
        cercle2 = new Circle(30, new Point((int) (200 + cercle.perimetro()), 200));//Carga el primer circulo
        //   cercle = new Circle(10, new Point(0, 0));
    }


    @Override
    public void draw() {
        background(0, 0, 0);

        cercle.separar(cercle2);
        cercle.dibuixa(this);
        cercle2.dibuixa(this);
        // cercle.mou();
        //  cercle.actualizar(this);

    }


    public static void main(String[] args) {

        //cridem el mètode static runSketch
        PelotaMove.runSketch(new String[]{"prova1"}, new PelotaMove(400, 400));//Medidas del canvas

        //dos papplets en paral·l3l
//        PelotaMove.runSketch(
//                new String[] {"prova2"},
//                new PelotaMove());

    }

}
