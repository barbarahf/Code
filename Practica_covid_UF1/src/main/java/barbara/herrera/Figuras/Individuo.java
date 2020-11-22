package barbara.herrera.Figuras;

import barbara.herrera.juegos.JocCovidSimulation;
import barbara.herrera.utils.Utils;

import java.awt.*;

import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

/**
 * @author Barbara Herrera
 */
public class Individuo extends Circle {

    private float xV;
    private float yV;
    private boolean sa;
    private boolean infectat;
    private boolean recuperat;
    private static int curados;
    private static int infectados;
    private static int Personasanos;

    public Individuo() {
        super();
        this.xV = Utils.getRandomSigno();
        this.yV = Utils.getRandomSigno();
        this.sa = true;
        this.infectat = false;
        this.recuperat = false;
        Personasanos++;
    }


    public Individuo(int radious, Point initialPoint, Color actualColor) {
        super(radious, initialPoint, actualColor);
        this.xV = Utils.getRandomSigno();
        this.yV = Utils.getRandomSigno();
        this.sa = true;
        this.infectat = false;
        this.recuperat = false;
        Personasanos++;
    }

    // <editor-fold defaultstate="collapsed" desc="GETTERS & SETTERS">
    public static int getCurados() {
        return curados;
    }

    public static int getInfectados() {
        return infectados;
    }

    public static int getSanos() {
        return Personasanos;
    }

    public boolean isSa() {
        return sa;
    }

    public void setSa(boolean sa) {
        this.sa = sa;
    }

    public boolean isInfectat() {

        return infectat;
    }

    public void setInfectat(boolean infectat) {
        if (infectat && !this.recuperat && !this.infectat) {
            this.setColor(new Color(186, 99, 35));
            this.infectat = true;
            //Añadir tiempo de recuparacion
            Timer timer = new Timer();
            timer.schedule(task, 9500);
            infectados++;
            Personasanos--;

        }
    }

    public boolean isRecuperat() {
        return recuperat;
    }

    public void setRecuperat(boolean recuperat) {
        curados++;
        infectados--;
        this.recuperat = recuperat;
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc=" METODOS ">
    public void dibuixa(JocCovidSimulation window) {
        window.fill(getColor().getRed(), getColor().getGreen(), getColor().getBlue());
        window.ellipse(getOrigin().x, getOrigin().y, (float) this.perimeter(), (float) this.perimeter());
    }

    /**
     * Esta funcion recibe un objeto "JocCovidSimulation" e incluye los métodos de processing (hereda de este)
     * De esta forma podremos obtener el tamaño de la pantalla para calcular las colisiones.
     *
     * @param window Recive el objeto PApplet heredado, para obtener el ancho y alto del "canvas"
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

    /**
     * @param persona Recibe objeto del tipo individuo, para verificar si chocan con el actual "THIS" que se pasa como
     *                en en el bucle de jugada()
     * @return boolean
     */
    public boolean choca(Individuo persona) {
        double distance = Utils.distanciaEntreIndividuos(getOrigin(), persona.getOrigin());
        return distance < getRadious() + persona.getRadious();
    }

    /**
     * @param personas Recibe cada una de los individuos a comprobar
     */
    public void choqueDetectar(List<Individuo> personas) {
        for (Individuo persona : personas) {

            if (choca(persona) && persona != this) {
                if (this.infectat || persona.infectat && !this.recuperat && !persona.recuperat) {
                    persona.setInfectat(true);
                    this.setInfectat(true);
                }
                /*Nuevos puntos intercambiando los valores para comprobar distancia*/

                Point pointA = new Point((int) (this.getOrigin().x + persona.xV), (int) (this.getOrigin().y + persona.yV));
                Point pointB = new Point((int) (persona.getOrigin().x + this.xV), (int) (persona.getOrigin().y + this.yV));
                double distance = Utils.distanciaEntreIndividuos(pointA, pointB);
                //Si intercambiando velocidades se alejan, las intercambia, en caso contrario mantienen la misma velocidad
                if (distance > getRadious() + (persona.getRadious())) {
                    float savVelY = persona.yV;
                    float savVelX = persona.xV;
                    persona.yV = this.yV;
                    persona.xV = this.xV;
                    this.yV = savVelY;
                    this.xV = savVelX;

                }
            }
        }
    }

    // </editor-fold>

    /**
     * Es una clase anonima, para generar un temporizador, tiempo de "infección"
     */
    TimerTask task = new TimerTask() {
        @Override
        public void run() {
            setColor(new Color(204, 138, 192));
            recuperat = true;
            infectat = false;
            curados++;
            infectados--;
        }

    };

}




