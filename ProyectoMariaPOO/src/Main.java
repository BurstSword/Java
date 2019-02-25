import java.util.Date;
import java.util.Scanner;

public class Main {

	public static void main (String[]args) {

		Scanner teclado = new Scanner(System.in);
		int opcion;
		String nombre = null, dni = null, nombreUsuario = null, claveAcceso = null; 
		String fechaNac = null;
		boolean correcto = false;

		Usuario usu1 = new Usuario (nombre, dni, fechaNac);
		Comprobaciones comprob = new Comprobaciones();


		do {

			do {

				System.out.println("----- Gestor de solicitudes -----\n");
				System.out.println("[DATOS DE LA SOLICITUD]\n");
				System.out.println("1. Nombre");
				System.out.println("2. DNI");
				System.out.println("3. Fecha de Nacimiento");
				System.out.println("4. Generar solicitud y Salir");

				opcion = teclado.nextInt();

				if ((opcion<1) || (opcion>4)) {
					System.out.println("Error. Vuelva a introducir una opción correcta\n");
				}

			} while ((opcion<1) || (opcion>4));

			switch (opcion) {

			case 1:
				System.out.println("Nombre completo: ");
				teclado.nextLine();
				nombre = teclado.nextLine();
				usu1.setNombre(nombre);
				System.out.println("\nNombre introducido correctamente");
				//System.out.println("Seleccione qué quiere hacer a continuación: \n");
				break;

			case 2:
				System.out.println("DNI: ");
				//teclado.next();
				dni = teclado.nextLine();

				do {
					comprob.comprobarDNI(dni);

					if (!correcto) {
						System.out.println("Formato incorrecto");
						System.out.println("Vuelva a introducir su DNI: ");
						dni = teclado.nextLine();
						comprob.comprobarDNI(dni);
					}
				} while (!correcto);
				teclado.nextLine();
				break;

			case 3:
				System.out.println("Fecha de nacimiento: ");
				fechaNac = teclado.nextLine();

				do {
					comprob.comprobarFechaNacimiento(fechaNac);

					if (!correcto) {
						System.out.println("Formato incorrecto");
						System.out.println("Vuelva a introducir su fecha de nacimiento: ");
						fechaNac = teclado.nextLine();
						comprob.comprobarFechaNacimiento(fechaNac);
					}
				} while (!correcto);

				usu1.esMayorDeEdad(fechaNac);
				teclado.nextLine();
				break;

			case 4:
				usu1.generarNombreUsuario();
				System.out.println("Tu Nombre de Usuario es " + nombreUsuario);
				usu1.generarClaveAcceso();
				System.out.println("Tu Clave de Acceso es " + claveAcceso);
				System.out.println("\nEste justificante de solicitud es meramente informativo. Debe contemplar la firma de los interesados\n");
				usu1.toString();
				System.out.println("----- Ha salido del Gestor de Solicitudes -----");
				teclado.nextLine();
				break;
			}

		} while (opcion!=4);


	}

}
