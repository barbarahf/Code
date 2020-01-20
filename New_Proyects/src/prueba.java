public class prueba {
    public static void main(String[] args) {
        int var1, var2, var3, var4;
        int numeros[] = {2, 4, 8};
        for (var1 = 0; var1 < numeros.length; var1++) {
            int gh = numeros[var1];
            for (var2 = 0; var2 < numeros.length; var2++) {
                for (var3 = 0; var2 < numeros.length; var3++) {
                    for (var4 = 0; var2 < numeros.length; var4++) {
                        System.out.println(var1 +" "+ var2+" "+ var3+" "+ var4);

                    }
                }
            }
        }
    }
}
