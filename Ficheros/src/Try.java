import java.io.PrintWriter;

public class Try {
    public static void main(String[] args) {
        try (PrintWriter pw = new PrintWriter("example.txt")) {
            String s = "Cadenada q escivem al ficher de text";
            pw.println(s);
            System.out.println("Se ha escrito la cadena den ek fichero");
//            pw.close();
//            pw.flush();
        } catch (Exception e) {
            System.out.println("ERROR:" + e.getMessage());
        }
    }
}
