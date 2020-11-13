package barbara.herrera.juegos;


import barbara.herrera.Figuras.Circle;
import processing.core.PApplet;

import java.awt.*;

import java.util.ArrayList;
import java.util.List;

public class Individuo extends Circle {
    private int xSpeed;
    private int ySpeed;

    public Individuo() {
        super();
        this.xSpeed = 1;
        this.ySpeed = 1;
    }

    public Individuo(int radious, Point initialPoint) {
        super(radious, initialPoint);
        this.xSpeed = 1;
        this.ySpeed = 1;
    }

    public void dibuixa(PApplet papplet) {
        papplet.fill(getColor().getRed(), getColor().getGreen(), getColor().getBlue());
        papplet.ellipse(getOrigin().x, getOrigin().y, (float) this.perimeter(), (float) this.perimeter());


    }

    public void mou() {

        setOrigin(new Point(getOrigin().x + xSpeed, getOrigin().y + ySpeed));
    }

    public void step(JocCovidSimulation window) {

        if (getOrigin().x + super.perimeter() >= window.width) {
            xSpeed = -1;
        }
        if (getOrigin().x - super.perimeter() <= 0) {
            xSpeed = +1;
        }
        if (getOrigin().y + super.perimeter() >= window.height) {
            ySpeed = -1;
        }
        if (getOrigin().y - super.perimeter() <= 0) {
            ySpeed = +1;
        }
    }

    public static double distanciaEntreIndividuos(Point p1, Point p2) {
        return Math.hypot(p1.getX() - p2.getX(), p1.getY() - p2.getY());
    }

    public void choqueDetectar(List<Individuo> personas, JocCovidSimulation windows) {
        for (int i = 0; i < personas.size(); i++) {
            if (!(this == personas.get(i))) {
                double distancia = distanciaEntreIndividuos(this.getOrigin(), personas.get(i).getOrigin());
                if (distancia < this.getRadious() + personas.get(i).getRadious()) {

                    if (this.getColor() == Color.green || personas.get(i).getColor() == Color.green) {
                        this.setColor(Color.MAGENTA);
                        personas.get(i).setColor(Color.MAGENTA);
                    } else {
                        this.setColor(Color.green);
                        personas.get(i).setColor(Color.green);
                    }
                    //   personas.get(i).ySpeed -= this.ySpeed - personas.get(i).ySpeed;
                    // personas.get(i).xSpeed -= this.xSpeed - personas.get(i).ySpeed;
                    personas.get(i).ySpeed *= -1;
                    personas.get(i).xSpeed *= -1;

                }
            }
        }
    }

/*//    public void choqueDetectar(List<Individuo> personas, JocCovidSimulation window) {
//        for (int i = 0; i < circles.size(); i++) {
//            if (!(this == circles.get(i))) {
//                int dx = this.getOrigin().x - circles.get(i).getOrigin().x;
//                int dy = this.getOrigin().y - circles.get(i).getOrigin().y;
//                int distancia = (int) Math.sqrt(dx * dx + dy * dy);
//                if (distancia <= this.perimeter() + circles.get(i).perimeter()) {
//
//                    if (this.getColor() == Color.green || circles.get(i).getColor() == Color.green) {
//                        this.setColor(Color.MAGENTA);
//                        circles.get(i).setColor(Color.MAGENTA);
//                    } else {
//                        this.setColor(Color.green);
//                        circles.get(i).setColor(Color.green);
//                    }
////                    circles.get(i).ySpeed -= this.ySpeed-circles.get(i).ySpeed;
////                    circles.get(i).xSpeed -= this.xSpeed-circles.get(i).ySpeed;
//                    circles.get(i).ySpeed *= -1;
//                    circles.get(i).xSpeed *= -1;
//                }
//            }
//        }
//      }*/
}
