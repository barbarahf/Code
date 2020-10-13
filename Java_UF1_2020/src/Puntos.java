import java.awt.*;

public class Puntos extends Point {

    private Puntos() {

    }

    static Point puntoMedio(Point pun1, Point pun2) {
        int ax = (pun1.x + pun2.x) / 2;
        int ay = (pun1.y + pun2.x) / 2;
        return new Point(ax, ay);
    }

    static double Distancia(Point pun1, Point pun2) {
        return Math.sqrt(Math.pow(pun1.getX() - pun2.getX(), 2) + Math.pow(pun1.getY() - pun2.getY(), 2));
    }

    public static void main(String[] args) {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(100, 100);
        Point p3 = new Point(50, 50);
        System.out.println(puntoMedio(p1, p2));
        System.out.println("Distancia: " + Distancia(p1, p2));
        System.out.println("Distancia: " + Distancia(p1, p3));
    }
}
