package pruebaSucesiones;

public class PruebasTiempo {
    public static void main(String[] args) {

        System.out.println("\nFibonacci Recursivo 1 " + Fib.tiempoFibRec(1));
        System.out.println("Fibonacci Recursivo 5 " + Fib.tiempoFibRec(5));
        System.out.println("Fibonacci Recursivo 10 " + Fib.tiempoFibRec(10));
        System.out.println("Fibonacci Recursivo 20 " + Fib.tiempoFibRec(20));
        System.out.println("Fibonacci Recursivo 30 " + Fib.tiempoFibRec(30));


        System.out.println("\nFibonacci Iterativo 1 " + Fib.tiempoFibIt(1));
        System.out.println("Fibonacci Iterativo 5 " + Fib.tiempoFibIt(5));
        System.out.println("Fibonacci Iterativo 10 " + Fib.tiempoFibIt(10));
        System.out.println("Fibonacci Iterativo 20 " + Fib.tiempoFibIt(20));
        System.out.println("Fibonacci Iterativo 30 " + Fib.tiempoFibIt(30));

        System.out.println("\nFibonacci con lista 1 " + Fib.tiempoFibLista(1));
        System.out.println("Fibonacci con lista 5 " + Fib.tiempoFibLista(5));
        System.out.println("Fibonacci con lista 10 " + Fib.tiempoFibLista(10));
        System.out.println("Fibonacci con lista 20 " + Fib.tiempoFibLista(20));
        System.out.println("Fibonacci con lista 30 " + Fib.tiempoFibLista(30));

        System.out.println("\nGauss con formula 1 " + Gauss.tiempoGaussForm(1));
        System.out.println("Gauss con formula 5 " + Gauss.tiempoGaussForm(5));
        System.out.println("Gauss con formula 10 " + Gauss.tiempoGaussForm(10));
        System.out.println("Gauss con formula 20 " + Gauss.tiempoGaussForm(20));
        System.out.println("Gauss con formula 30 " + Gauss.tiempoGaussForm(30));

        System.out.println("\nGauss Iterativo 1 " + Gauss.tiempoGaussIt(1));
        System.out.println("Gauss Iterativo 5 " + Gauss.tiempoGaussIt(5));
        System.out.println("Gauss Iterativo 10 " + Gauss.tiempoGaussIt(10));
        System.out.println("Gauss Iterativo 20 " + Gauss.tiempoGaussIt(20));
        System.out.println("Gauss Iterativo 30 " + Gauss.tiempoGaussIt(30));

        System.out.println("\nGauss Recursivo 1 " + Gauss.tiempoGaussRec(1));
        System.out.println("Gauss Recursivo 5 " + Gauss.tiempoGaussRec(5));
        System.out.println("Gauss Recursivo 10 " + Gauss.tiempoGaussRec(10));
        System.out.println("Gauss Recursivo 20 " + Gauss.tiempoGaussRec(20));
        System.out.println("Gauss Recursivo 30 " + Gauss.tiempoGaussRec(30));

        System.out.println("\nGauss con lista 1 " + Gauss.tiempoGaussLista(1));
        System.out.println("Gauss con lista 5 " + Gauss.tiempoGaussLista(5));
        System.out.println("Gauss con lista 10 " + Gauss.tiempoGaussLista(10));
        System.out.println("Gauss con lista 20 " + Gauss.tiempoGaussLista(20));
        System.out.println("Gauss con lista 30 " + Gauss.tiempoGaussLista(30));
    }
}
