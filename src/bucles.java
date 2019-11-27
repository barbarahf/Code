public class bucles {
    public static void main(String[] arg) {
        String nombre = "Hola soc la barbara";
        //Multiples declaraciones en un for ¿?
        for (int i = 0; i < nombre.length(); i++) {
            System.out.println(nombre.charAt(i) + " " + nombre.charAt(i));
        }
        //Up side down
        for (int j = nombre.length()-1; j >=0; j--) {
            System.out.println(nombre.charAt(j));
        }

        int nameUp , namdDown;
//        for (nameUp = nombre.length()-1, namdDown= 0; nameUp >=0 , namdDown< nombre.length(); nameUp--) {
//            System.out.println(nombre.charAt(nameUp));
//        }
    }
}
