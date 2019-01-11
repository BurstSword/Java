import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio3 {
    public static void main(String[] args) {

        File file = null;
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            file = new File("C:\\Users\\cloud\\Desktop\\Java\\Ejercicios Ficheros\\src\\Ejercicio3.txt");
            fw = new FileWriter(file);
            bw = new BufferedWriter(fw);
            bw.write("Hola Mundo");
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
