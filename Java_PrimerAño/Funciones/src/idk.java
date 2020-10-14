public class idk {
    public static void main(String[] args) {
        String s = "Hola soy idk kdsjfg ";
        int palabra = 0;
        for (int i = 0; i < s.length(); i++) {
            if (String.valueOf(s.charAt(i)) == " ")
                continue;
            else{
                palabra++;
            }
        }
    }
}
