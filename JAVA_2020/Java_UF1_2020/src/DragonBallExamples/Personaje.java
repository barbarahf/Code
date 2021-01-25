package DragonBallExamples;

/**
 * Esta clase pretende crear un personaje para un videojuego
 *
 * @author Barbara Herrera flores
 */
public abstract class Personaje {
    private String nom; //Encapsulacion
    private int ki;
    private String planeta;


    private int nivelVida = 100;
    boolean vivo = true;

    public Personaje(String nom, int ki, String planeta) {
        this.nom = nom;
        this.ki = ki;
        this.planeta = planeta;
    }

    //Principio de ocultacion, getters y setters
    //<editor-fold defaultstate="collapsed" desc="GETTERS & SETTERS">
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getKi() {
        return ki;
    }

    public void setKi(int ki) {
        this.ki = ki;
    }

    public String getPlaneta() {
        return planeta;
    }

    public void setPlaneta(String planeta) {
        this.planeta = planeta;
    }

    public int getNivelVida() {
        return nivelVida;
    }

    public void setNivelVida(int nivelVida) {
        this.nivelVida = nivelVida;
    }

    public boolean isVivo() {
        return vivo;
    }

    /**
     * Metodo para revivir al personaje
     *
     * @param viv Este parametro identifica si el personaje está vivo
     */
    public void setVivo(boolean viv) {
        if (viv) {
            System.out.println("Lo siento, necesita las esfereas del dragon para poder revivir a " + this.nom);
        } else {
            this.vivo = false;
        }
    }

    /**
     * @return Es un metodo void, revive al personaje
     */
    //</editor-fold>
    public abstract String fusion();

    public abstract void ataque();

    public abstract String leerKi();


}

class Sayayin extends Personaje { //Herencia

    String estado;

    public Sayayin(String nom, int ki, String planeta, String estado) {
        super(nom, ki, planeta);
        this.estado = estado;
    }

    public Sayayin(String nom, int ki, String planeta) {
        super(nom, ki, planeta);
    }

    @Override
    public String fusion() {
        return null;
    }

    @Override
    public void ataque() {

    }

    @Override
    public String leerKi() {
        return null;
    }

    public void transformarse() {
        this.estado = "super sayayin";
    }


    public static void main(String[] args) {
        Personaje goku = new Sayayin("goku", 1000, "Vegeta"); //Polimorfismo
        //Principio de ocultacion, modificar con getters y setter
        goku.setVivo(false);
        goku.setVivo(true);

    }
}