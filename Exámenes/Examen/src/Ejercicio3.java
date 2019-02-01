import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {    /*Declaramos las variables de los dos números con los que operar
                                                    dónde almacenaremos el producto y la división y lo que hara
                                                    la función de botón en el "menú" del switch , y el teclado
                                                    para introducir los números*/
        double num1, num2, producto, division;
        int boton;
        Scanner teclado = new Scanner(System.in);

        do {        /*Con este do podemos hacer que la calculadora se repita tantas veces como el usuario quiera
                    hasta que el usuario pulse el 5, entonces el programa se termina*/
            System.out.println("Ingrese dos números con los que operar");

            num1 = teclado.nextDouble();
            num2 = teclado.nextDouble();
            //Mostramos el menú al usuario, para que sepa que operación hace cada número//
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.println("Pulse del 1 al 4 para realizar una operación u otra y 5 para salir");
            //El usuario introduce por teclado que operación quiere realizar//
            boton = teclado.nextInt();


            switch (boton) {
                case 1: /*En el case 1 hacemos una llamada al método realizarSuma, que realizará la resta de los
                                     números ingresados anteriormente*/
                    Ejercicio3.realizarSuma(num1, num2);
                    break;

                case 2:
                    /*En el case 2 hacemos una llamada al método realizarResta, que realizará la resta de los
                                     números ingresados anteriormente*/
                    Ejercicio3.realizarResta(num1, num2);
                    break;

                case 3:
                    /*En el case 3 hacemos una llamada al método realizarProducto, que realizará el producto de los
                                     números ingresados anteriormente y nos devolverá el resultado para
                                      pasarlo por parámetro al método mostrarResultadoProducto*/
                    producto = Ejercicio3.realizarProducto(num1, num2);
                    Ejercicio3.mostrarResultadoProducto(num1, num2, producto);
                    break;

                case 4:
                    /*En el case 4 hacemos una llamada al método realizarDivision, que realizará la división de los
                                     números ingresados anteriormente y nos devolverá el resultado para
                                      pasarlo por parámetro al método mostrarResultadoDivision*/
                    division = Ejercicio3.realizarDivision(num1, num2);
                    Ejercicio3.mostrarResultadoDivision(num1, num2, division);
                    break;
            }
        } while (boton != 5);

    }

    public static void realizarSuma(double num1, double num2) { /*En este método tomamos por parámetros
                                    los números ingresados y mostramos el resultado de la suma*/
        double suma;

        suma = num1 + num2;

        System.out.println("El resultado de la suma es " + suma);
    }

    public static void realizarResta(double num1, double num2) {/*En este método tomamos por parámetros
                                    los números ingresados y mostramos el resultado de la resta*/
        double resta;

        resta = num1 - num2;

        System.out.println("El resultado de la resta es " + resta);
    }

    public static double realizarProducto(double num1, double num2) {/*En este método tomamos por parámetros
                                    los números ingresados y devolvemos el resultado del producto al método main*/
        double producto;

        producto = num1 * num2;

        return producto;

    }

    public static double realizarDivision(double num1, double num2) {/*En este método tomamos por parámetros
                                    los números ingresados y devolvemos el resultado de la división al método main*/
        double division;

        division = num1 / num2;

        return division;
    }

    public static void mostrarResultadoProducto(double num1, double num2, double producto) { /*Tomamos por parámetros
    los números ingresados y el resultado del producto, y lo mostramos en un Syso*/
        System.out.println("El resultado del producto de " + num1 + " y " + num2 + " es " + producto);

    }

    public static void mostrarResultadoDivision(double num1, double num2, double division) {/*Tomamos por parámetros
    los números ingresados y el resultado de la división, y lo mostramos en un Syso*/
        System.out.println("El resultado de la división de " + num1 + " y " + num2 + " es " + division);

    }

}
