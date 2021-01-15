package personas_practicas;

import java.util.Comparator;

class OrdenaData implements Comparator<Persona> {
    @Override
    public int compare(Persona coche, Persona coche2) {
        return coche.getFecha().compareTo(coche2.getFecha());
    }
}
