import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Usuario {
	
	private String nombre;
	private String dni;
	private Date fechaNac; // !!!!!!!
	private String nombreUsuario;
	private String claveAcceso;
	
	
	// CONSTRUCTOR
	public Usuario(String nombre, String dni, String fechaNac) {
		
		this.nombre = nombre;
		this.dni = dni;
		this.fechaNac = fechaNac;
	}
	
	// MÉTODOS Y FUNCIONALIDADES
	public void generarNombreUsuario () { 
		
		String nombreLetras = " ", apellido1Letras=" ", apellido2Letras=" ";
		String codigoBeta;
		
		//System.out.println("Introduce tu nombre y apellidos: ");
		//nombreApellidos = teclado.nextLine();
		
		this.nombre = this.nombre.toUpperCase();
	
		String [] separados = this.nombre.split(" ");
		apellido2Letras = separados[2].substring(0, 3);
		apellido1Letras = separados[1].substring(0, 3);
		nombreLetras = separados[0].substring(0, 3);
		
		codigoBeta = apellido1Letras.concat(apellido2Letras);
		this.nombreUsuario = codigoBeta.concat(nombreLetras);
	}
	
	public void generarClaveAcceso () {

		int codigoNumerico;
		
		codigoNumerico = (int) (Math.random() * 100) + 1;
		this.claveAcceso = this.nombreUsuario + codigoNumerico;
	
	}
	
	public boolean esMayorDeEdad () {
		
		boolean mayorEdad;
		
		Date fechaHoy;
		Calendar hoy = Calendar.getInstance();
		fechaHoy = hoy.getTime(); // Ya tenemos la fecha de hoy
		
		/*SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		String fechaComoCadena = sdf.format(aux); //Ya tenemos la fecha de hoy en formato cadena almacenada en la variable "fechaComoCadena"
				
		String [] calendario = fechaComoCadena.split("/"); // Guardamos en el array "calendario" la fechaComoCadena separa por "/", con dd, MM y yyyy almacenados en los subíndices 0, 1 y 2
		
		String [] nacimiento = fechaNac.split("/");*/
		
		LocalDate nacimiento = LocalDate.parse(this.fechaNac);  
		
		
		
		if ((fechaHoy - nacimiento) >= ) {
			mayorEdad = true;
		} else {
			mayorEdad = false;
		}
		return mayorEdad;
	}
	
	//GETTERS Y SETTERS

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getFechaNac() {
		return fechaNac;
	}

	public void setFechaNac(String fechaNac) {
		this.fechaNac = fechaNac;
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public String getClaveAcceso() {
		return claveAcceso;
	}

	public void setClaveAcceso(String claveAcceso) {
		this.claveAcceso = claveAcceso;
	}
	
	

}
