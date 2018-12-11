package ej.biblioteca;

public class Usuario {

	//ATRIBUTOS
	private String dni;
	private String nombre;
	
	//MÉTODOS
	// MÉTODO CONSTRUCTOR
	public Usuario(String nombre, String dni) {
		this.nombre = nombre;
		this.dni = dni;
	}
	
	//	MÉTODOS FUNCIONALES
	protected void alquilarLibro(Libro libro) {
		if(libro.isDisponible()) {
			libro.setDisponible(false);
			System.out.println("El usuario llamado " + this.getNombre() + " ha alquilado el libro " + libro.getTitulo());
		}else {
			System.out.println("El libro  " + libro.getTitulo() + " no está disponible.");	
		}
	}
	
	protected void devolverLibro(Libro libro) {
		if(!libro.isDisponible()) {
			libro.setDisponible(true);
			System.out.println("El usuario llamado " + this.getNombre() + " ha devuelto el libro " + libro.getTitulo());
		}else {
			System.out.println("El libro  " + libro.getTitulo() + " no puede devolverse, puesto que no está alquilado.");
		}
	}

	//	MÉTODOS GETTERS Y SETTERS
	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
	

}
