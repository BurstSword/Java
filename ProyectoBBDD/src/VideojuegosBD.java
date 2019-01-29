
import Gestora.*;

import java.util.Scanner;
/*
Clase main de la aplicación dónde se llamará a los distintos métodos de las clases gestoras para funcionar
 */

public class VideojuegosBD {
    public static void main(String[] args) {
        int btnLogin, btnNoAdmin, btnAdmin;
        String prueba = "";
        Scanner keyboard = new Scanner(System.in);


        do {
            do {
                GestoraMenus.loginMenu();
                btnLogin = keyboard.nextInt();
            } while (btnLogin < 1 || btnLogin > 3);

            switch (btnLogin) {
                case 1:
                    GestoraInfo.usuario = GestoraRegister.Register();

                    break;
                case 2:
                    GestoraInfo.usuario = GestoraLogin.Login();

                    break;
                case 3:
                    System.out.println("Goodbye, my almost friend");
                    break;
            }

        } while (btnLogin != 3 && GestoraInfo.usuario == null);


        if (GestoraInfo.usuario != null && !GestoraInfo.usuario.isAdmin()) {
            do {
                do {
                    GestoraMenus.userMenu(prueba);
                    btnNoAdmin = keyboard.nextInt();
                } while (btnNoAdmin < 1 || btnNoAdmin > 4);

                switch (btnNoAdmin) {
                    case 1:

                        GestoraConsultas.SelectAll();
                        break;

                    case 2:
                        GestoraUnregister.Unregister();
                        break;
                    case 3:

                        System.out.println("Goodbye, my friend");
                        break;
                }
            } while (btnNoAdmin != 3);
        }

        if (GestoraInfo.usuario != null && GestoraInfo.usuario.isAdmin()) {
            do {
                do {
                    GestoraMenus.adminMenu(prueba);
                    btnAdmin = keyboard.nextInt();
                } while (btnAdmin < 1 || btnAdmin > 7);
                switch (btnAdmin) {
                    case 1:

                        GestoraConsultas.SelectAll();
                        break;

                    case 2:

                        GestoraConsultas.Insert();
                        break;

                    case 3:
                        GestoraConsultas.Delete();
                        break;

                    case 4:
                        System.out.println("Goodbye, my admin friend");
                        break;
                }

            } while (btnAdmin != 4);
        }

    }
}

