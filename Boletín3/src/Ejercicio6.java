import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {        /*Declaramos las variables del array y las de menor y mayor, dónde
                                                      almacenaremos los datos de las variables para ordenarlas
                                                      */
        Scanner teclado = new Scanner(System.in);
        int[] orden = new int[3];
        int menor, mayor;


        System.out.println("Ingrese 3 números y los ordenadoremos de menor a mayor y de mayor a menor");
        for (int i = 0; i < orden.length; i++) {
            orden[i] = teclado.nextInt();
        }
                                        /*Vamos intercambiado el valor de las variables para ir ordenándolos en el orden
                                        indicado, en este caso de menor a mayor
                                         */
        if (orden[0] > orden[1]) {
            menor = orden[0];
            orden[0] = orden[1];
            orden[1] = menor;
        }

        if (orden[1] > orden[2]) {
            menor = orden[1];
            orden[1] = orden[2];
            orden[2] = menor;
        }

        if (orden[0] > orden[1]) {
            menor = orden[0];
            orden[0] = orden[1];
            orden[1] = menor;
        }

        System.out.println("los números ordenados de menor a mayor son: " + orden[0] + " " + orden[1] + " y " + orden[2]);
                                        /*Vamos intercambiado el valor de las variables para ir ordenándolos en el orden
                                        indicado, en este caso de mayor a menor*/

        if (orden[0] < orden[1]) {
            mayor = orden[0];
            orden[0] = orden[1];
            orden[1] = mayor;
        }

        if (orden[1] < orden[2]) {

            mayor = orden[1];
            orden[1] = orden[2];
            orden[2] = mayor;
        }

        if (orden[0] < orden[1]) {
            mayor = orden[0];
            orden[0] = orden[1];
            orden[1] = mayor;
        }

        System.out.println("los números ordenados de mayor a menor son: " + orden[0] + " " + orden[1] + " y " + orden[2]);
    }
}
