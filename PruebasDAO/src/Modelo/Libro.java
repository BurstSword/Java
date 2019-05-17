package Modelo;

public class Libro {
    private int isbn;
    private String autor;
    private String titulo;

    public Libro(int isbn, String autor, String titulo) {
        this.isbn = isbn;
        this.autor = autor;
        this.titulo = titulo;
    }
    public Libro(){

    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
