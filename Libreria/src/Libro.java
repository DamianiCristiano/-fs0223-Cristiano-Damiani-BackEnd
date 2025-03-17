
public class Libro {
	private String titolo;
	private String autore;
	private int anno;
	
	public Libro(String titolo, String autore, int anno) {
        this.titolo = titolo;
        this.autore = autore;
        this.anno = anno;
    }
	
	public Libro() {
		this.titolo = "";
		this.autore = "";
		this.anno = 0;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public String getAutore() {
		return autore;
	}

	public void setAutore(String autore) {
		this.autore = autore;
	}

	public int getAnno() {
		return anno;
	}

	public void setAnno(int anno) {
		this.anno = anno;
	}
	
	
	@Override
	public String toString() {
		return "Libro" + this.titolo + " " + this.autore + " " + this.anno; 
	}

	
	
}
