package banco.MiguelEspigaresRecio;

import java.util.Scanner;

public class PruebaBanco {
    public static void main(String[] args) {
        /*
        //Vamos a probar todas la funcionalidades de una cuenta bancaria

        //Instanciamos el objeto de tipo Cuenta bancaria
        CuentaBancaria cuenta = new CuentaBancaria("Ramón",159284639);
        //Mostramos el estado de la cuenta actual y lo mostraremos cada vez que hagamos un cambio, para así poder ver las pruebas
        //más eficientemente
        System.out.println(cuenta.toString());

        //Probamos a ingresar a dinero
        cuenta.ingresarDinero(300);
        System.out.println(cuenta.toString());
        //Probamos a ingresar 0 euros
        cuenta.ingresarDinero(0);
        System.out.println(cuenta.toString());
        //Probamos a retirar dinero
        cuenta.retirarDinero(100);
        System.out.println(cuenta.toString());
        //Probamos a retirar más de 600 euros
        cuenta.setDineroCuenta(1000);
        System.out.println(cuenta.toString());
        cuenta.retirarDinero(601);
        System.out.println(cuenta.toString());
        //Probamos a retirar 0 euros
        cuenta.retirarDinero(0);
        System.out.println(cuenta.toString());
        //Probamos a bloquear la cuenta si la cantidad de dinero es superior a 0
        cuenta.bloquearCuenta();
        System.out.println(cuenta.toString());
        //Dejamos la cuenta en negativo y vemos si se puede bloquear
        cuenta.setDineroCuenta(-100);
        cuenta.bloquearCuenta();
        System.out.println(cuenta.toString());
        //Probamos a desbloquear la cuenta si el saldo es superior a 0
        cuenta.desbloquearCuenta(1000);
    }
    */


        //Aquí irá el menu ejecutable que te permitirá realizar operaciones en el banco hasta que tú quieras

        //Instanciamos el objeto
        //Por parámetros le damos un nombre al titular de la cuenta y un número de cuenta
        CuentaBancaria cuentaMain = new CuentaBancaria("Ramón", 59365294);
        //Declaramos las variables necesarias para realizar nuestro menú y el objeto de tipo Scanner
        int boton, dinero;
        Scanner teclado = new Scanner(System.in);


        //Aquí comienza el menú y el programa en sí
        do {
            do {
                //Mostramos el menú que nos da las siguientes opciones, ingresar dinero, retirar dinero, desbloquear la  cuenta
                //ver el estado actual de la cuenta, y salir del banco
                System.out.println("1. Ingresar dinero");
                System.out.println("2. Retirar dinero");
                System.out.println("3. Desbloquear cuenta");
                System.out.println("4. Ver estado actual de la cuenta");
                System.out.println("0. Salir del banco");
                boton = teclado.nextInt();
            } while (boton < 0 || boton > 4);

            switch (boton) {
                //Aquí hacemos los ingresos en la cuenta, utilizando el método ingresarDinero en la clase CuentaBancaria
                //Que devolverá unos mensajes u otros en función del importe que ingresemos
                case 1:
                    System.out.println("Teclee el importe que desee ingresar");
                    dinero = teclado.nextInt();
                    cuentaMain.ingresarDinero(dinero);
                    break;
                case 2:
                    //Aquí realizamos las retiradas de dinero, utilizando el método retirarDinero de la clase CuentaBancaria
                    //Que nos mostrará distintos mensajes según el importe que retiremos, y si dejamos la cuenta en negativo
                    //Nos mostrará que la cuenta se ha bloqueado
                    System.out.println("Teclee el importe que desea retirar");
                    dinero = teclado.nextInt();
                    cuentaMain.retirarDinero(dinero);
                    if (cuentaMain.getDineroCuenta() < 0) {
                        cuentaMain.bloquearCuenta();
                    }
                    break;
                case 3:
                    //Con este método podemos desbloquear la cuenta utilizando el método desbloquearCuenta de la clase Cuenta Bancaria
                    //si está bloqueada nos dirá que hagamos el ingreso para dejarla desbloqueada, que debe dejar la cuenta
                    //en un número superior a 0, si no no nos dejará realizar el ingreso
                    //Si la deja en superior a 0 nos dirá que se ha desbloqueada la cuenta
                    //Y si no está desbloqueada nos permitirá salir o ingresar dinero
                    if (cuentaMain.isCuentaBloqueada() == true) {
                        System.out.println("Debe realizar un ingreso que deje su cuenta en una cantidad superior a 0");
                        dinero = teclado.nextInt();
                        cuentaMain.desbloquearCuenta(dinero);
                    }else{
                        System.out.println("Su cuenta no se encuentra bloqueada, pero puede hacer un ingreso, ingrese 0 si no quiere " +
                                "realizar ningún ingreso, y si quiere hacerlo ingrese la cantidad");
                        dinero=teclado.nextInt();
                        if (dinero==0){
                            System.out.println("Ha decidido no realizar ingresos");
                        }else{
                            cuentaMain.ingresarDinero(dinero);
                        }

                    }
                    break;
                case 4:
                    //Este case nos permite ver el estado actual de la cuenta
                    System.out.println(cuentaMain.toString());
                    break;
                case 0:
                    //Y con este case salimos del banco
                    System.out.println("Saliendo del banco");
                    break;
            }
        } while (boton != 0);
    }
}
