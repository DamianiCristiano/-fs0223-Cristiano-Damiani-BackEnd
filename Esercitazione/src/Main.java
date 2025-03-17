import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		int scelta;
		Dipendente[] dipendenti = new Dipendente[0];
		
		System.out.println("Buongiorno! cosa vuole fare?:");
		do {
			System.out.println("1) aggiungere un dipendente");
			System.out.println("2) elencare i dipendenti");
			System.out.println("3) cercare un dipendente");
			System.out.println("4) eliminare un dipendente");
			System.out.println("5) Esci e chiudi il programma");
			try {
				scelta = sc.nextInt();				
			} catch (InputMismatchException e) {
				scelta = 0;
			}
			sc.nextLine();
			
			if (scelta == 1)
			{
				boolean isF = true;
				while (isF)
				try {
					Dipendente nuovoDipendente = Dipendente.createDipendente(sc);
					dipendenti = Arrays.copyOf(dipendenti, dipendenti.length + 1);
					dipendenti[dipendenti.length - 1] = nuovoDipendente;
					System.out.println("Dipendente aggiunto con successo!");
					System.out.println(nuovoDipendente.toString());
					isF = false;
					
				} catch (Exception e) {
						System.out.println("Eta' non valida");
						sc.nextLine();
				}
				
			}
			
			else if (scelta == 2) 
			{
				for (int i = 0; i < dipendenti.length; i++) {
					System.out.println(dipendenti[i].toString());	 
				}
			}
			
			else if (scelta == 3) 
			{			
				
				 System.out.print("lo vuoi cercare per: \n"
				 		+ "1)per nome\n"
				 		+ "2)per cognome\n"
				 		+ "3)per email\n"
				 		+ "4)per eta'");
				 
				 int sceltaCerca = sc.nextInt();
				 sc.nextLine();
				 
				 if (sceltaCerca == 1) {
					 System.out.print("inserisci il nome del dipendente che stai cercando:");
					 String nomeCercare = sc.nextLine();
					 if (Arrays.toString(dipendenti).contains(nomeCercare)) 
					 {
						 for (int i = 0; i < dipendenti.length; i++) {
							 if (dipendenti[i].getNome().equalsIgnoreCase(nomeCercare)) {
								 System.out.println(dipendenti[i].toString());
							 }
						 }
					 } else {
						 System.out.println("Dipendente non trovato!");
						 break;
					 }
				 }
				 
				 else if (sceltaCerca == 2) {
					 System.out.print("inserisci il cognome del dipendente che stai cercando:");
					 String cognomeCercare = sc.nextLine();
					 if (Arrays.toString(dipendenti).contains(cognomeCercare))
						 {
                         for (int i = 0; i < dipendenti.length; i++) {
                             if (dipendenti[i].getCognome().equalsIgnoreCase(cognomeCercare)) {
                                 System.out.println(dipendenti[i].toString());
                             }
                         }
                     } else {
                    	 System.out.println("Dipendente non trovato!");
                         break;
                     }
				 }
				 
				 else if (sceltaCerca == 3) {
					 System.out.print("inserisci l'email del dipendente che stai cercando:");
					 String emailCercare = sc.nextLine();
					 if (Arrays.toString(dipendenti).contains(emailCercare))
						 {
                         for (int i = 0; i < dipendenti.length; i++) {
                             if (dipendenti[i].getEmail().equalsIgnoreCase(emailCercare)) {
                                 System.out.println(dipendenti[i].toString());
                             }
                         }
                     } else {
                         System.out.println("Dipendente non trovato!");
                         break;
                     }
				 }
				 
				 else if (sceltaCerca == 4) {
					 System.out.print("inserisci l'eta' del dipendente che stai cercando:");
					 int etaCercare = sc.nextInt();
					 sc.nextLine();
					 if (Arrays.toString(dipendenti).contains(etaCercare + ""))
						 {
                         for (int i = 0; i < dipendenti.length; i++) {
                             if (dipendenti[i].getAnni() == etaCercare) {
                                 System.out.println(dipendenti[i].toString());
                             }
                         }
                     } else {
                         System.out.println("Dipendente non trovato!");
                         break;
                     }
				 }
			}
			
			else if (scelta == 4) 
			{
				System.out.print("inserisci il nome del dipendente che vuoi eliminare:");
				String dCacciato = sc.nextLine();
				for (int i = 0; i < dipendenti.length; i++) {
					if (dipendenti[i].getNome().equalsIgnoreCase(dCacciato)) 
					{
						Dipendente[] arrT = dipendenti;
						int count = 0;
						for (int j = 0; j < arrT.length; j++) {
                            if (arrT[j].getNome().equalsIgnoreCase(dCacciato)) {
                            	count++;
                            }
                        }
						System.out.println(count);
						dipendenti = new Dipendente[arrT.length - count];
						for (int ite = 0, j = 0; j < arrT.length; j++) {
                            if (!arrT[j].getNome().equalsIgnoreCase(dCacciato)) {
                            	dipendenti[ite] = arrT[j];
                            	ite++;
                            }
                        }
					} 
					break;
				}
			}
			
			else if (scelta > 5 || scelta < 1)
			{
				System.out.println("scelta non valida");
			}
			
		} while(scelta != 5);
		
		System.out.println("Buonagiornata e arrivederci!");
		
	}

}
