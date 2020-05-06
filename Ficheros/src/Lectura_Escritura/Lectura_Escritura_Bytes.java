package Lectura_Escritura;

import java.io.*;

public class Lectura_Escritura_Bytes {
    public static void main(String[] args) {
        int contador = 0;
        int []datos_entrada  = new int[42818];
        try {
            FileInputStream archivoLectura = new FileInputStream("sehun.jpg");
            boolean final_er = false;
            while (!final_er) {
                int byte_entrada = archivoLectura.read();

                if (byte_entrada != -1)
                    datos_entrada[contador] = byte_entrada;
                else
                    final_er = true;
                System.out.println(datos_entrada[contador]);
                contador++;
            }
            archivoLectura.close();
        } catch (IOException e) {
            System.out.println("Error, algo salio mal");
        }
        System.out.println(contador);
    }
}
