import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        String numero;
        Scanner teclado = new Scanner(System.in);


        do{
            System.out.println("Escriba su número con el formato x'x");
            System.out.println("Para acabar escriba stop");
            numero = teclado.nextLine();
            sumar(numero);
        }while (numero.equals("stop"));
    }

    public static void sumar(String numero){
        double num;
        while(numero!=null){
            try {
                num = Double.parseDouble(numero);
                System.out.println(num+num);
            }catch (NumberFormatException e){
                System.out.println(numero + " valor no numérico");
            }

        }

    }
}
