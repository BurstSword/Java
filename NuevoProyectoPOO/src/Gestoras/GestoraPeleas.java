package Gestoras;

import Entidades.Guerrero;
import Entidades.Monstruo;
import Utilidades.Utilidad;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 * Clase gestora que maneja las peleas en la aplicación
 */
public class GestoraPeleas {
    /**
     * Función que devuelve un guerrero una vez cambiado los atributos del mismo guerrero pasado por parámetros después de pelear
     *
     * @param monstruo Monstruo traído por parámetros
     * @param guerrero Guerrero traído por parámetros
     * @return Devuelve el guerrero traído por parámetros una vez se hayan alterado los atributos en la pelea
     */
    public static boolean pelear(Monstruo monstruo, Guerrero guerrero) {
        //Variables y objetos
        boolean combateRealizado;
        int danoGuerrero, danoMonstruo, sumarORestar, probCritico, danoRestante, opcionGuerrero = 0, opcionMonstruo = -1;
        Scanner teclado = new Scanner(System.in);
        Random random = new Random();
        System.out.println(guerrero.getNombre() + " VS. " + monstruo.getNombre());
        //Este do repite los turnos del guerrero y del monstruo hasta que uno de los dos muere
        do {
            //Comienza el turno del guerrero
            System.out.println("\nTurno de " + guerrero.getNombre());
            System.out.println("Tienes " + guerrero.getVida() + " HP y " + guerrero.getEscudo() + " puntos de escudo");

            System.out.println("\nElige que quieres hacer");
            System.out.println("1. Atacar");
            do {
                try {
                    opcionGuerrero = teclado.nextInt();
                } catch (InputMismatchException i) {
                    i.printStackTrace();
                } finally {
                    teclado.nextLine();
                }

            } while (opcionGuerrero != 1);

            //Mediante un random de 0 a 1 vamos a calcular si le vamos a sumar o restar de 0 a 3 puntos de daño al ataque del guerrero
            sumarORestar = random.nextInt(2);
            danoGuerrero = guerrero.getAtaque();
            if (sumarORestar == 0) {
                danoGuerrero += random.nextInt(4);
            } else {
                danoGuerrero -= random.nextInt(4);
            }
            //Usando la probabilidad de crítico del guerrero, se calcula si el ataque del guerrero será multiplicado por 2 o no
            probCritico = random.nextInt(100) + 1;
            Utilidad.esperar();
            if (probCritico <= guerrero.getProbCritico()) {
                danoGuerrero *= 2;
                System.out.println("Ha sido un golpe crítico, has hecho " + danoGuerrero + " puntos de daño");
            } else {
                System.out.println("Has hecho " + danoGuerrero + " puntos de daño");
            }

            //El monstruo recibe el daño
            monstruo.recibirDano(danoGuerrero);
            //Finaliza el turno del guerrero

            //Comienza el turno del monstruo

            //Comprobamos si el monstruo no ha muerto (Si su vida es mayor a 0)
            if (monstruo.getVida() > 0) {
                System.out.println("\nTurno de " + monstruo.getNombre());
                Utilidad.esperar();
                System.out.println("Tienes " + monstruo.getVida() + " HP y " + (monstruo.isDisponibilidadHabilidad() ? "tiene su habilidad disponible" : "no tienes su habilidad disponible"));

                System.out.println("\nElige que quieres hacer");
                System.out.println("1. Atacar");
                System.out.println("2. Usar habilidad (Una vez por combate)");
                do {
                    try {
                        opcionMonstruo = teclado.nextInt();
                    } catch (InputMismatchException i) {
                        i.printStackTrace();
                    } finally {
                        teclado.nextLine();
                    }

                } while (opcionMonstruo < 1 || opcionMonstruo > 2);


                //Mediante un random de 0 a 1 vamos a calcular si le vamos a sumar o restar de 0 a 3 puntos de daño al ataque del guerrero
                sumarORestar = random.nextInt(2);
                danoMonstruo = monstruo.getAtaque();
                if (sumarORestar == 0) {
                    danoMonstruo += random.nextInt(4);
                } else {
                    danoMonstruo -= random.nextInt(4);
                }
                if (opcionMonstruo == 2 && monstruo.isDisponibilidadHabilidad()) {
                    danoMonstruo *= 2;
                    monstruo.setDisponibilidadHabilidad(false);
                } else if (!monstruo.isDisponibilidadHabilidad()) {
                    System.out.println("Ya has usado la habilidad del monstruo");
                }
                probCritico = random.nextInt(100) + 1;
                Utilidad.esperar();
                if (probCritico <= guerrero.getProbCritico()) {
                    danoMonstruo *= 2;
                    System.out.println("Ha sido un golpe crítico, has hecho " + danoMonstruo + " puntos de daño");
                } else {
                    System.out.println("Has hecho " + danoMonstruo + " puntos de daño");
                }

                //Si el guerrero aún tiene escudo el ataque del monstruo será recibido por el escudo
                if (guerrero.getEscudo() != 0) {

                    //Si el escudo aguanta el golpe completo se le restan puntos al escudo
                    if (monstruo.getAtaque() <= guerrero.getEscudo()) {
                        guerrero.recibirDanoEscudo(danoMonstruo);
                        System.out.println("El escudo de" + guerrero.getNombre() + "ha recibido " + danoMonstruo + " puntos de daño");

                    }
                    //Si el escudo no aguanta todo el golpe del monstruo, el daño restante lo recibirá el guerrero
                    else {
                        danoRestante = danoMonstruo - guerrero.getEscudo();
                        System.out.println("El escudo de " + guerrero.getNombre() + " ha recibido " + guerrero.getEscudo() + " y el ha recibido " + danoRestante + " punto/s de daño");
                        guerrero.recibirDanoEscudo(danoMonstruo - danoRestante);
                        guerrero.recibirDano(danoRestante);


                    }
                    if (guerrero.getEscudo() == 0) {
                        System.out.println("Tu escudo se ha roto");
                    }
                }
                //Si no tiene escudo, entonces todo el daño lo recibe el guerrero
                else {
                    guerrero.recibirDano(monstruo.getAtaque());
                    System.out.println("El monstruo " + monstruo.getNombre() + " ha recibido " + danoMonstruo + " puntos de daño");
                }
            }
            Utilidad.esperar();
            //Finaliza el turno del monstruo

        } while (monstruo.getVida() > 0 && guerrero.getVida() > 0);


        if (monstruo.getVida() <= 0) {
            System.out.println("\nEl monstruo ha sido eliminado, felicidades");
        }

        else {
            System.out.println("Esperaba más de ti guerrero");
        }
        combateRealizado = true;
        return combateRealizado;
    }
}
