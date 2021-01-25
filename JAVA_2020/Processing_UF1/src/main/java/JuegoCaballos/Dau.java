/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JuegoCaballos;

/**
 * @author pere
 */
public class Dau {
    public void setPuntuacio(short puntuacio) {
        this.puntuacio = puntuacio;
    }

    private short puntuacio;

    /**
     *
     */
    public Dau() {
        this.puntuacio = tirada();
    }

    /**
     * @return
     */
    public short tirada() {
        this.puntuacio = (short) (Math.random() * 6 + 1);//Actualiza el valor

        return this.puntuacio;
    }

    /**
     * @return
     */
    public short getPuntuacio() {
        return puntuacio;
    }

    @Override
    public String toString() {
        return "Dau{" + "puntuacio=" + puntuacio + '}';
    }


}
