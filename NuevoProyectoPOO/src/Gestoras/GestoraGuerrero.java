package Gestoras;

import Entidades.Guerrero;


public class GestoraGuerrero {

    private final static int escudoMax = 15;
    private final static int ataque = 7;
    private final static int probCritico = 14;
    private final static int vidaMax = 18;


    public static Guerrero generarGuerrero(String nombre) {

        return new Guerrero(probCritico, vidaMax, ataque, vidaMax, nombre, escudoMax, escudoMax);

    }
}
