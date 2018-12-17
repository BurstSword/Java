package Entidades;

public class SerVivo {
    private int vida, ataque;
    private String nombre;

    public SerVivo() {
        this.vida = 0;
        this.ataque = 0;
        this.nombre = "";
    }

    public SerVivo(int vida, int ataque, String nombre) {
        this.vida = vida;
        this.ataque = ataque;
        this.nombre = nombre;
    }

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

    public void recibirDano(int vida){
        this.vida-=vida;
    }
}
