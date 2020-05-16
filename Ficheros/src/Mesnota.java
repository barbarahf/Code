import java.io.*;

public class Mesnota {

    public static void main(String[] args) {

        try (BufferedReader bRead = new BufferedReader(new FileReader("palabras.txt"))) {
            System.out.println("hols");
            while ((bRead.readLine()) != null) {
                System.out.println(bRead);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Error: No se ha encontrado el fichero: ");
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Error al leer: ");
            System.out.println(e.getMessage());
        }
    }
}
