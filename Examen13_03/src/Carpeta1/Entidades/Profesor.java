package Carpeta1;

public class Profesor {
    //Atributos de la clase profesor
    private int codigoEspecialidad;
    private String dni;
    private String nombre;

    //Método constructor de la clase Profesor
    public Profesor(int codigoEspecialidad, String dni, String nombre) {
        this.codigoEspecialidad = codigoEspecialidad;
        this.dni = dni;
        this.nombre = nombre;
    }


    //Métodos getters y setters
    public int getCodigoEspecialidad() {
        return codigoEspecialidad;
    }

    public void setCodigoEspecialidad(int codigoEspecialidad) {
        this.codigoEspecialidad = codigoEspecialidad;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    //Método toString de la clase Profesor
    @Override
    public String toString() {
        return "Se llama " + this.nombre + " con DNI " + this.dni + " y su código de especialidad es " + this.codigoEspecialidad;
    }
}
