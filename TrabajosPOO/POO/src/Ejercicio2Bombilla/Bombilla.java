package Ejercicio2Bombilla;

public class Bombilla {
    int potencia, numEncendido;
    boolean encendida;


    public Bombilla() {
        this.potencia = 50;
        this.numEncendido = 0;
        this.encendida = false;

    }

    public void Apagar() {
        this.encendida = false;

    }

    public void Encender() {
        this.encendida = true;

    }

}

