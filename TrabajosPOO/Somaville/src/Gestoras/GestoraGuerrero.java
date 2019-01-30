package Gestoras;

import Entidades.Guerrero;

public class GestoraGuerrero {

    private final static int escudoMax = 15;
    private final static int dano = 7;
    private final static int dinero = 51;
    private final static boolean pocionRevivir = false;
    private final static int probCritico = 14;
    private final static int vidaMax = 18;


    public static Guerrero generarGuerrero(String nombre) {

        return new Guerrero(vidaMax, dano, nombre, escudoMax, dinero, pocionRevivir, probCritico, vidaMax, escudoMax);

    }
}
