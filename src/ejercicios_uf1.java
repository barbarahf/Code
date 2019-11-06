import javax.sound.midi.Soundbank;

public class ejercicios_uf1<numTwo> {
    public static void main(String[] args) {
        //Declaracion de constantes
        final String NOMBRE = "Barbara";
        System.out.println(NOMBRE);
        final int IVA = 15;
        System.out.println("El IVA es " + IVA);

        //conditional sintax
        int numOne = 5;
        int numTwo = 5;
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
       else {
            System.out.println("Son iguales");
        }
        //Num multiple of another
        if (numOne % numTwo == 0){
            System.out.println("Es multiplo");
        }
    }

}
