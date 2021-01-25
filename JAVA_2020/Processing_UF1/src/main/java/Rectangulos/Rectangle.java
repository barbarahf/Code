package Rectangulos;

import processing.core.PApplet;

import java.awt.*;
import java.util.Random;

public class Rectangle extends Shape {
    private double height;
    private double width;
    public static final double DEFAULT_HEIGHT = 40;
    public static final double DEFAULT_WIDTH = 40;


    //<editor-fold defaultstate="collapsed" desc="CONSTRUCTORES">
    public Rectangle() {

        this(DEFAULT_POINT, DEFAULT_HEIGHT, DEFAULT_WIDTH);

    }

    public Rectangle(Point origin, double height, double width) {
        super(origin);
        this.height = height;
        this.width = width;

    }

    public Rectangle(Point origin, Color color, double height, double width) {
        super(color, origin);
        this.height = height;
        this.width = width;

    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="GETTERS & SETTERS">
    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public void setHW(double height, double width) {
        this.height = height;
        this.width = width;
    }


    @Override
    public int getCodi() {
        return codi;
    }


//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="METHODS">
    @Override
    public double area() {
        return this.height * this.width;
    }

    @Override
    public double perimetro() {
        return 2 * (this.width + this.height);
    }

    //</editor-fold>
    //New methods
    public void dibuixa(PApplet papplet) {
        papplet.fill(getColor().getRed(), getColor().getGreen(), getColor().getBlue());
        papplet.rect(getOrigin().x, getOrigin().y, (float) width, (float) height);


    }
//    public  Color randomColor(){
//        Random random = new Random();
//        int R = random.nextInt(256);
//        int G = random.nextInt(256);
//        int B = random.nextInt(256);
//        System.out.println(R + " " + B + " " + G);
//        return new Color(R,B,G);
//
//    }


}
