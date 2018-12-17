package Gestoras;


import Entidades.Monstruo;

import java.util.Random;

public class GestoraMonstruo {

    private final static String[] arrayNombre = {"Somavilla", "Armos", "Chu-Chu", "ReDead", "Elden", "Bongo Bongo", "Link oscuro", "Ente Artema", "Unidad97", "!Volvagia"};
    private final static String[] arrayArmas = {"Espada", "Arco", "Lanza", "Mitones", "Baston", "Nunchakus", "Katana"};

    public static Monstruo generarMonstruo(int vidaGuerrero, int danoGuerrero) {

        int vida, dropDinero, ataque;
        String nombre, arma;
        Random random = new Random();
        vida = random.nextInt(8) + (3 * 7) / 4;
        ataque = random.nextInt(6) + (3 * 6) / 4;
        dropDinero = random.nextInt(26);
        nombre = arrayNombre[random.nextInt(arrayNombre.length)];
        arma = arrayArmas[random.nextInt(arrayArmas.length)];
        Monstruo monstruo = new Monstruo(vida,dropDinero,ataque,nombre,arma);
        return monstruo;
    }

    public static Monstruo generarJefe(int vidaGuerrero, int danoGuerrero) {
        int vida, dropDinero, ataque;
        String nombre, arma;
        Random random = new Random();
        vida = (random.nextInt(8)+ (3 * 7) / 4) +7;
        ataque = (random.nextInt(6) + (3 * 6) / 4) +7;
        dropDinero = random.nextInt(26)+70;
        nombre = arrayNombre[random.nextInt(arrayNombre.length)];
        arma = arrayArmas[random.nextInt(arrayArmas.length)];

        Monstruo jefe = new Monstruo(vida,dropDinero,ataque,nombre,arma);
        return jefe;
    }
}
