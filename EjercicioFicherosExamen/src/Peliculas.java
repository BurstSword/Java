import java.io.*;
import java.util.Scanner;

public class Peliculas {
    private static File f; //Declara el objeto File
    private static Scanner teclado = new Scanner(System.in); //Declara el objeto Scanner

    public static void main(String[] args) {
        System.out.println("Bienvenido a su videoclub favorito");
        int boton; //Variable donde se almacenar� la opci�n elegida

        do {
            do { //Este bucle se repetira si el n�mero almacenado en boton no esta en el men�
                menu();
                boton = teclado.nextInt();
            } while (boton < 1 || boton > 4);

            switch (boton) {
                case 1:
                    introducirPeliYPuntuacion(); //Llama al metodo Introducir...
                    break;
                case 2:
                    mostrarPuntuaciones(); //Llama al metodo Mostrar...
                    break;
                case 3:
                    mostrarMayorPuntuacion(); //Llama al metodo MostrarMayor..
                    break;
                case 4:
                    System.out.println("�Adi�s!"); //Mensaje de despedida
                    break;
            }

        } while (boton != 4); //Si el valor de boton no es 4 el men� se ejecutar� de nuevo
    }


    private static void menu() { //M�todo encargado del men� que se mostrar� por pantalla
        System.out.println("\n1. Introducir pel�cula y puntuaci�n");
        System.out.println("2. Mostrar las pel�culas y sus puntuaciones");
        System.out.println("3. Consultar mayor puntaci�n");
        System.out.println("4. Salir");
    }

    //M�todo que nos permitir� introducir una pel�cula y su puntuaci�n
    private static void introducirPeliYPuntuacion() {
        teclado.nextLine();
        f = crearArchivo();
        FileWriter fw = null;
        BufferedWriter bw = null;
        String pelicula, puntuacion;


        System.out.println("Escriba el nombre de la pel�cula");
        pelicula = teclado.nextLine(); //Lee el nombre de la pel�cula introducida por teclado
        System.out.println("Escriba la puntuaci�n");
        puntuacion = teclado.nextLine(); //Lee la puntuaci�n de la pel�cula introducida por teclado
        try {
            fw = new FileWriter(f, true);
            bw = new BufferedWriter(fw);
            bw.write(pelicula); //Escribe el nombre de la pel�cula
            bw.newLine(); //Pasa a una nueva l�nea
            bw.write(puntuacion); //Escribe la puntuaci�n de la pel�cula
            bw.flush();
            bw.newLine();
            System.out.println("Pel�cula y puntuaci�n a�adida con �xito");
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

    //M�todo encargado de mostrar las pel�culas y su puntuaci�n
    private static void mostrarPuntuaciones() {
        f = crearArchivo();
        FileReader fr;
        BufferedReader br;

        try {
            fr = new FileReader(f);
            br = new BufferedReader(fr);
            while (br.ready()) {
                System.out.print("Pel�cula:");
                System.out.println(br.readLine());
                System.out.print("Puntuaci�n:");
                System.out.println(br.readLine());
                System.out.println("<-------------------->");
            }
        } catch (IOException e1) {
            e1.printStackTrace();
        }
    }

    //M�todo encargado de mostrar la pel�cula con mayor puntuaci�n y su puntuaci�n
    private static void mostrarMayorPuntuacion() {
        f = crearArchivo();
        FileReader fr;
        BufferedReader br;
        String pel�cula, puntuacion, pel�culatmp = "";
        float punt, puntTmp = 0;
        try {
            fr = new FileReader(f);
            br = new BufferedReader(fr);
            while (br.ready()) {
                pel�cula = br.readLine();
                puntuacion = br.readLine();
                punt = Float.parseFloat(puntuacion);

                if (punt > puntTmp) {
                    puntTmp = punt;
                    pel�culatmp = pel�cula;
                }
            }
            System.out.println("La pel�cula con mayor puntuacion es " + pel�culatmp + " con una puntuaci�n de " + puntTmp);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //M�todo encargado de inicializar el archivo
    private static File crearArchivo() {
        f = new File("peliculas.txt");
        return f;
    }
}
