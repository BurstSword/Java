import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) { /*Declaramos las variables del array, el número de la dimensión del array
                                             y la variable suma, dónde almacenaremos la suma de los valores del array*/
        int[] elementos;
        int n, suma = 0;
        Scanner teclado = new Scanner(System.in);


        System.out.println("Ingrese la cantidad de números que quiera ingresar e ingrese los números y se hará la suma " +
                "de todos los elementos");
        n = teclado.nextInt();                      //declaramos cuántos números queremos en el array//
        elementos = new int[n];

                                                //Hacemos un bucle para darle datos al array//
        for (int i = 0; i < elementos.length; i++) {
            System.out.println("Ingrese un número");
            elementos[i] = teclado.nextInt();
            suma = suma + elementos[i];       //igualamos la variable suma a la suma de todos los elementos dell array//
        }
        System.out.println("La suma de todos los números es :" + suma);
    }
}
