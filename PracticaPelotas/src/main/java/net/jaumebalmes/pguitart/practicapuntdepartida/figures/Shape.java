package net.jaumebalmes.pguitart.practicapuntdepartida.figures;

import java.awt.Color;
import java.awt.Point;
import processing.core.PApplet;

/**
 * Com que és abstracta, no podem instanciar objectes Shape.
 * @author pereg
 * @date 2 d'octubre de 2020
 */
public abstract class Shape {
    //<editor-fold defaultstate="collapsed" desc="VALORS PER DEFECTE">
    /**
     * Per defecte punt (0,0).
     */
    final public static Point DEFAULT_POINT = new Point(0, 0);
    
    /**
     * Per defecte el color és VERMELL.
     */
    final public static Color DEFAULT_COLOR = Color.RED;
//</editor-fold>
    
//<editor-fold defaultstate="collapsed" desc="PROPIETATS">
    private Point point;
    private Color color;
//</editor-fold>
    
//<editor-fold defaultstate="collapsed" desc="CONSTRUCTORS">
    /**
     * Crea un rectangle.
     * @param point Punt de l'extrem superior esquerra del rectangle.
     * @param color Color del rectangle.
     */
    public Shape(Point point, Color color) {
        this.point = point;
        this.color = color;
    }
    
    /**
     * Crea rectangle amb valors per defecte
     */
    public Shape() {
        this(DEFAULT_POINT, DEFAULT_COLOR);
    }
//</editor-fold>

//<editor-fold defaultstate="collapsed" desc="GETTERS && SETTERS">
    public Point getPoint() {
        return point;
    }
    
    public Color getColor() {
        return color;
    }
//</editor-fold>
    
//<editor-fold defaultstate="collapsed" desc="ABSTRACT METHODS">
    /**
     * Dibuixa la figura en el papplet de crocessing corresponent
     * @param pApplet
     */
    public abstract void dibuixa(PApplet pApplet);
//</editor-fold>
    
}
