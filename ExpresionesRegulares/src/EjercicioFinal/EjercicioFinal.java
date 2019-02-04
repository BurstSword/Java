package EjercicioFinal;

import java.util.Scanner;


public class EjercicioFinal {
    public static void main(String[] args) {
        int boton;
        String nombre, edad, tlf, email;
        Scanner teclado = new Scanner(System.in);
        Scanner tecladoStr = new Scanner(System.in);
        do {
            do {
                GestoraMenus.Menu();
                boton = teclado.nextInt();
            } while (boton < 1 || boton > 5);


            switch (boton) {
                case 1:
                    System.out.print("Nombre: ");
                    nombre = tecladoStr.nextLine();
                    GestoraComprobar.Nombre(nombre);
                    break;
                case 2:
                    System.out.print("Edad: ");
                    edad = tecladoStr.nextLine();
                    GestoraComprobar.edad(edad);
                    break;
                case 3:
                    System.out.print("Teléfono: ");
                    tlf = tecladoStr.nextLine();
                    GestoraComprobar.tlf(tlf);
                    break;
                case 4:
                    System.out.print("Email: ");
                    email = tecladoStr.nextLine();
                    GestoraComprobar.mail(email);
                    break;
                case 5:
                    System.out.println("¡Adiós!");
                    break;
            }
        } while (boton != 5);
    }
}
