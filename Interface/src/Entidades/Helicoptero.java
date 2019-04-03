package Entidades;

import Interfaces.CapazDeMoverse;
import Interfaces.CapazDeVolar;

public class Helicoptero extends MedioDeTransporte implements CapazDeMoverse, CapazDeVolar {


    public Helicoptero() {
        super("Helicóptero");
    }

    @Override
    public void despegar() {
        System.out.println("\nEstá despegando");
    }

    @Override
    public void aterrizar() {
        System.out.println("\nEstoy aterrizando");
    }

    @Override
    public void volar() {
        System.out.println("\nEstoy volando");

    }

    @Override
    public void desplazarse(int inicio, int fin) {
        System.out.println("\nEstoy desplazándome desde " + inicio + " hasta " + fin);
    }
}
