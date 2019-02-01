public class SalaMasajes {
	
		//Attributes
		private boolean salaDisponible;
		private boolean salaPreparada;
		private boolean iluminacionYMusicaAdecuada;
		private boolean musicaConectada;
		private boolean toallasCambiadas;
		private int toallas;
		private int numSala;

		
		
		//Methods
		//Constructor
		public SalaMasajes (int numSala) {
			this.salaDisponible = true;
			this.salaPreparada = false;
			this.iluminacionYMusicaAdecuada = false;
			//this.musicaConectada = false;
			this.toallasCambiadas = false;
			this.toallas = 0;
			this.numSala = numSala;
		}
		
		//Functionalities
		protected void prepararSala () {
			if (!this.isSalaDisponible()) {
			} else if (!this.salaPreparada) {
				this.cambiarToallas (numSala);
				this.setIluminacionYMusicaAdecuada(true);
				this.setSalaPreparada(true);
			}
		}
		
		/*protected void encenderLuces () {
			if (!this.iluminacionAdecuada) {
				setIluminacionAdecuada (true);
				System.out.println("He encendido las luces tenues para masaje.");
			} else {
				System.out.println("No puedo encender de nuevo las luces tenues, ya est� la iluminaci�n adecuada.");
			}
		}

		protected void apagarLuces () {
			if (this.iluminacionAdecuada) {
				setIluminacionAdecuada (false);
				System.out.println("He apagado las luces adecuadas para masaje.");
			} else {
				System.out.println("No puedo volver a apagarlas porque ya lo est�n.");
			}
		}
		
		protected void encenderMusica () {
			if (!this.musicaConectada) {
				setMusicaConectada (true);
				System.out.println("Se ha encendido la m�sica.");
			} else {
				System.out.println("No te preocupes, porque ya est� encendida la m�sica.");
			}
		}
		
		protected void apagarMusica () {
			if (this.musicaConectada) {
				setMusicaConectada (false);
				System.out.println("He apagado la m�sica.");
			} else {
				System.out.println ("Est� ya apagada, puedes quedarte tranquilo.");
			}
		}*/
		
		protected void cambiarToallas (int numSala) {
			if (!this.toallasCambiadas) {
				if (this.toallas > 0) {
					setToallasCambiadas (true);
					setToallas (getToallas() - 1);
					System.out.println("\nSe han cambiado las toallas de la sala " + numSala + "\n");
				} else {
					System.out.println("\nNo quedan toallas limpias. Se mandan a lavander�a.\n.\n.\n.");
					setToallas (5);
					System.out.println("Se est�n lavando las toallas. Espera un rato para disponer de toallas nuevas y la sala est� disponible de nuevo.\n.\n.\n.\nYa se han lavado y secado las toallas.");
					this.cambiarToallas (numSala);
				}
			} else {
				System.out.println("\nNo hace falta cambiar toallas. Ya est�n cambiadas las toallas de la sala " + numSala + "");
			}
		}

		//Getters and setters
		
		public boolean isSalaDisponible() {
			return salaDisponible;
		}

		public void setSalaDisponible(boolean salaDisponible) {
			this.salaDisponible = salaDisponible;
		}
		
		public boolean isSalaPreparada() {
			return salaPreparada;
		}

		public void setSalaPreparada(boolean salaPreparada) {
			this.salaPreparada = salaPreparada;
		}

		public boolean isIluminacionYMusicaAdecuada() {
			return iluminacionYMusicaAdecuada;
		}

		public void setIluminacionYMusicaAdecuada(boolean iluminacionAdecuada) {
			this.iluminacionYMusicaAdecuada = iluminacionAdecuada;
		}

		public boolean isToallasCambiadas() {
			return toallasCambiadas;
		}

		public void setToallasCambiadas(boolean toallasCambiadas) {
			this.toallasCambiadas = toallasCambiadas;
		}

		public int getToallas() {
			return toallas;
		}

		public void setToallas(int toallas) {
			this.toallas = toallas;
		}
		
		//public String toStringDisponible() {
		//	return "SalaMasajes [salaDisponible=" + salaDisponible +
		//}
		@Override
		public String toString() {
			return "SalaMasajes [�Sala Disponible?=" + salaDisponible + ", �Sala Preparada?=" + salaPreparada +"�Iluminaci�n y m�sica adecuada?=" + iluminacionYMusicaAdecuada
					+ ", �M�sica Conectada?=" + musicaConectada + "]";
		}
		
}
