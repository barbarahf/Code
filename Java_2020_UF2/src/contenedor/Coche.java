package contenedor;

import java.time.LocalDate;


public class Coche {
    private LocalDate fecha;
    private String marca;
    private String matricula;
    private int codigo;
    private String color;
    private static int countCodi = 0;

    public Coche(LocalDate fecha, String marca, String matricula, String color) {
        if (fecha.getYear() > 2020 || fecha.getYear() < 1800)
            throw new IllegalArgumentException("El año debe ser mayor que 1800 y menor o igual a 2020");
        this.fecha = fecha;
        this.marca = marca;
        this.matricula = matricula;
        this.color = color;
        this.codigo = countCodi++;
    }

    @Override
    public boolean equals(Object obj) {

        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Coche other = (Coche) obj;
        if (this.codigo != other.codigo) {
            return false;
        }

        return true;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "fecha=" + fecha +
                ", marca='" + marca + '\'' +
                ", matricula='" + matricula + '\'' +
                ", codigo=" + codigo +
                ", color='" + color + '\'' +
                '}';
    }
}
