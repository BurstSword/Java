package pruebaSucesiones;


import java.util.ArrayList;

public class Gauss {


    public static final int NUMVUELTAS = 1000000;

    public Gauss() {
    }

    public static int GaussIt(int n) {
        int num = 0;

        for (int i = 0; i <= n; i++) {
            num += i;
        }

        return num;
    }

    public static long tiempoGaussIt(int n) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < NUMVUELTAS; i++) {
            GaussIt(n);
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

    public static long tiempoGaussRec(int n) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < NUMVUELTAS; i++) {
            GaussRec(20);
        }
        long end = System.currentTimeMillis();

        return end - start;
    }

    public static int GaussForm(int n) {
        int sum;

        sum = n * (1 + n) / 2;

        return sum;
    }

    public static long tiempoGaussForm(int n) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < NUMVUELTAS; i++) {
            int num = GaussForm(20);
        }
        long end = System.currentTimeMillis();

        return end - start;
    }

    public static int gaussConLista(int n) {
        ArrayList<Integer> listaGauss = new <Integer>ArrayList<Integer>();
        listaGauss.add(1);
        listaGauss.add(3);
        listaGauss.add(6);
        listaGauss.add(10);
        listaGauss.add(15);
        listaGauss.add(21);
        listaGauss.add(28);
        listaGauss.add(36);
        listaGauss.add(45);
        listaGauss.add(55);
        listaGauss.add(66);
        listaGauss.add(78);
        listaGauss.add(91);
        listaGauss.add(105);
        listaGauss.add(120);
        listaGauss.add(136);
        listaGauss.add(153);
        listaGauss.add(171);
        listaGauss.add(190);
        listaGauss.add(210);
        int resultado;
        resultado = listaGauss.get(n - 1);
        return resultado;
    }

    public static long tiempoGaussLista(int n) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < NUMVUELTAS; i++) {
            gaussConLista(n);
        }
        long end = System.currentTimeMillis();

        return end - start;
    }
}
