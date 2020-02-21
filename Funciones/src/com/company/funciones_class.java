package com.company;

public class funciones_class {
    //Ejercicio 1
    //Recursividad
    public static int max2(int a, int b) {
        if (a > b)
            return a;
        return b;
    }

    public static int max3(int a, int b, int c) {
        return max2(max2(a, b), c);
    }

    public static int max4(int a, int b, int c, int d) {
        return max2(max2(a, b), max2(c, d));
    }

    public static void main(String[] args) {

    }
}
