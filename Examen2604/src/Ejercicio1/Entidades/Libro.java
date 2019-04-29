package Ejercicio1.Entidades;

import Ejercicio1.Prestable;

public class Libro extends Publicacion implements Prestable {
    private boolean prestado;

    public Libro(int codigo, String titulo, int anoPublicacion, boolean prestado) {
        super(codigo, titulo, anoPublicacion);
        this.prestado = prestado;
    }

    @Override
    public void prestarLibro() {
        if (!this.prestado) {
            System.out.println("Ejercicio1.Entidades.Libro alquilado con éxito");
            this.prestado = true;
        } else {
            System.out.println("El libro lo tiene otra persona");
        }
    }

    @Override
    public void recibirLibroDeVuelta() {
        if (this.prestado) {
            System.out.println("Ejercicio1.Entidades.Libro devuelto con éxito");
            this.prestado = false;
        } else {
            System.out.println("Ese libro ya fue devuelto");
        }

    }

    public boolean isPrestado() {
        return prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }

    @Override
    public String toString() {
        return this.getTitulo() + ((this.prestado) ?
                " está prestado a alguien" : " está disponible para prestar");
    }
}
