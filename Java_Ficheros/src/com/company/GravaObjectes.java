package com.company;

import java.io.File;
import java.util.Scanner;
import java.io.*;
import java.util.Calendar;

/**
 * @author Barbara Herrera Flores
 */
public class GravaObjectes {
    private static String nomFicher = "/home/barbara/Documentos/Java/Java_Ficheros/src/user.bin";
    private static String archivoFuente = "/home/barbara/Documentos/Java/Java_Ficheros/src/clients.txt";
    private static Cliente[] clientes = new Cliente[1000];
    private static Cliente[] clientesBin = new Cliente[1000];
    private static int numClient;
    private static int numGurarados;

    public static void main(String[] args) {
        numClient = leerFichero(clientes);
        Cliente cli = new Cliente();
        //Almacenar el nuevo objeto
        for (int i = 0; i < clientes.length; i++) {
            if (clientes[i] == null) {
                clientes[i] = cli;
                break;
            }
        }
        createBin(clientes);
        numGurarados = ReadBin(clientesBin);
        mostrarVec(clientesBin);
        System.out.println("Se han guardado en el vector " + numClient + " objectos");
        System.out.println("En el archivo bin se encuentran almacenados " + numGurarados + " objetos");
    }

    public static void createBin(Cliente[] vCli) {
        try {
            FileOutputStream file = new FileOutputStream(nomFicher);
            ObjectOutputStream object = new ObjectOutputStream(file);
            int i = 0;
            while (vCli[i] != null) {
                object.writeObject(vCli[i]);
                i++;
            }

            object.close();
            file.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static int ReadBin(Cliente[] saveBin) {
        int i = 0;
        try {
            FileInputStream fileIn = new FileInputStream(nomFicher);
            ObjectInputStream object = new ObjectInputStream(fileIn);
            while (saveBin[i] == null) {
                saveBin[i] = (Cliente) object.readObject();
                i++;
            }
            object.close();
            fileIn.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return i;
    }

    public static int leerFichero(Cliente[] v) {
        int count = 0;
        try {
            File file = new File(archivoFuente);
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

    public static void mostrarVec(Cliente[] v) {
        int i = 0;
        while (v[i] != null) {
            System.out.println(v[i]);
            i++;
        }
    }

}


class Cliente implements Serializable {

    //    private int dat = Calendar.getInstance().get(Calendar.YEAR);
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


//    public void addDescuento() { //set
//        long descuento = comandes * 100 / 10;
//        if (dataalta.getAny() <= 5 - dat)
//            comandes -= descuento;
//
//    }


    public Cliente() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("nom: ");
        nom = entrada.nextLine();
        System.out.print("nif: ");
        entrada.next();
        nif = entrada.nextLine();
        System.out.print("telfixe: ");
        telfixe = entrada.nextLong();
        System.out.print("telmovil: ");
        telmovil = entrada.nextLong();
        dataalta = new Fecha();
        System.out.print("comandes: ");
        comandes = entrada.nextLong();
        System.out.print("pendents: ");
        pendents = entrada.nextLong();
        System.out.print("vip: ");
        vip = entrada.nextBoolean();

    }


}

class Fecha implements Serializable {

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

    //    public int getDia() {
//        return dia;
//    }
//
//    public int getMes() {
//        return mes;
//    }
//
//    public int getAny() {
//        return any;
//    }

    @Override
    public String toString() {
        return dia + "/" + mes + "/" + any;
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

}