package polimorfismo;

public class Cotxe extends Vehicle {
    public Cotxe(String nombre) {
        super(nombre);
    }

    @Override
    public String socVehicle() {
        return getNombre() + " soc un cotxe";
    }
}
