package Bombilla;

public class PruebaBombilla {
    private boolean encendida, fundida;

    public PruebaBombilla() {
        encendida = false;
        fundida = false;
    }


    public void Apagar() {
        this.encendida = false;

    }

    public void Encender() {
        this.encendida = true;

    }

    public void Fundir() {
        fundida = true;
    }

    public boolean getEncendida() {
        return encendida;
    }

    public void setEncendida(boolean encendida) {
        this.encendida = encendida;
    }

    public boolean getFundida() {
        return fundida;
    }

    public void setFundida(boolean fundida) {
        this.fundida = fundida;
    }
}
