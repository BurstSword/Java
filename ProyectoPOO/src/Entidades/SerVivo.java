package Entidades;

/**
 * Clase utilizada para ser heredada por Guerrero y Monstruo ya que ambas comparten estos atributos y funcionalidades
 * Tiene los atributos de vida, ataque y nombre
 */
public class SerVivo {
    private int vida, ataque;
    private String nombre;

    /**
     * Constructor que inicializa los enteros a 0 y los String a cadenas vacías
     */
    public SerVivo() {
        this.vida = 0;
        this.ataque = 0;
        this.nombre = "";
    }

    /**
     * Construsctor que inicializa los atributos con los valores traídos por parámetros
     * @param vida La vida del ser vivo
     * @param ataque El ataque del ser vivo
     * @param nombre El nombre del ser vivo
     */
    public SerVivo(int vida, int ataque, String nombre) {
        this.vida = vida;
        this.ataque = ataque;
        this.nombre = nombre;
    }
    //Getters y Setters
    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
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

    /**
     * Procedimiento que le resta vida al ser vivo
     * @param vida
     */
    public void recibirDano(int vida) {
        this.vida -= vida;
    }

    /**
     * Función que devuelve el estado del ser vivo actual en forma de String
     * @return Devuelve el estado actual del ser vivo en forma de String
     */
    @Override
    public String toString() {
        return "Tienes " + this.vida + " HP, " + this.ataque + " puntos de ataque";
    }
}
