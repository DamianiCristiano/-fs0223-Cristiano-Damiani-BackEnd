package esercizio_venerdi;

public class Immagine extends Elemento_Multimediale implements interfaces.luminosita {
	
		private int luminosita;
	
	public Immagine(String titolo, int luminosita) {
		super(titolo);
		this.luminosita = luminosita;
	}

	public void abbastaLuminosita() {
		System.out.println(luminosita -= 1);
	}

	public void alzaLuminosita() {
		System.out.println(luminosita += 1);
	}

	public void show() {
		System.out.print(getTitolo());
		for (int i = 0; i < luminosita; i++) {
			System.out.print("*");
		}
	}


}
