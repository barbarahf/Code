package com.company;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class exeption {
    public static void main(String[] args) {
        Leer_fichero accerder = new Leer_fichero();
        accerder.lee();
    }
}

class Leer_fichero {
    public void lee() {
        try {
            FileReader entrada = new FileReader("hola.txt");
            BufferedReader mibuffer = new BufferedReader(entrada);
//            int c = entrada.read();
//            int c = 0;
            /*\n or \r->retorno de cargo*/
            String linea = "";
            while (linea != null) {
                linea = mibuffer.readLine();
                if (linea != null)
                    System.out.println(linea);
            }
            entrada.close();
        } catch (IOException e) {
            System.out.println("No se encontró el archivo");
//            e.printStackTrace();
        }
    }
}