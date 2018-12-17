package Entidades;

/**
 * Esta clase Guerrero hereda de la clase SerVivo los atributos de nombre, vida y ataque, y como atributos propios que definen a guerrero
 * tiene la cantidad de puntos de escudo, el dinero, la probabilidad de crítico al atacar, la vida máxima del guerrero y la cantidad de puntos
 * de escudo máximo del mismo
 */
public class Guerrero extends SerVivo {
    private int escudo, dinero, probCritico, vidaMax, escudoMax;
    private boolean pocionRevivir;

    /**
     * Este constructor inicializa los valores de los atributos de Guerrero a 0 si es un entero y false si es un booleando
     */
    public Guerrero() {
        super();
        this.escudo = 0;
        this.dinero = 0;
        this.pocionRevivir = false;
        this.probCritico = 0;
        this.vidaMax = 0;
        this.escudoMax = 0;
    }

    /**
     * Este constructor inicializa los valores de los atributos de Guerrero con los valores que le pase por parámetros
     * @param vida La vida del guerrero
     * @param ataque El ataque del guerrero
     * @param nombre El nombre del guerrero
     * @param escudo Los puntos de escudo del guerrero
     * @param dinero El dinero del guerrero
     * @param pocionRevivir Si tiene una poción de revivir o no
     * @param probCritico La probabilidad de crítico que tiene el guerrero basado en una probabilidad de un porcentaje de 100
     * @param vidaMax La vida máxima del guerrero
     * @param escudoMax Los puntos de escudo máximos del guerrero
     */
    public Guerrero(int vida, int ataque, String nombre, int escudo, int dinero, boolean pocionRevivir, int probCritico, int vidaMax, int escudoMax) {
        super(vida, ataque, nombre);
        this.escudo = escudo;
        this.dinero = dinero;
        this.pocionRevivir = pocionRevivir;
        this.probCritico = probCritico;
        this.vidaMax = vidaMax;
        this.escudoMax = escudoMax;
    }

    //Getters y Setters
    public int getEscudo() {
        return escudo;
    }

    public void setEscudo(int escudo) {
        this.escudo = escudo;
    }

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }

    public boolean hasPocionRevivir() {
        return pocionRevivir;
    }

    public void setPocionRevivir(boolean pocionRevivir) {
        this.pocionRevivir = pocionRevivir;
    }

    public int getEscudoMax() {
        return escudoMax;
    }

    public void setEscudoMax(int escudoMax) {
        this.escudoMax = escudoMax;
    }

    public int getProbCritico() {
        return probCritico;
    }

    public int getVidaMax() {
        return vidaMax;
    }

    public void setVidaMax(int vidaMax) {
        this.vidaMax = vidaMax;
    }

    public void setProbCritico(int probCritico) {
        this.probCritico = probCritico;
    }
    //Funcionalidades propias de la clase Guerrero
    /**
     * Procedimiento que le resta el daño recibido por parámetro al escudo
     * @param dano Daño que recibe el escudo
     */
    public void recibirDanoEscudo(int dano) {
        this.escudo -= dano;
    }

    /**
     * Procedimiento que suma o resta la cantidad de dinero introducida por parámetros
     * @param dinero Dinero que se suma o se resta
     */
    public void manejarDinero(int dinero) {
        this.dinero += dinero;
    }

    /**
     * Función que devuelve el estado actual del guerrero en forma de String
     * @return estado actual del guerrero en String
     */
    @Override
    public String toString() {
        return super.toString() + ", " + this.getEscudo() + " puntos de escudo y " + this.dinero + " somacoins";
    }
}
