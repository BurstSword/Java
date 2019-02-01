import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n;


        do {
            System.out.println("Ingrese un número de mes del 1 al 12");

            n = teclado.nextInt();

        } while (n < 1 || n > 12);

        /*switch (n) {   //Forma Larga
            case 1:
                System.out.println("Enero tiene 31 días");
                break;
            case 2:
                System.out.println("Febrero tiene 28 días");
                break;
            case 3:
                System.out.println("Marzo tiene 31 días");
                break;
            case 4:
                System.out.println("Abril tiene 30 días");
                break;
            case 5:
                System.out.println("Mayo tiene 31 días");
                break;
            case 6:
                System.out.println("Junio tiene 30 días");
                break;
            case 7:
                System.out.println("Julio tiene 31 días");
                break;
            case 8:
                System.out.println("Agosto tiene 31 días");
                break;
            case 9:
                System.out.println("Septiembre tiene 30 días");
                break;
            case 10:
                System.out.println("Octubre tiene 31 días");
                break;
            case 11:
                System.out.println("Noviembre tiene 30 días");
                break;
            case 12:
                System.out.println("Diciembre tiene 31 días");
                break;

        }
        */

        switch (n) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                System.out.println("Tiene 31 días");
                break;
            case 2:
                System.out.println("Tiene 28 días y si el año es bisiesto tiene 29");
                break;
            case 4: case 6: case 9: case 11:
                System.out.println("Tiene 30 días");
                break;
        }

    }
}
