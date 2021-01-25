package ejercicios_examen;

/*
 * /*
 * Escribe una clase Multimedia para almacenar información de los objetos de tipo multimedia
 * (películas, discos, mp3,mp4…). Esta clase contiene título, autor, formato, y duración como
 *  atributos. El formato puede ser uno de los siguientes: wav, mp3, midi, avi, mov, mpg, cdAudio
 * y dvd. El valor de todos los atributos se pasa por parámetro en el momento de crear el objeto
 * . Esta clase tiene además, un método para devolver cada uno de los atributos y un método toString()
 * que devuelve la información del objeto. Por último, un método equals() que recibe un objeto de tipo Multimedia
 * y devuelve true en caso de que el título y el autor sean iguales y false en caso contrario.*/
enum formatos {
    WAV,
    MP3,
    MIDI,
    AVI,
    MOV,
    MPG,
    CDAUDIO,
    DVD
}

public class Multimedia {
    private final String titulo;
    private final String autor;
    private final formatos formatos;
    private final float duracion;

    public Multimedia(String titulo, String autor, ejercicios_examen.formatos formatos, float duracion) {
        this.titulo = titulo;
        this.autor = autor;
        this.formatos = formatos;
        this.duracion = duracion;
    }
// <editor-fold defaultstate="collapsed" desc=" Getters && setters ">

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public ejercicios_examen.formatos getFormatos() {
        return formatos;
    }

    public float getDuracion() {
        return duracion;
    }

// </editor-fold>

    @Override
    public String toString() {
        return "Multimedia{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", formatos=" + formatos +
                '}';
    }

    public boolean equal() {
        return this.autor.equals(this.titulo);
    }
}
