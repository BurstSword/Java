package pruebaSucesiones;

public class PruebasTiempo {
    public static void main(String[] args) {

        System.out.println("Fibonacci Iterativo " + Fib.tiempoFibIt());
        System.out.println("Fibonacci Recursivo " + Fib.tiempoFibRec());
        System.out.println("Gauss con formula " + Gauss.tiempoGaussForm());
        System.out.println("Gauss Iterativo " + Gauss.tiempoGaussIt());
        System.out.println("Gauss Recursivo " + Gauss.tiempoGaussRec());
    }
}
