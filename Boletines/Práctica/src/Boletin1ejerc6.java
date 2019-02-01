import java.util.Scanner;

public class Boletin1ejerc6 {

    public static void main(String[] args) {

        int n1, n2 = 0;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Vamos a calcular el salario semamal de los empleados");


        do {
            System.out.println("Ingrese el número de horas trabajadas");
            n1 = teclado.nextInt();
            if (n1 < 0) {
                System.out.println("Debe haber trabajado mínimo 1 hora");
            }

        } while (n1 < 0);
        if (n1 > 40) {
            n2 = n1 - 40;
            n1 = 40;
            if (n2 == 1) {
                System.out.println("Ha realizado una hora extra");
            } else {
                System.out.println("Ha realizado " + n2 + " horas extras");
            }
        }
        System.out.println("Su salario semanal es de " + ((n1 * 8) + (n2 * 16)));
    }
}
