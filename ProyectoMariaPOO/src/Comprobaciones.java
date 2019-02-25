import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Comprobaciones {
	
	public Comprobaciones() {
	}
	
	public boolean comprobarDNI(String dni) {
		
		boolean correcto = false;
		Pattern p = Pattern.compile("^[0-9]{8}[A-Z]$");
		Matcher m = p.matcher(dni);

		if (m.matches()) {
			correcto = true;
			System.out.println("Formato correcto");
		} else {
			correcto = false;
		}
		return correcto;
	}
	
	public boolean comprobarFechaNacimiento(String fechaNac) {
		
		boolean correcto = false;
		Pattern p = Pattern.compile("^\\d{2}[/]\\d{2}[/]\\d{4}$");
		Matcher m = p.matcher(fechaNac);

		if (m.matches()) {
			correcto = true;
			System.out.println("Formato correcto");
		} else {
			correcto = false;
		}
		return correcto;
	}
	

}
