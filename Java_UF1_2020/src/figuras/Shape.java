package figuras;

import java.awt.Color;
import java.awt.Point;

public abstract class Shape {

    final static Color DEFAULT_COLOR = Color.RED;
    final static Point DEFAULT_POINT = new Point(10, 10);
    private Color color;
    private Point origin;
    private static int counter;
    private final int codi;

//<editor-fold defaultstate="collapsed" desc="CONSTRUCTORS">

    /**
     * @param origin
     */
    protected Shape(Point origin) {
        this(DEFAULT_COLOR, origin);
    }

    protected Shape() {//LLama a el constructor de abajo
//        color = DEFAULT_COLOR;
//        origin = DEFAULT_POINT;
        this(DEFAULT_COLOR, DEFAULT_POINT);

    }

    //Constructor principal
    //Centralitza el control d'errors
    protected Shape(Color col, Point org) {
        color = col;
        origin = org;
        counter++;
        codi = counter;
    }
//</editor-fold>

//<editor-fold defaultstate="collapsed" desc="GETTERS & SETTERS">

    /**
     * @return el color
     */
    public Color getColor() {
        return color;
    }

    /**
     * @param color
     */
    public void setColor(Color color) {
        this.color = color;
    }

    public Point getOrigin() {
        return origin;
    }

    public void setOrigin(Point origin) {
        this.origin = origin;
    }

    public static int getCounter() {
        return counter;
    }

    public int getCodi() {
        return codi;
    }


//</editor-fold>

    public abstract double area();

    public abstract double perimetro();

    @Override
    public String toString() {
        return "Shape{" + "color=" + color + ", origin=" + origin + ", Codi=" + codi + '}';
    }

//    public static void main(String[] args) {
//
//
//        Shape re1 = new Rectangle(new Point(15, 15), 15.0, 50.0);
//        Rectangle re2 = new Rectangle();
//        Circle cir1 = new Circle();
//        Circle cir2 = new Circle(new Point(15, 80), 8);
//        System.out.println("How many shapes are: " + Shape.getCounter());
//        System.out.println("How many circles are: " + Circle.getCounter());
//        System.out.println("How many rectangle are: " + Rectangle.getCounter());
//        System.out.println(re1.getCodi());
//        System.out.println(re2.getCodi());
//    }
}