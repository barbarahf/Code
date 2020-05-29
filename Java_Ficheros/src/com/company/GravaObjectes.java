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
        int count = 0;
        try {
            File file = new File("/home/barbara/Documentos/Java/Java_Ficheros/src/clients.txt");
            String s = "";
            String nam = "";
            Scanner scanner = new Scanner(file, "UTF-8");
            while (scanner.hasNext()) {
                s = scanner.nextLine();
                final String sep = "!¡;";
                for (int i = 0; i < s.length(); i++) {
                    if (!sep.contains(Character.toString(s.charAt(i)))) {
                        nam += s.charAt(i);
                        v[count] = new Cliente();
                        v[count].setNom(nam);
                        v[count].setNif(nam);
                        v[count].setTelmovil(Long.parseLong(nam));
                        v[count].setTelfixe(Long.parseLong(nam));
                        v[count].setTelfixe(Long.parseLong(nam));
                        v[count].setTelfixe(Long.parseLong(nam));

                    }
                }
                System.out.println(nam);
            }

            scanner.close();
        } catch (IOException e) {
            e.printStackTrace();
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

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public void setTelfixe(long telfixe) {
        this.telfixe = telfixe;
    }

    public void setTelmovil(long telmovil) {
        this.telmovil = telmovil;
    }

    public void setDataalta(Fecha dataalta) {
        this.dataalta = dataalta;
    }

    public void setComandes(long comandes) {
        this.comandes = comandes;
    }

    public void setPendents(long pendents) {
        this.pendents = pendents;
    }

    public void setVip(boolean vip) {
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

//    public Cliente(String nom, String nif, long telfixe, long telmovil, Fecha dataalta, long comandes, long pendents, boolean vip) {
//        this.nom = nom;
//        this.nif = nif;
//        this.telfixe = telfixe;
//        this.telmovil = telmovil;
//        this.dataalta = dataalta;
//        this.comandes = comandes;
//        this.pendents = pendents;
//        this.vip = vip;
//    }

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