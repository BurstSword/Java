package pruebaSucesiones;


public class Gauss {

    public static final int NUMVUELTAS = 100000;

    public static int GaussIt(int n) {
        int num = 0;

        for (int i = 0; i <= n; i++) {
            num += i;
        }

        return num;
    }

    public static long tiempoGaussIt() {
        long start = System.currentTimeMillis();
        for (int i = 0; i < NUMVUELTAS; i++) {
            int num = GaussIt(20);
        }
        long end = System.currentTimeMillis();

        return end - start;
    }

    public static int GaussRec(int n) {

        if (n <= 1) {

            return 1;
        } else {
            return n + GaussRec(n - 1);
        }


    }

    public static long tiempoGaussRec() {
        long start = System.currentTimeMillis();
        for (int i = 0; i < NUMVUELTAS; i++) {
            int num = GaussRec(20);
        }
        long end = System.currentTimeMillis();

        return end - start;
    }

    public static int GaussForm(int n) {
        int sum;

        sum = n * (1 + n) / 2;

        return sum;
    }

    public static long tiempoGaussForm() {
        long start = System.currentTimeMillis();
        for (int i = 0; i < NUMVUELTAS; i++) {
            int num = GaussForm(20);
        }
        long end = System.currentTimeMillis();

        return end - start;
    }
}
