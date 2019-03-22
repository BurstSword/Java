package Gestoras;

import Entidades.Monstruo;

public class GestoraMonstruo {
    private final static int ataque = 7;
    private final static int probCritico = 10;
    private final static int vidaMax = 20;

    public static Monstruo generarMonstruo(String nombre){

        return new Monstruo(probCritico,vidaMax,ataque,vidaMax,nombre,true);

    }

}
