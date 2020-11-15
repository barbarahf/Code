

public class pruebas {
    public static void main(String[] args) throws InterruptedException {


    }

    public static void miMetodo() {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
        int xcal=i*i+1;
            System.out.println(xcal);
        }
        long end = System.currentTimeMillis();
        long elapsedTime = end - start;
        if (elapsedTime > 3) {
            System.out.println(elapsedTime);
        }

    }
}
