Algoritmo Ejercicio2
	Num Es Entero; //Declaramos las variable d�nde almacenaremos el n�mero que vayamos ingresando
	Aux Es Entero; //Y d�nde iremos almacenando el mayor n�mero de todos
	
	//Le pedimos al usuario que ingrese n�meros positivos y que cuando quiera terminar pulse 0
	//Entonces le mostraremos el mayor n�mero de todos
	Mostrar "Ingrese n�meros positivos, y cuando quiera finalizar pulse 0 y le mostraremos el mayor de todos los introducidos"
	
	//Con este bucle hacemos al usuario ingresar n�meros mayores que 0 
	//Vamos almacenando el mayor n�mero introducido en la variable aux
	//El bucle termina cuando el usuario pulse el 0
	Repetir
		Mostrar "Ingrese un n�mero y para finalizar pulse 0"
		Leer Num
		Si Num>Aux Entonces
			Aux=Num
		Fin Si
	Hasta Que Num==0
	
	Mostrar "El mayor n�mero introducido es " Aux
FinAlgoritmo
