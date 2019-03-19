package Entidades;

public class Guerrero extends Personaje {

    //ATRIBUTOS
    private int escudo, escudoMax;

    public Guerrero(int probCritico, int vidaMax, int ataque, int vida, String nombre, int escudo, int escudoMax) {
        super(probCritico, vidaMax, ataque, vida, nombre);
        this.escudo = escudo;
        this.escudoMax = escudoMax;
    }

    //METODOS
    public void recibirDanoEscudo(int escudo){
        this.escudo -= escudo;
    }

    //GETTERS AND SETTERS

    public int getEscudo() {
        return escudo;
    }

    public void setEscudo(int escudo) {
        this.escudo = escudo;
    }

    public int getEscudoMax() {
        return escudoMax;
    }

    public void setEscudoMax(int escudoMax) {
        this.escudoMax = escudoMax;
    }

    //TOSTRING

    @Override
    public String toString() {
        return "Guerrero{" +
                "nombre='" + this.getNombre() +
                ", probCritico=" + this.getProbCritico() +
                ", vidaMax=" + this.getVidaMax() +
                ", ataque=" + this.getAtaque() +
                ", vida=" + this.getVida() +
                "escudo=" + this.escudo +
                ", escudoMax=" + this.escudoMax +'\'' +
                '}';
    }

}
