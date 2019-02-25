import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class Main {

	public static void main (String[]args) {

		String fechaNac = "07/12/1990";
		Date fechaHoy;
		Calendar hoy = Calendar.getInstance();
		fechaHoy = hoy.getTime(); // Ya tenemos la fecha de hoy
		
		String fechaN [];
		
		
		
		/*SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		String fechaComoCadena = sdf.format(aux); //Ya tenemos la fecha de hoy en formato cadena almacenada en la variable "fechaComoCadena"
				
		String [] calendario = fechaComoCadena.split("/"); // Guardamos en el array "calendario" la fechaComoCadena separa por "/", con dd, MM y yyyy almacenados en los subíndices 0, 1 y 2
		
		String [] nacimiento = fechaNac.split("/");*/
		
		Date nacimiento = Date.parse(fechaNac);
		
		System.out.println(fechaHoy);
		System.out.println(nacimiento);
	}

}
