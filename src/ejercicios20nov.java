public class ejercicios20nov {
    public static void main(String[] arg) {
        int a = (int) 50.5;
        int b = 150;
        int c = (int) 500.8;
        int max;
//        max = (a > b) ? a : b;
//        if (a == b)
//            a = c;  El if con una sola sentencia no necesita {
        if (a > b && a > c) {
            max = a;
        } else if (b > a && b > c) {
            max = b;
        } else {
            max = c;
        }
        System.out.println(max);
    }
}