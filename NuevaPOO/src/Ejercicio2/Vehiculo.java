package Ejercicio2;

public abstract class Vehiculo {
    private String color;
    private String modelo;

    Vehiculo(String color, String modelo){
        this.color = color;
        this.modelo = modelo;
    }

    abstract void arrancar();
    abstract void frenar();
    abstract void aparcar();

    void bocina(){
        System.out.println("MEC MEC");
    }
}

