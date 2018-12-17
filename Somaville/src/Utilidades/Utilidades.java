package Utilidades;


public class Utilidades {
    public static void esperar() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void esperarFin() {
        try {
            Thread.sleep(150);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void esperarMejora() {
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void esperarDinero() {
        try {
            Thread.sleep(35);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

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

            Utilidades.esperarDinero();
        }
    }

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

    public static void subirDinero(int dinero, int dineroASubir) {
        String mejora;
        for (int i = 0; i <= dineroASubir; i++) {
            mejora = "Tu dinero: " + (dinero + i);
            if (i != 0)
                System.out.print("\r" + mejora);
            else
                System.out.print(mejora);

            Utilidades.esperarDinero();
        }
    }
}

