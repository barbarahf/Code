package contenedor_practica_0;

import java.time.LocalDate;
import java.util.Comparator;


public class Coche implements Comparable<Coche> {

    private LocalDate fecha;
    private String marca;
    private String matricula;
    private String color;
    private int codigo;
    private int valor;
    private static int countCodi = 0;
    private char letra;

    public Coche(LocalDate fecha, String marca, String matricula, String color, int valor, char letra) {
        if (fecha.getYear() > 2020 || fecha.getYear() < 1800)
            throw new IllegalArgumentException("El año debe ser mayor que 1800 y menor o igual a 2020");
        this.fecha = fecha;
        this.marca = marca;
        this.matricula = matricula;
        this.color = color;
        this.codigo = countCodi++;
        this.valor = valor;
        this.letra = letra;
    }

    // <editor-fold defaultstate="collapsed" desc=" Getters and setters ">
    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    // </editor-fold>
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

    public String getMarca() {
        return marca;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "fecha=" + fecha +
                ", marca='" + marca + '\'' +
                ", matricula='" + matricula + '\'' +
                ", color='" + color + '\'' +
                ", codigo=" + codigo +
                ", valor=" + valor +
                ", letra=" + letra +
                '}';
    }


    @Override
    public int compareTo(Coche coche) {

        if (coche.letra != letra) {
            return coche.letra - letra;
        } else {
            return coche.valor - valor;
        }

    }
}
/*
* compareToIgnoreCase
*
* */
class OrdenaCreixentValor implements Comparator<Coche> {

    @Override
    public int compare(Coche o1, Coche o2) {
        return o1.getValor() - o2.getValor();
    }
}

class OrdenaData implements Comparator<Coche> {

//Orden cronologico
    @Override
    public int compare(Coche coche, Coche coche2) {

        return coche.getFecha().compareTo(coche2.getFecha());

    }
}

class OrdenaAlfabe implements Comparator<Coche> {

//Orden alfabetico

    @Override
    public int compare(Coche coche, Coche coche2) {

        return coche.getMarca().compareTo(coche2.getMarca());

    }
}

//    public int compareTo(ChronoLocalDate otherDate) {
//        return this.getFecha() - otherDate.getFecha();
//
//    }
//    @Override
//    public LocalDate compare(Coche o1, Coche o2) {
//        return o1.getFecha() - o2.getFecha();
//    }



