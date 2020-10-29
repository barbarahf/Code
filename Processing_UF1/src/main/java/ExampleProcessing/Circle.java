/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExampleProcessing;

import java.awt.Point;

import processing.core.PApplet;

/**
 * @author pereg
 */
public class Circle extends Shape {
    private final static int CODI_BASE = 20000;
    public final static double DEFAULT_RADIOUS = 10;
    private static int nCircles = 0;
    private double radious;

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
    @Override
    public double perimeter() {
        return 2 * Math.PI * radious;
    }

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
        return 0;
    }

    public void polimorfisme() {
        System.out.println("M'agrada el polimorfisme!!");
    }

    public void dibuixa(PApplet papplet) {
        papplet.fill(getColor().getRed(),
                getColor().getGreen(),
                getColor().getBlue());
        papplet.ellipse(getOrigin().x,
                getOrigin().y,
                (float) radious,
                (float) radious);


    }

    public void mou(ExempleProcessing aThis) {
        setOrigin(new Point(getOrigin().x + 1, getOrigin().y + 1));
    }
}
