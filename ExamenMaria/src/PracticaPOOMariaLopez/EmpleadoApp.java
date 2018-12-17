package PracticaPOOMariaLopez;

import java.util.Arrays;
import java.util.Scanner;

public class EmpleadoApp {

    public static void main(String[] args) {
        Empleado arrayObjetos[] = new Empleado[3];
        String nombre, apellidos;
        int edad, salario;
        Scanner teclado = new Scanner(System.in);
        Scanner tecladoStr = new Scanner(System.in);

        for (int i = 0; i < arrayObjetos.length; i++) {
            System.out.println("Introduce el nombre del empleado " + i);
            nombre = tecladoStr.nextLine();
            System.out.println("Introduce los apellidos del empleado " + i);
            apellidos = tecladoStr.nextLine();
            System.out.println("Introduce la edad del empleado " + i);
            edad = teclado.nextInt();
            System.out.println("Introduce el salario del empleado " + i);
            salario = teclado.nextInt();

            arrayObjetos[i] = new Empleado(nombre, apellidos, edad, salario);
        }

        for (int i = 0; i < arrayObjetos.length;i++) {
            System.out.println(arrayObjetos[i].toString());
        }
    }
}