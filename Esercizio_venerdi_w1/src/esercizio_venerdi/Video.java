package esercizio_venerdi;

public class Video extends Elemento_Multimediale implements interfaces.luminosita,interfaces.volume {

	private int volume;
	private int luminosita;
	private int durata;
	
	public Video(String titolo, int durata, int volume, int luminosita) {
		super(titolo);
		this.durata = durata;
		this.volume = volume;
		this.luminosita = luminosita;
	}
	
	
	
	
	public int getVolume() {
		return volume;
	}


	public int getLuminosita() {
		return luminosita;
	}

	

	
	public void play() {
		System.out.println("Riproduzione del video: " + getTitolo());
		for (int i = 0; i < durata; i++) {
			System.out.println(getTitolo() + " ");
			for (int j = 0; j < volume; j++) {
				System.out.print("!");
				}
			for (int j2 = 0; j2 < luminosita; j2++) {
				System.out.print("*");
			}
		}
		System.out.println();
	}


	public void alzaVolume() {
		System.out.println(volume += 1);
	}


	public void abbassaVolume() {
		System.out.println(volume -= 1);
		
	}


	public void abbastaLuminosita() {
		System.out.println(luminosita -= 1);
		
	}


	public void alzaLuminosita() {
		System.out.println(luminosita += 1);
		
	}
	
}
