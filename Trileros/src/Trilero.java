import java.util.Random;
import java.util.Scanner;

public class Trilero {
    public static void main(String[] args) {
        int jugar, triles;
        char seguir;

        Random aleatorio = new Random();
        Scanner teclado = new Scanner(System.in);

        do {
            System.out.println("¿Una partida a los trileros? Y/N");
            seguir = Character.toUpperCase(teclado.next().charAt(0));
        } while (seguir != 'Y' && seguir != 'N');

        while (seguir == 'Y') {


            triles = aleatorio.nextInt(3)+1;


            do {
                System.out.println("Elija un cubo: 1 - 2 - 3");
                jugar = teclado.nextInt();
                while (jugar < 1 || jugar > 3) {
                    System.out.println("!Sólo hay 3 cubos!");
                    jugar = teclado.nextInt();
                }
            } while (jugar < 1 && jugar > 3);

            if (triles == jugar) {
                if (triles == 1) {
                    System.out.println("!Que suerte, estaba en el cubo! " + triles);
                    System.out.println("---------------------------------------------");
                    System.out.println("┌-----┐         ┌-----┐         ┌-----┐");
                    System.out.println("|     |         |     |         |     |");
                    System.out.println("|  O  |         |     |         |     |");
                    System.out.println("|     |         |     |         |     |");
                    System.out.println("└-----┘         └-----┘         └-----┘ ");
                } else {
                    if (triles == 2) {
                        System.out.println("!Que suerte, estaba en el cubo! " + triles);
                        System.out.println("---------------------------------------------");
                        System.out.println("┌-----┐         ┌-----┐         ┌-----┐");
                        System.out.println("|     |         |     |        |     |");
                        System.out.println("|     |         |  O  |        |     |");
                        System.out.println("|     |         |     |        |     |");
                        System.out.println("└-----┘         └-----┘         └-----┘ ");
                    } else {
                        System.out.println("!Que suerte, estaba en el cubo! " + triles);
                        System.out.println("---------------------------------------------");
                        System.out.println("┌-----┐         ┌-----┐         ┌-----┐");
                        System.out.println("|     |         |     |        |     |");
                        System.out.println("|     |         |     |        |  O  |");
                        System.out.println("|     |         |     |        |     |");
                        System.out.println("└-----┘          └-----┘        └-----┘ ");
                    }
                }
            } else {
                System.out.println("Has perdido, vuelve a intentarlo");
                if (triles == 1) {
                    System.out.println("La bolita estaba en el cubo: " + triles);
                    System.out.println("---------------------------------------------");
                    System.out.println("┌-----┐        ┌-----┐         ┌-----┐");
                    System.out.println("|     |        |     |        |     |");
                    System.out.println("|  O  |        |     |        |     |");
                    System.out.println("|     |        |     |        |     |");
                    System.out.println("└-----┘        └-----┘         └-----┘ ");
                } else {
                    if (triles == 2) {
                        System.out.println("La bolita estaba en el cubo: " + triles);
                        System.out.println("---------------------------------------------");
                        System.out.println("┌-----┐         ┌-----┐        ┌-----┐");
                        System.out.println("|     |         |     |       |     |");
                        System.out.println("|     |         |  O  |       |     |");
                        System.out.println("|     |         |     |       |     |");
                        System.out.println("└-----┘         └-----┘        └-----┘ ");
                    } else {
                        System.out.println("La bolita estaba en el cubo: " + triles);
                        System.out.println("---------------------------------------------");
                        System.out.println("┌-----┐        ┌-----┐          ┌-----┐");
                        System.out.println("|     |        |     |         |     |");
                        System.out.println("|     |        |     |         |  O  |");
                        System.out.println("|     |        |     |         |     |");
                        System.out.println("└-----┘        └-----┘          └-----┘ ");
                    }
                }
            }


            do {
                System.out.println("¿Una partida a los trileros? Y/N");
                seguir = Character.toUpperCase(teclado.next().charAt(0));
            } while (seguir != 'Y' && seguir != 'Y');

        }

    }
}
