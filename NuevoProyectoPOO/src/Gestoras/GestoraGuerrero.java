package Gestoras;

import Datos.AlmacenArmas;
import Entidades.Guerrero;

import java.util.InputMismatchException;
import java.util.Scanner;


public class GestoraGuerrero {

    private final static int escudoMax = 60;
    private final static int probCritico = 28;
    private final static int vidaMax = 137;


    public static Guerrero generarGuerrero(String nombre) {
        Scanner teclado = new Scanner(System.in);
        int eleccion = -1;
        System.out.println("Seleccione su arma");
        for (int i = 0; i < AlmacenArmas.armas.size(); i++) {
            System.out.println("Nº " + i + " Tipo de arma: " + AlmacenArmas.armas.get(i).getNombre() + " Daño: " + AlmacenArmas.armas.get(i).getDano());
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
