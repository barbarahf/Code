package com.company;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Escribiendo accde_es = new Escribiendo();
        accde_es.escribir();
    }

    static class Escribiendo {
        public void escribir() {
            String frase = "prueba de escritura uouuuuuuuu aaihbjsd me amor";

            try {
                FileWriter escribir = new FileWriter("hola.txt", true);//True, en caso de que exista
                for (int i = 0; i < frase.length(); i++) {
                    escribir.write(frase.charAt(i));
                }
                escribir.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
