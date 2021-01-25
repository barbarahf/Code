package practica_A2_libros;



import java.time.LocalDate;
import java.util.Iterator;

public class AppLibros {
    static Libros contenedor = new Libros();


    public static void main(String[] args) {
        try {
            Libro libro1 = new Libro("Cien años de soledad", "Gabriel", "Garcia", 1020456548, LocalDate.of(1945, 5, 1),15);
            contenedor.addLibro(new Libro("Cien años de soledad", "Gabriel", "Garcia", 1020456548, LocalDate.of(1945, 5, 1),25));
            contenedor.addLibro(new Libro("La Vida Secreta de Las Abejas", "Sue", "Monk", 85859595, LocalDate.now(),15.5));
            contenedor.addLibro(new Libro("El viejo y el mar", "Ernest", "Hemingway", 155489482, LocalDate.of(1935, 5, 1),18.9));
            contenedor.addLibro(new Libro("Alicia en el país de las maravillas", "Lewis", "Carroll", 474784547, LocalDate.now(),5.6));
            contenedor.addLibro(new Libro("El color púrpura", "Alice", "Walker", 1020456548, LocalDate.of(1945, 5, 1),18.9));
            //Libro duplicado
            contenedor.addLibro(new Libro("Cien años de soledad", "Gabriel", "Garcia", 1020456548, LocalDate.of(1945, 5, 1),22.7));
        } catch (LibroDuplicadoException e) {
            e.printStackTrace();
        }

        contenedor.mostrar();
        System.out.println(" ___________________Orden natural___________________");
        contenedor.ordenarLibros();
        contenedor.mostrar();

        System.out.println(" ___________________Orden Fecha (Más reciente a menos) ___________________");
        contenedor.orderByData();
        contenedor.mostrar();

        System.out.println(" ___________________Orden Alfabetico___________________");
        contenedor.orderAlfabe();
        contenedor.mostrar();
        System.out.println("ITERADORES");

        //Iterator
        System.out.println("Iterator con while:");
        Iterator<Libro> iteratorLibros = contenedor.iterator();
        while (iteratorLibros.hasNext()) {
            System.out.println(iteratorLibros.next());
        }
        System.out.println("Iterator con for:");
        for (Libro libro : contenedor) {
            System.out.println(libro);
        }

        System.out.println("Iterator por valor: ");
        Iterator<Libro> libroValorIt=contenedor.iteradorPerValor(18);
        while (libroValorIt.hasNext()) {
            System.out.println(libroValorIt.next());
        }
    }
}
