/*
    Programa que va a tener un Menú con las siguientes opciones:
    1. Ir a pelear(Si llevas 5 combates será ir a pelear contra un jefe)
        Si muere podrá utilizar la poción de revivir si la tiene, y si gana tendrá la opción de seguir peleando o volver a la ciudad
    2. Ir a la tienda
        Podrá mejorar equipamiento y podrá comprar la poción de revivir, que sólo podrá tener 1 a la vez.
    0.  Insultar al Rey para ser desterrado
        Mensaje del rey enfadado, y te destierre

 */

import Entidades.Guerrero;
import Gestoras.*;
import Utilidades.Utilidades;

import java.util.Scanner;

public class Somaville {
    public static void main(String[] args) {
        //variables
        int boton, contMonstruo = 1, contFavoresRey = 0;
        boolean esJefe;
        String nombreGuerrero, fraseAlRey;
        Scanner tecladoStr = new Scanner(System.in);
        Scanner teclado = new Scanner(System.in);

        System.out.println("Bienvenido a Somaville, joven guerrero, dinos tu nombre");
        nombreGuerrero = tecladoStr.nextLine();
        Guerrero guerrero = GestoraGuerrero.generarGuerrero(nombreGuerrero);


        do {

            do {
                if (contMonstruo % 5 != 0) {
                    GestoraMenus.mostrarMenuPrincipal();
                    esJefe = false;
                } else {
                    GestoraMenus.mostrarMenuPrincipalJefe();
                    esJefe = true;
                }
                boton = teclado.nextInt();
            } while (boton < 0 || boton > 2);

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
                    guerrero = GestoraTienda.entrarTienda(guerrero);
                    break;
                case 0:
                    System.out.println("¿Qué le quieres decir al rey?, cuida mucho tu parla con Su Majestad");
                    fraseAlRey = tecladoStr.nextLine();

                    if (fraseAlRey.equals("Sacre Bleu!")) {
                        contFavoresRey++;
                        if (contFavoresRey <= 2) {
                            System.out.println("Su Majestad: Veo que eres un hombre culto, aquí tienes algo que te ayudará en tu empresa");
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
                    } else if (fraseAlRey.equals("motherlode")){
                        System.out.println("Su Majestad: ¡Ka-ching!");
                        System.out.println("Has recibido de parte de Su Majestad 1000 somacoins");
                        Utilidades.subirDinero(guerrero.getDinero(), 1000);
                        guerrero.manejarDinero(1000);
                        boton = -2;
                    } else{
                        System.out.println("Su Majestad: Cómo osas a decirme tal barbarie");
                        System.out.println("¡Quedas desterrado de Somaville!");

                    }
                    break;
            }

        } while (boton != 0 && guerrero.getVida() > 0);
        Utilidades.finalPartida();
    }
}
