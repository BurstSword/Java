package pruebaSucesiones;



public class Fib {

    public static int fibonacciIterativo(int n) {
        if(n <= 1) {
            return n;
        }
        int fib = 1;
        int prevFib = 1;

        for(int i=2; i<n; i++) {
            int temp = fib;
            fib+= prevFib;
            prevFib = temp;
        }
        return fib;
    }

    public static int fibonacciRecursivo(int n) {
        if(n <= 1) {
            return n;
        }
        return fibonacciRecursivo(n-1) + fibonacciRecursivo(n-2);
    }


}
