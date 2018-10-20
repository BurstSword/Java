import java.util.Scanner;

public class Clase2 {
    public static void main (String[]Args){
        int boton;
        Scanner teclado = new Scanner (System.in);


        do {
            imprimirMenu();
            boton= teclado.nextInt();
            switch(boton) {

                case 1:
                    System.out.println("Buenos días");
                    break;

                case 2:
                    System.out.println("Buenas tardes");
                    break;

                case 3:
                    System.out.println("Buenas noches");
                    break;
            }
        } while(boton !=0 );


    }

    public static void imprimirMenu()
    {
        System.out.println("1. Imprimir buenos días");
        System.out.println("2. Imprimir buenas tardes");
        System.out.println("3. Imprimir buenas noches");
        System.out.println("0. Salir");
        System.out.println("Introduce un número del 0 al 3 ");
    }
}
