package ej.biblioteca;

public class Libro {

	//ATRIBUTOS
	private boolean disponible;
	private String titulo;
	
	//MÉTODOS
	//	MÉTODO CONSTRUCTOR
	public Libro(boolean disponible, String titulo) {
		this.disponible = disponible;
		this.titulo = titulo;
	}
	//	MÉTODOS GETTERS Y SETTERS
	public boolean isDisponible() {
		return disponible;
	}

	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	

}

