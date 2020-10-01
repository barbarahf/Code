
public class Personatge {
    private final String nom;
    private final int x;
    private final int y;
    private double presupuerto;
    private String mochila;


    public Personatge(String nom, int x, int y, double presupuerto, String mochila) {
        this.nom = nom;
        this.x = x;
        this.y = y;
        this.presupuerto = presupuerto;
        this.mochila = mochila;
    }

    public String getMochila() {
        return mochila;
    }

    public String getNom() {
        return nom;
    }


    private String deixa() {
        String temp = this.mochila;
        this.mochila = "";
        return temp;
    }

    private void deixarDiners(double cuantitat, Personatge per) {
        this.presupuerto -= cuantitat;
        per.presupuerto += cuantitat;
    }

    private void agafa(Personatge p) {
        this.mochila = p.deixa();
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }


    @Override
    public String toString() {
        return
                "Existe un personaje de nombre '" + nom + '\'' +
                        ", con las coordenadas (" + x + "," + y + ")" +
                        ", que dispone de " + presupuerto + " euros" +
                        " y lleva " + mochila + " en la mochila" + '\'';
    }

    public static void main(String[] args) {

        Personatge indiana = new Personatge("Indiana", 0, 0, 50.0, "Brujula");
        Personatge pepito = new Personatge("pepito", 7, 3, 30.0, "Mapa");

        //Tableros
        String[][] tablero = new String[10][10];
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                tablero[i][j] = "          ";
            }
        }
        tablero[indiana.getX()][indiana.getY()] = indiana.getNom();
        tablero[pepito.getX()][pepito.getY()] = pepito.getNom();

        System.out.println("#######################################################");
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                if (tablero[i][j] != null)
                    System.out.print(tablero[i][j] + "  ");
            }
            System.out.println("");
        }
        System.out.println("#######################################################");

    }
}
