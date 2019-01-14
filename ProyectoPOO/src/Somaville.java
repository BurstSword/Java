/*
    Programa que va a tener un Men� con las siguientes opciones:
    1. Ir a pelear(Si llevas 5 combates ser� ir a pelear contra un jefe)
        Si muere podr� utilizar la poci�n de revivir si la tiene, y si gana volver� a la ciudad
    2. Ir a la tienda
        Podr� mejorar equipamiento y podr� comprar la poci�n de revivir, que s�lo podr� tener 1 a la vez.
    0. Hablar con el Rey (Cuidado con lo que le dices porque te puede desterrar)


 */

import Entidades.Guerrero;
import Gestoras.*;
import Utilidades.Utilidades;

import java.io.*;
import java.util.Scanner;

/**
 * Clase principal desde la que se ejecuta el juego
 */
//TODO ABRIR PARTIDA GUARDADA, CREAR PARTIDA NUEVA Y BORRAR PARTIDA GUARDADA
//TODO MENU LOGIN Y REGISTRO
//TODO ARCHIVO DONDE SE ACTUALICEN LAS ESTAD�SISTICAS DEL GUERRERO DESPU�S DE CADA PELEA
public class Somaville {
    public static void main(String[] args) {
        //Variables
        int boton, contMonstruo = 1, contFavoresRey = 0, botonSecreto, dineroSecreto, vidaSecreta, escudoSecreto, danoSecreto;
        boolean esJefe;
        String nombreGuerrero = "", fraseAlRey, nombreSecreto;
        Scanner tecladoStr = new Scanner(System.in);
        Scanner teclado = new Scanner(System.in);

        do {
            GestoraMenus.mostrarMenuRegistro();
            boton = teclado.nextInt();
        } while (boton < 1 || boton > 3);

        switch (boton) {
            case 1:
                GestoraRegistro.registro();
                break;
            case 2:
                GestoraLogin.login();
                break;
            case 3:
                //Proceso de borrar perfil
                break;
        }
        GestoraArchivos.mensajeBienvenida(nombreGuerrero);
        Guerrero guerrero = GestoraGuerrero.generarGuerrero(nombreGuerrero);

        //Do que ejecuta el men� del juego y sus funcionalidades hasta que acabemos la partida
        do {

            //Do que valida la entrada por teclado para elegir una de las opciones del men� y muestra los men�s
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

                        //Cada funci�n de este men� est� en la clase GestoraMenus
                        switch (botonSecreto) {
                            case 1:
                                System.out.println("�Cu�nto dinero quieres?");
                                dineroSecreto = teclado.nextInt();
                                guerrero.setDinero(dineroSecreto);
                                break;
                            case 2:
                                System.out.println("Poci�n de revivir obtenida");
                                guerrero.setPocionRevivir(true);
                                break;
                            case 3:
                                System.out.println("Introduce la vida m�xima que quieres tener");
                                vidaSecreta = teclado.nextInt();
                                guerrero.setVidaMax(vidaSecreta);
                                guerrero.setVida(vidaSecreta);
                                break;
                            case 4:
                                System.out.println("Introduce el escudo m�ximo que quieras tener");
                                escudoSecreto = teclado.nextInt();
                                guerrero.setEscudo(escudoSecreto);
                                guerrero.setEscudoMax(escudoSecreto);
                                break;
                            case 5:
                                System.out.println("Introduce el da�o que quiere hacer");
                                danoSecreto = teclado.nextInt();
                                guerrero.setAtaque(danoSecreto);
                                break;
                            case 6:
                                System.out.println("Probabilidad de cr�tico establecida en 50");
                                guerrero.setProbCritico(50);
                                break;
                            case 7:
                                System.out.println("Introduce tu nuevo nombre");
                                nombreSecreto = tecladoStr.nextLine();
                                guerrero.setNombre(nombreSecreto);
                                break;
                            case 8:
                                System.out.println("Escudo y vida al m�ximo");
                                guerrero.setEscudo(guerrero.getEscudoMax());
                                guerrero.setVida(guerrero.getVidaMax());
                                break;
                        }
                    } while (botonSecreto != 0);

                    break;
                case 0:
                    System.out.println("�Qu� le quieres decir al rey?, cuida mucho tu parla con Su Majestad");
                    fraseAlRey = tecladoStr.nextLine();

                    //Si le decimos esta frase en concreto nos dar� dos tipos de recompensa de lo contrario nos expulsar� y finalizar� la partida
                    if (fraseAlRey.equals("Sacre Bleu!")) {
                        contFavoresRey++;

                        //Si le pedimos m�s de dos favores al rey nos ejecutar�
                        if (contFavoresRey <= 2) {
                            System.out.println("Su Majestad: Veo que eres un hombre culto, aqu� tienes algo que te ayudar� en tu empresa");

                            //Si tenemos una poci�n de revivir nos dar� dinero, de lo contrario nos dar� una poci�n de revivir
                            if (guerrero.hasPocionRevivir()) {
                                System.out.println("Has recibido de parte de Su Majestad 500 somacoins");
                                Utilidades.subirDinero(guerrero.getDinero(), 500);
                                guerrero.manejarDinero(500);
                            } else {
                                System.out.println("Has recibido una poci�n de revivir de parte de Su Majestad");
                                guerrero.setPocionRevivir(true);
                            }
                            boton = -2;
                        } else {
                            System.out.println("Su Majestad: �Est�s intentado aprovecharte de mi bondad?");
                            System.out.println("����Que le corten la cabeza a este canalla!!!!");
                        }
                    } else if (fraseAlRey.equals("motherlode")) {
                        System.out.println("Su Majestad: Veo que te gustan Los Sims, �ka-ching!");
                        System.out.println("Has recibido de parte de Su Majestad 1000 somacoins");
                        Utilidades.subirDinero(guerrero.getDinero(), 1000);
                        guerrero.manejarDinero(1000);
                        boton = -2;
                    } else {
                        System.out.println("Su Majestad: C�mo osas a decirme tal barbarie");
                        System.out.println("�Quedas desterrado de Somaville!");

                    }
                    break;
            }

        } while (boton != 0 && guerrero.getVida() > 0);
        Utilidades.finalPartida();
    }
}
