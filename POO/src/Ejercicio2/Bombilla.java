package Ejercicio2;

public class Bombilla {
    int potencia, numEncendido;
    boolean encendida;

    public Bombilla() {
        potencia = 50;
        numEncendido = 0;
        encendida = false;
    }

    public void Apagar() {
        encendida = false;
    }

    public void Encender() {
        encendida = true;
    }
}
