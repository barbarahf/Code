package Rectangulos;

//import ExampleProcessing.ExempleProcessing;
//import Processing_Teoria.AppCircles;

import Processing_Teoria.Ball;
import processing.core.PApplet;

import java.awt.*;
import java.util.ArrayList;

class Pantalla extends PApplet {

    private final ArrayList<Rectangle> rectan = new ArrayList<>();
    // private Rectangle rectan;

    //  @Override
    public void settings() {
        size(800, 800);
        //  balls.add(new Ball(this, width/2, height/2));

    }


    public void setup() {//Preparar sketch before draw()
        background(0, 0, 0);
//        rectan = new Rectangle(new Point(0, 1), new Color((int) (Math.random() * 0x1000000))
//                , 50, 100);
        //   cercle = new Circle(10, new Point(0, 0));
    }

    @Override
    public void draw() {
        background(0, 0, 0);
        //rectan.dibuixa(this);

        rectan.add(new Rectangle(new Point((int) random(width),
                (int) random(height)), new Color((int) (Math.random() * 0x1000000)), random(120), random(200)));
        for (Rectangle b : rectan) {
            b.dibuixa(this);

        }


    }

    public static void main(String[] args) {
        String[] processingArgs = {"RectangulosApp"};
        Pantalla mySketch = new Pantalla();
        PApplet.runSketch(processingArgs, mySketch);

    }

}
