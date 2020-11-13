/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.jaumebalmes.pguitart.practicapuntdepartida.jocs;

/**
 *
 * @author pere
 */
public class JocEndevinaNumero extends JocProcessing {

    final private static int WIDTH = 400;
    final private static int HEIGHT = 150;
    final private static int BACKGROUND = 50;
    final private static int MARGIN_RELATION = 15;

    final public static int MAX_NUMERO = 10;
    final public static int MAX_JUGADES = 5;
    final private static int KEY_RETURN = 10;

    private int numeroSecret;
    private String textEntrat = "";
    private String missatge_actiu = "";
    private int numEntrat = -1;
    private int nJugades = 0;
    private boolean guanyat = false;

    @Override
    public void iniciarJoc() {
        background(0);
        numeroSecret = (int) (Math.random() * MAX_NUMERO) + 1;
    }

    private void mostrarText() {
        background(BACKGROUND);
        textSize(width / 15);
        fill(255, 204, 0);
        text("Entra número del 1 a 10: " + textEntrat,
                width / MARGIN_RELATION,
                height / 3);

        if (!guanyat) {
            fill(255, 0, 0);
        } else {
            fill(0, 255, 0);
        }
        text(missatge_actiu,
                width / MARGIN_RELATION,
                (height * 2) / 3);

    }

    @Override
    public void keyPressed() {
        //Si prem una tecla tanca finestra
        if (esFinal()) {
            exit();
        }
        if (keyCode != KEY_RETURN) {
            textEntrat += key;
            missatge_actiu = "";
        } else {
            try { // si s'entra algun caràcter estrany considera número 0
                numEntrat = Integer.parseInt(textEntrat);
            } catch (NumberFormatException e) {
                numEntrat = 0;
            } finally {
                guanyat = numEntrat == numeroSecret;
                if (!guanyat) {
                    nJugades++;
                    missatge_actiu = "No és el " + textEntrat + "!!!  " + "(intent " + nJugades + ")";
                    textEntrat = "";
                }
            }
        }
    }

    @Override
    public void jugada() {
        if (!missatge_actiu.equals("")) {
            delay(300);
        }
        mostrarText();
    }

    @Override
    public boolean esFinal() {
        return guanyat || nJugades >= MAX_JUGADES;
    }

    @Override
    public void finalJoc() {

        if (guanyat) {
            fill(0, 255, 0);
            missatge_actiu = "Ets un crack! És el " + numeroSecret;
        } else {
            missatge_actiu = "Mala sort!!! Has perdut!";
        }
        mostrarText();
    }

    @Override
    public void prepararJoc() {
        size(WIDTH, HEIGHT);
    }

    public static void main(String[] args) {
        JocProcessing.runSketch(
                new String[]{"Quina passada"},
                new JocEndevinaNumero());
    }

}
