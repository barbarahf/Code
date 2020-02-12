package uf1.poo;

import java.util.Scanner;

public class Fecha {
    // Propietats
    private int dia, mes, any;

    public Fecha(int dia, int mes, int any) {
        this.dia = dia;
        this.mes = mes;
        this.any = any;
    }
    public Fecha() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introsueix la data: ");
        System.out.print("Dia: ");
        dia = entrada.nextInt();
        System.out.print("Mes: ");
        mes = entrada.nextInt();
        System.out.print("Any: ");
        any = entrada.nextInt();
    }

    public int getAny() {
        return any;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    @Override
    public String toString() {
        // 1return "Fecha{" + "dia=" + dia + ", mes=" + mes + ", any=" + any + '}';
        return dia + "/" + mes + "/" + any;
    }

}