package Gestoras;


public class GestoraMenus {

    /**
     * M�todo encargado de mostrar el men� principal del juego
     */
    public static void menu() {

        System.out.println("\nElija una de las siguientes opciones");
        System.out.println("1. Lanzar Dados");
        System.out.println("2. Crear personajes y luchar");
        System.out.println("3. Salir");

    }

    /**
     * M�todo encargado de mostrar el men� del guerrero
     */
    public static void menuGuerrero() {
        System.out.println("\nElige que quieres hacer");
        System.out.println("1. Atacar");
        System.out.println("2. Huir del combate");
    }

    /**
     * M�todo encargado de mostrar el men� del monstruo
     */
    public static void menuMonstruo() {
        System.out.println("\nElige que quieres hacer");
        System.out.println("1. Atacar");
        System.out.println("2. Usar habilidad (Una vez por combate)");
        System.out.println("3. Huir del combate");
    }

}
