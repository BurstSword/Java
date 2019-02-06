import java.util.ArrayList;
import java.util.Scanner;


public class Ejercicio1 {
    public static void main(String[] args) {
        String[] matriculas = new String[2];
        ArrayList<String> listaMatriculas = new ArrayList<>();

        Scanner teclado = new Scanner(System.in);
        String matricula;
        for (int i = 0; i < matriculas.length; i++) {
            System.out.print("Introduzca la matrícula: ");
            matricula = teclado.nextLine();
            matriculas[i] = matricula;
            listaMatriculas.add(matricula);
        }

        for (int j = 0; j < matriculas.length; j++) {
            System.out.println("Matrícula Nº" + j + ": " + matriculas[j]);
            System.out.println("Matrícula Nº" + j + ": " + listaMatriculas.get(j));
        }


    }
}
