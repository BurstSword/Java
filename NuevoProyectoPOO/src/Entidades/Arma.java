package Entidades;

public class Arma {
    private String nombre;
    private int dano;

    public Arma(String nombre, int dano) {
        this.nombre = nombre;
        this.dano = dano;
    }

    public String getArmas() {
        return nombre;
    }

    public void setArmas(String nombre) {
        this.nombre = nombre;
    }

    public int getDano() {
        return dano;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }

    @Override
    public String toString() {
        return "Entidades.Arma{" +
                "nombre='" + nombre + '\'' +
                ", dano=" + dano +
                '}';
    }
}
