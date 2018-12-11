package Bombilla;

import java.util.Scanner;

public class Main {
    private static Bombilla bombilla = new Bombilla();
    //private static Bombilla bombillaRegalada = new Bombilla(false,false,34);

    public static void main(String[] args) {
        int boton;
        Scanner teclado = new Scanner(System.in);

        do {

            do {
                Main.mostrarMenu();
                boton = teclado.nextInt();

            } while (boton != 1 && boton != 2 && boton != 0);


            switch (boton) {
                case 1:
                    encenderBombilla();
                    break;
                case 2:
                    apagarBombilla();
                    break;
            }
        } while (!bombilla.isFundida() && boton != 0);

        if (bombilla.isFundida()) {
            System.out.println("La bombilla se ha fundido");
        } else {
            System.out.println("Adiós");
        }
    }

    public static void mostrarMenu() {

        System.out.println("1. Encender bombilla");
        System.out.println("2. Apagar bombilla");
        System.out.println("0. Salir");
        System.out.println("Recuerde que si está encendida no la puede encender otra vez y viceversa");
        System.out.println("Pulse 1 o 2: ");
    }

    public static void encenderBombilla() {

        if (bombilla.isEncendida()) {
            System.out.println("Error");
        } else {
            bombilla.cambiarAEncendida();
            System.out.println("Bombilla encendida");
        }
    }

    public static void apagarBombilla() {

        if (!bombilla.isEncendida()) {
            System.out.println("Error");
        } else {
            bombilla.setEncendida(false);
            System.out.println("Bombilla apagada");
        }
    }


}
