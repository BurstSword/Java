import java.io.*;
import java.util.Scanner;
import java.io.File;

public class Hhhh {

    public static void main(String[] args) {
        File file = new File("C://fichero1.txt");
        try (BufferedReader br = new BufferedReader(new FileReader("C:\\fichero1.txt"));
             BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\fichero1.txt"))) {
            escribeFichero(bw);
            //Guardamos los cambios del fichero
            bw.flush();
            leeFichero(br);
        } catch (IOException e) {
            System.out.println("Error E/S: " + e);
        }
    }

    public static void escribeFichero(BufferedWriter bw) throws IOException {
        Scanner teclado = new Scanner(System.in);
        String cadena;
        cadena=teclado.nextLine();
        //Escribimos en el fichero
        bw.write(cadena);
        bw.newLine();
        bw.write("Seguimos usando Buffered");
    }

    public static void leeFichero(BufferedReader br) throws IOException {
        //Leemos el fichero y lo mostramos por pantalla
        String linea = br.readLine();
        while (linea != null) {
            System.out.println(linea);
            linea = br.readLine();
        }
    }
}