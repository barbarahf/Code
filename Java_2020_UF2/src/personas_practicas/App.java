package personas_practicas;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
/*    private String nom;
    private String cognom_1;
    private String getCognom_2;
    private String dni; //Campo unico
    private LocalDate data;      Persona persona= new Persona()
 */
        Personas personasApp = new Personas();
        try {
            personasApp.addPersona(new Persona("Brad", "Pitt", "Ila", "y6366156t", LocalDate.of(2000, 5, 10)));
            //personasApp.addPersona(new Persona("Brad", "Pitt", "Ila", "y6366156t", LocalDate.of(2000, 5, 10)));
        } catch (PersonaDuplicadaException e) {
            e.printStackTrace();
        }
        personasApp.ordenarPersonas();
        personasApp.mostrar();
    }
}
