package Biblioteca;


public class Publicacion {
    private static int generadorID = 0;
    private int ID;
    private boolean disponible;
    private int IDusuario;
    private String nombre;

    public Publicacion(String nombre) {
        this.disponible = true;
        this.IDusuario = this.ID;
        this.ID = generadorID++;
        this.nombre = nombre;
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
        return nombre;
    }

    public void setNombreLibro(String nombre) {
        this.nombre = nombre;
    }


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


    public int alquilarLibro(int IDusuario) {
        int ret;
        if (this.disponible) {
            this.disponible = false;
            this.IDusuario = IDusuario;
            ret = 0;
        } else {
            ret = -1;
        }
        return ret;
    }

    @Override
    public String toString() {
        return "El libro " + this.nombre + " con ID " + this.ID + " " +
                (this.disponible ? "está disponible" :
                        "está alquilado por el usuario " +
                                Datos.listaUsuarios.get(this.IDusuario - 1).getNombreUsuario());
    }
}
