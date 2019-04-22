package documentacion;

public class Ejemplo1 {
    public static void main(String[] args) {
        findFavoriteNumber(300);
    }

    public static void findFavoriteNumber(int maxNumber) {
        int favoriteNumber = 0;
        for (int i = 0; i < maxNumber + 1; i++) {
            if (isDivisible(i, 2)) {
                if (isDivisible(i, 3)) {
                    if (isDivisible(i + 1, 5)) {
                        int c = i / 7;
                        if (isDivisible(c, 2)) {
                            if (i > favoriteNumber) {
                                favoriteNumber = i;
                            }
                        }
                    }
                }
            }
        }
        printAsterisk(favoriteNumber);
        System.out.println("\nI found my new favorite number: " + favoriteNumber);
        printAsterisk(favoriteNumber);
        System.out.println();
    }

    private static boolean isDivisible(int numerator, int denominator) {
        return numerator % denominator == 0;
    }

    private static void printAsterisk(int b) {
        int i;
        for (i = 0; i < b; i++) {
            System.out.print("*");
        }
    }
}
