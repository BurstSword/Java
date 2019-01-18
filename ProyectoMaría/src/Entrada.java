public class Entrada {

	// ATRIBUTOS Y OBJETOS

	private boolean gratis;
	private boolean permanente;
	private int precioOficial;

	// M�TODO CONSTRUCTOR

	public Entrada() {

		this.gratis = false;
		this.permanente = false;
		this.precioOficial = 0;

	}

	public void CompraTotal (int contPermGr, int contPerm, int contTempGr, int contTemp) {
		
		int entradaPerm = contPermGr + contPerm;
		int entradaTemp = contTempGr + contTemp;
		int precioPerm = 10*contPerm;
		int precioTemp = 5*contTemp;
		int precioTotal = precioPerm + precioTemp;
		
		System.out.println("Su compra total es1: ");
		System.out.println("N�mero de entradas para la exposici�n permanente: " + entradaPerm);
		System.out.println("N�mero de entradas para la exposici�n temporal: " + entradaTemp);
		System.out.println("Importe total: " + precioTotal + "�");
	}
	
	
	// M�TODOS GETTERS Y SETTERS

	public boolean isGratis() {
		return gratis;
	}

	public void setGratis(boolean gratis) {
		this.gratis = gratis;
	}

	public boolean isPermanente() {
		return permanente;
	}

	public void setPermanente(boolean permanente) {
		this.permanente = permanente;
	}

	public int getPrecioOficial() {
		return precioOficial;
	}

	public void setPrecioOficial(int precioOficial) {
		this.precioOficial = precioOficial;
	}

	
	// M�TODO TOSTRING
	
	@Override
	public String toString() {
		return "Ha seleccionado su Entrada: " + (gratis ? "Gratuita": "Con coste") + ", permanente=" + permanente + ", A un precio de " + precioOficial + "�" + "]";
	}
	
	
	
}
