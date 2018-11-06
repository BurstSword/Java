import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        int num;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese un número por teclado y veremos si es mayor que 5 o no");
        num= teclado.nextInt();
        Boolean a;

        if(num>5){
            a=true;
            System.out.println(a);
        }
        else{
            a=false;
            System.out.println(a);
        }
    }
}
