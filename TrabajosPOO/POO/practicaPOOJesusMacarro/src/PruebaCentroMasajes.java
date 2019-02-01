import java.util.Scanner;

//import masajes.ProbarMasajes;

public class PruebaCentroMasajes {

	//Main method
	public static void main (String [] args) {
		//Declaring variables
		int numPaciente;
		int numMenu;
		int numSala;
		int aux;
		//Initializing variables
		numPaciente = 5;//initialize in 5, for demo start with 4 patients already signed up and "patient 0"
		numMenu = 0;
		numSala = 0;
		aux = 0;
		
		//Creating objects
		Scanner sc = new Scanner (System.in);
		PruebaCentroMasajes p = new PruebaCentroMasajes ();
		
		//Creating arrays objects
		SalaMasajes [] salas = new SalaMasajes [3];
		Paciente [] pacientes = new Paciente [5];
		
		//Initializing arrays objects
		for (int i = 0 ; i < salas.length ; i++) {
			salas [i] = new SalaMasajes (i+1);
		}
		salas [0].setSalaDisponible(false);
		salas [1].setSalaDisponible(false);
		salas [0].setIluminacionYMusicaAdecuada(true);
		salas [1].setIluminacionYMusicaAdecuada(true);
		
		for (int i = 0 ; i < pacientes.length ; i++) {
			pacientes [i] = new Paciente (i , "");
		}
		
		pacientes [0] = new Paciente (0 , "Paciente 0");
		
		pacientes [1] = new Paciente (1 , "Javier");
		pacientes [1].setNumPaciente(1);
		pacientes [1].setSalaAsignada(1);
		pacientes [1].setEnMasaje(true);
		pacientes [1].setRegistrado(true);
		pacientes [2] = new Paciente (2 , "Mary");
		pacientes [2].setSalaAsignada(2);
		pacientes [2].setEnMasaje(true);
		pacientes [2].setRegistrado(true);
		pacientes [3] = new Paciente (3 , "Susana");
		pacientes [3].setSalaAsignada(0);
		pacientes [3].setRegistrado(true);
		pacientes [4] = new Paciente (4 , "�lvaro");
		pacientes [4].setRegistrado(true);
		
		//Functional Control Menu
		do {
			System.out.println("\n�Qu� deseas hacer?\n------------------"
					+ "\n1 - Listado de pacientes.\n2 - Registrar paciente."
					+ "\n3 - Dar de baja a un paciente.\n4 - Asignar sala a paciente."
					+ "\n5 - Preparar sala.\n6 - Cobrar paciente.\n7 - Salir.");
			numMenu = sc.nextInt();
			if (numMenu >= 1 && numMenu <= 7) {
				
			switch (numMenu) {

				case 1 :
					p.listarPacientes(pacientes, numPaciente);

					break;	
				
				case 2 :
					p.registrarPaciente(pacientes , numPaciente);
					numPaciente++;
					
					break;
					
				
				case 3 :
					p.darDeBajaPaciente(pacientes);
					numPaciente--;
					
					break;
				
				case 4 :
					p.listarPacientesDisponibles(pacientes , numPaciente);
					p.listarSalasDisponibles(salas);
					System.out.println("�Qu� n�mero de paciente va a ir a la sala?");
					aux = sc.nextInt();
					if (aux <= 0 | aux >= 10) {
						System.out.println("Lo siento. No dispongo de datos para ese n�mero de pacientes."
								+ "\nMi base de datos est� limitada a 5");
					} else {
						if (!pacientes [aux].isRegistrado()) {
							
							System.out.println("No existe ese paciente");
							
						} else if (pacientes [aux].isEnMasaje()) {
							
							System.out.println("El paciente " + aux + " est� en masaje en la sala " 
							+ pacientes [aux].getSalaAsignada () 
							+ "\nNo se le puede dar otro masaje mientras est� ya en masaje.");
						} else {

							pacientes [aux].asignarSala (salas);
							break;
						}
					}

					break;
				
				case 5 :
					p.pedirPrepararSala(pacientes, salas);
					/*for (int i = 0 ; i < salas.length ; i++) {
						if (salas [i].isSalaDisponible()) {
							if (!salas [i].isSalaPreparada()) {
								System.out.println("La sala " + (i+1) + " est� disponible y por preparar.");
								System.out.println("�La quieres preparar?\n1 - S�\n2 - No");
								aux = sc.nextInt();
								if (aux == 1) {
									salas[i].prepararSala();
									System.out.println("\nSe han encendido las luces y la m�sica de la sala " + (i+1) + "\nYa est� preparada y puedes asignarla a un paciente.");
								} else if (aux == 2){
									System.out.println("�Est�s seguro de que no quieres preparar la sala? "
											+ "Podr�as estar haciendo esperar m�s de la cuenta a alg�n paciente.\n1 - S�\n2 - No");
									aux = sc.nextInt();
									if (aux == 1) {
										System.out.println("Verdad. A�n tienes tiempo. El paciente est� tomando un zumo en la sala de espera.\nPero recuerda tener preparada la sala para cuando haya finalizado su zumo"); 
									} else if (aux == 2) {
										salas [i].prepararSala ();
									} else {
										System.out.println("Par�metro no permitido.");
									}
								}
							} else {
								System.out.println("La sala " + (i+1) + " est� disponible y preparada. Puedes asignarla a un paciente.");
							}
						} else {
							System.out.println("La sala " + (i+1) + " est� ocupada. No se puede preparar ahora.");
						}
					}*/
					
					break;
				
				case 6 :
					System.out.println("Introduce el n�mero del paciente que se marcha");
					numPaciente = sc.nextInt();
					pacientes [numPaciente].pagarMasaje();
					salas [(pacientes [numPaciente].getSalaAsignada ()-1)].setSalaDisponible(true);
					
					break;
				
				case 7 :
					System.out.println("Se procede a cerrar el centro de masajes");
					p.cerrarCentroMasajes (salas , pacientes , numPaciente);
				}
			} else {
				System.out.println("\nPor favor, introduce un par�metro correcto (entre 1 y 7)");
			} 
		} while (numMenu != 7);
		
		System.out.println("�Hasta Ma�ana!");
	}
	
