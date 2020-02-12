package uf1.poo;

/**
 * Classe que fa servir el Jugador
 * @author Administrador
 */
public class ProvaJugador {

    public static void main(String[] args) {

        // Demanem un vector de 25 jugadors
        Jugador[] equipo = new Jugador[5];

        // Inicialitzem uns quants elements del vector
        // public Jugador(String nom, int dorsal, String posicion, int edad, boolean titular, Fecha fechaContrato) {
        equipo[0] = new Jugador("Lionel Messi", 10, "Davanter", 27, true, new Fecha(25,2,2008));
        equipo[1] = new Jugador("Andres Iniesta", 8, "Migcampista", 32, true, new Fecha(13,4,2000));
        equipo[2] = new Jugador("Neymar da Silva ", 13, "Davanter", 22, true, new Fecha(8,7,2018));
        equipo[3] = new Jugador("Gerard Piqué", 19, "Defensa", 22, false,new Fecha(2,11,2000));
        equipo[4] = new Jugador("Arturo Vidal", 19, "Migcampista", 31, false,new Fecha(25,2,2018));

        // Mostrem tota la llista de jugadors
        System.out.println("\nEquip de jugadors:");
        for (int i = 0; i < equipo.length; i++) {
            System.out.println(equipo[i]);
        }

        // Mostrem només els jugadors titulars
        System.out.println("\nJugadors titulars:");
        for (int i = 0; i < equipo.length; i++) {
            if (equipo[i].isTitular()) {
                System.out.println(equipo[i]);
            }
        }

        // Mostrar els noms dels jugadors de més de 30 anys
        // Bucle cercant els jugadors de més de 30 anys
        System.out.println("\nNoms dels jugadors de més de 30 anys");
        for (int i = 0; i < equipo.length; i++) {
            if (equipo[i].getEdad() > 30 ) {
                // Només mostrem el nom del jugador !
                System.out.println(equipo[i].getNom());
            }
        }

        // Mostrar el jugador amb el dorsal 10 (si existeix). Recerca
        boolean trobat = false;
        for (int i = 0; i < equipo.length && !trobat; i++) {
            if (equipo[i].getDorsal() == 10) {
                System.out.println("\nJugador amb el dorsal 10: \n"+equipo[i]);
                trobat = true;
            }
        }
        if (!trobat) {
            System.out.println("\nNo hi ha cap jugador amb el dorsal 10");
        }

        // Mostrem els jugadors titulars de menys de 20 anys
        System.out.println("\nJugadors titulars de menys de 20 anys:");
        for (int i = 0; i < equipo.length; i++) {
            if (equipo[i].isTitular() && equipo[i].getEdad() < 20) {
                System.out.println(equipo[i]);
            }
        }

        // Jugadors contractats al 2018
        System.out.println("\nJugadors contractats al 2018:");
        for (int i = 0; i < equipo.length; i++) {
            if (equipo[i].getFechaContrato().getAny() == 2018) {
                System.out.println(equipo[i]);
            }
        }
    }
}