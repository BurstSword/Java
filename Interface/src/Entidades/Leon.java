package Entidades;

import Interfaces.CapazDeCorrer;

public class Leon extends Animal implements  CapazDeCorrer  {


    public Leon() {
        super("Simba", "Grrr");
    }

    @Override
    public void desplazarse(int inicio, int fin) {
        System.out.println("\nEstoy desplazándome desde " + inicio + " hasta " + fin);
    }

    @Override
    public void correr() {
        System.out.println("\nEstoy corriendo");
    }



}