	public void listarPacientes (Paciente [] pacientes , int numeroPaciente) {
		//Instructions
		/*if (numeroPaciente == 1) {
			System.out.println ("Listado vac�o. No tenemos ning�n paciente registrado");
		} else {*/
			for (int i = 1 ; i < numeroPaciente ; i++ ) {
				if (pacientes [i].isRegistrado()) {
				System.out.println (pacientes [i].toString());
				}
			}
		//}
	}
	
	public void listarPacientesDisponibles (Paciente [] pacientes , int numeroPaciente) {
		//Instructions
		if (numeroPaciente == 1) {
			System.out.println ("Listado vac�o. No tenemos ning�n paciente registrado");
		} else {
			for (int i = 1 ; i < numeroPaciente ; i++ ) {
				if (!pacientes [i].isEnMasaje()) {
					System.out.println("Paciente: " + i + " est� esperando.");
				} else {
					System.out.println("Paciente: " + i + " est� recibiendo ya un masaje.");
				}
			}
		}
	}
	
	public void registrarPaciente (Paciente [] pacientes , int numeroPaciente) {
		//Creating object Scanner
		Scanner sc = new Scanner (System.in);
		
		//Instructions
		if (numeroPaciente < 5) {
			for (int i = 0 ; i < 5 ; i++) {
				if (!pacientes [i].isRegistrado()) {
					System.out.println("Numero de registro de paciente disponible: " + i);
				}

			}
			System.out.println("�Qu� n�mero de los disponibles quieres dar al nuevo paciente?");
			pacientes [numeroPaciente]= new Paciente (sc.nextInt() , "");
			System.out.println("�Nombre del paciente?");
			pacientes [numeroPaciente].setNombre(sc.next());
			System.out.println("�Edad del paciente?"); 
			pacientes [numeroPaciente].setEdad(sc.nextInt());
			System.out.println("�Importe saldo tarjeta pre-pago?");
			pacientes [numeroPaciente].setSaldoTarjeta(sc.nextInt());
			pacientes [numeroPaciente].setRegistrado(true);
		} else {
			System.out.println("No podemos dar de alta a m�s clientes. Nuestra base de datos est� completa.");
		}
	}
	
