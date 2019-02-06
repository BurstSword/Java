package EjercicioFinal;

import java.util.Scanner;


public class EjercicioFinal {
    public static void main(String[] args) {
        int boton;
        String nombre, edad, tlf, email;
        Scanner teclado = new Scanner(System.in);
        do {
            do {
                GestoraMenus.Menu();
                boton = teclado.nextInt();
                if (boton < 1 || boton > 5)
                    System.out.println("Opción incorrecta");

            } while (boton < 1 || boton > 5);

            switch (boton) {
                case 1:
                    System.out.print("Nombre: ");
                    nombre = teclado.nextLine();
                    GestoraComprobar.validacionCadenaLetras(nombre);
                    break;
                case 2:
                    System.out.print("Edad: ");
                    edad = teclado.nextLine();
                    GestoraComprobar.edad(edad);
                    break;
                case 3:
                    System.out.print("Teléfono: ");
                    tlf = teclado.nextLine();
                    GestoraComprobar.tlf(tlf);
                    break;
                case 4:
                    System.out.print("Email: ");
                    email = teclado.nextLine();
                    GestoraComprobar.mail(email);
                    break;
                case 5:
                    System.out.println("¡Adiós!");
                    break;
            }
        } while (boton != 5);
    }
}
