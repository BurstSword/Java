import java.io.*;

public class Ejercicio4 {
    public static void main(String[] args) {
        File file = null;
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            file = new File("C:\\Users\\cloud\\Desktop\\Java\\Ejercicios Ficheros\\src\\Ejercicio4.txt");
            if(!file.exists()){
                System.out.println("El archivo no existía antes de escribir");
            }else{
                System.out.println("El archivo existía antes de escribir");
            }
            fw = new FileWriter(file);
            bw = new BufferedWriter(fw);
            bw.write("Hola Mundo");
            bw.flush();
        } catch (IOException e) {
            e.getMessage();
        }finally {
            try {
                bw.close();
                fw.close();
            } catch (IOException |NullPointerException e) {
                e.printStackTrace();
            }

        }
    }
}
