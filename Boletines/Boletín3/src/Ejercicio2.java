import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {           /*Declaramos el array que en este
                                                            caso es de dimensión 5 */
        int num[] = new int[5];
        Scanner teclado = new Scanner(System.in);
        int ordenar;
        ordenar=0;
        for (int i = 0; i < num.length; i++) {          //Hacemos un bucle para darle datos al array//
            System.out.println("Ingrese un número");
            num[i] = teclado.nextInt();

        }
            /* Comparamos los números ingresados a ver si están ordenados de menor a mayor y para ello utilizamos un if
            y en caso de que no esté ordenados utilizamos el "else" para mostrar el mensaje de que no están ordenados
            */


        for (int k = 0; k < (num.length-1); k++) {
            if ((num [k]) > (num [k+1])) {
                ordenar = 1;
            }
        }
        if (ordenar == 0) {
            System.out.println("Están ordenados de menor a mayor");
        }else{
            System.out.println("No están ordenados");
        }

    }
}


