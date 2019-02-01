public class Entrada {

	// ATRIBUTOS Y OBJETOS

	private boolean gratis;
	private boolean permanente;
	private int precioOficial;

	// M�TODO CONSTRUCTOR

	public Entrada() {

		this.gratis = false;
		this.permanente = false;
		this.precioOficial = 5;

	}

	// M�TODOS Y FUNCIONALIDADES

	public void serGratis() {

		if (!this.gratis) {
			this.gratis = true;
			this.precioOficial = 0;
		}
	}

	public void tenerCostePermanente() {

		if (!this.permanente ) {
			this.permanente = true;
			this.gratis = false;
			this.precioOficial = 10;
		}
	}

	public void tenerCosteTemporal() {
		
		if (!this.permanente) {
			this.gratis = false;
			this.precioOficial = 5;
		}

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
		return "Entrada [gratis=" + gratis + ", permanente=" + permanente + ", precio=" + precioOficial + "]";
	}
	
	
	
}
