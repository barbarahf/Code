package com.company;

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
//            int c = entrada.read();
            int c = 0;
            while (c != -1) {
                c = entrada.read();
                System.out.print((char) c);
            }
            entrada.close();
        } catch (IOException e) {
            System.out.println("No se encontró el archivo");
//            e.printStackTrace();
        }
    }
}