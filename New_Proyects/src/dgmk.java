import java.util.Arrays;
///estudiar breack,


public class dgmk {
    public static void main(String[] args) {
        int[] inp = {5, 2, 9, 4, 5};
        int n = inp.length;

        int[] a = new int[(n + 1) / 2];
        int[] b = new int[n - a.length];
//        System.out.println(Arrays.toString(a));
        for (int i = 0; i < n; i++) {
            if (i < a.length)
                a[i] = inp[i];
            else
                b[i - a.length] = inp[i];
        }

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }
}

