package PracticaPOOMariaLopez;

public class Empleado {
	
	private String nombre;
	private String apellido;
	private int edad;
	private int salario;
	
	
	public Empleado(String nombre, String apellido, int edad, int salario) {
	
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.salario = salario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getSalario() {
		return salario;
	}

	public void setSalario(int salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Empleado{" +
				"nombre='" + nombre + '\'' +
				", apellido='" + apellido + '\'' +
				", edad=" + edad +
				", salario=" + salario +
				'}';
	}
}
