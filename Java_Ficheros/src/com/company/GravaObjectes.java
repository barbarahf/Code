package com.company;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.io.*;

/**
 * @author Barbara Herrera Flores
 */
public class GravaObjectes {
    public static void main(String[] args) {
        Cliente[] clientes = new Cliente[1000];
        leerFichero(clientes);
    }

    public static int leerFichero(Cliente[] v) {
        File file = new File("/home/barbara/Documentos/Java/Java_Ficheros/src/clients.txt");
        int count = 0;
        try {

            Scanner scanner = new Scanner(file, "UTF-8");
            while (scanner.hasNext()) {
                String s = scanner.nextLine();
                String[] vec = s.replaceAll(";", "!¡!").split("!¡!", s.length() - 1);
                int k = 0;
                while (k < vec.length) {
                    v[count] = new Cliente(vec[k++], vec[k++], Long.parseLong(vec[k++]), Long.parseLong(vec[k++]), new
                            Fecha(Integer.parseInt(vec[k++]), Integer.parseInt(vec[k++]), Integer.parseInt(vec[k++])),
                            Long.parseLong(vec[k++]), Long.parseLong(vec[k++]), !vec[k++].equals("N"));
                }
                count += 1;
            }
            scanner.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return count;
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

    public void setCli(String nom, String nif, long telfixe, long telmovil, Fecha dataalta, long comandes, long pendents, boolean vip) {
        this.nom = nom;
        this.nif = nif;
        this.telfixe = telfixe;
        this.telmovil = telmovil;
        this.dataalta = dataalta;
        this.comandes = comandes;
        this.pendents = pendents;
        this.vip = vip;
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