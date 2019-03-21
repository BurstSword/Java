package Entidades;

public class Personaje {
    //Atributos de la clase padre Personaje
    protected int probCritico;
    protected int vidaMax;
    protected int ataque;
    protected int vida;
    protected String nombre;

    //Método constructor
    public Personaje(int probCritico, int vidaMax, int ataque, int vida, String nombre) {
        this.probCritico = probCritico;
        this.vidaMax = vidaMax;
        this.ataque = ataque;
        this.vida = vida;
        this.nombre = nombre;
    }

    //Métodos y funcionalidades
    public void recibirDano(int vida) {

        this.vida -= vida;
    }

    //Métodos getter y setter
    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }


    public int getProbCritico() {
        return probCritico;
    }

    public void setProbCritico(int probCritico) {
        this.probCritico = probCritico;
    }

    public int getVidaMax() {
        return vidaMax;
    }

    public void setVidaMax(int vidaMax) {
        this.vidaMax = vidaMax;
    }


    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //Método toString
    @Override
    public String toString() {
        return "Personaje{" +
                ", probCritico=" + probCritico +
                ", vidaMax=" + vidaMax +
                ", ataque=" + ataque +
                ", vida=" + vida +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
