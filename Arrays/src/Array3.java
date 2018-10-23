import java.util.Scanner;

public class Array3 {
    public static void main(String[] args) {
        int[][] equis = new int[4][4];
        Scanner teclado = new Scanner(System.in);

        for (int i = 0; i < 4; i++) {

            for (int j = 0; j < 4; j++) {
                System.out.println("Ingrese números enteros");
                equis[i][j] = teclado.nextInt();
            }
        }
        System.out.println(equis[0][0] + "-" + "-" + "-");
        System.out.println("-" + equis[1][1] + "-" + "-");
        System.out.println("-" + "-" + equis[2][2] + "-");
        System.out.println("-" + "-" + "-" + equis[3][3]);

    }
}
