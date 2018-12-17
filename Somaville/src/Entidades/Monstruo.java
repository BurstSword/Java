package Entidades;

public class Monstruo extends SerVivo {
    private int dropDinero;
    private String arma;


    public Monstruo(){
        super();
        this.dropDinero=0;
        this.arma="";
    }

    public Monstruo(int vida, int dropDinero, int ataque, String nombre, String arma){
        super(vida,ataque,nombre);
        this.dropDinero=dropDinero;
        this.arma=arma;
    }

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
