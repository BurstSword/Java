package Gestoras;


import Entidades.Monstruo;

import java.util.Random;


/**
 * Clase gestora con la que manejamos la clase monstruo
 */
public class GestoraMonstruo {

    private final static String[] arrayMonstruos = {"Somavilla", "Armos", "Chu-Chu", "ReDead", "Elden", "Bongo Bongo", "Link oscuro", "Ente Artema", "Unidad97", "!Volvagia"};
    private final static String[] arrayArmas = {"Espada", "Arco", "Lanza", "Mitones", "Baston", "Nunchakus", "Katana"};
    private final static String[] arrayJefes = {"Medusa", "Octogon", "Twinrova", "Hektan", "Eox", "Ramrock", "Lanmola", "Odolwa", "Demise", "Evil Orb"};

    /**
     * Función que nos genera un monstruo a partir de la vida y el daño del guerrero traídos por parámetros para balancear
     * el monstruo que se genere
<<<<<<< Updated upstream
     *
=======
>>>>>>> Stashed changes
     * @param vidaGuerrero La vida máxima del guerrero
     * @param danoGuerrero El daño del guerrero
     * @return Devuelve un monstruo generado a partir de los parámetros y un nombre de monstruo y de arma al azar
     */
    public static Monstruo generarMonstruo(int vidaGuerrero, int danoGuerrero) {

        int vida, dropDinero, ataque;
        String nombre, arma;
        Random random = new Random();
<<<<<<< Updated upstream
        vida = (danoGuerrero * 2) + (random.nextInt(2) == 0 ? random.nextInt(1 + danoGuerrero / 15) * -1 : random.nextInt(1 + danoGuerrero / 10));
        ataque = (vidaGuerrero / 5) + (random.nextInt(2) == 0 ? random.nextInt(1 + vidaGuerrero / 10) * -1 : random.nextInt(1 + vidaGuerrero / 10));
=======
        vida = (danoGuerrero * 2) + (random.nextInt(2) == 0 ? random.nextInt(1+danoGuerrero/15) * -1 : random.nextInt(1+danoGuerrero/10));
        ataque = (vidaGuerrero / 5) + (random.nextInt(2) == 0 ? random.nextInt(1+vidaGuerrero/10) * -1 : random.nextInt(1+vidaGuerrero/10));
>>>>>>> Stashed changes
        dropDinero = random.nextInt(41);
        nombre = arrayMonstruos[random.nextInt(arrayMonstruos.length)];
        arma = arrayArmas[random.nextInt(arrayArmas.length)];
        Monstruo monstruo = new Monstruo(vida, dropDinero, ataque, nombre, arma);
        return monstruo;
    }

    /**
     * Función que nos genera un monstruo con características más fuerte en función de la vida máxima y daño del guerrero para
     * balancear el monstruo generado
<<<<<<< Updated upstream
     *
=======
>>>>>>> Stashed changes
     * @param vidaGuerrero La vida máxima del guerrero
     * @param danoGuerrero El daño del guerrero
     * @return Devuelve un monstruo con mejores características a partir de los parámetros y un nombre de monstruo y de arma al azar
     */
    public static Monstruo generarJefe(int vidaGuerrero, int danoGuerrero) {
        int vida, dropDinero, ataque;
        String nombre, arma;
        Random random = new Random();
<<<<<<< Updated upstream
        vida = (danoGuerrero * 2) + (random.nextInt(4) < 3 ? random.nextInt(1 + danoGuerrero / 7) : random.nextInt(1 + danoGuerrero / 15) * -1);
        ataque = (vidaGuerrero / 5) + (random.nextInt(4) < 3 ? random.nextInt(1 + vidaGuerrero / 7) : random.nextInt(1 + vidaGuerrero / 15) * -1);
=======
        vida = (danoGuerrero * 2) + (random.nextInt(4) < 3 ? random.nextInt(1+danoGuerrero/7) : random.nextInt(1+danoGuerrero/15) * -1);
        ataque = (vidaGuerrero / 5) + (random.nextInt(4) < 3 ? random.nextInt(1+vidaGuerrero/7) : random.nextInt(1+vidaGuerrero/15) * -1);
>>>>>>> Stashed changes
        dropDinero = random.nextInt(41) + 100;
        nombre = arrayJefes[random.nextInt(arrayJefes.length)];
        arma = arrayArmas[random.nextInt(arrayArmas.length)];

        Monstruo jefe = new Monstruo(vida, dropDinero, ataque, nombre, arma);
        return jefe;
    }
}
