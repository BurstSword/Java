package Coche;

import java.util.Scanner;

public class MenuCoche {
    public static void main(String[] args) {
        Coche coche = new Coche();
        int boton;
        double gasolinaRest;
        Scanner teclado = new Scanner(System.in);
        do {
            do {
                GestoraMenus.mostrarMenu();
                boton = teclado.nextInt();
            } while (boton < 0 || boton > 5);

            switch (boton) {
                case 1:
                    System.out.println(coche.encenderMotor() ? "El motor ha arrancado" : "El motor ya estaba encendido");
                    break;
                case 2:
                    System.out.println(coche.apagarMotor() ? "El motor se ha apagado" : "El motor ya estaba apagado");
                    break;
                case 3:
                    System.out.println("Introduzca los kilómetros a recorrer");
                    gasolinaRest = coche.rodarKilometros(teclado.nextDouble());
                    if (gasolinaRest == -1) {
                        System.out.println("El coche no tiene nada de gasolina");
                    } else if (gasolinaRest == -2) {
                        System.out.println("El coche se ha quedado sin gasolina durante el trayecto");
                    } else if (gasolinaRest == -3) {
                        System.out.println("El coche no está encendido");
                    } else {
                        System.out.println("Te quedan "+ gasolinaRest + " litros de gasolina");
                    }
                    break;
                case 4:
                    coche.llenarDeposito();
                    System.out.println("Depósito lleno");
                    break;
                case 5:
                    System.out.println(coche.toString());
                    break;
                case 0:
                    System.out.println("Saliste y cerraste la puerta");
                    break;

            }

        } while (boton != 0);
    }

}