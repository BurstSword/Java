package Biblioteca;


public class Libro {
    private static int generadorID = 1;
    private int ID;
    private boolean disponible;
    private int IDusuario;
    private String nombreLibro;

    public Libro(String nombre) {
        this.disponible = true;
        this.IDusuario = this.ID;
        this.ID = generadorID++;
        this.nombreLibro = nombre;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public int getIDusuario() {
        return IDusuario;
    }

    public void setIDusuario(int IDusuario) {
        this.IDusuario = IDusuario;
    }

    public int getID() {
        return ID;
    }

    public String getNombreLibro() {
        return nombreLibro;
    }

    public void setNombreLibro(String nombreLibro) {
        this.nombreLibro = nombreLibro;
    }


    /**
     * Función que pone la disponibilidad en true y la ID del usuario a 0 en caso de que se devuelva el libro
     * <p>
     *
     * @return Esta función nos devuelve el valor -1 en caso de que intente devolver un libro ya devuelto
     * En caso de que la devolución sea posible, devolverá el valor 0
     */
    public int devolverLibro() {
        int ret;
        if (this.disponible) {
            ret = -1;
        } else {
            this.disponible = true;
            this.IDusuario = 0;
            ret = 0;
        }
        return ret;
    }

    /**
     * Función que pone la disponibilidad en false en caso de que se alquile el libro y pone la ID del usuario al que lo quiera alquilar
     * @param IDusuario
     * @return
     */
    public int alquilarLibro(int IDusuario){
        int ret;
        if(this.disponible){
            this.disponible=false;
            this.IDusuario=IDusuario;
            ret=0;
        }else{
            ret = -1;
        }
        return ret;
    }

    @Override
    public String toString() {
        return "El libro "+this.nombreLibro+" con ID "+this.ID+" "+
                (this.disponible ? "está disponible" :
                        "está alquilado por el usuario "+Datos.listaUsuarios.get(this.IDusuario-1).getNombreUsuario());
    }
}
