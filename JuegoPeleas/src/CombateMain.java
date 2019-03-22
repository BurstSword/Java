

import Entidades.Guerrero;
import Entidades.Monstruo;
import Gestoras.*;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CombateMain {
    public static void main(String[] args) {
        String nombreGuerrero, nombreMonstruo;
        boolean combateAcabado = false;
        int opcion = 0;
        Scanner teclado = new Scanner(System.in);


        do {
            do {
                try {
                    GestoraMenus.menu();
                    opcion = teclado.nextInt();
                } catch (InputMismatchException i) {
                    i.printStackTrace();
                } finally {
                    teclado.nextLine();
                }


            } while (opcion < 1 || opcion > 3);


            switch (opcion) {

                case 1:
                    GestoraDado.lanzarDado();
                    break;
                case 2:
                    System.out.println("  ,^.\n" +
                            "  |||\n" +
                            "  |||       _T_\n" +
                            "  |||   .-.[:|:].-.\n" +
                            "  ===_ /\\|  \"'\"  |/\n" +
                            "   E]_|\\/ \\--|-|''''|\n" +
                            "   O  `'  '=[:]| A  |\n" +
                            "          /\"\"\"\"|  P |\n" +
                            "         /\"\"\"\"\"`.__.'\n" +
                            "        []\"/\"\"\"\\\"[]\n" +
                            "        | \\     / |\n" +
                            "        | |     | |\n" +
                            "      <\\\\\\)     (///>");
                    System.out.println("\nIntroduzca el nombre del guerrero");
                    nombreGuerrero = GestoraEntradaTeclado.introducirNombre();
                    Guerrero guerrero = GestoraGuerrero.generarGuerrero(nombreGuerrero);
                    System.out.println("                  (      )\n" +
                            "                  ((((()))\n" +
                            "                  |o\\ /o)|\n" +
                            "                  ( (  _')\n" +
                            "                   (._.  /\\__\n" +
                            "                  ,\\___,/ '  ')\n" +
                            "    '.,_,,       (  .- .   .    )\n" +
                            "     \\   \\\\     ( '        )(    )\n" +
                            "      \\   \\\\    \\.  _.__ ____( .  |\n" +
                            "       \\  /\\\\   .(   .'  /\\  '.  )\n" +
                            "        \\(  \\\\.-' ( /    \\/    \\)\n" +
                            "         '  ()) _'.-|/\\/\\/\\/\\/\\|\n" +
                            "             '\\\\ .( |\\/\\/\\/\\/\\/|\n" +
                            "               '((  \\    /\\    /\n" +
                            "               ((((  '.__\\/__.')\n" +
                            "                ((,) /   ((()   )\n" +
                            "                 \"..-,  (()(\"   /\n" +
                            "                 _//.   ((() .\"\n" +
                            "          _____ //,/\" ___ ((( ', ___\n" +
                            "                           ((  )\n" +
                            "                            / /\n" +
                            "                          _/,/'\n" +
                            "                        /,/,\"");
                    System.out.println("\nIntroduzca el nombre del monstruo");
                    nombreMonstruo = GestoraEntradaTeclado.introducirNombre();
                    Monstruo monstruo = GestoraMonstruo.generarMonstruo(nombreMonstruo);
                    combateAcabado = GestoraPeleas.pelear(monstruo, guerrero);
                    break;

                case 3:
                    System.out.println("\nAdiós");
                    break;
            }
        } while (opcion != 3 || combateAcabado);
    }
}


