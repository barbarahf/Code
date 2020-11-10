package figuras;

import java.awt.*;

public class App {
    public static void main(String[] args) {


        Shape re1 = new Rectangle(new Point(15, 15), 15.0, 50.0);
        Rectangle re2 = new Rectangle();
        Circle cir1 = new Circle();
        Circle cir2 = new Circle(new Point(15, 80), 8);
        System.out.println("How many shapes are: " + Shape.getCounter());
        System.out.println("How many circles are: " + Circle.getCounter());
        System.out.println("How many rectangle are: " + Rectangle.getCounter());
        System.out.println(re1.getCodi());
        System.out.println(re2.getCodi());
    }
}
