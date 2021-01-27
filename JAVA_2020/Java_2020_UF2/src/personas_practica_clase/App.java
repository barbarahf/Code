package personas_practica_clase;

import java.time.LocalDate;
import java.util.Iterator;

public class App {
    public static void main(String[] args) {

        Personas personasApp = new Personas();
        try {
            personasApp.addPersona(new Persona("Brad", "Pitt", "Ila", "y6366156t", LocalDate.of(2000, 5, 10)));
            personasApp.addPersona(new Persona("Yrad", "Pitt", "Ila", "y6366886t", LocalDate.of(2001, 5, 10)));
            personasApp.addPersona(new Persona("Bod", "Pitt", "Ila", "y6388886t", LocalDate.of(1997, 5, 10)));
            personasApp.addPersona(new Persona("Brad", "Pitt", "Ila", "y6366156t", LocalDate.of(2005, 5, 10)));
            personasApp.addPersona(new Persona("Isabel", "Poitt", "Ila", "y6387878886t", LocalDate.of(2002, 5, 10)));
        } catch (PersonaDuplicadaException e) {
            e.printStackTrace();
        }
        personasApp.ordenarPersonas();//Orden natural
        personasApp.ordenarDate2(); //Ordenar por fecha
        //personasApp.ordenarDate(); ==> Creciente
        personasApp.mostrar();
        System.out.println("Iterator");
        Iterator<Persona> it = personasApp.personas.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
//        for (Persona p: personasApp.personas) {//Es iterable, funciona solo iterable
//        }
        //Nmbre par
        System.out.println("Iterator, nombre par");
        Iterator<Persona> it2 = personasApp.iteradorNomParell();
        while (it2.hasNext()) {
            System.out.println(it2.next());
        }

    }
}
