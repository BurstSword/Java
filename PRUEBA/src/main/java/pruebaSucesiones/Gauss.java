package pruebaSucesiones;

public class Gauss {

    public static int GaussIt(int n) {

        for (int i = 0; i <= 100; i++) {
            n += i;
        }
        return n;
    }

    public static int GaussRec(int n) {

        if (n == 1) {

            return 1;
        } else {
            return n + GaussRec(n - 1);
        }


    }

    public static int GaussForm(int n) {
        int sum ;

        sum = n * (1 + n) / 2;

        return sum;
    }
}
