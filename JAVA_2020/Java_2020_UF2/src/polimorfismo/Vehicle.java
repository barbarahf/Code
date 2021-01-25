package polimorfismo;

public class Vehicle {
    private String nombre;

    public Vehicle(String nombre) {
        this.nombre = nombre;
    }

    public String socVehicle() {
        return nombre + " soc un vehicle";
    }
    public String getNombre() {
        return nombre;
    }

}
