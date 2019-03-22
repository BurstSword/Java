package Entidades;

public class Arma {

    //Atributos de clase arma
    private String nombre;
    private int dano;

    //Método constructor
    public Arma(String nombre, int dano) {
        this.nombre = nombre;
        this.dano = dano;
    }

    //Métodos getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDano() {
        return dano;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }

    //Método toString
    @Override
    public String toString() {
        return "Entidades.Arma{" +
                "nombre='" + nombre + '\'' +
                ", dano=" + dano +
                '}';
    }
}
