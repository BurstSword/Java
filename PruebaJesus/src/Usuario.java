public class Usuario {

	// ATRIBUTOS Y OBJETOS
	
	private boolean menorEdad;
	private boolean malaga;
	
	// M�TODO CONSTRUCTOR
	
	public Usuario() {
		
		this.menorEdad = false;
		this.malaga = false;
	}
	
	// M�TODOS Y FUNCIONALIDADES
	
	public void comprarEntradaPermanente(Entrada entr1) {
		
		if ((this.menorEdad = true) || (this.malaga = true)) {
			entr1.serGratis();
			System.out.println("Su entrada es gratuita.");
			System.out.println("Resumen de su compra: " + entr1.toString());
		}
		else {
			entr1.tenerCostePermanente();
			System.out.println("Su entrada tiene un precio de " + entr1.getPrecioOficial());
			System.out.println("Resumen de su compra: " + entr1.toString());
		}
	}
	
	public void comprarEntradaTemporal(Entrada entr1) {
		
		if ((this.menorEdad = false) || (this.malaga = false)) {
			entr1.tenerCosteTemporal();
			System.out.println("Su entrada tiene un precio de " + entr1.getPrecioOficial());
			System.out.println("Resumen de su compra: " + entr1.toString());
		}
		else {
			entr1.serGratis();
			System.out.println("Su entrada es gratuita.");
			System.out.println("Resumen de su compra: " + entr1.toString());
		}
		
	}

	// M�TODOS GETTERS Y SETTERS
	
	public boolean isMenorEdad() {
		return menorEdad;
	}

	public void setMenorEdad(boolean menorEdad) {
		this.menorEdad = menorEdad;
	}

	public boolean isMalaga() {
		return malaga;
	}

	public void setMalaga(boolean malaga) {
		this.malaga = malaga;
	}

	
	// M�TODO TOSTRING
	
	@Override
	public String toString() {
		return "Usuario [edad=" + menorEdad + ", malaga=" + malaga + "]";
	}
	
	
}
