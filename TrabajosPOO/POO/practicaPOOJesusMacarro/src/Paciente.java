import java.util.Scanner;

public class Paciente {
	//Attributes
	private int numPaciente;
	private String nombre;
	private int edad;
	private int salaAsignada;
	private int numSalaPreAsignada;
	private int saldoTarjeta;
	private boolean enMasaje;
	private boolean registrado;
	
	//Methods
	//Constructor
	public Paciente (int numPaciente , String nombre) {
		this.numPaciente = numPaciente;
		this.nombre = nombre;
		this.edad = edad;
		this.saldoTarjeta = 0;
		this.enMasaje = false;
		this.salaAsignada = 0;
		this.numSalaPreAsignada = 0;
		this.registrado = false;
		
	}
	
	//Functionalities
	//public void 
	protected void asignarSala (SalaMasajes [] salas) {
		//Creating object scanner
		Scanner sc = new Scanner (System.in);
		
		for (int i = 0 ; i < salas.length ; i++) {
			if (salas [i].isSalaPreparada()) {
				System.out.println(salas [i]);
				this.setEnMasaje (true);
				this.setSalaAsignada(i);
				salas [i].setSalaDisponible (false);
				salas [i].setSalaPreparada (false);
				
				System.out.println("La sala n�mero " + (i+1) + " ha sido ocupada por el paciente " + this.getNumPaciente () + "");
			} else if (!salas [i].isSalaDisponible()) {
				System.out.println("La sala n�mero " + (i+1) + " est� ocupada.");
			} else {

				System.out.println("La sala n�mero " + (i+1) + " est� disponible pero no est� preparada."
						+ "\n�Deseas prepararla?\n1 - S�\n2 - No");
				if (sc.nextInt() == 1) {
					numSalaPreAsignada = i;
					salas [i].prepararSala ();
					asignarSala(salas);
				} else {
					System.out.println("�Est�s seguro de que no quieres preparar la sala? "
							+ "Podr�as estar haciendo esperar m�s de la cuenta a alg�n paciente.\n1 - S�\n2 - No");
					int aux = sc.nextInt();
					if (aux == 1) {
						System.out.println("Verdad. A�n tienes tiempo. El paciente est� tomando un zumo en la sala de espera.\nPero recuerda tener preparada la sala para cuando haya finalizado su zumo"); 
					} else if (aux == 2) {
						salas [i].prepararSala ();
						asignarSala(salas);
					} else {
						System.out.println("Par�metro no permitido.");
					}
				}
			}
		}
	}
		
	protected void pagarMasaje () {
		//Creating object Scanner
		Scanner sc = new Scanner (System.in);

		//Instructions
		
		if (this.getSaldoTarjeta () >= 45) {
			this.setSaldoTarjeta (this.getSaldoTarjeta () - 45);
			System.out.println("Paciente: " + this.getNumPaciente() + "\nNombre: " + this.getNombre() + "\nImporte masaje: " + 45 + " �\nSaldo restante: " + this.getSaldoTarjeta());
		} else {
			System.out.println("No dispones de saldo suficiente\n\n�Deseas recargar tu tarjeta?\n1 - S�.\n2 - No.");
			if (sc.nextInt() == 1) {
				this.recargarTarjeta();
				this.pagarMasaje();
			}
		}
	}
	
	protected void recargarTarjeta () {
		//Creating object Scanner
		Scanner sc = new Scanner (System.in);
		
		//Instructions
		System.out.println("�Importe a recargar?");
		this.setSaldoTarjeta (this.getSaldoTarjeta () + sc.nextInt());
		System.out.println("Paciente: " + this.getNumPaciente() + "\nNombre: " + this.getNombre() + "\nNuevo Saldo: " + this.getSaldoTarjeta());
	}
	
	//getters and setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getNumPaciente() {
		return numPaciente;
	}

	public void setNumPaciente(int numPaciente) {
		this.numPaciente = numPaciente;
	}

	/*public int getTarjetaCredito() {
		return tarjetaCredito;
	}

	public void setTarjetaCredito(int tarjetaCredito) {
		this.tarjetaCredito = tarjetaCredito;
	}*/

	public int getSaldoTarjeta() {
		return saldoTarjeta;
	}

	public void setSaldoTarjeta(int saldoTarjeta) {
		this.saldoTarjeta = saldoTarjeta;
	}

	public boolean isEnMasaje() {
		return enMasaje;
	}

	public void setEnMasaje(boolean enMasaje) {
		this.enMasaje = enMasaje;
	}

	public int getSalaAsignada() {
		return salaAsignada;
	}

	public void setSalaAsignada(int salaAsignada) {
		this.salaAsignada = salaAsignada;
	}

	public int getNumSalaPreAsignada() {
		return numSalaPreAsignada;
	}

	public void setNumSalaPreAsignada(int numSalaPreAsignada) {
		this.numSalaPreAsignada = numSalaPreAsignada;
	}

	public boolean isRegistrado() {
		return registrado;
	}

	public void setRegistrado(boolean registrado) {
		this.registrado = registrado;
	}

	public void toStringEnMasaje (Paciente [] pacientes) {
		for (int i = 0 ; i < pacientes.length ; i++) {
			if (pacientes [i].isEnMasaje ()) {
				System.out.println(this.getNumPaciente());
			}
		}
	
	}
	

	public String toStringEsperando() {
		return "Paciente [numPaciente=" + numPaciente + ", enMasaje=" + enMasaje + "]";
	}

	@Override
	public String toString() {
		return "Paciente [numPaciente=" + numPaciente + ", nombre=" + nombre + ", edad=" + edad + ", salaAsignada="
				+ salaAsignada + ", saldoTarjeta=" + saldoTarjeta + ", enMasaje=" + enMasaje + "]";
	}




	
}
