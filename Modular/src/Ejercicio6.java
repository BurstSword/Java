import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Ejercicio6 ej = new Ejercicio6();
        int num;
        String comprobacion;

        num = ej.leerEntero();
        comprobacion = ej.comprobarMayorque10(num);
        System.out.println(comprobacion);
    }

    int leerEntero() {
        int num1;

        System.out.println("Ingrese un número y veremos si es positivo, negativo o 0");
        Scanner teclado = new Scanner(System.in);
        num1 = teclado.nextInt();
        return num1;
    }

    String comprobarMayorque10(int num1) {
        String comprobacion;

        if (num1 > 10 && num1 > 5) {
            comprobacion = "Mayor que 5";
        } else
            comprobacion = "Es menor que 5";
        {
            return comprobacion;
        }
    }
}
