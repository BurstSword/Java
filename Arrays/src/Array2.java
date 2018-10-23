import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {
        int[][] nums = new int[3][2];
        Scanner teclado = new Scanner(System.in);


        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 2; j++) {
                System.out.println("Ingrese del 1 al 6");
                nums[i][j] = teclado.nextInt();

            }
        }

        System.out.println(nums[0][0] + " - " + nums[0][1]);
        System.out.println(nums[1][0] + " - " + nums[1][1]);
        System.out.println(nums[2][0] + " - " + nums[2][1]);


    }
}