	public void darDeBajaPaciente (Paciente [] pacientes) {
		Scanner sc = new Scanner (System.in);
		System.out.println("numero Paciente  baja?");
		int aux = sc.nextInt();
		pacientes [aux].setNombre("");
		pacientes [aux].setEdad(0);
		pacientes [aux].setEnMasaje(false);
		pacientes [aux].setNumSalaPreAsignada(0);
		pacientes [aux].setRegistrado(false);
		pacientes [aux].setSaldoTarjeta(0);
		pacientes [aux].setSalaAsignada(0);
	}

	public void listarSalasDisponibles (SalaMasajes [] salas) {
		for (int i = 0 ; i < salas.length ; i++) {
			if (salas [i].isSalaDisponible()) {
				System.out.println("\nSala: "+ (i+1) + " est� disponible.");
			}
		}
		
	}
	
	/*protected void asignarSala (SalaMasajes [] salas , Paciente [] pacientes , int numeroPaciente) {
		//Creating object scanner
		Scanner sc = new Scanner (System.in);
		
		for (int i = 0 ; i < salas.length ; i++) {
			if (salas [i].isSalaPreparada()) {
				System.out.println(salas [i]);
				pacientes [numeroPaciente].setEnMasaje (true);
				pacientes [numeroPaciente].setSalaAsignada(i);
				salas [i].setSalaDisponible (false);
				salas [i].setSalaPreparada (false);
				
				System.out.println("La sala n�mero " + (i+1) + " ha sido ocupada por el paciente " + pacientes [numeroPaciente].getNumPaciente () + ".");
			} else if (!salas [i].isSalaDisponible()) {
				System.out.println("La sala n�mero " + (i+1) + " est� ocupada.");
			} else {
				pedirPrepararSala(pacientes , salas , numeroPaciente);
				/*System.out.println("La sala n�mero " + (i+1) + " est� disponible pero no est� preparada."
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
				}*/
	/*		}
		}
	}*/
	
	public void pedirPrepararSala (Paciente [] pacientes , SalaMasajes [] salas) {
		int aux = 0;
		Scanner sc = new Scanner (System.in);
		PruebaCentroMasajes p = new PruebaCentroMasajes ();
		
		for (int i = 0 ; i < salas.length ; i++) {
			if (salas [i].isSalaDisponible()) {
				if (!salas [i].isSalaPreparada()) {
					System.out.println("La sala " + (i+1) + " est� disponible y por preparar.");
					System.out.println("�La quieres preparar?\n1 - S�\n2 - No");
					aux = sc.nextInt();
					if (aux == 1) {
						salas[i].prepararSala();
						System.out.println("\nSe han encendido las luces y la m�sica de la sala " + (i+1) + "\nYa est� preparada y puedes asignarla a un paciente.");

					} else if (aux == 2){
						System.out.println("�Est�s seguro de que no quieres preparar la sala? "
								+ "Podr�as estar haciendo esperar m�s de la cuenta a alg�n paciente.\n1 - S�\n2 - No");
						aux = sc.nextInt();
						if (aux == 1) {
							System.out.println("Verdad. A�n tienes tiempo. El paciente est� tomando un zumo en la sala de espera.\nPero recuerda tener preparada la sala para cuando haya finalizado su zumo"); 
						} else if (aux == 2) {
							salas [i].prepararSala ();
						} else {
							System.out.println("Par�metro no permitido.");
						}
					}
				} else {
					System.out.println("La sala " + (i+1) + " est� disponible y preparada. Puedes asignarla a un paciente.");
				}
			} else {
				System.out.println("La sala " + (i+1) + " est� ocupada. No se puede preparar ahora.");
			}
		}
	}

	public void cerrarCentroMasajes (SalaMasajes [] salas , Paciente [] pacientes , int numeroPaciente) {
		for (int i = 0 ; i < 5 ; i++) {
			if (pacientes [i].isEnMasaje()) {
				System.out.println("Los pacientes acaban de terminar. Se procede a cobrar los tratamientos");
				pacientes [i].pagarMasaje();
				}
			}
			System.out.println("No quedan ya pacientes en las salas de masajes.\nSe procede a apagar luces y m�sica");
		for (int j = 0 ; j < salas.length ; j++) {
			if (salas [j].isIluminacionYMusicaAdecuada()) {
				salas [j].setIluminacionYMusicaAdecuada(false);
				System.out.println("Las luces y la m�sica se han apagado");			
			} else {
				System.out.println("Las luces y la m�sica ya estaban apagadas");
			}
		}
		System.out.println("El local queda vac�o y todo apagado.");
	}
}
