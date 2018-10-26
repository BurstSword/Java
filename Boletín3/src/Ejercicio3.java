import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {     /* Declaramos ambas arrays tanto del curso1 como del curso2
                                                    siendo ambas de dimensión 5, y las variables de las medias
                                                    de ambos curso */
        int[] curso1 = new int[5];
        int[] curso2 = new int[5];
        Scanner teclado = new Scanner(System.in);
        int media1 = 0;
        int media2 = 0;



        for (int i = 0; i < curso1.length; i++) {            //Hacemos un bucle para darle datos al array del curso 1//
            System.out.println("Ingrese la nota del alumno del curso 1");
            curso1[i] = teclado.nextInt();
            media1 = media1 + curso1[i];
        }
        media1 = media1 / curso1.length;                    /* Calculamos la media, que es los números ingresados entre
                                                                                   la dimensión del array */
        System.out.println("La media de la clase 1 es : " + media1 + "");
        System.out.println("La nota de los alumnos es : ");
        for (int i = 0; i < 5; i++) {                   //Mostramos las notas del curso 1//
            System.out.println(curso1[i]);

        }

        for (int j = 0; j < curso2.length; j++) {             //Hacemos un bucle para darle datos al array del curso 2//
            System.out.println("Ingrese la nota del alumno del curso 2");
            curso2[j] = teclado.nextInt();
            media2 = media2 + curso2[j];
        }
        media2 = media2 / curso2.length;                     /* Calculamos la media, que es los números ingresados entre
                                                                                   la dimensión del array */
        System.out.println("La media de la clase 2 es " + media2 + "");
        System.out.println("La nota de los alumnos es :");          //Mostramos las notas del curso 1//
        for (int j = 0; j < 5; j++) {
            System.out.println(curso2[j]);

        }
    }
}
