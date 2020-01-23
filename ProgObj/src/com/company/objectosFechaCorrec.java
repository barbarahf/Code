package com.company;

import java.util.Scanner;

public class objectosFechaCorrec {

    // Propietats
    private int dia, mes, any;

    public objectosFechaCorrec(int dia, int mes, int any) {
        this.dia = dia;
        this.mes = mes;
        this.any = any;
    }

    public objectosFechaCorrec() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introsueix la data: ");
        System.out.print("Dia: ");
        dia = entrada.nextInt();
        System.out.print("Mes: ");
        mes = entrada.nextInt();
        System.out.print("Any: ");
        any = entrada.nextInt();
    }

    // En l'exemple no es fan servir tots els getters/setters

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAny() {
        return any;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setAny(int any) {
        this.any = any;
    }

    @Override
    public String toString() {
        // 1return "Fecha{" + "dia=" + dia + ", mes=" + mes + ", any=" + any + '}';
        return dia + "/" + mes + "/" + any;
    }

    public static void main(String[] args) {
    }

}

