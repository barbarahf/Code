public class hola {
    public static void main(String[] args) {
        int a, b, c, d;
        for (a = 2; a <= 8; a++) {
            for (b = 2; b <= 8; b++) {
                for (c = 2; c <= 8; c++) {
                    for (d = 2; d <= 8; d++) {
                        if (a % 2 == 0 && b % 2 == 0 && c % 2 == 0 && d % 2 == 0) {
                            if (a != 6 && b != 6 && c != 6 && d != 6) {
                                if (a != 6 && b != 6 && c != 6 && d != 6) {
                                    if (!(a == b && a == b && a == c && a == d)) {
                                        System.out.println(a + " " + b + " " + c + " " + d);
                                    }
                                }
                            }
                        }
                    }
                }
            }

        }
    }
}
