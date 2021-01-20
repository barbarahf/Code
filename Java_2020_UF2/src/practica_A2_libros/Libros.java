package practica_A2_libros;

import personas_practicas_clase.Persona;

import java.util.ArrayList;
import java.util.Collections;

public class Libros {
    ArrayList<Persona> libros = new ArrayList<>();
/*
Heu definit una classe per a guardar els objectes de la vostra col·lecció. En principi
aquesta classe té un vector, un comptador d’elements (potser algú ha fet servir un ArrayList)
 i mètodes per afegir un element, ordenar amb l’ordre per valor (ordre natural), amb l’ordre
 alfabètic i amb ordre basat en data LocalDate.
 */

    public void ordenarLibros() {
        Collections.sort(libros);
    }



}
