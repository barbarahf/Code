package figuras;

import java.awt.*;

public class Circle extends Shape {
    private double radius;
    final static double PI = 3.14;
    public static final double DEFAULT_RADIUS = 10;

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
        super();
        this.radius = DEFAULT_RADIUS;
    }

    public Circle(Point org, double rad) {
        super(org);
        this.radius = rad;

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

    public static void main(String[] args) {
        Circle c = new Circle();
        Circle c1 = new Circle(new Point(10, 10), 15);
//        System.out.println(c1.area());
//        System.out.println(c1.perimetro());
//        c1.setRadius(80);
//        System.out.println(c1.getRadius());
//        c.setColor(Color.red);
//        System.out.println(c.getColor());
//        c.setOrigin(new Point(12, 5));
//        System.out.println(c.getOrigin());

        System.out.println("Area: " + c1.area());
        System.out.println("Perimetro: " + c1.perimetro());
        System.out.println("Position: " + c1.getOrigin());
        System.out.println("Color: " + c1.getColor());

    }
}
