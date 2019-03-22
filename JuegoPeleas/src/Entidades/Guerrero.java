package Entidades;

public class Guerrero extends Personaje {

    //Atributos clase guerrero
    private int escudo, escudoMax;

    public Guerrero(int probCritico, int vidaMax, int ataque, int vida, String nombre, int escudo, int escudoMax) {
        super(probCritico, vidaMax, ataque, vida, nombre);
        this.escudo = escudo;
        this.escudoMax = escudoMax;
    }

    //Métodos y funcionalidades
    public void recibirDanoEscudo(int escudo){
        this.escudo -= escudo;
    }

    //Métodos getters y setters

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

    //Método toString

    @Override
    public String toString() {
        return "El guerrero " + this.nombre + " esta listo para luchar con las siguientes estadisticas: " + this.vidaMax + "" +
                " HP, " + this.escudoMax + " puntos de escudo, " + this.probCritico + "% de probabilidad de critico, " +
                " y " + this.ataque + " puntos de ataque";
    }

}
