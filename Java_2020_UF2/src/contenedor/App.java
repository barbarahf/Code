package contenedor;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        try {
            Coche coche = new Coche(LocalDate.now(), "Audi", "XW41567", "Rojo");
            Coche coche01 = new Coche(LocalDate.now(), "Ferrari", "XW41567", "Blanco");
            Coche coche02 = new Coche(LocalDate.now(), "Jeep", "YX51567", "Negro");
            Coches almacen = new Coches();
            almacen.addCoche(coche);
            almacen.addCoche(coche01);
            almacen.addCoche(coche02);
            System.out.println(almacen.getCoche(0));
            almacen.mostrarCoches();
        } catch (IllegalArgumentException e) {
            System.out.println(e.toString());
        }
    }
}
