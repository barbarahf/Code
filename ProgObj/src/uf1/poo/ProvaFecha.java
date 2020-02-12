package uf1.poo;
/**

 */
public class ProvaFecha {
    public static void main(String[] args) {
         int A = 40;
        Fecha Hoy = new Fecha(14,1,2020);
        System.out.println("Data d'avui:");
        System.out.println(Hoy);
        Fecha Ahir = new Fecha(13,1,2020);
        System.out.println("Data d'ahir:");
        System.out.println(Ahir);
//         Les dues dates son del mateix any ?
        if (Hoy.getAny() == Ahir.getAny()) {
            System.out.println("Els dos anys son iguals...");
        }
        else {
            System.out.println("Els dos anys no son iguals");
        }

//         Cambiar el dia de Hoy por el valor 24
        Hoy.setDia(24);
        System.out.println(Hoy);

//         Declarar vector de 10 Fechas i inicializar los 3 primeros elementos
         int [] v = new int [10];
        Fecha [] vFecha = new Fecha [10];
        vFecha[0] = Hoy;
        vFecha[1] = Ahir;
        vFecha[2] = new Fecha();
        System.out.println("Les 3 dates del vector son:");
        for (int i=0;i<3;i++) {
            System.out.println(vFecha[i]);
        }
    }
}