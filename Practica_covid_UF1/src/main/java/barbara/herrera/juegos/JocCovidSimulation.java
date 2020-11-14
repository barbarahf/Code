/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package barbara.herrera.juegos;


import barbara.herrera.Figuras.Individuo;
import barbara.herrera.utils.Utils;

import java.awt.*;
import java.util.ArrayList;

/**
 * @author Barbara Herrera FLores
 */
public class JocCovidSimulation extends JocProcessing {
    private ArrayList<Individuo> personas = new ArrayList<Individuo>();

    public boolean checkOccupedPoint(Point pointToCheck, double radius) {
        for (Individuo persona : personas) {
            double distance = Utils.distanciaEntreIndividuos(pointToCheck, persona.getOrigin());
            if (distance < radius + persona.getRadious()) {
                return true;
            }
        }
        return false;
    }

    /**
     * En la funcion preparar joc se inicia el número de "individuos" y un punto aleatorio (para cada individuo)
     * separado del borde la la pantalla, así preparar el estado inicial del juego.
     */
    @Override
    public void prepararJoc() {
        setSize(1200, 800);
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
        for (int i = 0; i < personas.size(); i++) {
            personas.get(i).mou(this);
            personas.get(i).choqueDetectar(personas);
            personas.get(i).dibuixa(this);

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
