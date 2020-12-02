package WordMobile;

public class Tablets extends Dispositivo {
    private int pulgadas;

    public Tablets(String marca, String modelo, float precioBase, int pulgadas) {
        super(marca, modelo, precioBase);
        this.pulgadas = pulgadas;
    }

    // <editor-fold defaultstate="collapsed" desc=" Getters & setters ">
    public int getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(int pulgadas) {
        this.pulgadas = pulgadas;
    }

    // </editor-fold>
    @Override
    public String toString() {
        return super.toString() + "Tablets{" +
                "pulgadas=" + pulgadas +
                '}';
    }
    @Override
    public float precioFinal() {
        return this.getPRECIO_BASE() * 2;
    }

}
