import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {   /* Declaramos el número a ingresa para determinar la dimensión del array
                                                 , el nombre del array y la variable min que es dónde almacenaremos
                                                 el valor mínimo del array */
        int n;
        int[] menor;
        int min;


        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de números que quiera ingresar  e ingrese los números y se buscará el" +
                " menor de todos");
        n = teclado.nextInt();
        menor = new int[n];
        //Hacemos un bucle para darle datos al array//
        for (int i = 0; i < menor.length; i++) {
            System.out.println("Ingrese un número");
            menor[i] = teclado.nextInt();


        }
        min = menor[0];                         /*Le damos a la variable min el primer valor del array, para que vaya
                                                 comparando con los demás valores ingresados mediante el "for"*/
        for (int j = 0; j < menor.length; j++) {
            if (menor[j] < min) {
                min = menor[j];
            }
        }
        System.out.println("El número menor es :" + min);
    }
}



