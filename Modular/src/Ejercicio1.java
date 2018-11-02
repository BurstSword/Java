import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        int n;
        Scanner teclado = new Scanner(System.in);
        Ejercicio1 p = new Ejercicio1();

        System.out.println("Ingrese un número y lo multiplicaremos por 2");
        n = teclado.nextInt();
        p.multiplicar2(n);
        p.multiplicar();
    }

    void multiplicar() {
        Scanner teclado1 = new Scanner(System.in);
        System.out.println("Ingrese un número y lo multiplicaremos por 2");
        int num = teclado1.nextInt();
        System.out.println(num * 2);

    }

    void multiplicar2(int nRec) {
        System.out.println(nRec * 2);

    }

}
