import Gestora.GestoraMenus;

import java.util.Scanner;


public class EjercicioRepaso2 {
    public static void main(String[] args) {
        int button;

        Scanner keyboard = new Scanner(System.in);
        do {
            do {
                GestoraMenus.loginMenu();
                button = keyboard.nextInt();
            } while (button < 1 || button > 5);

            switch (button) {
                case 1:

                    //Registro
                    break;
                case 2:

                    //Loggearse
                    break;
                case 3:

                    //Loggearse como admin
                    break;

                case 4:

                    //
                    break;
            }

        } while (button != 5);

        //UNA VEZ LOGGEADA COMPRUEBA SI ERES ADMIN O NO Y MUESTRA UN MENU U OTRO

        do {
            do {
                GestoraMenus.userMenu();
                button = keyboard.nextInt();
            } while (button < 1 || button > 4);

            switch (button) {
                case 1:

                    //Registro
                    break;
                case 2:

                    //Loggearse
                    break;
                case 3:

                    //Loggearse como admin
                    break;

                case 4:

                    //
                    break;
            }
        } while (button != 4);

        do {
            do {
                GestoraMenus.adminMenu();
                button = keyboard.nextInt();
            } while (button < 1 || button > 7);

            //EN CONSTRUCCIÓN
        } while (button != 4);
    }
}
