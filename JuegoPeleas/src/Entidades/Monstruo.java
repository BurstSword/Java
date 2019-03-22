package Entidades;

public class Monstruo extends Personaje {
    //Atributos de la clase Monstruo
    private boolean disponibilidadHabilidad;

    //Método constructor


    public Monstruo(int probCritico, int vidaMax, int ataque, int vida, String nombre, boolean disponibilidadHabilidad) {
        super(probCritico, vidaMax, ataque, vida, nombre);
        this.disponibilidadHabilidad = disponibilidadHabilidad;
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
        return "El monstruo " + this.nombre + " esta listo para luchar con las siguientes estadisticas: " + this.vidaMax +
                " HP, " + this.probCritico + "% de probabilidad de critico, " +
                this.ataque + " puntos de ataque y " + (this.disponibilidadHabilidad? "tiene su habilidad disponible":"no tiene su habilidad disponible");
    }


}
