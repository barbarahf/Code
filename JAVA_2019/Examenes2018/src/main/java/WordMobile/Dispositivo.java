package WordMobile;

public abstract class Dispositivo {
    private String marca;
    private String modelo;
    private final float PRECIO_BASE;
    private float precioFinal;

    public Dispositivo(String marca, String modelo, float precioBase) {
        this.marca = marca;
        this.modelo = modelo;
        PRECIO_BASE = precioBase;
        this.precioFinal = precioFinal();

    }
    // <editor-fold defaultstate="collapsed" desc=" GETTERS & SETTER ">

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getPRECIO_BASE() {
        return PRECIO_BASE;
    }

    public float getPrecioFinal() {
        return precioFinal;
    }

    public void setPrecioFinal(float precioFinal) {
        this.precioFinal = precioFinal;
    }

    // </editor-fold>

    protected abstract float precioFinal();

    @Override
    public String toString() {
        return "Dispositivo{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", precioBase=" + PRECIO_BASE +
                '}';
    }

}
