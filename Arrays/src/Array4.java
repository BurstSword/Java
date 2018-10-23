public class Array4 {
    public static void main(String[] args) {
        char[][] equis = {{'x', '-', '-', '-'}, {'-', 'x', '-', '-'}, {'-', '-', 'x', '-'}, {'-', '-', '-', 'x'}};


        for (int i = 0; i < 4; i++) {
            System.out.println("");

            for (int j = 0; j < 4; j++) {
                System.out.print(equis[i][j] + " ");

            }
        }
    }
}
