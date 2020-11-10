/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rebotar_pelota;


import processing.core.PApplet;

import java.awt.*;

/**
 * @author pereg
 */
public class Circle extends Shape {
    private final static int CODI_BASE = 20000;
    public final static double DEFAULT_RADIOUS = 10;
    private static int nCircles = 0;
    private double radious;
    private int direccionX = 0;
    private int direccionY = 0;


//<editor-fold defaultstate="collapsed" desc="CONSTRUCTORS">

    /**
     * @param radious
     * @param origin
     */
    public Circle(double radious, Point origin) {
        //Punt centrakitzat per validar que no creem cap objecte incorrecte
        //if (radious > 10000) throw new Exception();
        super(origin);
        this.radious = radious;
    }

    /**
     *
     */
    public Circle() {
        this(DEFAULT_RADIOUS, DEFAULT_POINT);
//        super();
//        radious = DEFAULT_RADIOUS;
    }

    @Override
    public int getCodi() {
        return 0;
    }
//</editor-fold>

//<editor-fold defaultstate="collapsed" desc="GETTERS/SETTER">

    /**
     * @return
     */
    public double getRadious() {
        return radious;
    }

    public void setRadious(double radious) {
        this.radious = radious;
    }
//</editor-fold>

    /**
     * @return
     */
//    @Override
//    public double perimeter() {
//        return 2 * Math.PI * radious;
//    }

    /**
     * @return
     */
    @Override
    public double area() {
        return Math.PI * radious * radious;
    }

    @Override
    public String toString() {
        return "Circle{" + "radious=" + radious + '}'
                + " " + super.toString();
    }


    @Override
    protected void assignarCodi() {
        nCircles++;
        codi = CODI_BASE + nCircles;
    }

    @Override
    public double perimetro() {
        return 2 * Math.PI * radious;
    }


    public void dibuixa(PApplet papplet) {

        papplet.fill(getColor().getRed(),
                getColor().getGreen(),
                getColor().getBlue());
        papplet.ellipse(getOrigin().x, getOrigin().y, (float) radious, (float) radious);
//  papplet.ellipse(getOrigin().x, getOrigin().y, (float) this.perimeter(), (float) this.perimeter());

    }

    public void mou() {

        setOrigin(new Point(getOrigin().x + direccionX, getOrigin().y + direccionY));
    }

    public void actualizar(PelotaMove aThis) {

        if (getOrigin().x + (int)this.radious / 2 >= aThis.width) {
            System.out.println(getOrigin().x +" "+ (int)this.radious+" "+aThis.width);
            direccionX = -1;
        }
        if (getOrigin().x - this.radious / 2 <= 0) {
            direccionX = +1;
        }
        if (getOrigin().y + this.radious / 2 >= aThis.height) {
            direccionY = -1;
        }
        if (getOrigin().y - this.radious / 2 <= 0) {
            direccionY = +1;
        }
    }


}
