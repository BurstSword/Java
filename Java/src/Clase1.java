import java.sql.SQLOutput;
import java.util.Scanner;

public class Clase1 {
    public static void main (String[]Args){
        int nota,edad;
        char sexo;
        Scanner teclado = new Scanner (System.in);

        System.out.println("Ingrese la nota");
        nota = teclado.nextInt();
        System.out.println("Ingrese la edad");
        edad = teclado.nextInt();
        System.out.println("Ingrese el sexo");
        sexo = Character.toUpperCase(teclado.next().charAt(0));

        if (nota>=5 && edad>=18 && edad<30 && sexo=='M') {
            System.out.println("ACEPTADA");

        }
        else if (nota>=5 && edad>=30 && sexo=='M') {
            System.out.println("POSIBLE");
        }
    }
}

