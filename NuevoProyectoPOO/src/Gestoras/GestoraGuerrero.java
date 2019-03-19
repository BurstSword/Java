package Gestoras;

import Datos.AlmacenArmas;
import Entidades.Guerrero;

import java.util.InputMismatchException;
import java.util.Scanner;


public class GestoraGuerrero {

    private final static int escudoMax = 18;
    private final static int probCritico = 14;
    private final static int vidaMax = 18;


    public static Guerrero generarGuerrero(String nombre) {
        Scanner teclado = new Scanner(System.in);
        int eleccion = -1;
        System.out.println("Seleccione su arma");
        for (int i = 0; i < AlmacenArmas.armas.size(); i++) {
            System.out.println("Tipo de arma: " + AlmacenArmas.armas.get(i).getNombre() + " Daño: " + AlmacenArmas.armas.get(i));
        }

        do {
            try {
                eleccion = teclado.nextInt();
            } catch (InputMismatchException i) {
                i.printStackTrace();
            } finally {
                teclado.nextLine();
            }
        } while (eleccion < 0 || eleccion > 1);

        return new Guerrero(probCritico, vidaMax, AlmacenArmas.armas.get(eleccion).getDano(), vidaMax, nombre, escudoMax, escudoMax);

    }
}
