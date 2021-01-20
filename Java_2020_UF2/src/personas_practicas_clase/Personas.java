package personas_practicas_clase;


import java.util.*;
import java.util.function.Consumer;

public class Personas implements Iterable<Persona> {

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

    public void ordenarDate2() {
        personas.sort(new OrdenaData2());
    }

    public void ordenarDate3() { //Comparador anonimo
        personas.sort(new Comparator<Persona>() {
            @Override
            public int compare(Persona persona, Persona persona2) {
                return persona.getFecha().compareTo(persona2.getFecha());
            }
        });
    }

    public void ordenarDate4() { //Comparador Lamda
        personas.sort((Persona t, Persona t1) -> t.getFecha().compareTo(t1.getFecha()));
    }

    //Iterable metodos
    @Override
    public Iterator<Persona> iterator() {
        return personas.iterator();
    }

    //Iterar personas por numero de caracters per al nombre

    public Iterator<Persona> iteradorNomParell() {
        return new Iterator<Persona>() {
            int actual = 0;

            @Override
            public boolean hasNext() {
                //Poner el index (actual) al siguiente elemento
                // retorna false si no ha cap mes element
                //retorna true en caso contrario
                boolean encontrado = false;
                while (!encontrado && actual < personas.size()) {
                    encontrado = personas.get(actual).getNom().length() % 2 == 0;
                    if (!encontrado) {
                        actual++;
                    }
                }
                return encontrado;
            }

            @Override
            public Persona next() {
                return personas.get(actual++);
            }
        };
    }

    @Override
    public void forEach(Consumer<? super Persona> action) {

    }

    @Override
    public Spliterator<Persona> spliterator() {
        return null;
    }
}

//Orden decreciente
class OrdenaData2 implements Comparator<Persona> {
    @Override
    public int compare(Persona persona, Persona persona2) {
        return persona2.getFecha().compareTo(persona.getFecha());
    }
}
//Otro ejemplo
/*
class OrdenaData2 implements Comparator<Persona> {
    @Override
    public int compare(Persona persona, Persona persona2) {
        return -1*(persona2.getFecha().compareTo(persona.getFecha()));
    }
}*/
