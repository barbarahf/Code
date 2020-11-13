package ejercicios_examen;

import java.awt.*;

public class App {
    public static Point midelPoint(Point punto1, Point punto2) {
        return new Point((int) (punto1.getX() + punto2.getX() / 2), (int) (punto1.getY() + punto2.getY() / 2));
    }

    public static double distanceBetweenPoints(Point p1, Point p2) {

        return Math.sqrt(Math.pow((p1.getX() - p2.getX()), 2) + Math.pow((p1.getY() - p2.getY()), 2));
    }

    public static void main(String[] args) {
        Point punto1 = new Point(50, 50);
        Point punto2 = new Point(100, 100);
        // System.out.println(midelPoint(punto1, punto2));
        System.out.println(distanceBetweenPoints(punto1, punto2));
        //Color
        Color color01 = new Color(0, 191, 255);
        Color color02 = new Color(0, 191, 255);
        Color color03 = new Color(0, 191, 255);
    }
}
//Chistian Miranda