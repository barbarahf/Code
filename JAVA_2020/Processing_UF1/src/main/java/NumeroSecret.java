/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import JuegoCaballos.JocInterface;

import java.util.Scanner;

/**
 *
 * @author pere
 */
public class NumeroSecret implements JocInterface {
    final public static int MAX_NUMERO = 10;
    final public static int MAX_JUGADES = 5;
    
    private int numeroSecret;
    private boolean guanyat = false;

    @Override
    public void iniciarJoc() {
        numeroSecret = (int) (Math.random() * MAX_NUMERO + 1);
    }

    @Override
    public void jugada() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Endevina el numero de 1 a 10? ");      
        int numJugat=entrada.nextInt();
        guanyat = numeroSecret == numJugat;
    }

    @Override
    public boolean esFinal() {
        return guanyat;
    }

    @Override
    public void finalJoc() {
        if (guanyat){
            System.out.println("Ets un crack. En numero es "+ 
                  numeroSecret+   " Has guanyat!");
        } else {
            System.out.println("Has perdut");
        }
    }
    
    public static void main(String[] args) {
        NumeroSecret joc = new NumeroSecret();
        int nJugades = 0;
        joc.iniciarJoc();
        while (nJugades<NumeroSecret.MAX_JUGADES && !joc.esFinal()){
            joc.jugada();
            nJugades++;
        }
        joc.finalJoc();
    }
    
}
