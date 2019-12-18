public class JOU {
    public static void main(String[] args) {
        int a, b, c, d;
        int[] nums = {2, 4, 8};
        int count = 0;
        for (a = 0; a < nums.length; a++) {
            int one = nums[a];
            for (b = 0; b < nums.length; b++) {
                int two = nums[b];
                for (c = 0; c < nums.length; c++) {
                    int three = nums[c];
                    for (d = 0; d < nums.length; d++) {
                        int four = nums[d];
//                        if (four != three && three != two && two != one && four != two) {
                            System.out.println(one + " " + two + " " + three + " " + four);
                            count++;
//                        }

                    }
                }
            }
        }
        System.out.println(count);
    }
}

