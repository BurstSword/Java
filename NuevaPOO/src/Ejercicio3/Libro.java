package Ejercicio3;

public class Libro extends Publicacion {
    private String autor;

    public Libro(String nombre) {
        super(nombre);
        this.autor = " ";
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "autor='" + autor + '\'' +
                '}';
    }
}
