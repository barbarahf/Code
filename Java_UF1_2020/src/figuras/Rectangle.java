package figuras;

import java.awt.*;

public class Rectangle extends Shape {
    private double height;
    private double width;
    public static final double DEFAULT_HEIGHT = 40;
    public static final double DEFAULT_WIDTH = 40;

    //<editor-fold defaultstate="collapsed" desc="CONSTRUCTORES">
    public Rectangle() {
        super();
        this.height = DEFAULT_HEIGHT;
        this.width = DEFAULT_WIDTH;
    }

    public Rectangle(Point origin, double height, double width) {
        super(origin);
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

    public static void main(String[] args) {
        Rectangle rec = new Rectangle();
        Rectangle rec1 = new Rectangle(new Point(15, 80), 10, 30);
//        System.out.println(rec.area());
//        rec1.setColor(Color.blue);
//        System.out.println(rec1);
//        System.out.println(rec);

        System.out.println("Area: " + rec1.area());
        System.out.println("Perimetro: " + rec1.perimetro());
        System.out.println("Position: " + rec1.getOrigin());
        System.out.println("Color: " + rec1.getColor());

    }
}
