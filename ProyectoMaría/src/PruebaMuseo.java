import java.util.Scanner;

public class PruebaMuseo {

	public static void main (String[]args) {

		Usuario usu1 = new Usuario();
		Entrada entrada = new Entrada();


		int opcion;
		int contPermGr=0;
		int contPerm=0;
		int contTempGr=0;
		int contTemp=0;
		boolean opcionFinal;
		
		Scanner teclado = new Scanner(System.in);

		do {
			opcion=0;
			do {
				
				Menus.MenuBienvenida();

				opcion = teclado.nextInt();

				if ((opcion<1) || (opcion>3)){

					System.out.println("ERROR");
				}

			} while ((opcion<1) || (opcion>=3));

		
			switch (opcion) {

			case 1:  
				entrada.setGratis(true);
			
			break;

			case 2: 
				entrada.isGratis();
			break;
			}
	

			do {

				Menus.MenuComprarEntrada();

				opcion = teclado.nextInt();

				if ((opcion<1) || (opcion>3)){

					System.out.println("ERROR");
				}

			} while ((opcion<1) || (opcion>3)); 



			switch (opcion) {

			case 1: usu1.comprarEntrada(entrada);
				entrada.setPermanente(true);
				
				if(entrada.isGratis()) {
					contPermGr++;
				
				}else{
					entrada.setPrecioOficial(10);
					contPerm++;
				}
				
				System.out.println(entrada.toString()); 
				
			break;

			case 2: usu1.comprarEntrada(entrada);
				entrada.setPermanente(false);
				
				if(entrada.isGratis()) {
					contTempGr++;
					
				}else{
					entrada.setPrecioOficial(5);
					contTemp++;
				}
				
				System.out.println(entrada.toString());
				
			break;
			
			case 3: System.out.println("Ha salido del programa.");
			}

			
			do {
				
				Menus.MenuRepetirCompra();
				
				opcion = teclado.nextInt();
				
				if ((opcion<1) || (opcion>2)){

					System.out.println("ERROR");
				}
				
			} while ((opcion<1) || (opcion>2)); 
			
			
			if (opcion==1) {
				opcionFinal=true;
			
			}else {
				opcionFinal=false;
				
			}
			
		} while (opcionFinal);
		
		entrada.CompraTotal(contPermGr, contPerm, contTempGr, contTemp);
		
	
	






	}
}
