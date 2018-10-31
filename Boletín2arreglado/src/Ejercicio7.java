import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int day, month;

        System.out.println("Ingrese el día");
        day = teclado.nextInt();
        System.out.println("Ingrese el mes");
        month = teclado.nextInt();

        System.out.print("Has nacido el " + day + "/" + month + ", así que eres: ");
        if ((month == 1 && day <= 20) || (month = 12 && day >= 22)) {
            System.out.print("Capricornio");
        } else if ((month == 1 && day >= 21) || (month == 2 && day <= 19)) {
            System.out.print("Acuario");
        } else if ((month == 2 && day >= 20) || (month == 3 && day <= 20)) {
            System.out.print("Piscis");
        } else if ((month == 3 && day >= 21) || (month == 4 && day <= 19)) {
            System.out.print("Aries");
        } else if ((month == 4 && day >= 20) || (month == 5 && day <= 20)) {
            System.out.print("Tauro");
        } else if ((month == 5 && day >= 21) || (month == 6 && day <= 21)) {
            System.out.print("Géminis");
        } else if ((month == 6 && day >= 22) || (month == 7 && day <= 23)) {
            System.out.print("Cáncer");
        } else if ((month == 7 && day >= 24) || (month == 8 && day <= 23)) {
            System.out.print("Leo");
        } else if ((month == 8 && day >= 24) || (month == 9 && day <= 22)) {
            System.out.print("Virgo");
        } else if ((month == 9 && day >= 23) || (month == 10 && day <= 22)) {
            System.out.print("Libra");
        } else if ((month == 10 && day >= 23) || (month == 11 && day <= 22)) {
            System.out.print("Escorpio");
        } else if ((month == 11 && day >= 23) || (month == 12 && day <= 20)) {
            System.out.print("Sagitario");
        }
    }
}

