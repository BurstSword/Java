package Ejercicio2Redux;

public class Bombilla {
    private int potencia, numEncendido;
    private boolean encendida;


    public Bombilla() {
        this.potencia = 50;
        this.numEncendido = 0;
        this.encendida = false;

    }

    public Bombilla(boolean encendida){
        this.potencia = 50;
        this.numEncendido = 0;
        this.encendida=encendida;
    }


    public int getPotencia(){
        return this.potencia;
    }

    public void setPotencia(int potencia){
        this.potencia=potencia;
    }

    public int getNumEncendido(){
        return this.numEncendido;
    }

    public void setNumEncendido(int numEncendido){
        this.numEncendido=numEncendido;
    }

    public boolean getEncendida(){
        return this.encendida;
    }

    public void setEncendida(boolean encendida){
        this.encendida=encendida;
    }


    public void Apagar() {
        this.encendida = false;

    }

    public void Encender() {
        this.encendida = true;

    }

    @Override
    public String toString() {
        return "Bombilla{" +
                "potencia=" + potencia +
                ", numEncendido=" + numEncendido +
                ", encendida=" + encendida +
                '}';
    }
}

