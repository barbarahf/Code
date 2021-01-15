package personas_practicas;


import java.util.ArrayList;
import java.util.Collections;

public class Personas {
    ArrayList<Persona> personas = new ArrayList<>();//Se puede hacer una copia directa

    public void addPersona(Persona persona) throws PersonaDuplicadaException {
        if (personas.contains(persona))
            throw new PersonaDuplicadaException("Error, la persona que intenta añadir ya existe: " + persona.getNom());
        personas.add(persona);
    }

    public void ordenarPersonas() {
        Collections.sort(personas);
    }

    public void mostrar() {
        for (Persona p : personas) {
            System.out.println(p);
        }
    }

    public void ordenarDate() {
        personas.sort(new OrdenaData());
    }
}
