package Ejercicio2;

public class Barco extends Vehiculo {

    public Barco(String color, String model) {
        super(color, model);
    }

    @Override
    void arrancar() {
        System.out.println("El barco est� arrancando");
    }

    @Override
    void frenar() {
        System.out.println("El barco est� frenando");
    }

    @Override
    void aparcar() {
        System.out.println("El barco est� atracando");
    }

}