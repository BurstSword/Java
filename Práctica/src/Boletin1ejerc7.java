import java.util.Scanner;

public class Boletin1ejerc7 {
    public static void main(String[] args) {
        int n1, n2, n3;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Vamos a calcular si la suma de los dos primeros números es igual al tercer número." +
                " Ingrese el primero número");
        n1 = teclado.nextInt();
        System.out.println("Ingrese el segundo número");
        n2 = teclado.nextInt();
        System.out.println("Ingrese el tercer número");
        n3 = teclado.nextInt();

        if (n1 + n2 == n3) {
            System.out.println("Iguales");

        } else {
            System.out.println("Distintos");
        }


    }


}

