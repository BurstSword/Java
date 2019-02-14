

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String palabra;
        System.out.println("Escriba una palabra y veremos si es un palíndromo o no");
        palabra = teclado.nextLine();


        if (comprobarPalindromo(palabra)) {
            System.out.println("Es un palíndromo");
        } else {
            System.out.println("No es un palíndromo");
        }
    }

        /*
        public static void reOrdenar(String palabra) {
            String palabraOrdenada = "";
            for (int i = palabra.length() - 1; i >= 0; i--) {
                palabraOrdenada = palabraOrdenada + palabra.charAt(i);
            }
           if(palabra.equals(palabraOrdenada)){
               System.out.println("La palabra " + palabra + " es un palíndromo");
           }else{
               System.out.println("La palabra " + palabra + " no es un palíndromo");
           }
        }
        */

    /*
    public static void comprobarPalindromo(String palabra) {
        int principio = 0;
        int end = palabra.length() - 1;
        boolean igual = true;

        while (principio < end && igual) {

            if (palabra.charAt(principio) == palabra.charAt(end)) {
                principio++;
                end--;

            } else {
                igual = false;
            }
        }
        if (!igual) {
            System.out.println(palabra + " no es un palíndromo");
        } else {
            System.out.println(palabra + " es un palíndromo");
        }
    }
    */

    public static boolean comprobarPalindromo(String palabra) {

        if (palabra.length() == 0 || palabra.length() == 1) {
            return true;
        }

        if (palabra.charAt(0) == palabra.charAt(palabra.length() - 1)) {
            return comprobarPalindromo(palabra.substring(1, palabra.length() - 1));
        }

        return false;
    }
}
