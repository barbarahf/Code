package contenedor_practica_0;

import java.time.LocalDate;


public class App {

    public static void main(String[] args) {
        try {
            Coche coche = new Coche(LocalDate.now(), "Audi", "XW41567", "Rojo", 4, 'Z');
            Coche coche01 = new Coche(LocalDate.now(), "Ferrari", "XW41567", "Blanco", 15000000, 'A');
            //Iguales
            Coche coche02 = new Coche(LocalDate.now(), "Ferrari", "XW41567", "Blanco", 15000000, 'X');
//            Coche cocheEjemplo = coche01;//Referencia
            Coche coche03 = new Coche(LocalDate.now(), "Ford Mustang", "YX71567", "Negro", 7151515, 'C');
            Coche coche04 = new Coche(LocalDate.now(), "Jaguar", "YX51567", "Rojo", 800, 'L');
            Coche coche05 = new Coche(LocalDate.now(), "Toyota", "YX51567", "Negro", 100000, 'P');

            Coches almacen = new Coches();
            almacen.addCoche(coche);
            almacen.addCoche(coche01);
            almacen.addCoche(coche02);
            almacen.addCoche(coche03);
            almacen.addCoche(coche04);
            almacen.addCoche(coche05);
            //Comparar sin son iguales
            System.out.println(coche01.equals(coche02));
//            System.out.println(cocheEjemplo.equals(coche01));

//            System.out.println(almacen.getCoche(0));
            almacen.ordenarCoches();
            almacen.mostrarCoches();
        } catch (IllegalArgumentException e) {
            System.out.println(e.toString());
        }

    }
}
