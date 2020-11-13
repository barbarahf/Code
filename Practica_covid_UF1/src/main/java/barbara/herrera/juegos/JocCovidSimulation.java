/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package barbara.herrera.juegos;


import barbara.herrera.Figuras.Circle;

import java.awt.*;
import java.util.ArrayList;

/**
 * @author Barbara Herrera FLores
 */
public class JocCovidSimulation extends JocProcessing {
    private ArrayList<Individuo> personas = new ArrayList<Individuo>();
    //   private Circle circulos[] = new Circle[50];

    public static double distanceBetweenPoints(Point p1, Point p2) {
        return Math.hypot(p1.getX() - p2.getX(), p1.getY() - p2.getY());
    }

//    public static Point midelPoint(Point punto1, Point punto2) {
//        return new Point((int) (punto1.getX() + punto2.getX() / 2), (int) (punto1.getY() + punto2.getY() / 2));
//    }

    public boolean checkOccupedPoint(Point pointToCheck, double radius) {
        for (Individuo persona : personas) {
            double distance = distanceBetweenPoints(pointToCheck, persona.getOrigin());
            if (distance < radius + persona.getRadious()) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void prepararJoc() {
        setSize(1600, 700);
        while (personas.size() < 200) {
            int circleRadius = 6;
            int circleSize = circleRadius * 2;
            Point randomPoint = new Point((int) random(circleSize, this.width - circleSize), (int) random(circleSize, this.height - circleSize));
            while (checkOccupedPoint(randomPoint, circleRadius)) {
                randomPoint = new Point((int) random(circleSize, this.width - circleSize), (int) random(circleRadius, this.height - circleSize));
            }
            Individuo nuevaPersona = new Individuo(circleRadius, randomPoint);//20 es el tamaño del punto
            nuevaPersona.setColor(new Color(170, 198, 202));
            personas.add(nuevaPersona);
        }

    }

    @Override
    public void iniciarJoc() {

        background(0);

    }

    @Override
    public void jugada() {
        background(255, 255, 255);
//        Rectangle r = Rectangle.getRectangleRandom(this);
//        r.dibuixa(this);
        // Circle a = new Circle();
        //  CIRCULOS.get(0).dibuixa(this);
        for (Individuo per : personas) {
            per.dibuixa(this);
            per.mou();
          per.choqueDetectar(personas, this);
            per.step(this);
        }

    }

    @Override
    public boolean esFinal() {
        return false;
    }

    @Override
    public void finalJoc() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static void main(String[] args) {
        JocProcessing.runSketch(
                new String[]{"Quina passada"},
                new JocCovidSimulation());
    }

}
