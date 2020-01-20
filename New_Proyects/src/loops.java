public interface loops {
    public static void main(String[] arg) {
        String nombre = "Hola soc la barbara";
        //Ejercicio doble bucles
        for (int i = 0, j = nombre.length() - 1; i < nombre.length() && j >= 0; i++, j--) {
            System.out.println(nombre.charAt(i) + " " + nombre.charAt(j));
        }
        //Ejercicio 1
        for (int cien = 100; cien <= 110; cien++) {
            System.out.println(cien);
        }
        //Ejercicio 2
        for (int quinientos = 512; quinientos >= 500; quinientos--) {
            System.out.println(quinientos);
//        100 al 120 en orden creciente  (string.format("%3d,  ", n))
        }
        //Ejercicio 3
        for (int parNumber = 100; parNumber <= 120; parNumber += 2) {
            System.out.print("\t" + parNumber + ",");
        }
        //Ejercicio 4
        System.out.println("\n");        //Ejercicio 4
        for (int menos = 200; menos >= 50; menos -= 2) {
            System.out.print("\n" + menos + ",");
        }
        for (int cien = 100; cien <= 110; cien++) {
            System.out.println(cien);
//        do {
//            statement(s);
//        } while( condition );
//        Ejercicio 5
            int cien2 = 100;
            do {
                cien2++;
                System.out.println(cien2);
            }
            while (cien2 <= 110);
        }
    }
}

