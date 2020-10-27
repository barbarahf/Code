/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExampleProcessing;

import java.awt.Color;
import java.awt.Point;

/**
 *
 * @author pere
 */
public class App {

    public static void main(String[] args) {
        Shape s1 = new Shape(); //1
        Shape c1 = new Circle();
        // PÈRDUA D'IDENTITAT
        /* c1 és pensa que és un Shape però,
        * com que és un Cercle,
        * actua com un cercle.
        * No sap, però, que té alguns mètodes 
        * de Cercle si no estan a Shape
        */
        Circle c2 = new Circle(100, new Point(300, 300)); //20002
        Shape s2 = new Shape(Color.PINK, new Point(200, 200)); //2

        c2.polimorfisme();
        ((Circle ) c1).polimorfisme();
        
        System.out.println(s1);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(s2);

//        System.out.println("Area 0? " + s1.area());
//        System.out.println("Area "
//                + Circle.DEFAULT_RADIOUS * Circle.DEFAULT_RADIOUS * Math.PI + "? "
//                + c1.area());

    }

}
