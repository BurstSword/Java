package Gestoras;

import Entidades.Guerrero;

public class GestoraGuerrero {

    private final static int vida = 18;
    private final static int escudo = 15;
    private final static int dano = 7;
    private final static int dinero = 70;
    private final static boolean pocionRevivir = false;
    private final static int probCritico = 15;

    public static Guerrero generarGuerrero(String nombre) {

        return new Guerrero(vida, dano, nombre, escudo, dinero, pocionRevivir, probCritico);

    }
}
