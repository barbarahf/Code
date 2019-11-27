public class ejercicios20novi {
    public static void main(String[] arg) {
        int a = 50;
        int b = 5;
        int c = 50;
        boolean r;
        if(b != c && a != b && a != c ){
            r = true;
        }else {
            r = false;
        }
        System.out.println(r);
        /*Solucion faro
        r= c<a && a<b || b<a && a<c || a < b && b<c || c<b && b <a || a<c || c<b || b<c ||c<a
         */
    }
}