import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);       /* Declaramos el Scanner y la variable dónde almacenaremos los
                                                            números y dónde iremos ordenandolos con la variable auxiliar
                                                            "mayor"*/
        int mayor;
        int num1, num2, num3;
        System.out.println("Ingrese 3 números ");

        //Ingresamos por teclado los números a ordenar//
         num1 = teclado.nextInt();
         num2 = teclado.nextInt();
         num3 = teclado.nextInt();


         //Mediante la variable mayor vamos ordenando los números para obtener el resultado al final//
        if (num1 > num2) {
            mayor = num1;
            num1 = num2;
            num2 = mayor;
        }

        if (num2 > num3) {
            mayor = num2;
            num2 = num3;
            num3 = mayor;
        }

        if (num1 > num2) {
            mayor = num1;
            num1 = num2;
            num2 = mayor;
        }

        System.out.println("los números ordenados son " + num1 + " " + num2 + " y " + num3);
    }
}
