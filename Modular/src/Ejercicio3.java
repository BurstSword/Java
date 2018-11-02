import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Ejercicio3 ej = new Ejercicio3();
        int num;
        String comprobacion;

        num = ej.recibNum();
        comprobacion = ej.comprob(num);
        System.out.println(comprobacion);
    }

    int recibNum() {
        int num1;
        System.out.println("Ingrese un número por teclado");
        Scanner teclado = new Scanner(System.in);
        num1 = teclado.nextInt();
        return num1;
    }

    String comprob(int num1) {
        String comprobacion;
        if (num1 > 0) {
            comprobacion = "Es positivo";
        } else if (num1 < 0) {
            comprobacion = "Es negativo";
        } else {
            comprobacion = "Es 0";
        }
        return comprobacion ;
    }
}
