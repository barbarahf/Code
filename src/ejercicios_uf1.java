import java.util.Scanner;

public class ejercicios_uf1 {
    public static void main(String[] args) {
        //Declaracion de constantes
        final String NOMBRE = "Barbara";
        System.out.println(NOMBRE);
        final int IVA = 15;
        System.out.println("El IVA es " + IVA);

        //conditional sintax

        Scanner teclado = new Scanner(System.in);
        int numOne;
        int numTwo;
        System.out.print("Enter a sentence:\t");
        String variable2 = teclado.nextLine();
        System.out.println(variable2);
        System.out.println("Introduce un numero para cada variable");
        numOne = teclado.nextInt();
        numTwo = teclado.nextInt();

        if( numOne > numTwo){
            System.out.println("numOne " + numOne+ " es mayor");
        }
        if ( numTwo > numOne){
            System.out.println("numTwo "+ numTwo+ " es mayor");
        }
        if( numOne < numTwo){
            System.out.println("numOne " + numOne+ " es menor");
        }
        if ( numTwo < numOne){
            System.out.println("numTwo "+ numTwo+ " es menor");
        }
       else if (numOne == numTwo){
            System.out.println("Son iguales");
        }
        //Num multiple of another
        if (numOne % numTwo == 0){
            System.out.println("Es multiplo");
        }
        else {
            System.out.println("No es multiplo");
        }

        String name = "Barbara";
        System.out.println(name.length());

        //Draw
        System.out.println(" + \"\"\"\"\" +");
        System.out.println(" [| o o |]");
        System.out.println("  |  ^  | ");
        System.out.println("  | '_' |");
        System.out.println("  +-----+");
    //Scanner

    }

}
