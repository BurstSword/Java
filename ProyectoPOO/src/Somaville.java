/*
    Programa que va a tener un Menú con las siguientes opciones:
    1. Ir a pelear(Si llevas 5 combates será ir a pelear contra un jefe)
        Si muere podrá utilizar la poción de revivir si la tiene, y si gana volverá a la ciudad
    2. Ir a la tienda
        Podrá mejorar equipamiento y podrá comprar la poción de revivir, que sólo podrá tener 1 a la vez.
    0. Hablar con el Rey (Cuidado con lo que le dices porque te puede desterrar)


 */

import Entidades.Guerrero;
import Gestoras.*;
import Utilidades.Utilidades;

import java.util.Scanner;

/**
 * Clase principal desde la que se ejecuta el juego
 */
public class Somaville {
    public static void main(String[] args) {
        //Variables
        int boton, contMonstruo = 1, contFavoresRey = 0, botonSecreto, dineroSecreto, vidaSecreta, escudoSecreto, danoSecreto;
        boolean esJefe;
        String nombreGuerrero, fraseAlRey, nombreSecreto;
        Scanner tecladoStr = new Scanner(System.in);
        Scanner teclado = new Scanner(System.in);

        System.out.println("Bienvenido a Somaville, joven guerrero, dinos tu nombre");
        nombreGuerrero = tecladoStr.nextLine();
        Guerrero guerrero = GestoraGuerrero.generarGuerrero(nombreGuerrero);

        //Do que ejecuta el menú del juego y sus funcionalidades hasta que acabemos la partida
        do {

            //Do que valida la entrada por teclado para elegir una de las opciones del menú y muestra los menús
            do {
                System.out.println("\n" + guerrero.toString());
                if (contMonstruo % 5 != 0) {
                    GestoraMenus.mostrarMenuPrincipal();
                    esJefe = false;
                } else {
                    GestoraMenus.mostrarMenuPrincipalJefe();
                    esJefe = true;
                }

                boton = teclado.nextInt();
            } while ((boton < 0 || boton > 2) && boton != 527);

            //Este switch realiza las distintas Funcionalidades del programa, la primera llama a la clase GestoraPeleas,
            //la segunda a la clase GestoraTienda y la tercera funciona directamente en el main
            switch (boton) {
                case 1:
                    if (esJefe) {
                        guerrero = GestoraPeleas.pelear(GestoraMonstruo.generarJefe(guerrero.getVidaMax(), guerrero.getAtaque()), guerrero);
                    } else {
                        guerrero = GestoraPeleas.pelear(GestoraMonstruo.generarMonstruo(guerrero.getVidaMax(), guerrero.getAtaque()), guerrero);
                    }
                    contMonstruo++;
                    break;
                case 2:

                    //Llama a la clase GestoraTienda
                    guerrero = GestoraTienda.entrarTienda(guerrero);
                    break;
                case 527:

                    //Este bucle se repite mientra que el botonSecreto sea distinto de 0
                    do {

                        //Este bucle valida la entrada por teclado del valor de botonSecreto
                        do {
                            GestoraMenus.mostrarMenuSecreto();
                            botonSecreto = teclado.nextInt();
                        } while (botonSecreto < 0 || botonSecreto > 8);

                        //Cada función de este menú está en la clase GestoraMenus
                        switch (botonSecreto) {
                            case 1:
                                System.out.println("¿Cuánto dinero quieres?");
                                dineroSecreto = teclado.nextInt();
                                guerrero.setDinero(dineroSecreto);
                                break;
                            case 2:
                                System.out.println("Poción de revivir obtenida");
                                guerrero.setPocionRevivir(true);
                                break;
                            case 3:
                                System.out.println("Introduce la vida máxima que quieres tener");
                                vidaSecreta = teclado.nextInt();
                                guerrero.setVidaMax(vidaSecreta);
                                guerrero.setVida(vidaSecreta);
                                break;
                            case 4:
                                System.out.println("Introduce el escudo máximo que quieras tener");
                                escudoSecreto = teclado.nextInt();
                                guerrero.setEscudo(escudoSecreto);
                                guerrero.setEscudoMax(escudoSecreto);
                                break;
                            case 5:
                                System.out.println("Introduce el daño que quiere hacer");
                                danoSecreto = teclado.nextInt();
                                guerrero.setAtaque(danoSecreto);
                                break;
                            case 6:
                                System.out.println("Probabilidad de crítico establecida en 50");
                                guerrero.setProbCritico(50);
                                break;
                            case 7:
                                System.out.println("Introduce tu nuevo nombre");
                                nombreSecreto = tecladoStr.nextLine();
                                guerrero.setNombre(nombreSecreto);
                                break;
                            case 8:
                                System.out.println("Escudo y vida al máximo");
                                guerrero.setEscudo(guerrero.getEscudoMax());
                                guerrero.setVida(guerrero.getVidaMax());
                                break;
                        }
                    } while (botonSecreto != 0);

                    break;
                case 0:
                    System.out.println("¿Qué le quieres decir al rey?, cuida mucho tu parla con Su Majestad");
                    fraseAlRey = tecladoStr.nextLine();

                    //Si le decimos esta frase en concreto nos dará dos tipos de recompensa de lo contrario nos expulsará y finalizará la partida
                    if (fraseAlRey.equals("Sacre Bleu!")) {
                        contFavoresRey++;

                        //Si le pedimos más de dos favores al rey nos ejecutará
                        if (contFavoresRey <= 2) {
                            System.out.println("Su Majestad: Veo que eres un hombre culto, aquí tienes algo que te ayudará en tu empresa");

                            //Si tenemos una poción de revivir nos dará dinero, de lo contrario nos dará una poción de revivir
                            if (guerrero.hasPocionRevivir()) {
                                System.out.println("Has recibido de parte de Su Majestad 500 somacoins");
                                Utilidades.subirDinero(guerrero.getDinero(), 500);
                                guerrero.manejarDinero(500);
                            } else {
                                System.out.println("Has recibido una poción de revivir");
                                guerrero.setPocionRevivir(true);
                            }
                            boton = -2;
                        } else {
                            System.out.println("Su Majestad: ¿Estás intentado aprovecharte de mi bondad?");
                            System.out.println("¡¡¡¡Que le corten la cabeza a este canalla!!!!");
                        }
                    } else if (fraseAlRey.equals("motherlode")) {
                        System.out.println("Su Majestad: Veo que te gustan Los Sims, ¡ka-ching!");
                        System.out.println("Has recibido de parte de Su Majestad 1000 somacoins");
                        Utilidades.subirDinero(guerrero.getDinero(), 1000);
                        guerrero.manejarDinero(1000);
                        boton = -2;
                    } else {
                        System.out.println("Su Majestad: Cómo osas a decirme tal barbarie");
                        System.out.println("¡Quedas desterrado de Somaville!");

                    }
                    break;
            }

        } while (boton != 0 && guerrero.getVida() > 0);
        Utilidades.finalPartida();
    }
}
