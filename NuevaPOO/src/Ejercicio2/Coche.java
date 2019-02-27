package Ejercicio2;


public class Coche extends Vehiculo {

    private int puertas;

    public Coche(String color, String model, int puertas) {
        super(color, model);
        this.puertas = puertas;
    }

    @Override
    void arrancar() {
        System.out.println("El coche está arrancando");
    }

    @Override
    void frenar() {
        System.out.println("El coche está frenando");
    }

    @Override
    void aparcar() {
        System.out.println("El coche está aparcando");
    }
}

