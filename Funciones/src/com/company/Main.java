package com.company;

import java.util.*;

public class Main {
    //Ejercicio 1
    public static int longitud(String cadena) {
        return cadena.length();
    }

    //Ejercicio 2
    public static void permutarValores(int varA, int varB) {
        int auxVar = varA;
        varA = varB;
        varB = auxVar;
    }

    //Ejercicio 2.1
    public static void permutar(int vector[]) {
        int varAuxiliar = vector[0];
        vector[0] = vector[1];
        vector[1] = varAuxiliar;
    }

    //Ejercicio 3
    public static int aleatorio(int vecAleatory[]) {
        for (int j = 0; j < vecAleatory.length; j++) {
            for (int i = j + 1; i < vecAleatory.length; i++) {
                if (vecAleatory[j] > vecAleatory[i]) {
                    int auxiliar = vecAleatory[i];
                    vecAleatory[i] = vecAleatory[j];
                    vecAleatory[j] = auxiliar;
                }
            }
        }
        int aleatory = (int) (Math.random() * (vecAleatory[1] - vecAleatory[0] + 1) + vecAleatory[0]);
        return aleatory;
    }

    //Ejercicio 4
    public static int dau() {
        int randomNumber = (int) (Math.random() * (6 - 1 + 1) + 1);
        return randomNumber;
    }

    //Ejercicio 5
    public static int dos_dau() {
        return dau() + dau();
    }

    //Ejercicio 6
    public static boolean par(int parNumber) {
        return parNumber % 2 == 0;
    }

    public static boolean par(double parNumber) {
        return parNumber % 2 == 0;
    }

    //Ejercicio 7

    public static String nif(int dni) {
        char charDni = "TRWAGMYFPDXBNJZSQVHLCKE".charAt(dni % 23);
        return Integer.toString(dni) + charDni;
    }

    //Ejercicio 8
    public static int[] ordena_tres(int n1, int n2, int n3) {
        int[] ordenarNumeros = {n1, n2, n3};
        Arrays.sort(ordenarNumeros);
        return ordenarNumeros;
    }

    //Ejercicio 9
    public static int len_num(int num) {
        String tranformToString = String.valueOf(num);
        int contador = 0;
        for (int i = 0; i < tranformToString.length(); i++) {
            if (tranformToString.charAt(i) != ' ') {
                contador++;
            }
        }
        return contador;
    }

    //Ejercicio 10
    public static void piedrapapeltijera() {
        String game[] = {"Piedra", "Papel", "Tijeras"};
        String aleatory = game[(int) (Math.random() * game.length)];
        System.out.println(aleatory);
    }

    //Ejercicio 11
    public static String triangle(int a, int b, int c) {
        if (!(a + b <= c || a + c <= b || b + c <= a)) {
            if (a == b && a == c && c == b)
                return "equilater";
            else if ((a == b && a != c) || (a == c && a != b) || (b == c && b != a))
                return "isosceles";
            else if (a != b && a != c && c != b)
                return "escale";
        }
        return "No es un triangulo";
    }

    //Ejercicio 12
    public static int talles_roba(String lletres) {
        Hashtable<String, Integer> getTalla = new Hashtable<String, Integer>();
        getTalla.put("XS", 34);
        getTalla.put("S", 36);
        getTalla.put("M", 40);
        getTalla.put("G", 42);
        getTalla.put("XL", 46);
        getTalla.put("LX", 46);
        getTalla.put("XXL", 52);
        getTalla.put("2XX", 52);
        getTalla.put("3X", 56);
        if (getTalla.containsKey(lletres)) {
            System.out.print("La equivalencia es: ");
            return getTalla.get(lletres);
        }
        return 0;
    }

    //Ejercicio 13
    public static double descuento(double precio, double descuento) {
        double porcentaje = precio * descuento / 100;
        return precio - porcentaje;
    }
//    15 x 80
    //500 metros
//500/30 40x15
    /*10
    1metrs.*/

    //Ejercicio 14
    public static int numLosas(double altoLosa, double anchoLosa, double area) {
        area = area * area;
        float tamanoBaldosa = (float) (altoLosa * anchoLosa);
        return (int) Math.ceil((area / tamanoBaldosa));
    }

    //Ejercicio 15
//    facturaTelefonica (float duracion,float  costeEstablecido, float costoMinuto){
//        return 0;
//    }
    float facturaTelefonica(float duracion, float costeEstablecido, float costoMinuto) {
//        numLosas(hola, chao, )
        return 0;
    }

    public static void main(String[] args) {
        //Ejercicio 1
        Scanner teclado = new Scanner(System.in);
//        System.out.println("Introduce una cadena:");
//        String longCadenada = teclado.nextLine();
//        System.out.println("La longitud de la cadena es: " + longitud(longCadenada));

        //Ejercicio 2
//        int a = 10;
//        int b = 50;
//        permutarValores(a, b);
//        System.out.println("Vector antes ");
//        System.out.println(a + " " + b);
//        //Ejercicio 2.1
//        int vec[] = {15, 80};
//        System.out.println("Vector antes: " + java.util.Arrays.toString(vec));
//        permutar(vec);
//        System.out.println("Vector antes: " + java.util.Arrays.toString(vec));

        //Ejercicio 3
//        System.out.println("Introduce dos digitos para generar valores " +
//                "aleatorios, por ejemplo valores aleatorios del 5 al 15");
//        int[] twoAleatory = new int[2];
//        for (int i = 0; i < twoAleatory.length; i++) {
//            System.out.println("Introduce un valor:");
//            twoAleatory[i] = teclado.nextInt();
//        }
//        System.out.println(aleatorio(twoAleatory));
        //Ejercicio 4
//        System.out.println(dau());
        //Ejercicio 5
//        System.out.println(dos_dau());
        //Ejercicio 6
//        double introDouble = teclado.nextDouble();
        double nuevoDouble = 15.6;
        int parInt = 6;
        System.out.println(par(nuevoDouble));
        System.out.println(par(parInt));

        //Ejercicio 7
//        System.out.println("Introcude tu dni sin letra");
//        int dniVariable = teclado.nextInt();
//        if (dniVariable <= 99999999)
//            System.out.println("El NIF con la tetra :" + nif(dniVariable));
//        else
//            System.out.println("El NIF debe tener una longitud de 8 caracteres");
//        System.out.println(Arrays.toString(ordena_tres(5, 8, 1)));
//        System.out.println(len_num(1000));
//        piedrapapeltijera();
//        System.out.println(triangle(5, 120, 4));
//        Ejercicio 12
        System.out.println("Introduce una talla para saber su equivalencia:");
//        String talla = teclado.nextLine();
//        System.out.println(talles_roba(talla));
        //Ejercico 13
        System.out.println(descuento(100, 10));
        System.out.println("Ejercicio 14");
        System.out.println(numLosas(15, 40, 100));
        System.out.println("Prueba");
        float y = (float) 127.1;
        System.out.println(Math.ceil(y));
    }
}