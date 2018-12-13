package Gestoras;

import Entidades.Guerrero;
import Entidades.Monstruo;

import java.util.Random;

public class GestoraPeleas {
    public static Guerrero pelear(Monstruo monstruo, Guerrero guerrero) {
        int dano, sumarORestar, probCritico, danoRestante;
        Random random = new Random();
        System.out.println("Te has encontrado con un " + monstruo.getNombre());
        do {
            //Turno guerrero
            sumarORestar = random.nextInt(2);
            dano = guerrero.getAtaque();
            if (sumarORestar == 0) {
                dano += random.nextInt(4);
            } else {
                dano -= random.nextInt(4);
            }

            probCritico = random.nextInt(100) + 1;

            if (probCritico <= guerrero.getProbCritico()) {
                dano *= 2;
                System.out.println("Ha sido un golpe crítico");
            }
            System.out.println("Has hecho " + dano + " puntos de daño");
            monstruo.recibirDano(dano);
            //Fin turno guerrero
            //Turno monstruo
            if (monstruo.getVida() != 0) {
                if (guerrero.getEscudo() != 0) {
                    if (monstruo.getAtaque() <= guerrero.getEscudo()) {
                        guerrero.recibirDanoEscudo(monstruo.getAtaque());
                    } else {
                        danoRestante = monstruo.getAtaque() - guerrero.getEscudo();
                        guerrero.recibirDanoEscudo(monstruo.getAtaque() - danoRestante);
                        guerrero.recibirDano(danoRestante);
                    }
                }
            }
            //Fin turno monstruo
            if (guerrero.getVida()==0){
                if(guerrero.hasPocionRevivir()){
                    System.out.println("¿Quieres utilizar la poción de revivir?");
                }
            }
        }while (monstruo.getVida()<=0 && guerrero.getVida()<=0);
        if (monstruo.getVida())

    }
}
