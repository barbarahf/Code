package ejercicios_examen;

/*
Escribe una clase Película que herede de la clase Multimedia anterior.
 La clase Película tiene, además de los atributos heredados, un actor principal
  una actriz principal. Se permite que uno de los dos sea nulo, pero no los dos.
   La clase debe tener dos métodos para obtener los nuevos atributos y debe sobreescribir
   el método toString() para reflejar la nueva información.


 */
public class Pelicula extends Multimedia {

    private String actorPrincipal;
    private String actrizPrincipal;

    public Pelicula(String titulo, String autor, ejercicios_examen.formatos formatos,
                    float duracion, String actorPrincipal, String actrizPrincipal) {
        super(titulo, autor, formatos, duracion);

        this.actorPrincipal = actorPrincipal;
        this.actrizPrincipal = actrizPrincipal;


    }

    // <editor-fold defaultstate="collapsed" desc=" GETTERS && SETTER ">
    public String getActorPrincipal() {
        return actorPrincipal;
    }

    public String getActrizPrincipal() {
        return actrizPrincipal;
    }

    // </editor-fold>


    @Override
    public String toString() {
        return "Pelicula{" +
                "actorPrincipal='" + actorPrincipal + '\'' +
                ", actrizPrincipal='" + actrizPrincipal + '\'' +
                '}' + super.toString();
    }
}
