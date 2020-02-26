package com.company;

import java.util.*;


public class Main {
    public static long multiplyNumbers(int num) {
        if (num >= 1)
            return num * multiplyNumbers(num - 1);
        else
            return 1;
    }

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

    //Ejercicio 14
    public static int numLosas(double altoLosa, double anchoLosa, double area) {
        double tamanoBaldosa = altoLosa * anchoLosa;
        return (int) Math.ceil((area / tamanoBaldosa));
    }
    //Ejercicio 15

    //    public static void  facturaTelefonica(float duracion, float costeEstablecido, float costoMinuto) {
//        duracion += costeEstablecido;
//        duracion *= costoMinuto;
//       // costeEstablecido x costoMinuto + duracion
//        System.out.println("El costo de su llamada es de "+duracion+"€");
//    }
    //Ejercicio 16
    public static float facturaTelefonica(float duracionMinutos, float costeEstablecido, float costoMinuto) {
        return costoMinuto * duracionMinutos + costeEstablecido;
    }

    public static int multiplicar(int a, int b) {
        return a * b;
    }

    //Ejercicio 17
    // /*
//    String h="01:00:00";
//    String[] h1=h.split(":");
//
//    int hour=Integer.parseInt(h1[0]);
//    int minute=Integer.parseInt(h1[1]);
//    int second=Integer.parseInt(h1[2]);
//
//    int temp;
//    temp = second + (60 * minute) + (3600 * hour);
//
//    public static int QuansSegons(int dias, int horas, int minutos, int segundos) {
//        int segundosCount = 60;
//
////        return multiplicar(multiplicar(dias, 24),
////                multiplicar(segundosCount, segundosCount)) +
////                multiplicar(horas, segundosCount) + multiplicar(minutos, segundosCount);
//
//
////        horas = horas * 60 * 60;
////        dias = dias * 24 * 60 * 60;
////        return minutos + horas + dias + segundos;
//
//    }

    //Una hora es = 3600s segundos
// un minuto =  60s
    //Dias = 86400;
    public static int QuansSegons(int dias, int horas, int minutos, int segundos) {
        horas *= 60 * 60;
        dias *= 24 * 60 * 60;
        minutos *= 60;
        return minutos + horas + dias + segundos;
    }

    public static void main(String[] args) {
        //Ejercicio 1
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce una cadena:");
//        String longCadenada = teclado.nextLine();
//        System.out.println("La longitud de la cadena es: " + longitud(longCadenada));

        //Ejercicio 2
        int a = 10;
        int b = 50;
        permutarValores(a, b);
        System.out.println("Vector antes ");
        System.out.println(a + " " + b);
//        //Ejercicio 2.1
        int vec[] = {15, 80};
        System.out.println("Vector antes: " + java.util.Arrays.toString(vec));
        permutar(vec);
        System.out.println("Vector antes: " + java.util.Arrays.toString(vec));

        //Ejercicio 3
        System.out.println("Introduce dos digitos para generar valores " +
                "aleatorios, por ejemplo valores aleatorios del 5 al 15");
        int[] twoAleatory = new int[2];
//        for (int i = 0; i < twoAleatory.length; i++) {
//            System.out.println("Introduce un valor:");
//            twoAleatory[i] = teclado.nextInt();
//        }
//        System.out.println(aleatorio(twoAleatory));

        //Ejercicio 4
        System.out.println(dau());
        //Ejercicio 5
        System.out.println(dos_dau());
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

        //Ejercicio 8
        System.out.println(Arrays.toString(ordena_tres(5, 8, 1)));
        System.out.println(len_num(1000));
        piedrapapeltijera();
        System.out.println(triangle(5, 120, 4));
        //Ejercicio 12
        System.out.println("Introduce una talla para saber su equivalencia:");
//        String talla = teclado.nextLine();
//        System.out.println(talles_roba(talla));
        //Ejercico 13
        System.out.println(descuento(100, 10));
        System.out.println("Ejercicio 14");
        System.out.println(numLosas(15, 15, 30));


        //Ejercicio 16
        System.out.println("15");

        System.out.println(facturaTelefonica(15, 1, 5));
        System.out.println("16");
//        System.out.println(QuansSegons(1, 1, 1, 1));
        System.out.println(QuansSegons(1, 1, 1, 1));
    }


}