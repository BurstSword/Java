package Ejercicio2;

public class Main {
    public static void main(String[] args) {
        Bombilla bomb1 = new Bombilla();

        bomb1.potencia = 50;
        bomb1.numEncendido = 0;
        bomb1.encendida = false;


        System.out.println();
        bomb1.Encender();
    }

}
