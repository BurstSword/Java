import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {        /*Declaramos las variables del array y las de menor y mayor, dónde
                                                      almacenaremos los datos de las variables para ordenarlas
                                                      */
        Scanner teclado = new Scanner(System.in);
        int[] orden = new int[3];
        int aux;


        System.out.println("Ingrese 3 números y los ordenadoremos de menor a mayor");
        for (int i = 0; i < orden.length; i++) {    //Recorremos el array para cargar los datos en ella//
            orden[i] = teclado.nextInt();
        }

        for (int k = 0; k < (orden.length - 1); k++) { /* Creamos dos bucles for para comparar los números del array y
                                                            ordenarlos de menor a mayor*/
            for (int j = k + 1; j < orden.length; j++) {
                if (orden[k] > orden[j]) {
                    aux = orden[k];
                    orden[k] = orden[j];
                    orden[j] = aux;
                }
            }
        }
        System.out.println("Los números ordenados de menor a mayor son: " + " " + orden[0] + ", " + orden[1] +
                " y " + orden[2]);
    }
}