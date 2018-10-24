import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        int[] curso1 = new int[5];
        int[] curso2 = new int[5];
        Scanner teclado = new Scanner(System.in);
        int media1 = 0;
        int media2 = 0;


        for (int i = 0; i < curso1.length; i++) {
            System.out.println("Ingrese la nota del alumno del curso 1");
            curso1[i] = teclado.nextInt();
            media1 = media1 + curso1[i];
        }
        media1 = media1 / 5;
        System.out.println("La media de la clase 1 es : " + media1 + "");
        System.out.println("La nota de los alumnos es : ");
        for (int i = 0; i < 5; i++) {
            System.out.println(curso1[i]);

        }

        for (int j = 0; j < curso2.length; j++) {
            System.out.println("Ingrese la nota del alumno del curso 2");
            curso2[j] = teclado.nextInt();
            media2 = media2 + curso2[j];
        }
        media2 = media2 / 5;
        System.out.println("La media de la clase 2 es " + media2 + "");
        System.out.println("La nota de los alumnos es :");
        for (int j = 0; j < 5; j++) {
            System.out.println(curso2[j]);

        }
    }
}
