public class BarbaraHerreraFlores {
    public static void main(String[] args) {
        int a, b, c, d;
        int[] nums = {2, 4, 8}; //   Array con los elementos necesarios
        int contador = 0; //Contador para calcular las posibles combinaciones

        //Un bucle para cada variable que contendrá el valor del array.
        for (a = 0; a < nums.length; a++) {
            int one = nums[a]; //Iniciar variables (4) con el contenido del array
            for (b = 0; b < nums.length; b++) {
                int two = nums[b];
                for (c = 0; c < nums.length; c++) {
                    int three = nums[c];
                    for (d = 0; d < nums.length; d++) {
                        int four = nums[d];
                        //Condicional descartando las conbinaciones no necesarias.
                        if ((!(one == two && one == three && one == four))
                                && ((!(one == two && one == three))
                                && (!(two == three && two == four))
                                && (!(one == three && one == four))
                                && (!(one == two && one == four))
                                && (!(one == two && three == four))
                                && (!(one == four && two == three))
                                && (!(one == three && two == four))
                        )) {
                            System.out.println(one + " " + two + " " + three + " " + four);
                            contador++;
                        }
                    }
                }
            }
        }
        System.out.println(contador);
    }
}

