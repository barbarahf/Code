package WordMobile;

public class GenericDispositivo extends Dispositivo {

    private String descripcion;


    public GenericDispositivo(String marca, String modelo, float precioBase, String descripcion) {
        super(marca, modelo, precioBase);
        this.descripcion = descripcion;
    }

    // <editor-fold defaultstate="collapsed" desc=" GETTERS AND SETTERS ">
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    // </editor-fold>
    @Override
    public String toString() {
        return super.toString() + "GenericDispositivo{" +
                "descripcion='" + descripcion + '\'' +
                '}';
    }

    @Override
    public float precioFinal() {
        return this.getPRECIO_BASE() * 2;
    }

}
