package Entidades;

public class Monstruo extends Personaje {
    //Atributos de la clase Monstruo
    private boolean disponibilidadHabilidad;

    //Método constructor


    public Monstruo(int probCritico, int vidaMax, int ataque, int vida, String nombre, boolean disponibilidadHabilidad) {
        super(probCritico, vidaMax, ataque, vida, nombre);
        this.disponibilidadHabilidad = disponibilidadHabilidad;
    }

    //Métodos y funcionalidades
    public void usarHabilidad(int ataque) {
        System.out.println("Ha usado super puñetazo!");
        this.ataque = ataque * 2;
        this.disponibilidadHabilidad = false;

    }

    //Métodos Getter y Setter
    public boolean isDisponibilidadHabilidad() {
        return disponibilidadHabilidad;
    }

    public void setDisponibilidadHabilidad(boolean disponibilidadHabilidad) {
        this.disponibilidadHabilidad = disponibilidadHabilidad;
    }

    //Método toString

    @Override
    public String toString() {
        return "Monstruo{" +
                "nombre='" + this.getNombre() +
                ", probCritico=" + this.getProbCritico() +
                ", vidaMax=" + this.getVidaMax() +
                ", ataque=" + this.getAtaque() +
                ", vida=" + this.getVida() +
                ", Uso de habilidad= " + (this.disponibilidadHabilidad ? " Disponible " : " No Disponible ");
    }


}
