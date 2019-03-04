package Biblioteca;

public class Revista extends Publicacion {
    private int anio;
    private int mes;

    public Revista(String nombre) {
        super(nombre);
        this.anio = 0;
        this.mes = 0;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    @Override
    public String toString() {
        return "Revista{" +
                "anio=" + anio +
                ", mes=" + mes +
                '}';
    }
}
