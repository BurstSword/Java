<<<<<<< Updated upstream
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
     * Procedimiento que hace que el hilo principal del programa se quede parado durante 300ms (0.3 segundos)
     */
    public static void esperarMejora() {
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * Procedimiento que hace que el hilo principal del programa se quede parado durante 35ms (0.035 segundos)
     */
    public static void esperarDinero() {
        try {
            Thread.sleep(35);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * Procedimiento que hace que el hilo principal del programa se quede parado durante 10ms (0.01 segundos)
     */
    public static void esperarDineroFast() {
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * Procedimiento que hace que el hilo principal del programa se quede parado durante 60ms (0.06 segundos)
     */
    public static void esperarDineroSlow() {
        try {
            Thread.sleep(60);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * Procedimiento que muestra en pantalla "Mejorando", y le va añadiendo "." hasta formar "Mejorando..." en la misma línea,
     * repitiendo esta acción 3 veces
     */
    public static void mejorarEquipamiento() {
        String mejora;
        for (int i = 0; i < 3; i++) {
            mejora = "Mejorando";
            for (int j = 0; j < 4; j++) {
                if (j != 0 || i > 0)
                    System.out.print("\r" + mejora);
                else
                    System.out.print(mejora);

                mejora += '.';
                Utilidades.esperarMejora();

                if(j == 3)
                    System.out.print("\rMejorando   ");
            }
        }

        System.out.println("\r¡Mejorada!  ");

    }

    /**
     * Procedimiento que muestra en pantalla "Reparando", y le va añadiendo "." hasta formar "Reparando..." en la misma línea,
     * repitiendo esta acción 3 veces
     */
    public static void repararEquipamiento() {
        String mejora;
        for (int i = 0; i < 3; i++) {
            mejora = "Reparando";
            for (int j = 0; j < 4; j++) {
                if (j != 0 || i > 0)
                    System.out.print("\r" + mejora);
                else
                    System.out.print(mejora);

                mejora += '.';
                Utilidades.esperarMejora();

                if(j == 3)
                    System.out.print("\rReparando   ");
            }
        }

        System.out.println("\r¡Reparado!");

    }
    /**
     * Procedimiento que muestra en pantalla "Creando", y le va añadiendo "." hasta formar "Creando..." en la misma línea,
     * repitiendo esta acción 3 veces
     */
    public static void crearPocion() {
        String mejora;
        for (int i = 0; i < 3; i++) {
            mejora = "Creando";
            for (int j = 0; j < 4; j++) {
                if (j != 0 || i > 0)
                    System.out.print("\r" + mejora);
                else
                    System.out.print(mejora);

                mejora += '.';
                Utilidades.esperarMejora();

                if(j == 3)
                    System.out.print("\rCreando   ");
            }
        }

        System.out.println("\r¡Creada!");

    }
    /**
     * Procedimiento que muestra en pantalla "Tu dinero:" y le va bajando el número hasta la cantidad específica
     * @param dinero Dinero inicial
     * @param dineroABajar La cantidad de dinero hasta la que se desea bajar
     */
    public static void bajarDinero(int dinero, int dineroABajar) {
        String mejora;
        int longitudAnterior = 0, longitud;

        for (int i = 0; i <= dineroABajar; i++) {
            mejora = "Tu dinero: " + (dinero - i);
            longitud = mejora.length();
            if(longitudAnterior == 0)
                longitudAnterior = longitud;

            if(longitud != longitudAnterior)
                mejora = mejora+" ";

            if(longitudAnterior != longitud)
                longitudAnterior = longitud;

            if (i != 0)
                System.out.print("\r" + mejora);
            else
                System.out.print(mejora);

            if(dineroABajar-i < 50)
                Utilidades.esperarDineroSlow();
            else if (dineroABajar-i < 300)
                Utilidades.esperarDinero();
            else
                Utilidades.esperarDineroFast();
        }
    }

    /**
     * Procedimiento que muestra en pantalla "Fin de partida" letra por letra en la misma línea
     */
    public static void finalPartida() {
        char[] arrayFinPartida = {'F', 'i', 'n', ' ', 'd', 'e', ' ', 'p', 'a', 'r', 't', 'i', 'd', 'a'};
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
    /**
     * Procedimiento que muestra en pantalla "Tu dinero:" y le va subiendo el número hasta la cantidad específica
     * @param dinero Dinero inicial
     * @param dineroASubir La cantidad de dinero hasta la que se desea subir
     */
    public static void subirDinero(int dinero, int dineroASubir) {
        String mejora;
        for (int i = 0; i <= dineroASubir; i++) {
            mejora = "Tu dinero: " + (dinero + i);
            if (i != 0)
                System.out.print("\r" + mejora);
            else
                System.out.print(mejora);

            if(dineroASubir-i < 50)
                Utilidades.esperarDineroSlow();
            else if (dineroASubir-i < 300)
                Utilidades.esperarDinero();
            else
                Utilidades.esperarDineroFast();
        }
    }
}

=======
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
     * Procedimiento que hace que el hilo principal del programa se quede parado durante 300ms (0.3 segundos)
     */
    public static void esperarMejora() {
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * Procedimiento que hace que el hilo principal del programa se quede parado durante 35ms (0.035 segundos)
     */
    public static void esperarDinero() {
        try {
            Thread.sleep(35);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * Procedimiento que hace que el hilo principal del programa se quede parado durante 10ms (0.01 segundos)
     */
    public static void esperarDineroFast() {
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * Procedimiento que hace que el hilo principal del programa se quede parado durante 60ms (0.06 segundos)
     */
    public static void esperarDineroSlow() {
        try {
            Thread.sleep(60);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * Procedimiento que muestra en pantalla "Mejorando", y le va añadiendo "." hasta formar "Mejorando..." en la misma línea,
     * repitiendo esta acción 3 veces
     */
    public static void mejorarEquipamiento() {
        String mejora;
        for (int i = 0; i < 3; i++) {
            mejora = "Mejorando";
            for (int j = 0; j < 4; j++) {
                if (j != 0 || i > 0)
                    System.out.print("\r" + mejora);
                else
                    System.out.print(mejora);

                mejora += '.';
                Utilidades.esperarMejora();

                if(j == 3)
                    System.out.print("\rMejorando   ");
            }
        }

        System.out.println("\r¡Mejorada!  ");

    }

    /**
     * Procedimiento que muestra en pantalla "Reparando", y le va añadiendo "." hasta formar "Reparando..." en la misma línea,
     * repitiendo esta acción 3 veces
     */
    public static void repararEquipamiento() {
        String mejora;
        for (int i = 0; i < 3; i++) {
            mejora = "Reparando";
            for (int j = 0; j < 4; j++) {
                if (j != 0 || i > 0)
                    System.out.print("\r" + mejora);
                else
                    System.out.print(mejora);

                mejora += '.';
                Utilidades.esperarMejora();

                if(j == 3)
                    System.out.print("\rReparando   ");
            }
        }

        System.out.println("\r¡Reparado!");

    }
    /**
     * Procedimiento que muestra en pantalla "Creando", y le va añadiendo "." hasta formar "Creando..." en la misma línea,
     * repitiendo esta acción 3 veces
     */
    public static void crearPocion() {
        String mejora;
        for (int i = 0; i < 3; i++) {
            mejora = "Creando";
            for (int j = 0; j < 4; j++) {
                if (j != 0 || i > 0)
                    System.out.print("\r" + mejora);
                else
                    System.out.print(mejora);

                mejora += '.';
                Utilidades.esperarMejora();

                if(j == 3)
                    System.out.print("\rCreando   ");
            }
        }

        System.out.println("\r¡Creada!");

    }
    /**
     * Procedimiento que muestra en pantalla "Tu dinero:" y le va bajando el número hasta la cantidad específica
     * @param dinero Dinero inicial
     * @param dineroABajar La cantidad de dinero hasta la que se desea bajar
     */
    public static void bajarDinero(int dinero, int dineroABajar) {
        String mejora;
        int longitudAnterior = 0, longitud;

        for (int i = 0; i <= dineroABajar; i++) {
            mejora = "Tu dinero: " + (dinero - i);
            longitud = mejora.length();
            if(longitudAnterior == 0)
                longitudAnterior = longitud;

            if(longitud != longitudAnterior)
                mejora = mejora+" ";

            if(longitudAnterior != longitud)
                longitudAnterior = longitud;

            if (i != 0)
                System.out.print("\r" + mejora);
            else
                System.out.print(mejora);

            if(dineroABajar-i < 50)
                Utilidades.esperarDineroSlow();
            else if (dineroABajar-i < 300)
                Utilidades.esperarDinero();
            else
                Utilidades.esperarDineroFast();
        }
    }

    /**
     * Procedimiento que muestra en pantalla "Fin de partida" letra por letra en la misma línea
     */
    public static void finalPartida() {
        char[] arrayFinPartida = {'F', 'i', 'n', ' ', 'd', 'e', ' ', 'p', 'a', 'r', 't', 'i', 'd', 'a'};
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
    /**
     * Procedimiento que muestra en pantalla "Tu dinero:" y le va subiendo el número hasta la cantidad específica
     * @param dinero Dinero inicial
     * @param dineroASubir La cantidad de dinero hasta la que se desea subir
     */
    public static void subirDinero(int dinero, int dineroASubir) {
        String mejora;
        for (int i = 0; i <= dineroASubir; i++) {
            mejora = "Tu dinero: " + (dinero + i);
            if (i != 0)
                System.out.print("\r" + mejora);
            else
                System.out.print(mejora);

            if(dineroASubir-i < 50)
                Utilidades.esperarDineroSlow();
            else if (dineroASubir-i < 300)
                Utilidades.esperarDinero();
            else
                Utilidades.esperarDineroFast();
        }
    }
}

>>>>>>> Stashed changes
