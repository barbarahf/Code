public class Personatge {
    private static final String[][] tablero = new String[10][10];
    private final String nom;
    private int x;
    private int y;
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

    //Move
    private void xLeft(){
        this.x--;
    }
    private void yDown(){
        this.y--;
    }
    private void xRigth(){
        this.x++;
    }
    private void yUp(){
        this.y++;
    }

    private void move(int x){
        while (this.x!=x){
         if(this.x>x)  {
             while (this.x!=x){
                 this.xLeft();

             }
         }else{
             this.xRigth();
         }
        }

    }
    //Overload
    private void move(int x,int y){
        move(x);
        while (this.y!=y){
            if(this.y>y)  {
                while (this.y!=y){
                    this.yDown();
                }
            }else{
                this.yUp();
            }
        }
        tablero[this.x][this.y]=this.nom;
    }

    //Aceptardinero()

    //agafarCosas()
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
        System.out.println(indiana);

        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                tablero[i][j] = " |........| ";
            }
        }
        Personatge.tablero[indiana.getX()][indiana.getY()]=indiana.getNom();
        Personatge.tablero[pepito.getX()][pepito.getY()]=pepito.getNom();

        indiana.move(1,1);
        System.out.println(indiana);
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
