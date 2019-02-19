import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num;
        num = teclado.nextInt();
        System.out.println(sumar(num));
    }

    private static int sumar(int num) {

        if (num == 1) {

        } else {
            num = num + sumar(num - 1);
        }
        return num;
    }
}
