package Entidades;



public class Animal  {
    protected String nombre;
    protected String mensaje;

    public Animal(String nombre, String mensaje) {
        this.nombre = nombre;
        this.mensaje = mensaje;
    }

    public void comunicarse(){
        System.out.println("\n"+this.mensaje);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
