package Gestoras;

import Datos.AlmacenArmas;
import Entidades.Guerrero;

import java.util.InputMismatchException;
import java.util.Scanner;


public class GestoraGuerrero {

    private final static int escudoMax = 60;
    private final static int probCritico = 28;
    private final static int vidaMax = 137;

    /**
     * Método encargado de crear un nuevo guerrero con sus atributos inicializdos
     *
     * @param nombre
     * @return guerrero que es el guerrero generado por el método
     */
    public static Guerrero generarGuerrero(String nombre) {
        Scanner teclado = new Scanner(System.in);
        int eleccion = -1;
        System.out.println("Seleccione su arma");
        AlmacenArmas.mostrarArrayListArmas();

        do {
            try {
                eleccion = teclado.nextInt();
            } catch (InputMismatchException i) {
                i.printStackTrace();
            } finally {
                teclado.nextLine();
            }
        } while (eleccion < 0 || eleccion > AlmacenArmas.armas.size());

        return new Guerrero(probCritico, vidaMax, AlmacenArmas.armas.get(eleccion).getDano(), vidaMax, nombre, escudoMax, escudoMax);

    }
}
