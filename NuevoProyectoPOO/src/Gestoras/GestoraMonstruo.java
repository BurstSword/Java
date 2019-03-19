package Gestoras;

import Datos.AlmacenArmas;
import Entidades.Monstruo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GestoraMonstruo {
    private final static int probCritico = 10;
    private final static int vidaMax = 20;

    public static Monstruo generarMonstruo(String nombre) {
        Scanner teclado = new Scanner(System.in);
        int eleccion = -1;
        System.out.println("Seleccione su arma");
        for (int i = 0; i < AlmacenArmas.armas.size(); i++) {
            System.out.println("Tipo de arma: " + AlmacenArmas.armas.get(i).getNombre() + " Da�o: " + AlmacenArmas.armas.get(i));
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
        return new Monstruo(probCritico, vidaMax, AlmacenArmas.armas.get(eleccion).getDano(), vidaMax, nombre, true);

    }

}
