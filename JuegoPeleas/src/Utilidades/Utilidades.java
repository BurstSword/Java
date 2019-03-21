package Utilidades;

/**
 * Clase de utilidades que se podrán usar por todo el programa
 */
public class Utilidades {
    /**
     * Procedimiento que hace que el hilo principal del programa se quede parado durante 1200ms (1.2 segundos)
     */
    public static void esperar() {
        try {
            Thread.sleep(1200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * Procedimiento que hace que el hilo principal del programa se quede parado durante 150ms (0.15 segundos).
     */
    public static void esperarFin() {
        try {
            Thread.sleep(150);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    /**
     * Procedimiento que muestra en pantalla "Fin de partida" letra por letra en la misma línea
     */
    public static void finalCombate() {
        char[] arrayFinPartida = {'F', 'i', 'n', ' ', 'd', 'e', 'l', ' ', 'c', 'o', 'm', 'b', 'a', 't', 'e'};
        String mensajeCompleto = "";
        for (int i = 0; i < arrayFinPartida.length; i++) {
            mensajeCompleto += arrayFinPartida[i];
            if (i != 0)
                System.out.print("\r" + mensajeCompleto);
            else
                System.out.print(mensajeCompleto);
            Utilidades.esperarFin();
        }
    }

}

