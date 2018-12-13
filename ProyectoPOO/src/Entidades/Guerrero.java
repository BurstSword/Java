package Entidades;

public class Guerrero extends SerVivo {
    private int escudo, dinero, probCritico;
    private boolean pocionRevivir;
    public Guerrero() {
        super();
        this.escudo = 0;
        this.dinero = 0;
        this.pocionRevivir=false;
        this.probCritico=0;
    }

    public Guerrero(int vida, int ataque, String nombre, int escudo, int dinero, boolean pocionRevivir, int probCritico) {
        super(vida, ataque, nombre);
        this.escudo = escudo;
        this.dinero = dinero;
        this.pocionRevivir = pocionRevivir;
        this.probCritico = probCritico;
    }

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

    public int getProbCritico() {
        return probCritico;
    }

    public void setProbCritico(int probCritico) {
        this.probCritico = probCritico;
    }

    public void recibirDanoEscudo(int dano){
        this.escudo-=dano;
    }
}
