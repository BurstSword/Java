Algoritmo Ejercicio2a
	Num Es Entero; //Declaramos las variable dónde almacenaremos el número que vayamos ingresando
	min Es Entero; //Y dónde iremos almacenando el menor número de todos
	
	
	//Le pedimos al usuario que ingrese números positivos y que cuando quiera terminar pulse 0
	//Entonces le mostraremos el mayor número de todos
	Mostrar "Ingrese números positivos, y cuando quiera finalizar pulse 0 y le mostraremos el mayor de todos los introducidos"
	
	//Con este bucle hacemos al usuario ingresar números positivos
	//Vamos almacenando el menor número introducido en la variable min
	//El bucle termina cuando el usuario pulse el 0
	Mostrar "Ingrese un número positivo"
	Leer Num
	min=Num
	Mientras Num<>0
		Mostrar "Ingrese un número positivo"
		Leer Num
		Si Num<min y Num<>0
			min=Num
		FinSi
	FinMientras
	
	Mostrar "El menor número introducido es " min
FinAlgoritmo
