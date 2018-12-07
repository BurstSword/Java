package Armario;

public class Main {
    public static void main(String[] args) {
        Armario armario = new Armario(2, 4, "marron", false, false, false);

        System.out.println("\nArmario creado, tiene esto:");
        System.out.println(armario.toString());

        armario.abrirPuerta();
        System.out.println("\nHemos abierto las puertas: ");
        System.out.println(armario.toString());

        armario.abrirPuerta();
        System.out.println("\nVamos a volver a intentar abrir las puertas: ");
        System.out.println(armario.toString());

        armario.cerrarPuerta();
        System.out.println("\nHemos cerrado las puertas: ");
        System.out.println(armario.toString());

        armario.cerrarPuerta();
        System.out.println("\nVamos a volver a intentar cerrar las puertas: ");
        System.out.println(armario.toString());

        armario.abrirCajon();
        System.out.println("\nHemos abierto los cajones");
        System.out.println(armario.toString());

        armario.abrirCajon();
        System.out.println("\nVamos a volver a intentar abrir los cajones");
        System.out.println(armario.toString());

        armario.cerrarCajon();
        System.out.println("\nHemos cerrado los cajones");
        System.out.println(armario.toString());

        armario.cerrarCajon();
        System.out.println("\nVamos a volver a intentar cerrar los cajones");
        System.out.println(armario.toString());

        armario.pintarArmario("morado");
        System.out.println("\nHemos pintado el armario");
        System.out.println(armario.toString());

        System.out.println("\nHemos estropeado la pintura");
        armario.setPinturaEstaEstropeada(true);
        System.out.println(armario.toString());

        armario.pintarArmario("verde");
        System.out.println("\nHemos vuelto a pintar el armario");
        System.out.println(armario.toString());

    }
}
