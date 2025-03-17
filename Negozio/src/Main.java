import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Negozio n = new Negozio();
		int scelta;
		Prodotto p = new Prodotto();
		
		System.out.println("Benvenuto!");
		do {
			System.out.println("1) Aggiungi un prodotto");
			System.out.println("2) Visualizzare i prodotti");
			System.out.println("3) Acquista un prodotto");
			System.out.println("4) Rimuovi un prodotto");
			System.out.println("5) Esci");
			scelta = sc.nextInt();
			sc.nextLine();
			if (scelta <= 0 || scelta > 5) {
				System.out.println("Scelta non valida!");
                continue;
			}
			else if (scelta == 1) {
				System.out.println("Nome prodotto:");
				String nome = sc.nextLine();
				System.out.println("Prezzo prodotto:");
				double prezzo = sc.nextDouble();
				System.out.println("Quantita prodotto:");
				int quantita = sc.nextInt();
				p = new Prodotto(nome, prezzo, quantita);
				n.aggiungiProdotto(p);
			}
			else if (scelta == 2) {
                n.getProdotti();
            }
			else if (scelta == 3) {
				System.out.println("Nome prodotto:");
                String nome = sc.nextLine();
                p = n.getProdotto(nome);
                n.acquistaProdotto(p);;
			}
			else if (scelta == 4) {
				System.out.println("Nome prodotto:");
                String nome = sc.nextLine();
                p = n.getProdotto(nome);
                n.rimuoviProdotto(p);;
			}
			
		} while (scelta != 5);
		System.out.println("buonagiornata");
		sc.close();

	}

}
