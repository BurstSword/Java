package Gestoras;

import Entidades.Guerrero;

/**
 * Clase gestora para manejar los guerreros
 */
public class GestoraGuerrero {

    private final static int escudoMax = 15;
    private final static int dano = 7;
    private final static int dinero = 25;
    private final static boolean pocionRevivir = false;
    private final static int probCritico = 14;
    private final static int vidaMax = 18;

    /**
     * Función que genera un guerrero a partir del nombre pasado por parámetros y a los valores que tenemos almacenados en la misma clase
     *
     * @param nombre El nombre del guerrero traído por parámetro
     * @return Devuelve un guerrero con todos sus atributos incializados
     */
    public static Guerrero generarGuerrero(String nombre) {

        return new Guerrero(vidaMax, dano, nombre, escudoMax, dinero, pocionRevivir, probCritico, vidaMax, escudoMax);

    }
}
