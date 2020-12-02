package WordMobile;

enum Hardware {
    gps, accelerometre;
}

public class Smartphones extends Dispositivo {
    private String sistemaOperativo;
    private Hardware gps;
    private Hardware accelerometre;


    public Smartphones(String marca, String modelo, float precioBase, String sistemaOperativo, Hardware gps, Hardware accelerometre) {
        super(marca, modelo, precioBase);
        this.sistemaOperativo = sistemaOperativo;
        this.gps = gps;
        this.accelerometre = accelerometre;
        if (this.gps != null || this.accelerometre != null) {
            setPrecioFinal(getPrecioFinal() + getPrecioFinal() * 5 / 100);
        }
    }

    // <editor-fold defaultstate="collapsed" desc=" GETTERS & SETTERS ">
    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    public Hardware getGps() {
        return gps;
    }

    public void setGps(Hardware gps) {
        this.gps = gps;
    }

    public Hardware getAccelerometre() {
        return accelerometre;
    }

    public void setAccelerometre(Hardware accelerometre) {
        this.accelerometre = accelerometre;
    }

    @Override
    public float precioFinal() {
        return getPRECIO_BASE() * 2;

    }

    // </editor-fold>
    @Override
    public String toString() {
        return super.toString() + "Smartphones{" +
                "so='" + sistemaOperativo + '\'' +
                ", gps=" + gps +
                ", accelerometre=" + accelerometre +
                '}';
    }
}
