package Gestoras;


public class GestoraMenus {

    /**
     * Método encargado de mostrar el menú principal del juego
     */
    public static void menu() {

        System.out.println("\nElija una de las siguientes opciones");
        System.out.println("1. Lanzar Dados");
        System.out.println("2. Crear personajes y luchar");
        System.out.println("3. Salir");

    }

    /**
     * Método encargado de mostrar el menú del guerrero
     */
    public static void menuGuerrero() {
        System.out.println("\nElige que quieres hacer");
        System.out.println("1. Atacar");
        System.out.println("2. Huir del combate");
    }

    /**
     * Método encargado de mostrar el menú del monstruo
     */
    public static void menuMonstruo() {
        System.out.println("\nElige que quieres hacer");
        System.out.println("1. Atacar");
        System.out.println("2. Usar habilidad (Una vez por combate)");
        System.out.println("3. Huir del combate");
    }

}
