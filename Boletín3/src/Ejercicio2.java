import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {           /*Declaramos el array que en este
                                                            caso es de dimensión 5 */
        int num[] = new int[5];
        Scanner teclado = new Scanner(System.in);

        for (int i = 0; i < num.length; i++) {          //Hacemos un bucle para darle datos al array//
            System.out.println("Ingrese un número");
            num[i] = teclado.nextInt();

        }
        /* Comparamos los números ingresados a ver si están ordenados de menor a mayor y para ello utilizamos un if
        y en caso de que no esté ordenados utilizamos el "else" para mostrar el mensaje de que no están ordenados
         */


        if (num[0] < num[1] && num[1] < num[2] && num[2] < num[3] && num[3] < num[4]) {
            System.out.println("Los números están ordenados de menor a mayor ");
        } else {
            System.out.println("Los números no están ordenados de menor a mayor");
        }
    }
}

