package com.company;

import java.util.Date;

class Jugador {
    private String nombre;
    private int dorsal;
    private String posicion;
    private int edad;
    private boolean titular;
    private Date fecha = new Date();
    /*Date date = sdf.parse(dateInString);*/
    /*SimpleDateFormat sdf = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");*/
}

class ProvaJugador {
    private Jugador[] tipoJu = new Jugador[5];

    public void setTipoJu(Jugador[] tipoJu) {
        this.tipoJu = tipoJu;
    }
}

//public class jugadores {
//    public static void main(String[] args) {
//        for (int j = 0; j < SetTipoJu; j++) {
//        }
//
//    }

