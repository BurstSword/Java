package Ejercicio1;

import java.io.*;
import java.util.Scanner;

public class Taller {

    //Método main en el que tenemos el menú y dónde haremos las llamadas a los distintos métodos//

    public static void main(String[] args) {
        //Variables//
        Scanner teclado = new Scanner(System.in);
        int btn;

        System.out.println("Bienvenido a tu tienda de juegos favorita");

        /*Aquí validamos que introduzca un número dentro del menú y que el menú se repite tantas veces como el usuario
        quiera hasta que pulse la opción de salir
         */

        do {
            do {
                Menu();
                btn = teclado.nextInt();

            } while (btn < 1 || btn > 4);

            switch (btn) {
                case 1:
                    IntroducirMatriculaYCoste();
                    break;

                case 2:
                    MostrarMatriculas();
                    break;
                case 3:

                    break;
            }

        } while (btn != 4);
        System.out.println("Adiós!");
    }

    //Método que nos muestra el menú principal del programa
    public static void Menu() {
        System.out.println("Pulse el número correspondiente a la acción que quiera realizar");
        System.out.println("1. Introducir matrícula y coste de reparación");
        System.out.println("2. Mostrar todas las matrículas que se han reparado en el día actual");
        System.out.println("3. Mostrar la matrícula del coche con el que se ha obtenido mayor beneficio");
        System.out.println("4. Salir");
    }

    //Método que nos permite introducir en un fichero la matrícula y el coste de reparación del vehículo
    public static void IntroducirMatriculaYCoste() {
        //Variables y Scanners
        Scanner tecladoStr = new Scanner(System.in);
        Scanner teclado = new Scanner(System.in);
        String matricula;
        int coste;

        System.out.println("Introduzca la matrícula completa en este formato XXXXCCC X siendo número y C letra");
        matricula = tecladoStr.nextLine();
        System.out.println("Introduzca el coste");
        coste = teclado.nextInt();

        //Declaramos el archivo y el FileWrite y el BufferedWriter, que nos permitirán escribir en el fichero
        File file = new File("Facturas.txt");
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(file, true);
            bw = new BufferedWriter(fw);
            bw.newLine();
            bw.write(matricula + "/" + coste);
            bw.flush();

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    //Método que nos permite mostrar las matrículas existentes en el fichero
    public static void MostrarMatriculas() {

//Declaramos el File y el FileReader y BufferedReader, que nos permitirán hacer una lectura del fichero del programa
        File file = new File("Facturas.txt");
        FileReader fr = null;
        BufferedReader br = null;
        try {
            fr = new FileReader(file);
            br = new BufferedReader(fr);
            while (br.ready()) {
                System.out.println(br.readLine());
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                br.close();
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
