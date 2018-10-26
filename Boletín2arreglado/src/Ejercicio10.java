import java.util.Scanner;
import java.lang.Math;          //Importamos la librería Math de Java para poder hacer la raíz cuadrada//
public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double n;

        do {                       //Validamos que el dato sea mayor que 0 para que la raíz no de negativo
            System.out.println("Ingrese un número mayor que 0 y haremos la raíz cuadrada");
            n = teclado.nextDouble();

        }while (n<0);
        //Realizamos la raíz cuadrada con la librería importada//
        System.out.println("La raíz cuadrada de " + n + " es: " + Math.sqrt(n));
    }
}
