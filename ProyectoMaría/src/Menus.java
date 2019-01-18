public class Menus {
	
	public static void MenuBienvenida() {
		
		System.out.println("Bienvenido al Museo del Ayuntamiento de Málaga.");
		System.out.println("Antes de seleccionar su entrada, informarle de que esta puede ser gratuita si: ");
		System.out.println("- Es menor de edad");
		System.out.println("- Es nacido en la provincia de Málaga");
		System.out.println("Para ello, seleccione una opción, debiendo acreditarse en la taquilla del museo: ");
		System.out.println("1. Sí, soy menor de edad o nacido en Málaga");
		System.out.println("2. No, no soy menor de edad // No, no soy nacido en Málaga");
		System.out.println("3. No estoy seguro");

	}
	
	public static void MenuComprarEntrada() {
		
		System.out.println("Seleccione qué tipo de entrada quiere adquirir: ");
		System.out.println("1. Entrada Permanente");
		System.out.println("2. Entrada Temporal");
		System.out.println("3. Cancelar");
		
	}
	
	public static void MenuRepetirCompra() {
		
		System.out.println("Si desea comprar otra entrada, pulse 1. Si desea finalizar su compra, pulse 2.");
		System.out.println("1. Comprar otra entrada");
		System.out.println("2. Finalizar compra y salir");
		
	}

}
