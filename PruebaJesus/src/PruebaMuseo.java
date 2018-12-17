import java.util.Scanner;

public class PruebaMuseo {

	public static void main (String[]args) {

		Usuario usu1 = new Usuario();
		Entrada entr1 = new Entrada();

		int opcion;
		Scanner teclado = new Scanner(System.in);

		do {

			do {

				System.out.println("Bienvenido al Museo del Ayuntamiento de M�laga.");
				System.out.println("Antes de seleccionar su entrada, informarle de que esta puede ser gratuita si: ");
				System.out.println("- Es menor de edad.");
				System.out.println("- Es nacido en la provincia de M�laga.");
				System.out.println("Para ello, seleccione una opci�n, debiendo acreditarse en la taquilla del museo: ");
				System.out.println("1. Soy menor de edad.");
				System.out.println("2. Soy nacido en M�laga.");
				System.out.println("3. No estoy seguro.");

				opcion = teclado.nextInt();

				if ((opcion<1) || (opcion>3)){

					System.out.println("ERROR");
				}

			} while ((opcion<1) || (opcion>3));

			switch (opcion) {

			case 1: usu1.setMenorEdad(true);
			break;

			case 2: usu1.setMalaga(true);
			break;
			}

		} while (opcion==3);


		do {

			do {

				System.out.println("Seleccione qu� tipo de entrada quiere adquirir.");
				System.out.println("1. Entrada Permanente");
				System.out.println("2. Entrada Temporal");
				System.out.println("3. Salir del programa");

				opcion = teclado.nextInt();

				if ((opcion<1) || (opcion>3)){

					System.out.println("ERROR");
				}

			} while ((opcion<1) || (opcion>3)); 



			switch (opcion) {

				case 1: entr1.setPermanente(true);
				usu1.comprarEntradaPermanente(entr1);
			break;

			case 2: entr1.setPermanente(false);
				usu1.comprarEntradaTemporal(entr1);
			break;
			}

		} while (opcion!=3);


		/*usu1.comprarEntradaPermanente(entr1);
			usu1.comprarEntradaTemporal(entr1);

			entr1.serGratis();
			entr1.toString();
			entr1.tenerCostePermanente();
			entr1.toString();
			entr1.tenerCosteTemporal();
			entr1.toString();*/





	}
}
