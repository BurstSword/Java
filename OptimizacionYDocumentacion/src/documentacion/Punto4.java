package documentacion;

public class Punto4 {
    public static void main(String[] args) {
        findFavoriteNumber(300);
    }

    /**
     * Method that finds our new favorite number using some calculations  with a maximum number
     * @param maxNumber This number it is the limit of the method to generate the number
     */
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

    /**
     * Method that returns if two numbers are divisible or not
     * @param numerator division numerator
     * @param denominator division denominator
     * @return a boolean that determines if it is divisible or not
     */
    private static boolean isDivisible(int numerator, int denominator) {
        return numerator % denominator == 0;
    }

    /**
     * Method that prints a determined number of asterisk, determined by the favoriteNumber
     * @param asteriskNumber The quantity of asterisk the method will print
     */
    private static void printAsterisk(int asteriskNumber) {
        int i;
        for (i = 0; i < asteriskNumber; i++) {
            System.out.print("*");
        }
    }
}
