package Bombilla;

public class Bombilla {
    private boolean encendida, fundida;
    private int contadorEncendido;

    public Bombilla() {
        encendida = false;
        fundida = false;
        contadorEncendido = 0;
    }

    public Bombilla(boolean encendida, boolean fundida, int contadorEncendido) {
        this.encendida = encendida;
        this.fundida = fundida;
        this.contadorEncendido = contadorEncendido;
    }

    public boolean Apagar() {
        return encendida = false;
    }

    public boolean Encender() {
        return encendida = true;
    }

    public boolean isEncendida() {
        return encendida;
    }

    public void setEncendida(boolean encendida) {
        this.encendida = encendida;
    }

    public boolean isFundida() {
        return fundida;
    }

    public void setFundida(boolean fundida) {
        this.fundida = fundida;
    }

    public int getContadorEncendido() {
        return contadorEncendido;
    }

    public void setContadorEncendido(int contadorEncendido) {
        this.contadorEncendido = contadorEncendido;
    }

    public void cambiarAEncendida() {
        this.encendida = true;
        this.contadorEncendido++;
        if (this.contadorEncendido == 100) {
            this.fundida = true;
        }
    }
}
