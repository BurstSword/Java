package Gestoras;

/**
 * Clase gestora que guarda las funcionalidades para mostrar los distintos menús en el juego
 */
public class GestoraMenus {
    /**
     * Muestra el menú de la primera pantalla del juego
     */
    public static void mostrarMenuPrincipal() {
        System.out.println("\n1. Ir a pelear");
        System.out.println("2. Ir a la tienda");
        System.out.println("0. Platicar con el rey");
    }

    /**
     * Muestra el menú de la primera pantalla del juego pero cuando le toca luchar contra un jefe
     */
    public static void mostrarMenuPrincipalJefe() {
        System.out.println("\n1. Ir a pelear con el jefe");
        System.out.println("2. Ir a la tienda");
        System.out.println("0. Platicar con el rey");
    }

    /**
     * Muestra el menú de la pantalla de la tienda
     */
    public static void mostrarMenuTienda() {
        System.out.println("\n1. Aumentar en 4 puntos el daño de tu arma (50 somacoins)");
        System.out.println("2. Aumentar en 3 puntos de vida tu escudo (40 somacoins");
        System.out.println("3. Aumentar en 4 puntos tu vida máxima (70 somacoins)");
        System.out.println("4. Rellenar el escudo al máximo (20 somacoins)");
        System.out.println("5. Rellenar tu vida (20 somacoins)");
        System.out.println("6. Aumentar probabilidad de crítico en 3 puntos (100 somacoins)");
        System.out.println("7. Comprar poción de revivir (350 somacoins)");
        System.out.println("0. Volver a la ciudad");
    }

    /**
     * Muestra el menú secreto del juego, shhh
     */
    public static void mostrarMenuSecreto() {
        System.out.println("1. Ponerte dinero");
        System.out.println("2. Darte una poción de revivir");
        System.out.println("3. Cambiarte la vida máxima");
        System.out.println("4. Cambiarte el escudo máximo");
        System.out.println("5. Cambiarte el daño");
        System.out.println("6. Poner al máximo la probabilidad de crítico");
        System.out.println("7. Cambiarte el nombre");
        System.out.println("8. Regenerar escudo y vida");
        System.out.println("0. Salir");
    }


}
