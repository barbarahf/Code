package contenedor_practica_0;

import java.time.LocalDate;
import java.util.Arrays;

public class AppA1 {
    public static void main(String[] args) {
        Coches almacenPractica01 = new Coches();
        Coche coche01 = new Coche(LocalDate.now(), "LAMBORGHINI", "54656564", "Negro", 66660000, 'P');
        coche01.setFecha(LocalDate.of(2020, 1, 8));
        Coche coche02 = new Coche(LocalDate.now(), "BMW", "XW41564657", "Blanco", 900000, 'X');
        coche02.setFecha(LocalDate.of(2020, 2, 8));
        Coche coche03 = new Coche(LocalDate.now(), "Renault", "Y1XXX567", "Negro", 8000, 'C');
        Coche coche04 = new Coche(LocalDate.now(), "Lexus", "5464DRFF5", "Rojo", 700000, 'L');
        Coche coche05 = new Coche(LocalDate.now(), "CHEVROLET", "54654XD67", "Negro", 100000, 'P');


        almacenPractica01.addCoche(coche01);
        almacenPractica01.addCoche(coche02);
        almacenPractica01.addCoche(coche03);
        almacenPractica01.addCoche(coche04);
        almacenPractica01.addCoche(coche05);
        almacenPractica01.ordenarCoches();

        System.out.println("Comparable, ordenar por valor");
        almacenPractica01.ordenarCoches();

        System.out.println("Ordenar valor, coparator");
        Arrays.sort(almacenPractica01.getAlamacenCoches(), 0, almacenPractica01.getnCoche(), new OrdenaCreixentValor());
        almacenPractica01.mostrarCoches();
        System.out.println();


        System.out.println("Orden cronologico");
        Arrays.sort(almacenPractica01.getAlamacenCoches(), 0, almacenPractica01.getnCoche(), new OrdenaData());
        almacenPractica01.mostrarCoches();

        System.out.println("Orden alfabetico");
        Arrays.sort(almacenPractica01.getAlamacenCoches(), 0, almacenPractica01.getnCoche(), new OrdenaAlfabe());
        almacenPractica01.mostrarCoches();
    }

}
