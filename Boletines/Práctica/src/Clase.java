import java.sql.SQLOutput;
import java.util.Scanner;

public class Clase {
    public static void main(String[] args) {
        double nota, ContAprob, ContNotas;
        ContAprob = 0;
        ContNotas = 0;
        Scanner teclado = new Scanner(System.in);


        do {
            System.out.println("Ingrese notas y cuando quiera acabar pulse un número que no esté comprendido entre 0 y 10 ");
            nota = teclado.nextInt();
            if (nota < 5 && nota > 0) {
                ContNotas++;
            }
            if (nota >=5 && nota <=10){
                ContNotas++;
                ContAprob++;
            }

        } while (nota < 0 || nota < 10);

        System.out.println("El porcentaje de aprobados es de " + ((ContAprob * 100) / ContNotas));
        System.out.println("El porcentaje de suspensos es de " + (100 - ((ContAprob * 100) / ContNotas)));
    }
}
