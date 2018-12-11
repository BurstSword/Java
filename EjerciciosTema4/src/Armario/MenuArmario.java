package Armario;

import java.util.Scanner;

public class MenuArmario {
    public static void main(String[] args) {
        Armario armario = new Armario(2, 4, "marrón", false, false, false, 99);
        int boton;
        Scanner teclado = new Scanner(System.in);
        Scanner tecladoStr = new Scanner(System.in);
        do {
            do {
                GestoraMenus.mostrarMenu();
                boton = teclado.nextInt();
            } while (boton < 0 || boton > 6);

            switch (boton) {
                case 1:
                    System.out.println(armario.abrirPuerta() ? "Las puertas se ha abierto" : "La puerta ya estaba abierta");
                    break;
                case 2:
                    System.out.println(armario.abrirCajon() ? "Los cajones se han abierto" : "Los cajones ya estaban abiertos");
                    break;
                case 3:
                    System.out.println(armario.cerrarPuerta() ? "Las puertas se han cerrado" : "Las puertas ya estaban cerradas");
                    break;
                case 4:
                    System.out.println(armario.cerrarCajon() ? "Los cajones se han cerrado" : "Los cajones ya estaban cerrados");
                    break;
                case 5:
                    if(armario.isPinturaEstaEstropeada()){
                        System.out.println("¿De qué color quiere el armario?");
                        armario.pintarArmario(tecladoStr.next());
                    }else{
                        System.out.println("La pintura del armario está en perfectas condiciones, no es necesario pintarlo");
                    }
                    break;
                case 6:
                    System.out.println(armario.toString());
                    break;
                case 0:
                    System.out.println("Adiós");
                    break;

            }

        } while (boton != 0);
    }

}


