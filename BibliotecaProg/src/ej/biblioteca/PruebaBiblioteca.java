package ej.biblioteca;

public class PruebaBiblioteca {

	public PruebaBiblioteca() {
		// TODO Auto-generated constructor stub
	}
	public static void main (String args[]) {
		//	Creación de dos usuarios y dos libros.
		Usuario usu1 = new Usuario("Mario", "11223344S");
		Usuario usu2 = new Usuario("Marisa", "55667788S");
		Libro l1 = new Libro("Canción de Hielo y fuego");
		Libro l2 = new Libro ("Danza de dragones");
		//o	Los usuarios pueden alquilar libros siempre que éstos estén disponibles 
		//(es decir, siempre que no hayan sido alquilados por otro usuario). 
		
		//Comprobación de que los usuarios pueden alquilar libros si están disponibles:
		usu1.alquilarLibro(l1);
		usu2.alquilarLibro(l2);
		//Comprobación de que los usuarios no pueden alquilar libros si ya han sido alquilados:
		usu2.alquilarLibro(l1);
		//Comprobación de devolución de libros:
		usu2.devolverLibro(l1);
		//Comprobación de devolución de un libro que no está alquilado:
		usu2.devolverLibro(l1);


	}

}
