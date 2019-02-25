import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Usuario {

	private String nombre;
	private String dni;
	private String fechaNac; // !!!!!!!
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

	public boolean esMayorDeEdad (String fechaNac) {

		boolean mayorEdad;

		Date fechaHoy;
		Calendar hoy = Calendar.getInstance();
		fechaHoy = hoy.getTime(); 

		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");

		Date nacimiento = null;
		try {
			nacimiento = formatter.parse(fechaNac);
		} catch (ParseException e) {

			e.printStackTrace();
		}

		if (((fechaHoy.getTime() - nacimiento.getTime())/86400000) >= 6570) {
			mayorEdad = true;
			System.out.println("Es mayor de edad");
		} else {
			mayorEdad = false;
			System.out.println("Es menor de edad");
		}
		return mayorEdad;
	}
	
	// TO STRING
	@Override
	public String toString() {
		return "Datos personales \n[Nombre: " + nombre + " \nDNI: " + dni + "\nFecha de Nacimiento: " + fechaNac + "\nNombre de Usuario: "
				+ nombreUsuario + "\nClave de Acceso: " + claveAcceso + "]";
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
