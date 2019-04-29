package Ejercicio1.Entidades;

public class Revista extends Publicacion {
    private int numeroPublicacion;
    private boolean siendoLeida;

    public Revista(int codigo, String titulo, int anoPublicacion, int numeroPublicacion, boolean siendoLeida) {
        super(codigo, titulo, anoPublicacion);
        this.numeroPublicacion = numeroPublicacion;
        this.siendoLeida = siendoLeida;
    }


    public void leerRevista() {
        if (this.siendoLeida) {
            System.out.println("Esta revista ya la tiene otra persona");
        } else {
            System.out.println("Leyendo revista con éxito");
            this.siendoLeida = true;
        }
    }

    public void devolverRevista() {
        if (this.siendoLeida) {
            System.out.println("Ejercicio1.Entidades.Revista devuelta con éxito");
            this.siendoLeida = false;
        } else {
            System.out.println("Esta revista no puede ser devuelta, nadie la estaba leyendo");
        }
    }


    public int getNumeroPublicacion() {
        return numeroPublicacion;
    }

    public void setNumeroPublicacion(int numeroPublicacion) {
        this.numeroPublicacion = numeroPublicacion;
    }

    @Override
    public String toString() {
        return this.getTitulo() + ((this.siendoLeida) ? " la está leyendo alguien" : " estña disponible para leer");
    }
}
