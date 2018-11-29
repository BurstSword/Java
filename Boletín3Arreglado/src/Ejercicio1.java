import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {            /*Declaramos las variables de la media, y el array que en este
                                                            caso es de dimensión 5 */
        int[] numeros = new int[5];
        int media = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Vamos a ver que números son mayores que la media");
        for (int i = 0; i < numeros.length; i++) {      //Hacemos un bucle para darle datos al array//
            System.out.println("Ingrese un número");
            numeros[i] = teclado.nextInt();
            media = media + numeros[i];
        }
        media = media / numeros.length;                          /* Calculamos la media, que es los números ingresados entre
                                                        la dimensión del array */
        for (int j = 0; j < 5; j++) {                   //Con este bucle comprobamos que números son mayores a la media
            if (numeros[j] > media) {
                System.out.println(numeros[j] + " es mayor que la media");
            }
        }


    }


}
