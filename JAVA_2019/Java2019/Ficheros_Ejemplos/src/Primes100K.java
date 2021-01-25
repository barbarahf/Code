import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 * @author Barbara Herrera Flores
 */
public class Primes100K {
    public static void main(String[] args) {
        String file = "";
        if (args.length > 0) {
            file = args[0];
        } else {
//            System.out.println(args[0]);
            System.out.println("          ----------------------------------------------------------");
            System.out.println("          || Programa para leer una lista de primos de un fichero ||");
            System.out.println("          ----------------------------------------------------------");
            System.out.println("Debe pasar al programa el nombre de un fichero de texto que contenga los numeros primos");
            System.out.println("     (uno por linea). El programa hará una serie de operaciones con estos primos.");
            System.out.println("     No se ha encontrado argumentos en el programa, la ejecucin no puede continuar");
            file = "primes-to-100k.txt";
        }

        Lee_fichero acceso = new Lee_fichero();
        acceso.lee(file);

        Palindromos into = new Palindromos();
        into.lee_p(file);
    }

    static class Lee_fichero {
        public void lee(String file) {

            int leido;
            int contador = 0;
            int[] primos = new int[100000];
            try {
                Scanner input = new Scanner(new File(file));
                while (input.hasNextLine()) {
                    leido = Integer.parseInt(input.nextLine());
                    primos[contador] = leido;
                    contador++;
                }
                System.out.println("Leidos " + contador + " valores del fichero " + file);
                input.close();

                distancia(primos, contador);
            } catch (FileNotFoundException e) {
                System.out.println("No se ha encontrado el archivo");
            } catch (InputMismatchException e) {
                System.out.println("Error indeterminado al procesar el fichero de primos");
            } catch (Exception e) {
                System.out.println("¿Presenta la sintaxis adecuada? el sistema reporta:");
                System.out.println(e);
            }

        }

        public static void distancia(int[] v, int contador) {
            int dist, prim1 = 0, prim2 = 0, max = 0, gemelos = 0;
            for (int i = 0; i < contador - 1; i++) {
                if (v[i + 1] == (v[i]) + 2) {
                    gemelos++;
                }
                dist = restar(v[i], v[i + 1]);
                if (dist > max) {
                    max = dist;
                    prim1 = v[i];
                    prim2 = v[i + 1];
                }
            }
            System.out.println("La diferencia maxima entre dos primos consecutivos del fichero analizado es de " + max +
                    " y es dada por primera vez por los primos " + prim1 + " y " + prim2);
            System.out.println("El numero de gemelos encontrados es: " + gemelos);
        }

        public static int restar(int a, int b) {
            if (a >= b)
                return a - b;
            return restar(b, a);
        }

    }

    static class Palindromos {
        public void lee_p(String file) {
            try (Scanner lee = new Scanner(new File(file))) {
                int leido;
                int contador = 0;
                leido = lee.nextInt();
                while (lee.hasNextInt()) {
                    if (isPali(leido)) {
                        System.out.format("%6d ", leido);
                        leido = lee.nextInt();
                        contador++;
                    } else {
                        leido = lee.nextInt();
                    }
                }
                lee.close();
                if (contador == 0)
                    throw new Exception("No hay ningun  palíndromo en este fichero");
            } catch (Exception e) {
                System.out.println(e);
            }
        }

        public static boolean isPali(int numero) {
            return tac(numero) == numero;
        }

        public static int tac(int value) {
            int re = 0;
            for (int i = value; i != 0; i /= 10) {
                re = re * 10 + i % 10;
            }
            return re;
        }
    }
}
