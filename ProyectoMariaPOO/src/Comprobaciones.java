import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Comprobaciones {
	
	Scanner teclado = new Scanner (System.in);
	
	public void comprobarDNI(String dni) {
		
		//System.out.println("Introduce tu DNI: ");
		//dni = teclado.nextLine();

		Pattern p = Pattern.compile("^[0-9]{8}[A-Z]$");
		Matcher m = p.matcher(dni);

		if (m.matches()) {
			System.out.println("Formato correcto");
		} else {
			System.out.println("Formato incorrecto");
		}
	}
	
	public void comprobarFechaNacimiento(String fechaNac) {
	
		//System.out.println("Introduce tu fecha de nacimiento: ");
		//fechaNac = teclado.nextLine();

		Pattern p = Pattern.compile("^\\d{2}[/]\\d{2}[/]\\d{4}$");
		Matcher m = p.matcher(fechaNac);

		if (m.matches()) {
			System.out.println("Formato correcto");
		} else {
			System.out.println("Formato incorrecto");
		}
	}
	

}
