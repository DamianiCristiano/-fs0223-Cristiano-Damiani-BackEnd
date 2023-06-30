package esercizio_venerdi;

public class Registrazione_Audio extends Elemento_Multimediale implements interfaces.volume {
	
	private int volume;
	private int durata;
	public Registrazione_Audio(String titolo, int durata , int volume) {
		super(titolo);
		this.durata = durata;
		this.volume = volume;
	}
	
	public int getVolume() {
		return volume;
	}

	public void abbassaVolume() {
		System.out.println(volume -= 1);
	}
	
	public void alzaVolume() {
		System.out.println(volume += 1);
	}

	public void play() {
		System.out.println("Riproduzione dell' audio: " + getTitolo());
		
		
		for (int i = 0; i < durata; i++) {
			System.out.println(getTitolo() + " ");
			for (int j = 0; j < volume; j++) {
				System.out.print("!");
			}
		}
		System.out.println();
	}

	
}
