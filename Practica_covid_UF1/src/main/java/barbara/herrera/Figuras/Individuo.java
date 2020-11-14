package barbara.herrera.Figuras;


import barbara.herrera.juegos.JocCovidSimulation;
import barbara.herrera.utils.Utils;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;


public class Individuo extends Circle {


    private int xV;
    private int yV;

    public Individuo() {
        super();
        this.xV = Utils.getRandomSigno();
        this.yV = Utils.getRandomSigno();
    }

    public Individuo(int radious, Point initialPoint) {
        super(radious, initialPoint);
        this.xV = Utils.getRandomSigno();
        this.yV = Utils.getRandomSigno();
    }

    public void dibuixa(JocCovidSimulation window) {
        window.fill(getColor().getRed(), getColor().getGreen(), getColor().getBlue());
        window.ellipse(getOrigin().x, getOrigin().y, (float) this.perimeter(), (float) this.perimeter());

    }

    /**
     * Esta funcion recibe un objeto "JocCovidSimulation" e incluye los métodos de processing (hereda de este)
     * De esta forma podremos obtener el tamaño de la pantalla para calcular las colisiones.
     *
     * @param window
     */
    public void mou(JocCovidSimulation window) {
        int x = getOrigin().x;
        int y = getOrigin().y;

        if (x + super.perimeter() >= window.width) {
            xV = -Math.abs(xV);
        }
        if (y + super.perimeter() >= window.height) {
            yV = -Math.abs(yV);
        }
        if (x - super.perimeter() <= 0) {
            xV = Math.abs(xV);
        }

        if (y - super.perimeter() <= 0) {
            yV = Math.abs(yV);
        }
        x += xV;
        y += yV;
        setOrigin(new Point(x, y));

    }

    public boolean choca(Individuo persona) {
        double distance = Utils.distanciaEntreIndividuos(getOrigin(), persona.getOrigin());
        if (distance < getRadious() + persona.getRadious()) {
            return true;
        }
        return false;
    }


    public void choqueDetectar(List<Individuo> personas) {
        for (int i = 0; i < personas.size(); i++) {
            if (choca(personas.get(i)) && personas.get(i) != this) {



                int savVelY = personas.get(i).yV;
                int savVelX = personas.get(i).xV;
                personas.get(i).yV = this.yV;
                personas.get(i).xV = this.xV;
                this.yV = savVelY;
                this.xV = savVelX;


                //Mover la pelota actual de la colision
//                double distance = Utils.distanciaEntreIndividuos(getOrigin(), personas.get(i).getOrigin());
//                float colisionDistan = (float) (0.5f * (distance - this.getRadious() - personas.get(i).getRadious()));
//                this.xV  -= colisionDistan * (this.getOrigin().x - personas.get(i).getOrigin().x) / distance;
//                this.yV  -= colisionDistan * (this.getOrigin().y - personas.get(i).getOrigin().y) / distance;
//
//                //Mover la otra pelota de la colision
//                personas.get(i).xV += colisionDistan * (this.getOrigin().x - personas.get(i).getOrigin().x) / distance;
//                personas.get(i).yV += colisionDistan * (this.getOrigin().y - personas.get(i).getOrigin().y) / distance;


                if (personas.get(i).getColor() == Color.green) {
                    personas.get(i).setColor(Color.MAGENTA);
                } else {
                    personas.get(i).setColor(Color.green);
                }

                if (getColor() == Color.green) {
                    setColor(Color.MAGENTA);
                } else {
                    setColor(Color.green);
                }
            }
        }

    }


}

