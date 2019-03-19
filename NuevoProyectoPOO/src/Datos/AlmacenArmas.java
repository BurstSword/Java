package Datos;


import Entidades.Arma;

import java.util.ArrayList;
import java.util.Arrays;

public class AlmacenArmas {	
	
	//Objetos previamente incializados
	private static Arma[] listaArma = {new Arma("Espada", 12), new Arma("Hacha", 15)};
	
	//Creacion de ArrayList de objetos
	public static ArrayList<Arma> armas = new ArrayList<Arma>(Arrays.asList(listaArma));
	
	
	
//	Para añadir nuevos elementos:
//	Datos.AlmacenArmas.armas.add(new Arma("cuchillo", 5));
	

}
