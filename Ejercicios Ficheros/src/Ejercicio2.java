import java.io.*;


public class Ejercicio2 {
    public static void main(String[] args) {
        int leerCaracteres;
        File file = null;
        FileReader fr = null;
        BufferedReader br = null;
        try {
            file = new File("C:\\Users\\cloud\\Desktop\\Java\\Ejercicios Ficheros\\src\\Ejercicio2.txt");
            fr = new FileReader(file);
            br = new BufferedReader(fr);
            leerCaracteres = br.read();
            while (leerCaracteres != -1) {
                System.out.print((char) leerCaracteres);
                leerCaracteres = br.read();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                br.close();
                fr.close();
            } catch (IOException | NullPointerException e) {
                e.printStackTrace();
            }

        }
    }
}
