package Coche;

public class Main {
    public static void main(String[] args) {
        Coche coche = new Coche(false,0,0,100,60,15);

        System.out.println(coche.toString());

        System.out.println("\nVamos a probar el rodaje de kilómetros con el motor apagado");
        System.out.println(coche.rodarKilometros(100));
        System.out.println(coche.toString());

        System.out.println("\nVamos a encender el motor");
        coche.encenderMotor();
        System.out.println(coche.toString());

        System.out.println("\nVamos a volver a encender el motor");
        coche.encenderMotor();
        System.out.println(coche.toString());

        System.out.println("\nVamos a apagar el motor");
        coche.apagarMotor();
        System.out.println(coche.toString());

        System.out.println("\nVamos a volver a apagar el motor");
        coche.apagarMotor();
        System.out.println(coche.toString());

        System.out.println("\nVamos a encender el motor");
        coche.encenderMotor();
        System.out.println(coche.toString());

        System.out.println("\nVamos a probar el rodaje con 0 litros en el depósito");
        System.out.println(coche.rodarKilometros(100));
        System.out.println(coche.toString());

        System.out.println("\nVamos a probar el aviso de reserva");
        coche.avisoReserva();

        System.out.println("\nVamos a llenar el depósito");
        coche.llenarDeposito();
        System.out.println(coche.toString());

        System.out.println("\nVamos a probar el aviso de reserva");
        coche.avisoReserva();

        System.out.println("\nVamos a probar el rodaje de kilómetros con el depósito lleno");
        System.out.println(coche.rodarKilometros(100));
        System.out.println(coche.toString());

        System.out.println("\nVamos a probar el rodaje de kilómetros sabiendo que no tiene capacidad para ello");
        System.out.println(coche.rodarKilometros(10000));
        System.out.println(coche.toString());
    }
}
