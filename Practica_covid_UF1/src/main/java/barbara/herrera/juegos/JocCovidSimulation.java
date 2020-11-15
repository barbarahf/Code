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
    private final ArrayList<Individuo> personas = new ArrayList<Individuo>();


    /**
     * @param pointToCheck Recibe un punto aleatorio para verificar si está o no ocupado.
     * @param radius       el radio del individuo a comparar
     * @return Boolean, true si el punto está cupado
     */

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
        setSize(1320, 700);
        while (personas.size() < 200) {
            int circleRadius = 5;
            int circleSize = circleRadius * 2;
            Point randomPoint = new Point((int) random(circleSize, this.width - circleSize), (int) random(circleSize, this.height - circleSize));
            while (checkOccupedPoint(randomPoint, circleRadius)) {
                randomPoint = new Point((int) random(circleSize, this.width - circleSize), (int) random(circleRadius, this.height - circleSize));
            }
            Individuo nuevaPersona = new Individuo(circleRadius, randomPoint);
            nuevaPersona.setColor(new Color(170, 198, 202));
            personas.add(nuevaPersona);
        }

        int randomInfected = Utils.random(0, personas.size());
        personas.get(randomInfected).setInfectat(true);
        personas.get(randomInfected).setColor(new Color(186, 99, 35));
//
//        Individuo per = new Individuo(6, new Point(width/2, height/2));
//        per.setInfectat(true);
//        personas.add(per);

    }

    @Override
    public void iniciarJoc() {
        background(0);
    }

    /**
     * Metodo jugada, es el que se encargar de toda la ejecucion del juego, dibujar, mover los objetos y actualizar
     */
    @Override
    public void jugada() {
        background(255, 255, 255);
        for (int i = 0; i < personas.size(); i++) {
            personas.get(i).choqueDetectar(personas);
            personas.get(i).mou(this);
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
                new String[]{"Covid simulation"},
                new JocCovidSimulation());
    }

}
