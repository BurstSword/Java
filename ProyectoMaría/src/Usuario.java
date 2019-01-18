public class Usuario {

	// ATRIBUTOS Y OBJETOS
	
	private boolean menorEdad;
	private boolean malaga;
	
	// MÉTODO CONSTRUCTOR
	
	public Usuario() {
		
		this.menorEdad = false;
		this.malaga = false;
	}
	
	// MÉTODOS Y FUNCIONALIDADES
	
	public void comprarEntrada(Entrada entrada) {
		
		
	}
	
	/*public void comprarEntradaPermanente(Entrada entrada) {
		
		if ((this.menorEdad = true) || (this.malaga = true)) {
			entrada.setGratis(true);
			entrada.setPermanente(true);
			entrada.setPrecioOficial(0);
			System.out.println("Su entrada es gratuita.");
			
		}
		else {
			entrada.setGratis(false);
			entrada.setPermanente(true);
			entrada.setPrecioOficial(10);
			System.out.println("Su entrada tiene un precio de " + entrada.getPrecioOficial());
			
		}
	}
	
	public void comprarEntradaTemporal(Entrada entrada) {
		
		if ((this.menorEdad) || (this.malaga)) {
			entrada.setGratis(false);
			entrada.setPermanente(false);
			entrada.setPrecioOficial(5);
			System.out.println("Su entrada tiene un precio de " + entrada.getPrecioOficial());
			
		}
		else {
			entrada.setGratis(true);
			entrada.setPermanente(false);
			entrada.setPrecioOficial(0);
			System.out.println("Su entrada es gratuita.");
			
		}
		
	}*/

	// MÉTODOS GETTERS Y SETTERS
	
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

	
	// MÉTODO TOSTRING
	
	@Override
	public String toString() {
		return "Usuario [edad=" + menorEdad + ", malaga=" + malaga + "]";
	}
	
	
}
