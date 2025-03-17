
public class Prodotto {
	private String nome;
	private double prezzo;
	private int quantity;

	public Prodotto(String nome, double prezzo, int quantiy) {
		this.nome = nome;
		this.prezzo = prezzo;
		this.quantity = quantiy;
	}

	public Prodotto() {
		this.nome = "";
		this.prezzo = 0.0;
		this.quantity = 0;
	}

	public String getNome() {
		return nome;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrezzoTotale() {
		return prezzo;
	}

	@Override
	public String toString() {
		return "Prodotto: " + nome + ", Prezzo: " + prezzo + ", Quantita': " + quantity;
	}

}
