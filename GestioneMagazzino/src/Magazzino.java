import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Magazzino {

	private static final String FILE_NAME;
	private static final Scanner sc;

	static {
		FILE_NAME = "prodotti.txt";
		sc = new Scanner(System.in);
	}

	int scelta;

	private void addProduct() {
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME, true))) {
			System.out.println("nome prodotto: ");
			String nome = sc.nextLine().toLowerCase().trim();

			System.out.println("prezzo prodotto: ");
			double prezzo = sc.nextDouble();
			sc.nextLine();
			

			System.out.println("quantita prodotto: ");
			int quantita = sc.nextInt();
			sc.nextLine();

			System.out.println("categoria prodotto: ");
			String categoria = sc.nextLine().toLowerCase().trim();

			String prodotto = nome + "," + prezzo + "," + quantita + "," + categoria;

			writer.write(prodotto);
			writer.newLine();
			System.out.println("prodotto aggiunto correttamente");
			

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		return;
	}

	private void visualizza() {
		try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
			String testo;
			System.out.printf("\t%-10s%-10s%-10s%-10s\n", "nome", "prezzo", "quantita'", "categoria");
			while ((testo = reader.readLine()) != null) {
				String[] prodotto = testo.split(",");
				System.out.printf("\t%-10s%-10s%-10s%-10s\n", prodotto[0], prodotto[1], prodotto[2], prodotto[3]);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
	}

	private void cercaProdotto() {
		System.out.print("cerca prodotto:");
		String prodotto = sc.nextLine();
		Boolean result = false;

		try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
			String line;
			while ((line = reader.readLine()) != null) {
				String[] lista = line.split(",");
				if (lista[0].toLowerCase().equals(prodotto.toLowerCase())) {
					System.out.printf("\t%-20s%-10s%-10s%-15s\n", "nome", "prezzo", "quantita'", "categoria");
					System.out.printf("\t%-20s%-10s%-10s%-15s\n", lista[0], lista[1], lista[2], lista[3]);
					result = true;
				}
			}
		} catch (IOException e) {
			System.out.println("Errore");
		}
		if (!result) {
            System.out.println("Prodotto non trovato");
        }
		return;
	}
	
	private static void aggiornaQuantita () {
		System.out.println("aggiorna prodotto:");
		String prodotto = sc.nextLine();
		
		 ArrayList<String> righeAggiornate = new ArrayList<>();

		boolean trovato = false;
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
        	String line;
        	try {
				while ((line = reader.readLine()) != null) {
						String[] lista = line.split(",");
				    if (lista[0].toLowerCase().equals(prodotto.toLowerCase())) {
				    	System.out.println("inserisci la quantita':");
				    	int quantita = sc.nextInt();
				    	sc.nextLine();
				        trovato = true;
				        lista[2] = String.valueOf(quantita);
				        }
				    
				    String nuovaRiga = String.join(",", lista);
		            righeAggiornate.add(nuovaRiga);
		            
				}
				
			} catch (IOException e) {
				e.printStackTrace();
			}
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME))) {
                for (String riga : righeAggiornate) {
                    writer.write(riga);
                    writer.newLine();
                }}
        } catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		} 	
        return;
	}
	
	
	
	public void Programma() {

		do {
			System.out.println("dimmi cosa vuoi fare?");
			scelta = sc.nextInt();
			sc.nextLine();
			if (scelta <= 0 || scelta > 5) {
				System.out.println("scelta errata");
			} else {
				if (scelta == 1) {
					addProduct();
				}
				if (scelta == 2) {
					visualizza();
				}
				if (scelta == 3) {
					cercaProdotto();
				}
				if (scelta == 4) {
                    aggiornaQuantita();
                }

			}

		}

		while (scelta != 5);
	}

}
