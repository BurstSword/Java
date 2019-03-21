package Entidades;

public class Monstruo extends Personaje {
    //ATRIBUTOS
    private boolean disponibilidadHabilidad;

    //CONSTRUCTOR


    public Monstruo(int probCritico, int vidaMax, int ataque, int vida, String nombre, boolean disponibilidadHabilidad) {
        super(probCritico, vidaMax, ataque, vida, nombre);
        this.disponibilidadHabilidad = disponibilidadHabilidad;
    }

    //METODOS
    public void usarHabilidad(int ataque){
        System.out.println("Ha usado super puñetazo!");
        this.ataque = ataque * 2;
        this.disponibilidadHabilidad = false;

    }

    public boolean isDisponibilidadHabilidad() {
        return disponibilidadHabilidad;
    }

    public void setDisponibilidadHabilidad(boolean disponibilidadHabilidad) {
        this.disponibilidadHabilidad = disponibilidadHabilidad;
    }

    //TOSTRING

    @Override
    public String toString() {
        return "Monstruo{" +
                "nombre='" + this.getNombre() +
                ", probCritico=" + this.getProbCritico() +
                ", vidaMax=" + this.getVidaMax() +
                ", ataque=" + this.getAtaque() +
                ", vida=" + this.getVida() +
                ", Uso de habilidad= " + (this.disponibilidadHabilidad? " Disponible " : " No Disponible ");
    }



}
