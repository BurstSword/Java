import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] orden = new int[3];
        int menor, mayor;



        System.out.println("Ingrese 3 números y los ordenadoremos de menor a mayor y de mayor a menor");
        for (int i = 0; i < orden.length; i++) {
            orden[i] = teclado.nextInt();
        }

            if (orden[0] > orden[1]) {
                menor = orden[0];
                orden[0] = orden[1];
                orden[1] = menor;
            }

            if (orden[1] > orden[2]) {

                menor = orden[1];
                orden[1] = orden[2];
                orden[2] = menor;
            }

            if (orden[0] > orden[1]) {
                menor = orden[0];
                orden[0] = orden[1];
                orden[1] = menor;
            }

        System.out.println("los números ordenados de menor a mayor son: " + orden[0] + " " + orden[1] + " y " + orden[2]);

            if (orden[0] < orden[1]) {
                mayor = orden[0];
                orden[0] = orden[1];
                orden[1] = mayor;
            }

            if (orden[1] < orden[2]) {

                mayor = orden[1];
                orden[1] = orden[2];
                orden[2] = mayor;
            }

            if (orden[0] < orden[1]) {
                mayor = orden[0];
                orden[0] = orden[1];
                orden[1] = mayor;
            }

        System.out.println("los números ordenados de mayor a menor son: " + orden[0] + " " + orden[1] + " y " + orden[2]);
    }
}
