package Gestora;
/*
Clase gestora encargada de los menús de la aplicación
 */
public class GestoraMenus {
    //Método que muestra el menú de loggeo y registro
    public static void loginMenu() {
        System.out.println("\nWelcome to my database, please choose one of the options below");
        System.out.println("1. Sign in");
        System.out.println("2. Log in");
        System.out.println("3. Close");

    }
    //Método que muestra el menú de no administradors
    public static void userMenu(String nombreUsuario) {
        System.out.println("\nWelcome " + nombreUsuario);
        System.out.println("1. Show all entries");
        System.out.println("2. Unregister");
        System.out.println("3. Logout");
    }
    //Método que muestra el menú de administradores
    public static void adminMenu(String nombreUsuario) {
        System.out.println("\nWelcome " + nombreUsuario);
        System.out.println("1. Show all entry");
        System.out.println("2. Add a new entry");
        System.out.println("3. Remove an existing entry");
        System.out.println("4. Logout");
    }
}
