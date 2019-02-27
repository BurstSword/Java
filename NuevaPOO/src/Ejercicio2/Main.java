package Ejercicio2;


public class Main {

    public static void main(String[] args) {
        Coche coche = new Coche("Azul","Seat",4);
        coche.arrancar();
        coche.frenar();
        coche.aparcar();
        coche.bocina();

        Barco barco = new Barco("Blanco","Yate");
        barco.arrancar();
        barco.frenar();
        barco.aparcar();
        barco.bocina();
    }
}