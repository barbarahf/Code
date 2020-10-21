import java.util.Arrays;

public class ArrayStrings {
    public static void main(String[] args) {
        //inline initialization
        String[] strArray1 = new String[]{"A", "B", "C"};
        String[] strArray2 = {"A", "B", "C"};

//initialization after declaration
        String[] strArray3 = new String[3];
        strArray3[0] = "A";
        strArray3[1] = "B";
        strArray3[2] = "C";
        System.out.println(strArray1.equals(strArray2)); // false
        System.out.println(Arrays.toString(strArray1).equals(Arrays.toString(strArray2)));// true
    }

}
