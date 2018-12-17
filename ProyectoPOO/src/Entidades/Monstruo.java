package Entidades;

/**
 * Clase que hereda de SerVivo los atributos de vida, ataque y nombre y que tiene como propios el dinero que da al morir
 * y el arma que porta
 */
public class Monstruo extends SerVivo {
    private int dropDinero;
    private String arma;

    /**
     * Contructor que inicializa los enteros a 0 y los String a cadenas vacías
     */
    public Monstruo() {
        super();
        this.dropDinero = 0;
        this.arma = "";
    }

    /**
     * Constructor que inicializa los atributos con los valores traídos por parámetros
     *
     * @param vida       La vida del monstruo
     * @param dropDinero El dinero que suelta el monstruo al morir
     * @param ataque     El ataque del monstruo
     * @param nombre     El nombre del monstruo
     * @param arma       El arma que utiliza el monstruo
     */
    public Monstruo(int vida, int dropDinero, int ataque, String nombre, String arma) {
        super(vida, ataque, nombre);
        this.dropDinero = dropDinero;
        this.arma = arma;
    }

    //Getters y Setters
    public int getDropDinero() {
        return dropDinero;
    }

    public void setDropDinero(int dropDinero) {
        this.dropDinero = dropDinero;
    }

    public String getArma() {
        return arma;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }


}
