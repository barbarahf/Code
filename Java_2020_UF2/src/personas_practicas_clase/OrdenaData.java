package personas_practicas_clase;

import java.util.Comparator;

class OrdenaData implements Comparator<Persona> {
    @Override
    public int compare(Persona persona, Persona persona2) {
        return persona.getFecha().compareTo(persona2.getFecha());
    }
}
