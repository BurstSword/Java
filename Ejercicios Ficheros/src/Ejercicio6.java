import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String cadena;
        File file = null;
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            file = new File("C:\\Users\\Usuario\\Desktop\\Java\\Ejercicios Ficheros\\src\\Ejercicio6.txt");
            fw = new FileWriter(file, true);
            bw = new BufferedWriter(fw);
            System.out.println("Escriba");
            cadena = teclado.nextLine();
            bw.write(cadena);
            bw.newLine();
            bw.flush();
        } catch (IOException e) {
            e.getMessage();
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (IOException | NullPointerException e) {
                e.printStackTrace();
            }

        }
    }
}
