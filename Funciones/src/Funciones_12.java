public class Funciones_12 {
    //Ejercicio 1
    static int major2(int a, int b) {
        if (a > b)
            return a;
        return b;
    }

    //Ejercicio 2
    static int major3(int a, int b, int c) {
        return major2(major2(a, b), c);
    }

    //Ejercicio 3
    static int major4(int a, int b, int c, int d) {
        return major2(major2(a, b), major2(c, d));
    }
    //Ejercicio 5
    static int quantsEspais(String cad) {
        return quantesVegades(cad, ' ');
    }
    //Ejercicio 4
    static int quantesVegades(String cad, char c) {
        int contador = 0;
        for (int i = 0; i < cad.length(); i++)
            if (cad.charAt(i) == c)
                contador++;
        return contador;
    }
    //Ejercicio 6
    /*Programar una funció int quantesVocals(String cad, String sonVocals) a la
que passarem una cadena cad i una altra sonVocals contenint totes les vocals que
volem considerar dins de cad i retornarà el nombre de vocals (de les contingudes a
sonVocals) que hi ha dintre de cad. Per exemple quantesVocals(“Ara no el
trobarà”,”aeiou”) retornarà 5, ja que la primera ‘A’ majúscula i la última ‘à’
accentuada no s’han considerat vocals (no hi son a la cadena sonVocals). Aquesta
funció es pot fer recorrent la cadena sonVocals, i per a cada caràcter d’aquesta, cridar
a la funció quantesVegades i acumular el valor de retorn d’aquesta funció en un
totalitzador.

    * */
    //Ejercicio 6
    static int cuantasVocales(String cadena, String sonVocales) {
        int contador = 0;
        for (int i = 0; i < sonVocales.length(); i++)
         quantesVegades(cadena, sonVocales.charAt(i));
                return contador;

    }

    public static void main(String[] args) {
        //Ejercicio 1
        System.out.println(major2(0, 1));
        //Ejercicio 2
        System.out.println(major3(11, 11, 0));
        //Ejercicio 5
        String holi = "nocquehacer";
        System.out.println(quantesVegades(holi, 'c'));
        //Ejercicio 6
        System.out.println(quantsEspais("hola  hq  "));
        //ejercicio vocal
        System.out.println("vocales");
        System.out.println(cuantasVocales("mecagoentodo", "aeiou"));
    }
}
