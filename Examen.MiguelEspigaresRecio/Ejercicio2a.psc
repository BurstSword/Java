Algoritmo Ejercicio2a
	Num Es Entero; //Declaramos las variable d�nde almacenaremos el n�mero que vayamos ingresando
	min Es Entero; //Y d�nde iremos almacenando el menor n�mero de todos
	
	
	//Le pedimos al usuario que ingrese n�meros positivos y que cuando quiera terminar pulse 0
	//Entonces le mostraremos el mayor n�mero de todos
	Mostrar "Ingrese n�meros positivos, y cuando quiera finalizar pulse 0 y le mostraremos el mayor de todos los introducidos"
	
	//Con este bucle hacemos al usuario ingresar n�meros positivos
	//Vamos almacenando el menor n�mero introducido en la variable min
	//El bucle termina cuando el usuario pulse el 0
	Mostrar "Ingrese un n�mero positivo"
	Leer Num
	min=Num
	Mientras Num<>0
		Mostrar "Ingrese un n�mero positivo"
		Leer Num
		Si Num<min y Num<>0
			min=Num
		FinSi
	FinMientras
	
	Mostrar "El menor n�mero introducido es " min
FinAlgoritmo
