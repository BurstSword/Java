import java.io.*;
import java.util.Scanner;

public class Peliculas {
    private static File f; //Declara el objeto File
    private static Scanner teclado = new Scanner(System.in); //Declara el objeto Scanner

    public static void main(String[] args) {
        System.out.println("Bienvenido a su videoclub favorito");
        int boton; //Variable donde se almacenará la opción elegida

        do {
            do { //Este bucle se repetira si el número almacenado en boton no esta en el menú
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
                    System.out.println("¡Adiós!"); //Mensaje de despedida
                    break;
            }

        } while (boton != 4); //Si el valor de boton no es 4 el menú se ejecutará de nuevo
    }


    private static void menu() { //Método encargado del menú que se mostrará por pantalla
        System.out.println("\n1. Introducir película y puntuación");
        System.out.println("2. Mostrar las películas y sus puntuaciones");
        System.out.println("3. Consultar mayor puntación");
        System.out.println("4. Salir");
    }

    //Método que nos permitirá introducir una película y su puntuación
    private static void introducirPeliYPuntuacion() {
        teclado.nextLine();
        f = crearArchivo();
        FileWriter fw = null;
        BufferedWriter bw = null;
        String pelicula, puntuacion;


        System.out.println("Escriba el nombre de la película");
        pelicula = teclado.nextLine(); //Lee el nombre de la película introducida por teclado
        System.out.println("Escriba la puntuación");
        puntuacion = teclado.nextLine(); //Lee la puntuación de la película introducida por teclado
        try {
            fw = new FileWriter(f, true);
            bw = new BufferedWriter(fw);
            bw.write(pelicula); //Escribe el nombre de la película
            bw.newLine(); //Pasa a una nueva línea
            bw.write(puntuacion); //Escribe la puntuación de la película
            bw.flush();
            bw.newLine();
            System.out.println("Película y puntuación añadida con éxito");
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

    //Método encargado de mostrar las películas y su puntuación
    private static void mostrarPuntuaciones() {
        f = crearArchivo();
        FileReader fr;
        BufferedReader br;

        try {
            fr = new FileReader(f);
            br = new BufferedReader(fr);
            while (br.ready()) {
                System.out.print("Película:");
                System.out.println(br.readLine());
                System.out.print("Puntuación:");
                System.out.println(br.readLine());
                System.out.println("<-------------------->");
            }
        } catch (IOException e1) {
            e1.printStackTrace();
        }
    }

    //Método encargado de mostrar la película con mayor puntuación y su puntuación
    private static void mostrarMayorPuntuacion() {
        f = crearArchivo();
        FileReader fr;
        BufferedReader br;
        String película, puntuacion, películatmp = "";
        float punt, puntTmp = 0;
        try {
            fr = new FileReader(f);
            br = new BufferedReader(fr);
            while (br.ready()) {
                película = br.readLine();
                puntuacion = br.readLine();
                punt = Float.parseFloat(puntuacion);

                if (punt > puntTmp) {
                    puntTmp = punt;
                    películatmp = película;
                }
            }
            System.out.println("La película con mayor puntuacion es " + películatmp + " con una puntuación de " + puntTmp);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //Método encargado de inicializar el archivo
    private static File crearArchivo() {
        f = new File("peliculas.txt");
        return f;
    }
}
