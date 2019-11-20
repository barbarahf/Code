public class ejercicios20nov {
    public static void main(String[] arg) {
        int a = 10;
        int b = (int) 500.5;
        int c = 10;
        int max;
        int max2 = a >= b && a >= c ?  a : b >= a && b >= c ? b : c >= b && c >= a ? c : 0;
        System.out.println(max2);
        int max3 = a>b && a > c ? a: b>c? b:c; //Ejemplo Faro
        System.out.println(max3);
         //        max = (a > b) ? a : b;
        // if (a == b)
        //  a = c;  El if con una sola sentencia no necesita ({)

        if (a >= b && a >= c) {
            max = a;
        } else if (b >= a && b >= c) {
            max = b;
        } else {
            max = c;
        }
        System.out.println(max);
    }
}