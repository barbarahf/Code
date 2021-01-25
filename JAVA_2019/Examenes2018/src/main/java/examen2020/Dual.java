package examen2020;

public class Dual extends Alumne {
    private boolean aFetFct;
    private int horasAlumne;
    private final int HORAS_TOTAL_DUAL = 1043;

    public Dual(String nombre, int nota, boolean aFetFct) {
        super(nombre, nota);
        this.aFetFct = aFetFct;
        if (aFetFct)
            horasAlumne = reduccion(100);
        else
            horasAlumne = HORAS_TOTAL_DUAL;
    }

    public Dual(String nombre, int nota, int reducPorcentaje) {
        super(nombre, nota);
        this.horasAlumne = reduccion(reducPorcentaje);
    }

    @Override
    protected int duracionPraticas() {
        return horasAlumne;
    }

    int reduccion(int reduccio) {
        return HORAS_TOTAL_DUAL * reduccio / 100;
    }

    @Override
    public String toString() {
        return super.toString() + "Dual{" +
                "aFetFct=" + aFetFct +
                ", horasAlumne=" + horasAlumne +
                '}';
    }


}
