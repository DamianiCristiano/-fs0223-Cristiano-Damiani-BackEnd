import java.util.ArrayList;

public class Negozio {
	private ArrayList<Prodotto> Prodotti;

	public Negozio() {
		Prodotti = new ArrayList<Prodotto>();
	}

	public void aggiungiProdotto(Prodotto p) {
		Prodotti.add(p);
	}

	public void rimuoviProdotto(Prodotto p) {
		Prodotti.remove(p);
	}

	public void acquistaProdotto(Prodotto p) {
		if (p.getQuantity() > 0) {
			int q = p.getQuantity() - 1;
			System.out.println("prodotto " + p.getNome() + " acquistato " + (p.getQuantity() - 1));
			p.setQuantity(q);
		} else {
			System.out.println("No quantity");
		}
	}

	public void getProdotti() {
		for (Prodotto p : Prodotti) {
			System.out.println(p.toString());
		}
	}

	public Prodotto getProdotto(String name) {
		for (Prodotto p : Prodotti) {
			if (p.getNome().equals(name)) {
				return p;
			}
		}
		return null;
	}

}
