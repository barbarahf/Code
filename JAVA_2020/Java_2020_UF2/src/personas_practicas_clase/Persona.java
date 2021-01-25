package personas_practicas_clase;

import java.time.LocalDate;


public class Persona implements Comparable<Persona> {
    private String nom;
    private String cognom_1;
    private String cognom_2;
    private String dni; //Campo unico
    private LocalDate data;
    private int id;
    private static int count = 0;

    public Persona(String nom, String cognom_1, String getCognom_2, String dni, LocalDate data) {
        this.nom = nom;
        this.cognom_1 = cognom_1;
        this.cognom_2 = getCognom_2;
        this.dni = dni;
        this.data = data;
        this.id = count++;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nom='" + nom + '\'' +
                ", cognom_1='" + cognom_1 + '\'' +
                ", getCognom_2='" + cognom_2 + '\'' +
                ", dni='" + dni + '\'' +
                ", data=" + data +
                '}';
    }

    // <editor-fold defaultstate="collapsed" desc=" GETTERS AND SETTERS">
    public String getDni() {
        return dni;
    }

    public LocalDate getFecha() {
        return data;
    }

    public String getCognom_1() {
        return cognom_1;
    }

    public String getNom() {
        return nom;
    }

    public String getGetCognom_2() {
        return cognom_2;
    }

    // </editor-fold>
    //Orden natural, arrays sort & collection sort
    @Override
    public int compareTo(Persona persona) {
        int result = this.cognom_1.compareToIgnoreCase(persona.cognom_1);
        if (result == 0) {
            result = this.cognom_2.compareToIgnoreCase(persona.cognom_2);
            if (result == 0) {
                result = this.nom.compareToIgnoreCase(persona.nom);
            }
        }
        return result;
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Persona other = (Persona) obj;
        return this.dni.equals(other.dni);
    }

}


