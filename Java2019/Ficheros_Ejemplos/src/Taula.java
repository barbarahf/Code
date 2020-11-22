import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Taula {

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.printf("%7d%n", 1255);
            if (((i + 1) % 10) == 0) {
                System.out.println();
            }
        }


//        String archivoS = "TaulaMultiplicar.txt";
//        File archivo = new File(archivoS);//Evitar errores diferentes plataformas
//        if (archivo.exists()) {
//            System.out.println("El archivo " + archivo + "ya existe en el disco");
//            System.out.println("Eliminelo previamente antes de continuar");
//            System.exit(-1);
//        }
//        try (FileWriter fw = new FileWriter(archivo)) {
//            long tmeps = System.currentTimeMillis();
//            for (int num = 1; num <= 10; ++num) {
//                for (int i = 1; i <= 10; ++i) {
//                    fw.write(String.format("%2d x %2d = %3d   ", i, num, num * i));
//                    if (i / 2 == i)
//                        break;
//                }
//                fw.write(System.lineSeparator());
//            }
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }

}
