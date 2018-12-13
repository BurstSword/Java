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
import Gestoras.GestoraGuerrero;
import Gestoras.GestoraMenus;

import java.util.Scanner;

public class Somaville {
    public static void main(String[] args) {
        //variables
        int boton, contMonstruo=0;
        String nombreGuerrero;
        Scanner tecladoStr = new Scanner(System.in);
        Scanner teclado = new Scanner(System.in);

        System.out.println("Bienvenido a Somaville, joven guerrero, dinos tu nombre");
        nombreGuerrero = tecladoStr.nextLine();
        Guerrero guerrero = GestoraGuerrero.generarGuerrero(nombreGuerrero);

        //Menú
        do {

            do {
                if(contMonstruo%5!=0) {
                    GestoraMenus.mostrarMenuPrincipal();

                }else{
                    GestoraMenus.mostrarMenuPrincipalJefe();
                }
                boton = teclado.nextInt();
            } while (boton < 0 || boton > 2);

            switch(boton){
                case 1:

                    System.out.println("Pelea");
                    boton = teclado.nextInt();
                    switch (boton){
                        case 1:
                            //ir a pelear de nuevo
                            System.out.println("Pelea+");
                            break;
                        case 2:
                            //volver a la ciudad
                            System.out.println("Ciudad");
                    }
                    break;
                case 2:
                    //ir a la tienda
                    //Mostrar menú tienda y comprar
                    System.out.println("Tienda");
                    break;
                case 0:
                    System.out.println("Rey tus muertos");
                    //Insulto al rey y ser desterrado y finalizar programa
                            //Easter egg de hablar con él y decirle algo bonito y te de una poción de revivir
                    break;
            }


        }while(boton !=0); //Desterrado o el guerrero muera
    }
}
