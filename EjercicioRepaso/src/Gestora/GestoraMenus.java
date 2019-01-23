package Gestora;

public class GestoraMenus {
    public static void loginMenu(){
        System.out.println("\n Welcome to my database, please choose one of the options below");
        System.out.println("1. Sign in");
        System.out.println("2. Log in");
        System.out.println("3. Log in as an admin (ONLY IF U ARE AN ADMIN)");
        System.out.println("4. Unregister");
        System.out.println("5. Close");

    }

    public static void userMenu(String nombreUsuario){
        System.out.printf("Welcome %s","nombreUsuario");
        System.out.println("1. Show all registry");
        System.out.println("2. Show me an specific registry");
        System.out.println("3. Show me a random registry");
        System.out.println("4. Logout");
    }

    public static void adminMenu(String nombreUsuario){
        System.out.printf("Welcome %s","nombreUsuario");
        System.out.println("1. Show all registry");
        System.out.println("2. Show me an specific registry");
        System.out.println("3. Show me a random registry");
        System.out.println("4. Add a new registry");
        System.out.println("5. Remove an existing registry");
        System.out.println("6. Make someone an admin");
        System.out.println("7. Logout");
    }
}
