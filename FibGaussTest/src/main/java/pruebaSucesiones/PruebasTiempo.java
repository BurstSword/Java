package pruebaSucesiones;

public class PruebasTiempo {
    public static void main(String[] args) {

        System.out.println("Fibonacci Recursivo " + Fib.tiempoFibRec(1));
        System.out.println("Fibonacci Iterativo " + Fib.tiempoFibIt(1));
        System.out.println("Gauss con formula " + Gauss.tiempoGaussForm(1));
        System.out.println("Gauss Iterativo " + Gauss.tiempoGaussIt(1));
        System.out.println("Gauss Recursivo " + Gauss.tiempoGaussRec(1));
    }
}
