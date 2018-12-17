package Gestoras;

import Entidades.Guerrero;
import Utilidades.Utilidades;

import java.util.Scanner;

public class GestoraTienda {

    public static Guerrero entrarTienda(Guerrero guerrero) {
        int boton = -1;
        Scanner teclado = new Scanner(System.in);

        System.out.println("   |\\                     /)\n" +
                " /\\_\\\\__               (_//\n" +
                "|   `>\\-`     _._       //`)\n" +
                " \\ /` \\\\  _.-`:::`-._  //\n" +
                "  `    \\|`    :::    `|/\n" +
                "        |     :::     |\n" +
                "        |.....:::.....|\n" +
                "        |:::::::::::::|\n" +
                "        |     :::     |\n" +
                "        \\     :::     /\n" +
                "         \\    :::    /\n" +
                "          `-. ::: .-'\n" +
                "           //`:::`\\\\\n" +
                "          //   '   \\\\\n" +
                "         |/         \\\\");

        System.out.println("Vendedor: Bienvenido a SuperSoma, tu tienda de confianza");
        System.out.println("Tienes " + guerrero.getDinero() + " somacoins");
        do {
            do {
                GestoraMenus.mostrarMenuTienda();
                System.out.println(boton == -1 ? "Vendedor: ¿Algo que necesites?" : "Vendedor: ¿Algo más?");
                boton = teclado.nextInt();

            } while (boton < 0 || boton > 7);

            switch (boton) {
                case 1:
                    if (guerrero.getDinero() < 50) {
                        System.out.println("Vendedor: No tienes dinero suficiente, te faltan " + (50 - guerrero.getDinero()) + " somacoins");
                    } else {
                        System.out.println("Vendedor: Déjame tu arma, será solo un momento");
                        Utilidades.mejorarEquipamiento();
                        guerrero.setAtaque(guerrero.getAtaque() + 4);
                        System.out.println("Vendedor: Aquí tienes tu arma, muchas gracias");
                        Utilidades.bajarDinero(guerrero.getDinero(), 50);
                        guerrero.manejarDinero(-50);
                    }
                    break;
                case 2:
                    if (guerrero.getDinero() < 40) {
                        System.out.println("Vendedor: No tienes dinero suficiente, te faltan " + (40 - guerrero.getDinero()) + " somacoins");
                    } else {

                        System.out.println("Vendedor: Déjame tu escudo, será solo un momento");
                        Utilidades.mejorarEquipamiento();
                        guerrero.setEscudoMax(guerrero.getEscudoMax() + 3);
                        System.out.println("Vendedor: Aquí tienes tu escudo, muchas gracias");
                        Utilidades.bajarDinero(guerrero.getDinero(), 40);
                        guerrero.manejarDinero(-40);
                    }
                    break;
                case 3:
                    if (guerrero.getDinero() < 70) {
                        System.out.println("No tienes dinero suficiente, te faltan " + (70 - guerrero.getDinero()) + " somacoins");
                    } else {

                        System.out.println("Vendedor: Déjame tu corazón, será solo un momento en el que estarás muerto");
                        Utilidades.mejorarEquipamiento();
                        guerrero.setVidaMax(guerrero.getVidaMax() + 4);
                        System.out.println("Vendedor: Aquí tienes tu corazón, muchas gracias");
                        Utilidades.bajarDinero(guerrero.getDinero(), 70);
                        guerrero.manejarDinero(-70);
                    }
                    break;
                case 4:
                    if (guerrero.getEscudo() == guerrero.getEscudoMax()) {
                        System.out.println("Vendedor: Tu escudo se encuentra en perfectas condiciones");
                    } else if (guerrero.getDinero() < 20) {
                        System.out.println("Vendedor: No tienes dinero suficiente, te faltan " + (20 - guerrero.getDinero()) + " somacoins");
                    } else {

                        System.out.println("Vendedor: Déjame tu escudo, será solo un momento");
                        Utilidades.repararEquipamiento();
                        guerrero.setEscudo(guerrero.getEscudoMax());
                        System.out.println("Vendedor: Aquí tienes tu escudo, muchas gracias");
                        Utilidades.bajarDinero(guerrero.getDinero(), 20);
                        guerrero.manejarDinero(-20);
                    }
                    break;
                case 5:
                    if (guerrero.getVida() == guerrero.getVidaMax()) {
                        System.out.println("Tu corazón se encuentra en perfectas condiciones");
                    } else if (guerrero.getDinero() < 20) {
                        System.out.println("No tienes dinero suficiente, te faltan " + (20 - guerrero.getDinero()) + " somacoins");
                    } else {

                        System.out.println("Vendedor: Déjame tu corazón, será solo un momento");
                        Utilidades.repararEquipamiento();
                        guerrero.setVida(guerrero.getVidaMax());
                        System.out.println("Vendedor: Aquí tienes tu corazón, muchas gracias");
                        Utilidades.bajarDinero(guerrero.getDinero(), 20);
                        guerrero.manejarDinero(-20);
                    }
                    break;
                case 6:
                    if (guerrero.getProbCritico() >= 50) {
                        System.out.println("Vendedor: No puedes aumentar más tu probabilidad de crítico");
                    } else if (guerrero.getDinero() < 100) {
                        System.out.println("Vendedor: No tienes dinero suficiente, te faltan " + (100 - guerrero.getDinero()) + " somacoins");
                    } else {

                        System.out.println("Vendedor: Déjame tu suerte, será solo un momento");
                        Utilidades.mejorarEquipamiento();
                        guerrero.setProbCritico(guerrero.getProbCritico() + 3);
                        System.out.println("Vendedor: Aquí tienes tu suerte, muchas gracias");
                        Utilidades.bajarDinero(guerrero.getDinero(), 100);
                        guerrero.manejarDinero(-100);
                    }
                    break;
                case 7:
                    if (guerrero.hasPocionRevivir()) {
                        System.out.println("Vendedor: Sólo puedes llevar una poción de revivir según las leyes de Somaville");
                    } else if (guerrero.getDinero() < 350) {
                        System.out.println("Vendedor: No tienes dinero suficiente, te faltan " + (350 - guerrero.getDinero()) + " somacoins");
                    } else {
                        System.out.println("Vendedor: Voy a crear la poción, ahora vuelvo");
                        Utilidades.crearPocion();
                        guerrero.setPocionRevivir(true);
                        System.out.println("Vendedor: Aquí tienes la poción, muchas gracias");
                        Utilidades.bajarDinero(guerrero.getDinero(), 350);
                        guerrero.manejarDinero(-350);
                    }
                    break;
                case 0:
                    System.out.println("Vendedor: Hasta luego, vuelva pronto");
            }
        } while (boton != 0);
        return guerrero;
    }
}
