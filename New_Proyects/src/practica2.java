public class practica2 {
    private int cifra8;

    public static void main(String[] args) {
/*
Indicar el número de combinaciones de 4 cifras que sólo contienen las cifras 2, 8 y 4,
y mostrar todas estas combinaciones una debajo de la otra. Se desea una solución que
no utilice el método contains de la clase String.
Orientaciones para resolver el ejercicio para cualesquiera valores a, bica la secuencia:
No pueden ser los cuatro iguales (1 combinación), no pueden ser tres de ellos iguales
(4 combinaciones) y no pueden ser iguales dos a dos (3 combinaciones ), así, con un
condicional de 1 + 4 + 3 = 8 comparaciones deberíamos poder resolver, para cualesquiera 3 valores.

*/      int contador=0;
        int cifra2 = 2;
        int cifra8 = 8;
        int cifra4 = 4;
        for (int n0 = 1; n0 <= cifra2; n0++) {
            for (int n1 = 1; n1 <= cifra8; n1++, contador++) {
                for (int n2 = 1; n2 <= cifra4; n2++) {
                    System.out.println(n0 + " " + n1 + " " + n2);
//                    contador++;
                }
            }

        }
    }
}
