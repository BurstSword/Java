import java.util.Random;
import java.util.Scanner;

public class Trilero {
    public static void main(String[] args) {
        int cubo, triles;
        char jugar;

        Random aleatorio = new Random();
        Scanner teclado = new Scanner(System.in);

        do {
            System.out.println("¿Una partida a los trileros? Y/N");
            jugar = Character.toUpperCase(teclado.next().charAt(0));
        } while (jugar != 'Y' && jugar != 'N');

        while (jugar == 'Y') {


            triles = aleatorio.nextInt(3)+1;


            do {
                System.out.println("Elija un cubo: 1 - 2 - 3");
                cubo = teclado.nextInt();
                while (cubo < 1 || cubo > 3) {
                    System.out.println("!Sólo hay 3 cubos!");
                    cubo = teclado.nextInt();
                }
            } while (cubo < 1 && cubo > 3);

            if (triles == cubo) {
                if (triles == 1) {
                    System.out.println("!Que suerte, estaba en el cubo " + triles + "!");
                    System.out.println("---------------------------------------------");
                    System.out.println("┌-----┐         ┌-----┐         ┌-----┐");
                    System.out.println("|     |         |     |         |     |");
                    System.out.println("|  O  |         |     |         |     |");
                    System.out.println("|     |         |     |         |     |");
                    System.out.println("└-----┘         └-----┘         └-----┘ ");
                } else {
                    if (triles == 2) {
                        System.out.println("!Que suerte, estaba en el cubo " + triles + "!");
                        System.out.println("---------------------------------------------");
                        System.out.println("┌-----┐         ┌-----┐        ┌-----┐");
                        System.out.println("|     |         |     |        |     |");
                        System.out.println("|     |         |  O  |        |     |");
                        System.out.println("|     |         |     |        |     |");
                        System.out.println("└-----┘         └-----┘        └-----┘ ");
                    } else {
                        System.out.println("!Que suerte, estaba en el cubo " + triles + "!");
                        System.out.println("---------------------------------------------");
                        System.out.println("┌-----┐         ┌-----┐        ┌-----┐");
                        System.out.println("|     |         |     |        |     |");
                        System.out.println("|     |         |     |        |  O  |");
                        System.out.println("|     |         |     |        |     |");
                        System.out.println("└-----┘         └-----┘        └-----┘ ");
                    }
                }
            } else {
                System.out.println("Has perdido, vuelve a intentarlo");
                if (triles == 1) {
                    System.out.println("La bolita estaba en el cubo: " + triles);
                    System.out.println("---------------------------------------------");
                    System.out.println("┌-----┐        ┌-----┐        ┌-----┐");
                    System.out.println("|     |        |     |        |     |");
                    System.out.println("|  O  |        |     |        |     |");
                    System.out.println("|     |        |     |        |     |");
                    System.out.println("└-----┘        └-----┘        └-----┘ ");
                } else {
                    if (triles == 2) {
                        System.out.println("La bolita estaba en el cubo: " + triles);
                        System.out.println("---------------------------------------------");
                        System.out.println("┌-----┐         ┌-----┐       ┌-----┐");
                        System.out.println("|     |         |     |       |     |");
                        System.out.println("|     |         |  O  |       |     |");
                        System.out.println("|     |         |     |       |     |");
                        System.out.println("└-----┘         └-----┘       └-----┘ ");
                    } else {
                        System.out.println("La bolita estaba en el cubo: " + triles);
                        System.out.println("---------------------------------------------");
                        System.out.println("┌-----┐        ┌-----┐         ┌-----┐");
                        System.out.println("|     |        |     |         |     |");
                        System.out.println("|     |        |     |         |  O  |");
                        System.out.println("|     |        |     |         |     |");
                        System.out.println("└-----┘        └-----┘         └-----┘ ");
                    }
                }
            }


            do {
                System.out.println("¿Una partida a los trileros? Y/N");
                jugar = Character.toUpperCase(teclado.next().charAt(0));
            } while (jugar != 'Y' && jugar != 'Y');

        }

    }
}
