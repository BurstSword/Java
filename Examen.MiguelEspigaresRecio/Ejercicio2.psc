Algoritmo Ejercicio2
	Num Es Entero; //Declaramos las variable dónde almacenaremos el número que vayamos ingresando
	Aux Es Entero; //Y dónde iremos almacenando el mayor número de todos
	
	//Le pedimos al usuario que ingrese números positivos y que cuando quiera terminar pulse 0
	//Entonces le mostraremos el mayor número de todos
	Mostrar "Ingrese números positivos, y cuando quiera finalizar pulse 0 y le mostraremos el mayor de todos los introducidos"
	
	//Con este bucle hacemos al usuario ingresar números mayores que 0 
	//Vamos almacenando el mayor número introducido en la variable aux
	//El bucle termina cuando el usuario pulse el 0
	Repetir
		Mostrar "Ingrese un número y para finalizar pulse 0"
		Leer Num
		Si Num>Aux Entonces
			Aux=Num
		Fin Si
	Hasta Que Num==0
	
	Mostrar "El mayor número introducido es " Aux
FinAlgoritmo
