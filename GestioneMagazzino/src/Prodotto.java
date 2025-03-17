
public class Prodotto {
	private String nome;
	private double prezzo;
	private int quantity;
	private String category;
	
	public Prodotto(String nome, double prezzo, int quantity, String category) {
		this.nome = nome;
        this.prezzo = prezzo;
        this.quantity = quantity;
        this.category = category;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPrezzo() {
		return prezzo;
	}
	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "Prodotto [nome = " + nome + ", prezzo = " + prezzo + ", quantity = " + quantity + ", category = " + category
				+ "]";
	}
	
	
	

}
