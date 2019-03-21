package Gestoras;

import Entidades.Guerrero;
import Entidades.Monstruo;
import Utilidades.Utilidades;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;


public class GestoraPeleas {
    /**
     * Método encargado de gestionar la pelea entre el guerrero y el monstruo
     * @param monstruo
     * @param guerrero
     * @return boolean que nos dice si el combate está acabado o no
     */
    public static boolean pelear(Monstruo monstruo, Guerrero guerrero) {
        //Variables y objetos
        boolean combateRealizado;
        int danoGuerrero, danoMonstruo, sumarORestar, probCriticoGuerrero, probCriticoMonstruo, danoRestanteMonstruo, opcionGuerrero = 0, opcionMonstruo = -1;
        Scanner teclado = new Scanner(System.in);
        Random random = new Random();
        System.out.println(guerrero.getNombre() + " VS. " + monstruo.getNombre());
        //Este do repite los turnos del guerrero y del monstruo hasta que uno de los dos muere
        do {
            //Comienza el turno del guerrero
            System.out.println("\nTurno de " + guerrero.getNombre());
            System.out.println("Tienes " + guerrero.getVida() + " HP y " + guerrero.getEscudo() + " puntos de escudo");

            GestoraMenus.menuGuerrero();
            do {
                try {
                    opcionGuerrero = teclado.nextInt();
                } catch (InputMismatchException i) {
                    i.printStackTrace();
                } finally {
                    teclado.nextLine();
                }

            } while (opcionGuerrero < 1 || opcionGuerrero > 2);
            if (opcionGuerrero != 2) {
                //Mediante un random de 0 a 1 vamos a calcular si le vamos a sumar o restar de 0 a 3 puntos de daño al ataque del guerrero
                sumarORestar = random.nextInt(2);
                danoGuerrero = guerrero.getAtaque();
                if (sumarORestar == 0) {
                    danoGuerrero += random.nextInt(4);
                } else {
                    danoGuerrero -= random.nextInt(4);
                }
                //Usando la probabilidad de crítico del guerrero, se calcula si el ataque del guerrero será multiplicado por 2 o no
                probCriticoGuerrero = random.nextInt(100) + 1;
                Utilidades.esperar();
                if (probCriticoGuerrero <= guerrero.getProbCritico()) {
                    danoGuerrero *= 2;
                    System.out.println("\nHa sido un golpe critico, has hecho " + danoGuerrero + " puntos de dano");
                } else {
                    System.out.println("\nHas hecho " + danoGuerrero + " puntos de dano");
                }
                //El monstruo recibe el daño
                monstruo.recibirDano(danoGuerrero);
            } else {
                guerrero.setVida(0);
            }
            //Finaliza el turno del guerrero

            //Comienza el turno del monstruo

            //Comprobamos si el monstruo no ha muerto (Si su vida es mayor a 0)
            if (monstruo.getVida() > 0 && guerrero.getVida() != 0) {
                System.out.println("\nTurno de " + monstruo.getNombre());
                Utilidades.esperar();
                System.out.println("\nTienes " + monstruo.getVida() + " HP y " + (monstruo.isDisponibilidadHabilidad() ? "tiene su habilidad disponible" : "no tienes su habilidad disponible"));

                GestoraMenus.menuMonstruo();
                do {
                    try {
                        opcionMonstruo = teclado.nextInt();
                    } catch (InputMismatchException i) {
                        i.printStackTrace();
                    } finally {
                        teclado.nextLine();
                    }

                } while (opcionMonstruo < 1 || opcionMonstruo > 3);

                if (opcionMonstruo != 3) {
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
                    } else if (opcionMonstruo == 2 && !monstruo.isDisponibilidadHabilidad()) {
                        System.out.println("\nYa has usado la habilidad del monstruo, asi que haras un ataque normal");

                    }
                    probCriticoMonstruo = random.nextInt(100) + 1;
                    Utilidades.esperar();
                    if (probCriticoMonstruo <= guerrero.getProbCritico()) {
                        danoMonstruo *= 2;
                        System.out.println("\nHa sido un golpe critico, has hecho " + danoMonstruo + " puntos de dano");
                    } else {
                        System.out.println("\nHas hecho " + danoMonstruo + " puntos de dano");
                    }

                    //Si el guerrero aún tiene escudo el ataque del monstruo será recibido por el escudo
                    if (guerrero.getEscudo() != 0) {

                        //Si el escudo aguanta el golpe completo se le restan puntos al escudo
                        if (danoMonstruo <= guerrero.getEscudo()) {
                            guerrero.recibirDanoEscudo(danoMonstruo);
                            System.out.println("\nEl escudo de " + guerrero.getNombre() + " ha recibido " + danoMonstruo + " puntos de dano");

                        }
                        //Si el escudo no aguanta todo el golpe del monstruo, el daño restante lo recibirá el guerrero
                        else {
                            danoRestanteMonstruo = danoMonstruo - guerrero.getEscudo();
                            System.out.println("\nEl escudo de " + guerrero.getNombre() + " ha recibido " + guerrero.getEscudo() + " y el ha recibido " + danoRestanteMonstruo + " punto/s de dano");
                            guerrero.recibirDanoEscudo(guerrero.getEscudo());
                            guerrero.recibirDano(danoRestanteMonstruo);


                        }
                        if (guerrero.getEscudo() == 0) {
                            System.out.println("\nTu escudo se ha roto");
                        }
                    }
                    //Si no tiene escudo, entonces todo el daño lo recibe el guerrero
                    else {
                        guerrero.recibirDano(monstruo.getAtaque());
                        System.out.println("\nEl monstruo " + monstruo.getNombre() + " ha recibido " + danoMonstruo + " puntos de dano");
                    }
                } else {
                    monstruo.setVida(0);
                }
                Utilidades.esperar();
                //Finaliza el turno del monstruo
            }

        } while (monstruo.getVida() > 0 && guerrero.getVida() > 0);


        if (monstruo.getVida() <= 0) {
            System.out.println("\nEl monstruo ha sido eliminado, felicidades");
        } else {
            System.out.println("\nEsperaba mas de ti guerrero");
        }
        combateRealizado = true;

        Utilidades.finalCombate();
        return combateRealizado;
    }
}
