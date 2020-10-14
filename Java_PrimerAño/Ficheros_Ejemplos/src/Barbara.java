import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Barbara {
    public static void main(String[] args) {
        String directorio = System.getProperty("java.class.path");
        String archivoS = directorio + "\\numeros.txt";
        File archivo = new File(archivoS);
        if (args.length < 3) {
            System.out.println("Debe introducir (3) parametros para ejecutar el programa");
            System.exit(-1);
        }
        try (FileWriter fw = new FileWriter(archivo); BufferedWriter bw = new BufferedWriter(fw)) {
            int max = Integer.parseInt(args[0]);
            int numColum = Integer.parseInt(args[1]);
            int cuantsF = Integer.parseInt(args[2]);
            for (int i = 0; i < numColum; i++) {
                for (int j = 0; j < cuantsF; j++)
                    bw.write(String.format("%" + (args[0].length() + 1) + "d ", (int) (Math.random() * (max + 1))));
                bw.write(System.lineSeparator());
            }
        } catch (IOException ioException) {
            ioException.printStackTrace();
        } catch (NumberFormatException exception) {
            System.out.println(" Los parametros a introducir deben ser numeros");
        }
    }
}

