package examen2020;

import Museo.Obra;

import java.util.Random;

public class Fct extends Alumne {
    public final static int HORAS_TOTAL_FCT = 317;
    private final static int PORCENTAJE_EXE = 0;
    private int horasAlumne;

    //Trabajador redundante
    public Fct(String nombre, int nota, int porcentajeExempcion, boolean practicasAsignadas) {
        super(nombre, nota, practicasAsignadas);
        this.horasAlumne = reduccion(porcentajeExempcion);
    }

    public Fct(String nombre, int nota, int porcentajeExempcion) {
        super(nombre, nota);
        this.horasAlumne = reduccion(porcentajeExempcion);
    }

    public Fct(String nombre, int nota, boolean practicasAsignadas) {
        super(nombre, nota, practicasAsignadas);
        this.horasAlumne = HORAS_TOTAL_FCT;
    }

    public Fct(String nombre, int nota) {
        this(nombre, nota, PORCENTAJE_EXE);
        this.horasAlumne = HORAS_TOTAL_FCT;
    }

    int reduccion(int reduccio) {

        return HORAS_TOTAL_FCT * reduccio / 100;
    }

    @Override
    public String toString() {
        return super.toString() + "Fct{" +
                ", horasAlumne=" + horasAlumne +
                '}';
    }


    @Override
    protected int duracionPraticas() {
        return horasAlumne;
    }


}
