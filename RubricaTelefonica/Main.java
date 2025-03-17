import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Rubrica r = new Rubrica();
		Scanner sc = new Scanner(System.in);
		int scelta;
		
		System.out.println("Decidi cosa fare:");
		do {
			 System.out.println("1. Aggiungi contatto");
			 System.out.println("2. Visualizza contatti");
			 System.out.println("4. Cerca contatto per nome");
			 System.out.println("4. Rimuovi contatto");
			 System.out.println("5. Esci");
			 scelta = sc.nextInt();
			 sc.nextLine();
			 if (scelta <= 0 || scelta > 5) {
				 System.out.println("Scelta non valida. Riprova.");
                 continue;
			 } 
			 else if (scelta == 1) {
				 System.out.println("Inserisci nome:");
                 String nome = sc.nextLine();
                 System.out.println("Inserisci numero:");
                 String numero = sc.nextLine();
                 Contatto c = new Contatto(nome, numero);
                 r.aggiungiContatto(c);;
			 }
			 else if (scelta == 2) {
                 r.stampaContatti();
             }
			 else if (scelta == 3) {
				 System.out.println("Inserisci nome del contatto da cercare:");
                 String nome = sc.nextLine();
                 Contatto c = r.cercaContattoByName(nome);
                 if (c!= null) {
                	 System.out.println(c);
                 }
                 else {
                     System.out.println("Contatto non trovato.");
                 }
             }
			 else if (scelta == 4) {
				 System.out.println("Inserisci nome del contatto da rimuovere:");
                 String nome = sc.nextLine();
                 Contatto c = r.cercaContattoByName(nome);
                 if (c != null) {
                	 r.rimuoviContatto(c);
                     System.out.println("Contatto rimosso.");
                 }
                 else {
                     System.out.println("Contatto non trovato.");
                 }
             }
			 
		} while (scelta != 5);
		System.out.println("arrivederci!");

	}

}
