package Gestoras;

import Entidades.Guerrero;
import Entidades.Monstruo;
import Utilidades.Utilidades;

import java.util.Random;
import java.util.Scanner;

/**
 * Clase gestora que maneja las peleas en la aplicación
 */
public class GestoraPeleas {
    /**
     * Función que devuelve un guerrero una vez cambiado los atributos del mismo guerrero pasado por parámetros después de pelear
     * @param monstruo Monstruo traído por parámetros
     * @param guerrero Guerrero traído por parámetros
     * @return Devuelve el guerrero traído por parámetros una vez se hayan alterado los atributos en la pelea
     */
    public static Guerrero pelear(Monstruo monstruo, Guerrero guerrero) {
        //Variables y objetos
        int dano, sumarORestar, probCritico, danoRestante;
        char respuestaPocion;
        Scanner teclado = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Te has encontrado con un " + monstruo.getNombre());
        //Este do repite los turnos del guerrero y del monstruo hasta que uno de los dos muere
        do {
            //Comienza el turno del guerrero
            System.out.println("\nTu turno");
            System.out.println("Tienes " + guerrero.getVida() + " HP y " + guerrero.getEscudo() + " puntos de escudo");

            //Mediante un random de 0 a 1 vamos a calcular si le vamos a sumar o restar de 0 a 3 puntos de daño al ataque del guerrero
            sumarORestar = random.nextInt(2);
            dano = guerrero.getAtaque();
            if (sumarORestar == 0) {
                dano += random.nextInt(4);
            } else {
                dano -= random.nextInt(4);
            }


            //Usando la probabilidad de crítico del guerrero, se calcula si el ataque del guerrero será multiplicado por 2 o no
            probCritico = random.nextInt(100) + 1;
            Utilidades.esperar();
            if (probCritico <= guerrero.getProbCritico()) {
                dano *= 2;
                System.out.println("Ha sido un golpe crítico, has hecho " + dano + " puntos de daño");
            } else {
                System.out.println("Has hecho " + dano + " puntos de daño");
            }


            //El monstruo recibe el daño
            monstruo.recibirDano(dano);
            //Finaliza el turno del guerrero


            //Comienza el turno del monstruo
            //Comprobamos si el monstruo no ha muerto (Si su vida es mayor a 0)
            if (monstruo.getVida() > 0) {
                System.out.println("\nTurno del monstruo");
                Utilidades.esperar();

                //Si el guerrero aún tiene escudo el ataque del monstruo será recibido por el escudo
                if (guerrero.getEscudo() != 0) {

                    //Si el escudo aguanta el golpe completo se le restan puntos al escudo
                    if (monstruo.getAtaque() <= guerrero.getEscudo()) {
                        guerrero.recibirDanoEscudo(monstruo.getAtaque());
                        System.out.println("Tu escudo ha recibido " + monstruo.getAtaque() + " puntos de daño");

                    }
                    //Si el escudo no aguanta todo el golpe del monstruo, el daño restante lo recibirá el guerrero
                    else {
                        danoRestante = monstruo.getAtaque() - guerrero.getEscudo();
                        System.out.println("Tu escudo ha recibido " + guerrero.getEscudo() + " puntos de daño y tú has recibido " + danoRestante + " punto/s de daño");
                        guerrero.recibirDanoEscudo(monstruo.getAtaque() - danoRestante);
                        guerrero.recibirDano(danoRestante);


                    }
                    if (guerrero.getEscudo() == 0) {
                        System.out.println("Tu escudo se ha roto");
                    }
                }
                //Si no tiene escudo, entonces todo el daño lo recibe el guerrero
                else {
                    guerrero.recibirDano(monstruo.getAtaque());
                    System.out.println("Has recibido " + monstruo.getAtaque() + " puntos de daño");
                }
            }
            Utilidades.esperar();
            //Finaliza el turno del monstruo

            //Si la vida del guerrero llega a 0 o menos
            if (guerrero.getVida() <= 0) {

                //Si el guerrero tiene poción de revivir le preguntamos si quiere utilizarla o no
                if (guerrero.hasPocionRevivir()) {
                    do {
                        System.out.println("\n¿Quieres utilizar la poción de revivir? Y/N");
                        respuestaPocion = Character.toUpperCase(teclado.next().charAt(0));
                    } while (respuestaPocion != 'Y' && respuestaPocion != 'N');

                    //Si la respuesta es afirmativa, el guerrero revive con la vida completa y puede seguir luchando
                    if (respuestaPocion == 'Y') {
                        guerrero.setPocionRevivir(false);
                        guerrero.setVida(guerrero.getVidaMax());
                        System.out.println("Su guerrero ha revivido con vida máxima");
                    }
                }
            }
        } while (monstruo.getVida() > 0 && guerrero.getVida() > 0);

        //Si al terminar la pelea es el monstruo el que ha muerto se te dará la cantidad de dinero que tuviese el monstruo
        if (monstruo.getVida() <= 0) {
            System.out.println("\nEl monstruo ha sido eliminado, felicidades");
            System.out.println("Has obtenido " + monstruo.getDropDinero() + " somacoins");
            Utilidades.subirDinero(guerrero.getDinero(), monstruo.getDropDinero());
            guerrero.manejarDinero(monstruo.getDropDinero());
            System.out.println("\nHas regresado a la ciudad");
        }
        //Si eres tú el que ha muerto finalizará la partida
        else {
            System.out.println("Esperaba más de ti guerrero");
        }
        return guerrero;
    }
}
