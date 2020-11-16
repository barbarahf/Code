package ejercicios_examen;

public class Main {
    public static void main(String[] args) {
        Multimedia multimedi1 = new Multimedia("Queen", "Queen", formatos.DVD, (float) 55.0);
        System.out.println(multimedi1.equal());
        System.out.println(multimedi1);

        Pelicula titanic = new Pelicula("Titanic", "Anonimo", formatos.DVD, (float) 1000.0, "Leonardo Dicaprio", "Rose");
        System.out.println(titanic);

    }
}
