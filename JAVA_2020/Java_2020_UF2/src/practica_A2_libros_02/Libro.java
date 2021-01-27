package practica_A2_libros_02;


import java.time.LocalDate;

public class Libro implements Comparable<Libro> {
    private int isbn;
    private String titulo;
    private String autorNom;
    private String autorCog;
    private LocalDate dataPublicacion;
    private double precio;

    public Libro(String titulo, String autorNom, String autorCog, int isbn, LocalDate dataPublicacion, double precio) {
        this.titulo = titulo;
        this.autorNom = autorNom;
        this.autorCog = autorCog;
        this.isbn = isbn;
        this.dataPublicacion = dataPublicacion;
        this.precio = precio;
    }


    // <editor-fold defaultstate="collapsed" desc=" GETTERS AND SETTERS ">
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutorNom() {
        return autorNom;
    }

    public void setAutorCog(String autor) {
        this.autorCog = autor;
    }

    public String getAutorCog() {
        return autorCog;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public LocalDate getDataPublicacion() {
        return dataPublicacion;
    }

    public void setDataPublicacion(LocalDate dataPublicacion) {
        this.dataPublicacion = dataPublicacion;
    }

    public double getPrecio() {
        return precio;
    }
    // </editor-fold>

    //Metodos

    //To use equals
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Libro other = (Libro) obj;
        return this.titulo.equals(other.titulo);
    }

    //To use sort
    @Override
    public int compareTo(Libro libro) {
        int result = this.titulo.compareToIgnoreCase(libro.titulo);
        if (result == 0) {
            result = this.autorNom.compareToIgnoreCase(libro.autorNom);
            if (result == 0) {
                result = this.autorCog.compareToIgnoreCase(libro.autorCog);
            }
        }
        return result;
    }

    @Override
    public int hashCode() {
        return isbn;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "isbn=" + isbn +
                ", titulo='" + titulo + '\'' +
                ", autorNom='" + autorNom + '\'' +
                ", autorCog='" + autorCog + '\'' +
                ", dataPublicacion=" + dataPublicacion +
                ",Precio " + precio +
                '}';
    }
}

