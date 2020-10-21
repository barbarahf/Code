package figuras;

import java.awt.*;

public class Circle extends Shape {
    private double radius;
    final static double PI = 3.14;
    public static final double DEFAULT_RADIUS = 10;
    private static int counter;
    private final int codi;
    @Override
    public int getCodi() {
        return codi;
    }


    //<editor-fold defaultstate="collapsed" desc="GETTERS & SETTERS">
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }



    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="CONSTRUCTORS">
    public Circle() {
        this(DEFAULT_POINT, DEFAULT_RADIUS);
    }

    public Circle(Point org, double rad) {
        super(org);
        this.radius = rad;
        counter++;
        codi = 10000 + counter;

    }

    public static int getCounter() {
        return counter;
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="METHODS">
    @Override
    public double area() {
        return PI * this.radius * this.radius;
    }

    @Override
    public double perimetro() {
        return 2 * PI * this.radius;
    }

    //</editor-fold>


}
