package com.company;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Primes100K {
    public static void main(String[] args) {
        System.out.println("----------------------------------------------------------");
        System.out.println("|| Programa para leer una lista de primos de un fichero ||");
        System.out.println("----------------------------------------------------------");
        System.out.println("Debe pasar al programa el nombre de un fichero de texto que contenga los" +
                " numeros primos (uno por linea). El programa hará una serie de operaciones con estos primos.");

        //Comprobando fichero
        String file;
        if (args.length > 0)
            file = args[0];
        else {
//            System.out.println(args[0]);
            file = "primes-to-100k.txt";
        }
//        file = sc.nextLine();

        Lee_fichero acceso = new Lee_fichero();
        acceso.lee(file);
    }

    static class Lee_fichero {
        public void lee(String file) {
            long intervalo = System.currentTimeMillis();
            int leido;
            List<Integer> primos = new ArrayList<>();
            try {
                Scanner input = new Scanner(new File(file));
                while (input.hasNextInt()) {
                    leido = input.nextInt();
                    primos.add(leido);
                }
                for (Integer i : primos) {
                    System.out.println(i);
                }
                input.close();
            } catch (Exception e) {
                System.out.println("No se encontró el archivo");
//            e.printStackTrace();
            }
            System.out.println("Temps: " + (System.currentTimeMillis() - intervalo) + " ms");
        }
    }
}
