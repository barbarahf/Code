package practica_A2_libros;

import java.time.LocalDate;

public class Libro {
    private String titulo;
    private String autor;
    private int isbn;
    private LocalDate dataPublicacion;

    public Libro(String titulo, String autor, int isbn, LocalDate dataPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.dataPublicacion = dataPublicacion;
    }

    // <editor-fold defaultstate="collapsed" desc=" GETTERS AND SETTERS ">
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
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

    // </editor-fold>
}
