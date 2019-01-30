import java.util.Scanner;

public class Boletin1ejerc4 {

    public static void main(String[] args) {

        int min, max, cont = 0;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese el número mínimo");
        min = teclado.nextInt();

        do {
            System.out.println("Ingrese el número máximo");
            max = teclado.nextInt();
        } while (max <= min);
        for (int i = min; i < max; i++) {

            cont++;
        }
        System.out.println("Hay " + cont + " números entero/s entre " + min + " y " + max);

    }
}
