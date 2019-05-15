package Libreria;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "libro")
@XmlType(propOrder = {"isbn", "titulo", "autor"})
public class Libro {
    private int isbn;
    private String titulo;
    private String autor;

    public Libro(int isbn, String titulo, String autor) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
    }

    public Libro() {
        this.isbn = 0;
        this.titulo = "";
        this.autor = "";
    }

    @XmlAttribute(name = "isbn")
    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    @XmlElement(name = "titulo")
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @XmlElement(name = "autor")
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
}
