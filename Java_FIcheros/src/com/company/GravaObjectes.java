package com.company;

import java.util.Scanner;

/**
 * @author Barbara Herrera Flores
 */
public class GravaObjectes {
    public static void main(String[] args) {
//        Fecha cli = new Fecha(10, 15, 200);
        Cliente clis = new Cliente("barbara", "y6366156t", 63265L, 63775L,
                new Fecha(10, 15, 200), 82L, 1L, false);
        System.out.println(clis);
        Cliente[] clientes = new Cliente[1000];

    }
}

class Cliente {
    private String nom;
    private String nif;
    private long telfixe;
    private long telmovil;
    private Fecha dataalta;
    private long comandes;
    private long pendents;
    private boolean vip;

    @Override
    public String toString() {
        return "nom='" + nom + '\'' +
                ", nif='" + nif + '\'' +
                ", telfixe=" + telfixe +
                ", telmovil=" + telmovil +
                ", dataalta=" + dataalta +
                ", comandes=" + comandes +
                ", pendents=" + pendents +
                ", vip=" + vip;
    }

    public Cliente() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("nom: ");
        nom = entrada.nextLine();
        System.out.print("nif: ");
        entrada.next();
        nif = entrada.nextLine();
        System.out.print("telfixe: ");
        telfixe = entrada.nextInt();
        System.out.print("telmovil: ");
        telmovil = entrada.nextInt();
        System.out.print("dataalta: ");

        System.out.print("comandes: ");
        comandes = entrada.nextInt();
        System.out.print("pendents: ");
        pendents = entrada.nextInt();
        System.out.print("vip: ");
        vip = entrada.nextBoolean();
    }

    public Cliente(String nom, String nif, long telfixe, long telmovil, Fecha dataalta, long comandes, long pendents, boolean vip) {
        this.nom = nom;
        this.nif = nif;
        this.telfixe = telfixe;
        this.telmovil = telmovil;
        this.dataalta = dataalta;
        this.comandes = comandes;
        this.pendents = pendents;
        this.vip = vip;
    }

}


class Fecha {

    private int dia, mes, any;

    public Fecha(int any, int mes, int dia) {
        this.dia = dia;
        this.mes = mes;
        this.any = any;
    }

    public void setFecha(int any, int mes, int dia) {
        this.dia = dia;
        this.mes = mes;
        this.any = any;
    }


    @Override
    public String toString() {
        return dia + "/" + mes + "/" + any;
    }

}