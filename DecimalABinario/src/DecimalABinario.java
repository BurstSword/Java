import java.util.Scanner;

public class DecimalABinario {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número en el sistema decimal positivo");
        int numero = scanner.nextInt();
        StringBuilder binario = new StringBuilder();
        if (numero > 0) {
            while (numero > 0) {
                if (numero % 2 == 0) {
                    binario.insert(0, "0");
                } else {
                    binario.insert(0, "1");
                }
                numero = numero / 2;
            }
        } else if (numero == 0) {
            binario = new StringBuilder("0");
        } else {
            binario = new StringBuilder("No se pudo convertir el numero, ingrese solo números positivos");
        }
        System.out.println("El número convertido a binario es: " + binario);
    }
}