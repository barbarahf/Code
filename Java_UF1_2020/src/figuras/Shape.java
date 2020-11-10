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


}