package examen2020;


public abstract class Alumne implements Comparable<Alumne> {
    private static int idAlumneContador;
    private String nombre;
    private int alumneId;
    private boolean practicasAsignats;
    private int nota;
    final static boolean ESTADO_POR_DEFECTO = false;
    private boolean prioridad;

    public Alumne(String nombre, int nota, boolean practicasAsignats) {
        this.nombre = nombre;
        this.practicasAsignats = practicasAsignats; //Sin asignar, pendiente
        this.alumneId = idAlumneContador++;
        if (nota < 0 || nota > 10)
            throw new IllegalArgumentException("Las notas no puden ser negativas/nobrepasar 10");
        this.nota = nota;
        if (nota > 8) {
            this.prioridad = true;
        }
    }

    public Alumne(String nombre, int nota) {
        this(nombre, nota, ESTADO_POR_DEFECTO);
    }

    // <editor-fold defaultstate="collapsed" desc=" GETTERS AND SETTERS ">
    public static int getIdAlumneContador() {
        return idAlumneContador;
    }

    public static void setIdAlumneContador(int idAlumneContador) {
        Alumne.idAlumneContador = idAlumneContador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public int getAlumneId() {
        return alumneId;
    }

    public void setAlumneId(int alumneId) {
        this.alumneId = alumneId;
    }

    public boolean getPracticasEstatus() {
        return practicasAsignats;
    }

    public void setPracticasEstatus(boolean practicasEstatus) {
        this.practicasAsignats = practicasEstatus;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public boolean isPrioridad() {
        return prioridad;
    }

    public void setPrioridad(boolean prioridad) {
        this.prioridad = prioridad;
    }

    // </editor-fold>

    protected abstract int duracionPraticas();

    @Override
    public int compareTo(Alumne o) {
        return o.getNota() - getNota();
    }

    @Override
    public String toString() {
        return "Alumne{" +
                "nombre='" + nombre + '\'' +

                ", alumneId=" + alumneId +
                ", practicasAsignats=" + ((practicasAsignats) ? "asignadas" : "si asignar") +
                ", nota=" + nota +
                ", prioridad=" + prioridad +
                '}';
    }
}
