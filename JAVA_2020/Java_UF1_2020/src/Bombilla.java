public class Bombilla {

    private final int MIN = 0;
    private final int MAX = 5;
    private int intensidad;//Apagada por defecto


    public Bombilla(int intensidad) {
        this.intensidad = intensidad;
    }

    public void setIntensidad(int intensidad) {//Cambiar estado
        if (intensidad != MAX) {
            this.intensidad = intensidad;
        }
    }

    public void apagar() {
        this.setIntensidad(0);
    }

    public void bajarIntencidad() {
        if (intensidad != 0 && intensidad < 5)
            this.intensidad -= 1;
    }

    public void subirIntencidad() {
        if (intensidad < 5)
            this.intensidad += 1;
    }

    @Override
    public String toString() {
        return "Bombilla{" +
                "intensidad=" + intensidad +
                '}';
    }

    public static void main(String[] args) {
        Bombilla[] tabla = {
                new Bombilla(0), new Bombilla(4),
                new Bombilla(3), new Bombilla(4), new Bombilla(1), new Bombilla(6)
        };
        for (Bombilla bombilla : tabla) {
            System.out.print(bombilla + " ");
        }
        for (Bombilla bombilla : tabla) {
            bombilla.bajarIntencidad();
        }
        for (Bombilla bombilla : tabla) {
            System.out.print(bombilla + " ");
        }
    }
}
