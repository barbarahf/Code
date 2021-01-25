package POO_Examen;

public class Futbolista extends SeleccionFutbol {
    private int dorsal;
    String demarcacion;

    public Futbolista() {
        super();
    }

    public Futbolista(int id, String nombre, String apellidos, int edad, int dorsal, String demarcacion) {
        super(id, nombre, apellidos, edad);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

    @Override
    public void entrenamiento() {

    }
}