package esercizio_venerdi;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Elemento_Multimediale[] arr = new Elemento_Multimediale[5];
		
		Scanner sc = new Scanner(System.in);
		
		
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println("che cosa vuoi salvare? ");
			String tipo = sc.nextLine();
			
			if (tipo.equals("Registrazione_Audio")) {
				
				System.out.println("che titolo ha? ");
				String titolo = sc.nextLine();
				System.out.println("che durata ha? ");
				int durata = sc.nextInt();
				System.out.println("che volume ha? ");
				int volume = sc.nextInt();
				sc.nextLine();
				Registrazione_Audio elemento = new Registrazione_Audio(titolo, durata, volume);
				arr[i] = elemento;
				
			} 	else if (tipo.equals("Immagine")) {
				System.out.println("che titolo ha? ");
				String titolo = sc.nextLine();
				System.out.println("che luminosita ha? ");
				int luminosita = sc.nextInt();
				sc.nextLine();
				Immagine elemento = new Immagine(titolo, luminosita);
				arr[i] = elemento;
				
			} 	else if (tipo.equals("Video")) {
				System.out.println("che titolo ha? ");
				String titolo = sc.nextLine();
				System.out.println("che durata ha? ");
				int durata = sc.nextInt();
				System.out.println("che volume ha? ");
				int volume = sc.nextInt();
				System.out.println("che luminosita ha? ");
				int luminosita = sc.nextInt();
				sc.nextLine();
				Video elemento = new Video(titolo, durata, volume, luminosita);
				arr[i] = elemento;
			}
		}
		
		int scelta;
		
		do {
			System.out.println("scegli un oggetto da 1 a 5 oppure termina il processo con 0: ");
			scelta = sc.nextInt();
			if (scelta >= 1 && scelta <= 5) {
				if (arr[scelta - 1] instanceof Registrazione_Audio) {
					Registrazione_Audio Umberto = (Registrazione_Audio)arr[scelta -1];
					Umberto.play();
				}
				else if (arr[scelta - 1] instanceof Immagine) {
					Immagine Umberto = (Immagine)arr[scelta -1];
					Umberto.show();
				}
				else if (arr[scelta - 1] instanceof Video) {
					Video Umberto = (Video)arr[scelta -1];
					Umberto.play(); 
				}
			}
			
		} while (scelta != 0);
		
		
		
	}

}
