package practica_A2_libros;


import java.util.*;
import java.util.function.Consumer;

public class Libros implements Iterable<Libro> {
    ArrayList<Libro> libros = new ArrayList<>();

    public void mostrar() {
        for (Libro libro : libros) {
            System.out.println(libro);
        }
    }

    public void ordenarLibros() {
        Collections.sort(libros);
    }

    public void addLibro(Libro newLibro) throws LibroDuplicadoException {
        if (libros.contains(newLibro))
            throw new LibroDuplicadoException("Error, el libro que intenta añadir ya existe: " + newLibro.getTitulo());
        libros.add(newLibro);
    }

    public void orderByData() {     //Comparador anonimo
        libros.sort(new Comparator<Libro>() {
            @Override
            public int compare(Libro libro1, Libro libro2) {
                return libro2.getDataPublicacion().compareTo(libro1.getDataPublicacion());
            }
        });
    }

    //Comparador clase externa
    public void orderAlfabe() {
        libros.sort(new OrdenaAlfabe());

    }

    //Iterator
    @Override
    public Iterator<Libro> iterator() {
        return libros.iterator();
    }

    @Override
    public void forEach(Consumer<? super Libro> action) {

    }

    @Override
    public Spliterator<Libro> spliterator() {
        return null;
    }
    //Metodos de iterable

    public Iterator<Libro> iteradorPerValor(double minVal) {
        return new Iterator<Libro>() {
            int actual = 0;

            @Override
            public boolean hasNext() {
                boolean encontrado = false;
                while (!encontrado && actual < libros.size()) {
                    encontrado = libros.get(actual).getPrecio() >= minVal;
                    if (!encontrado) {
                        actual++;
                    }
                }
                return encontrado;
            }

            @Override
            public Libro next() {
                return libros.get(actual++);
            }
        };
    }

}
