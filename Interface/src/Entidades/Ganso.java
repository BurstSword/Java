package Entidades;

import Interfaces.CapazDeCorrer;
import Interfaces.CapazDeVolar;

public class Ganso extends Animal implements CapazDeVolar, CapazDeCorrer {

    public Ganso() {
        super("Guillermo", "Crue, crue");
    }

    @Override
    public void desplazarse(int inicio, int fin) {
        System.out.println("\nEstoy desplazándome desde " + inicio + " hasta " + fin);
    }

    @Override
    public void correr() {
        System.out.println("\nEstoy corriendo");
    }

    @Override
    public void despegar() {
        System.out.println("\nEstoy despegando");
    }

    @Override
    public void aterrizar() {
        System.out.println("\nEstoy aterrizando");
    }

    @Override
    public void volar() {
        System.out.println("\nEstoy volando");
    }

}
