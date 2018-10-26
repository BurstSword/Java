import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {        /*Declaramos el Scanner y los 5 números a ingresar, y media que es
                                                        dónde almacenaremos la media*/
        Scanner teclado = new Scanner(System.in);
        int n1, n2, n3, n4, n5;
        double media;

        //Ingresamos los 5 números//
        System.out.println("Ingrese 5 números enteros");
        n1 = teclado.nextInt();
        n2 = teclado.nextInt();
        n3 = teclado.nextInt();
        n4 = teclado.nextInt();
        n5 = teclado.nextInt();

        media = (n1 + n2 + n3 + n4 + n5) / 5.0;

        System.out.println("Los números mayores a la media " + media + " son:");
        if (n1 > media) {
            System.out.println(n1);
        }
        if (n2 > media) {
            System.out.println(n2);
        }
        if (n3 > media) {
            System.out.println(n3);
        }
        if (n4 > media) {
            System.out.println(n4);
        }
        if (n5 > media) {
            System.out.println(n5);
        }
    }
}

