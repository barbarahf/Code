//package com.company;
//
//import java.util.Scanner;
//
//class Fecha {
//
//        private int dia, mes, year;
//
//        public Fecha(int dia, int mes, int year) {
//            this.dia = dia;
//            this.mes = mes;
//            this.year = year;
//        }
//
//        @Override
//        public String toString() {
//            return String.format("%02d/%02d/%2d", dia, mes, year);
//        }
//    }
//
//    class Tiempo {
//        private int horas;
//        private int minutos;
//        private int segundos;
//
//        //public
//        //Constructor
//        //Variables data en java?
//        Tiempo(int horas, int minutos, int segundos) {
//            this.horas = horas;
//            this.minutos = minutos;
//            this.segundos = segundos;
//        }
//
//        //Añadir valores iniciales a mi clase setter
//        public void setHoras(int horas) {
//            this.horas = horas;
//        }
//
//        public void setMinutos(int minutos) {
//            this.minutos = minutos;
//        }
//
//        public void setSegundos(int segundos) {
//            this.segundos = segundos;
//
//        }
//
//        //getters
//        public int getHoras() {
//            return horas;
//        }
//
//        public int getMinutos() {
//            return minutos;
//        }
//
//        public int getSegundos() {
//            return segundos;
//        }
//
//        @Override
//        //Metodo
//        public String toString() {
//            return String.format("%02d:%02d:%02d", horas, minutos, segundos);
//        }
//        //Escribir con formota --> investigar format
//    }
//
//    public static void main(String[] args) {
//        Scanner teclado = new Scanner(System.in);
//        // Objeto
//        System.out.println("Introduce la hora:");
//        int Introhora = teclado.nextInt();
//        System.out.println("Introduce los minutos:");
//        int Introminuts = teclado.nextInt();
//        System.out.println("Introduce los segundos:");
//        int Introsegun = teclado.nextInt();
//
//        Tiempo introObjects = new Tiempo(Introhora, Introminuts, Introsegun);
//        System.out.println(introObjects);
//        int dia1, mes1, year1;
//        do {
//            System.out.println("Introduce un dia:");
//            dia1 = teclado.nextInt();
//        } while (dia1 > 31 || dia1 == 0);
//        do {
//            System.out.println("introduce un mes");
//            mes1 = teclado.nextInt();
//        } while (mes1 > 12 || mes1 == 0);
//        do {
//            System.out.println("Introduce un año");
//            year1 = teclado.nextInt();
//        } while (year1 < 2020 || year1 == 0);
//        Fecha object2 = new Fecha(dia1, mes1, year1);
//        System.out.println(object2);
//    }
//}
