//import java.util.Scanner;
//
///**
// * Classe Fecha
// * @author prof
// */
//public class Feche {
//
//    // Propietats
//    private int dia, mes, any;
//
//    public Feche(int dia, int mes, int any) {
//        this.dia = dia;
//        this.mes = mes;
//        this.any = any;
//    }
//
//    public Feche() {
//        Scanner entrada = new Scanner(System.in);
//        System.out.println("Introsueix la data: ");
//        System.out.print("Dia: ");
//        dia = entrada.nextInt();
//        System.out.print("Mes: ");
//        mes = entrada.nextInt();
//        System.out.print("Any: ");
//        any = entrada.nextInt();
//    }
//
//    // En l'exemple no es fan servir tots els getters/setters
//
//    public int getDia() {
//        return dia;
//    }
//
//    public int getMes() {
//        return mes;
//    }
//
//    public int getAny() {
//        return any;
//    }
//
//    public void setDia(int dia) {
//        this.dia = dia;
//    }
//
//    public void setMes(int mes) {
//        this.mes = mes;
//    }
//
//    public void setAny(int any) {
//        this.any = any;
//    }
//
//    @Override
//    public String toString() {
//        // 1return "Fecha{" + "dia=" + dia + ", mes=" + mes + ", any=" + any + '}';
//        return dia+"/"+mes+"/"+any;
//    }
//
//}public class ProvaFecha {
//    public static void main(String[] args) {
//        // int A = 40;
//        Feche Hoy = new Feche(14,1,2020);
//        System.out.println("Data d'avui:");
//        System.out.println(Hoy);
//        Feche Ahir = new Feche(13,1,2020);
//        System.out.println("Data d'ahir:");
//        System.out.println(Ahir);
//        // Les dues dates son del mateix any ?
//        if (Hoy.getAny() == Ahir.getAny()) {
//            System.out.println("Els dos anys son iguals...");
//        }
//        else {
//            System.out.println("Els dos anys no son iguals");
//        }
//
//        // Cambiar el dia de Hoy por el valor 24
//        Hoy.setDia(24);
//        System.out.println(Hoy);
//
//        // Declarar vector de 10 Fechas i inicializar los 3 primeros elementos
//        // int [] v = new int [10]
//        Feche [] Feche = new Feche [10];
//        vFecha[0] = Hoy;
//        vFecha[1] = Ahir;
//        vFecha[2] = new Feche();
//        System.out.println("Les 3 dates del vector son:");
//        for (int i=0;i<3;i++) {
//            System.out.println(vFecha[i]);
//        }
//    }
//}