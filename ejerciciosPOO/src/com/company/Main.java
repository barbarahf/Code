package com.company;

import java.util.Scanner;
class Tiempo {
    private int horas;
    private int minutos;
    private int segundos;

    public Tiempo(int horas, int minutos, int segundos) {
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

    public Tiempo() {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce la hora:");
        horas = in.nextInt();
        System.out.println("Introduce los segundos:");
        minutos = in.nextInt();
        System.out.println("Introduce los minutos:");
        segundos = in.nextInt();
    }

    public Tiempo(int horas, int minutos) {
        this(horas, minutos, 0);
    }

    @Override
    public String toString() {
//        return horas + ":" + minutos + ":" + segundos;
        return String.format("%02d:%02d:%02d", horas, minutos, segundos);
    }
}

public class Main {

    public static void main(String[] args) {
        // write your code here
        Tiempo x = new Tiempo();
        System.out.println(x);
    }
}
