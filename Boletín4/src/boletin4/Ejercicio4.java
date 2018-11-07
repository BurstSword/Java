package boletin4;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        String[] fechaNac = leerFecha();
        String signo = comprobarSigno(fechaNac);
        mostrarSigno(signo, fechaNac);

    }

    public static String[] leerFecha() {
        Scanner teclado = new Scanner(System.in);
        String fecha;
        String[] fechaNac;

        System.out.println("Ingrese su fecha de nacimiento(día/mes)");
        fecha = teclado.next();
        fechaNac = fecha.split("/");
        return fechaNac;
    }

    public static String comprobarSigno(String[] fechaNac) {
        int month, day;
        String signo = "";
        month = Integer.parseInt(fechaNac[1]);
        day = Integer.parseInt(fechaNac[0]);
        if ((month == 1 && day <= 20) || (month == 12 && day >= 22)) {

            signo = "Capricornio";
        } else if ((month == 1 && day >= 21) || (month == 2 && day <= 19)) {
            signo = "Acuario";
        } else if ((month == 2 && day >= 20) || (month == 3 && day <= 20)) {
            signo = "Piscis";
        } else if ((month == 3 && day >= 21) || (month == 4 && day <= 19)) {
            signo = "Aries";
        } else if ((month == 4 && day >= 20) || (month == 5 && day <= 20)) {
            signo = "Tauro";
        } else if ((month == 5 && day >= 21) || (month == 6 && day <= 21)) {
            signo = "Géminis";
        } else if ((month == 6 && day >= 22) || (month == 7 && day <= 23)) {
            signo = "Cáncer";
        } else if ((month == 7 && day >= 24) || (month == 8 && day <= 23)) {
            signo = "Leo";
        } else if ((month == 8 && day >= 24) || (month == 9 && day <= 22)) {
            signo = "Virgo";
        } else if ((month == 9 && day >= 23) || (month == 10 && day <= 22)) {
            signo = "Libra";
        } else if ((month == 10 && day >= 23) || (month == 11 && day <= 22)) {
            signo = "Escorpio";
        } else if ((month == 11 && day >= 23) || (month == 12 && day <= 20)) {
            signo = "Sagitario";
        }
        return signo;
    }

    public static void mostrarSigno(String signo, String[] fechaNac) {
        System.out.println("Usted ha nacido el " + fechaNac[0] + "/" + fechaNac[1] +
                " así que su signo es " + signo);
    }
}
