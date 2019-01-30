package Gestoras;

import Entidades.Guerrero;
import Entidades.Monstruo;
import Utilidades.Utilidades;

import java.util.Random;
import java.util.Scanner;

public class GestoraPeleas {
    public static Guerrero pelear(Monstruo monstruo, Guerrero guerrero) {
        int dano, sumarORestar, probCritico, danoRestante;
        char respuestaPocion;
        Scanner teclado = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Te has encontrado con un " + monstruo.getNombre());
        do {
            //Turno guerrero
            System.out.println("\nTu turno");
            System.out.println("Tienes " + guerrero.getVida() + " HP y " + guerrero.getEscudo() + " puntos de escudo");
            sumarORestar = random.nextInt(2);
            dano = guerrero.getAtaque();
            if (sumarORestar == 0) {
                dano += random.nextInt(4);
            } else {
                dano -= random.nextInt(4);
            }

            probCritico = random.nextInt(100) + 1;
            Utilidades.esperar();
            if (probCritico <= guerrero.getProbCritico()) {
                dano *= 2;
                System.out.println("Ha sido un golpe crítico, has hecho " + dano + " puntos de daño");
            } else {
                System.out.println("Has hecho " + dano + " puntos de daño");
            }
            monstruo.recibirDano(dano);
            //Fin turno guerrero
            //Turno monstruo
            if (monstruo.getVida() > 0) {
                System.out.println("\nTurno del monstruo");
                Utilidades.esperar();
                if (guerrero.getEscudo() != 0) {
                    if (monstruo.getAtaque() <= guerrero.getEscudo()) {
                        guerrero.recibirDanoEscudo(monstruo.getAtaque());
                        System.out.println("Tu escudo ha recibido " + monstruo.getAtaque() + " puntos de daño");
                    } else {
                        danoRestante = monstruo.getAtaque() - guerrero.getEscudo();
                        System.out.println("Tu escudo ha recibido " + guerrero.getEscudo() + " puntos de daño y tú has recibido " + danoRestante + " punto/s de daño");
                        guerrero.recibirDanoEscudo(monstruo.getAtaque() - danoRestante);
                        guerrero.recibirDano(danoRestante);


                    }
                    if (guerrero.getEscudo() == 0) {
                        System.out.println("Tu escudo se ha roto");
                    }
                } else {
                    guerrero.recibirDano(monstruo.getAtaque());
                    System.out.println("Has recibido " + monstruo.getAtaque() + " puntos de daño");
                }
            }
            Utilidades.esperar();
            //Fin turno monstruo
            if (guerrero.getVida() <= 0) {
                if (guerrero.hasPocionRevivir()) {
                    do {
                        System.out.println("\n¿Quieres utilizar la poción de revivir? Y/N");
                        respuestaPocion = Character.toUpperCase(teclado.next().charAt(0));
                    } while (respuestaPocion != 'Y' && respuestaPocion != 'N');
                    if (respuestaPocion == 'Y') {
                        guerrero.setPocionRevivir(false);
                        guerrero.setVida(guerrero.getVidaMax());
                        System.out.println("Su guerrero ha revivido con vida máxima");
                    }
                }
            }
        } while (monstruo.getVida() > 0 && guerrero.getVida() > 0);
        Utilidades.esperar();
        if (monstruo.getVida() <= 0) {


            System.out.println("\nEl monstruo ha sido eliminado, felicidades");
            System.out.println("Has obtenido " + monstruo.getDropDinero() + " somacoins");
            Utilidades.subirDinero(guerrero.getDinero(), monstruo.getDropDinero());
            guerrero.manejarDinero(monstruo.getDropDinero());
            System.out.println("\nHas terminado el combate con " + guerrero.getVida() + " HP y " + guerrero.getEscudo() + " puntos de escudo");
            System.out.println("\nHas regresado a la ciudad");
        } else {
            System.out.println("Su guerrero ha muerto");
        }
        return guerrero;
    }
}
