public class Personatge {
    private static Object[][] tablero = new Object[10][10];
    private final String nom;
    private int x;
    private int y;
    private double presupuerto;
    private String mochila;


    public Personatge(String nom, int y, int x, double presupuerto, String mochila) {
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
        if (checkIntercambio(per)) {
            this.presupuerto -= cuantitat;
            per.presupuerto += cuantitat;
        }
    }

    private void agafa(Personatge p) {
        if (checkIntercambio(p)) {
            this.mochila = p.deixa();
        }
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    //Move
    private int xLeft() {
        x--;
        return x;
    }

    private int yDown() {
        y++;
        return y;
    }

    private int xRigth() {
        x++;
        return x;
    }

    private int yUp() {

        y--;
        return y;
    }

    private void move(int newX) {//Move desplaza el objeto de forma secuencial
        if (newX < x) {
            while (newX < x) {
                Object sav = tablero[y][x - 1];
                tablero[y][x] = sav;
                tablero[y][xLeft()] = this.getNom();
            }
        } else {
            while (newX > x) {
                Object sav = tablero[y][x + 1];
                tablero[y][x] = sav;
                tablero[y][xRigth()] = this.getNom();
            }
        }
    }

    //Overload
    private void move(int newY, int newX) {
        //No pueden estar los objectos en una misma posicion.
        if (checkEmpty(newY, newX)) {
            if (newX != 0) {
                newX -= 1;
            } else {
                newX += 1;//Si el objeto esta en la primera posicion, desplazar el siguiente a la derecha
            }
        }
        if (newY < y) {
            while (newY < y) {
                Object sav = tablero[y - 1][x];
                tablero[y][x] = sav;
                tablero[yUp()][x] = this.getNom();
            }
        } else {
            while (newY > y) {
                Object sav = tablero[y + 1][x];
                tablero[y][x] = sav;
                tablero[yDown()][x] = this.getNom();
            }
        }
        move(newX);
    }

    private boolean checkEmpty(int yCheck, int xCheck) {
        return tablero[yCheck][xCheck] != null;
    }

    //Obtener objetos del tablero
    private void agafarDelTablero() {
        if (tablero[y][x + 1] instanceof String) {
            this.mochila = tablero[y][x + 1].toString();
        } else if (tablero[y][x - 1] instanceof String) {
            this.mochila = tablero[y][x - 1].toString();
        }
    }

    //Solo puden intercambiar los objetos que esten juntos
    private boolean checkIntercambio(Personatge p) {
        return p.x == this.x + 1 || p.x == this.x - 1;

    }

    @Override
    public String toString() {
        return
                "Existe un personaje de nombre '" + nom + '\'' +
                        ", con las coordenadas (" + y + "," + x + ")" +
                        ", que dispone de " + presupuerto + " euros" +
                        " y lleva " + mochila + " en la mochila" + '\'';
    }

    public static void main(String[] args) {
        try {

            Personatge indiana = new Personatge("Indiana", 0, 0, 50.0, "Brujula");
            Personatge pepito = new Personatge("pepito", 1, 3, 30.0, "");

            tablero[indiana.getY()][indiana.getX()] = indiana;
            tablero[pepito.getY()][pepito.getX()] = pepito;
            tablero[5][5] = "Mapa";

            System.out.println(pepito);
            System.out.println(indiana);

            //Mover hasta encontrar a pepito
            pepito.move(indiana.getY(), indiana.getX());//Se posiciona al lado de pepito
            pepito.deixarDiners(5, indiana);
            pepito.agafa(indiana);
            //Pepito se desplaza hasta 5,5 y coge un mapa
            pepito.move(5, 5);
            pepito.agafarDelTablero();
            //Utilizar getters
            System.out.println("Nom:" + indiana.getNom());
            System.out.println("Coordenadas:" + indiana.getY() + "," + indiana.getX());
            System.out.println("Mochila:" + indiana.getMochila());
            System.out.println(pepito);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

