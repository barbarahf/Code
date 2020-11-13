/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.jaumebalmes.pguitart.practicapuntdepartida.figures;

import java.awt.Color;
import java.awt.Point;
import net.jaumebalmes.pguitart.practicapuntdepartida.utils.Utils;
import processing.core.PApplet;

/**
 *
 * @author pereg
 */
public class Rectangle extends Shape {

//<editor-fold defaultstate="collapsed" desc="VALORS PER DEFECTE">
    /**
     * Amplada 20 per defecte
     */
    public static int DEFAULT_WIDTH = 20;

    /**
     * Alçada 15 per defecte
     */
    public static int DEFAULT_HEIGHT = 15;
//</editor-fold>

//<editor-fold defaultstate="collapsed" desc="PROPIETATS">
    private int width;
    private int height;
//</editor-fold>

//<editor-fold defaultstate="collapsed" desc="CONSTRUCTORS">

    public Rectangle(int width, int height, Point point, Color color) {
        super(point, color);
        this.width = width;
        this.height = height;
    }

    /**
     * Crea rectangle amb valors per defecte.
     */
    public Rectangle() {
        this(DEFAULT_WIDTH, DEFAULT_HEIGHT, DEFAULT_POINT, DEFAULT_COLOR);
    }
    

//</editor-fold>

    /**
     * Retorna un rectangle a l'atzar; 
     * @param pApplet
     * @return rectangle amb posició, color i mida a l'atzar, en funció
     * de les mides del pApplet.
     */
    
  public static Rectangle getRectangleRandom(PApplet pApplet){
      int ESCALAT = 10;
      int MAX_WIDTH_RECT = pApplet.width / ESCALAT;
      int MAX_HEIGHT_RECT = pApplet.height / ESCALAT;
      int MIN_WIDTH_RECT = pApplet.width / (2 * ESCALAT);
      int MIN_HEIGHT_RECT = pApplet.height / (2 * ESCALAT);
      
      
      Point p = new Point(Utils.atzarInt(pApplet.width), 
                Utils.atzarInt(pApplet.height));
      Color c = new Color(Utils.atzarInt(256),
                Utils.atzarInt(256),
                Utils.atzarInt(256));
      int width = 
              Utils.atzarInt(MAX_WIDTH_RECT - MIN_HEIGHT_RECT) 
              + MIN_WIDTH_RECT;
      int height = 
              Utils.atzarInt(MAX_HEIGHT_RECT - MIN_HEIGHT_RECT) 
              + MIN_HEIGHT_RECT ;
      return new Rectangle(width, height, p, c);
  }  
    
//<editor-fold defaultstate="collapsed" desc="METODES">
    @Override
    public void dibuixa(PApplet pApplet) {
        int red = getColor().getRed();
        int green = getColor().getGreen();
        int blue = getColor().getBlue();
        pApplet.fill(red, green, blue);
        
        pApplet.rect( getPoint().x, getPoint().y, width, height);
    }
//</editor-fold>
    
    @Override
    public String toString() {
        return "Rectangle{" + "height=" + height + ", width=" + width + '}'
                + super.toString();
    }

}
