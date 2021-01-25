package practica_A2_libros;

import java.util.Comparator;

public class OrdenaAlfabe implements Comparator<Libro> {
    @Override
    public int compare(Libro o, Libro t1) {
        int result = o.getTitulo().compareToIgnoreCase(t1.getTitulo());
        if (result == 0) {
            result = o.getAutorCog().compareToIgnoreCase(t1.getAutorCog());
            if (result == 0) {
                result = o.getAutorNom().compareToIgnoreCase(t1.getAutorNom());
            }
        }
        return result;
    }
}
