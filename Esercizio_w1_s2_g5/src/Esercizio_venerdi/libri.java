package Esercizio_venerdi;

public class libri extends catalogo {

	public libri(String isbn, String titolo, Integer annoPublicazione, Integer numeroPagine, String autore,
			String genere) {
		super(isbn, titolo, annoPublicazione, numeroPagine);
		this.autore = autore;
		this.genere = genere;
	}

	private String autore;
	private String genere;

	public String getAutore() {
		return autore;
	}

	public void setAutore(String autore) {
		this.autore = autore;
	}

	public String getGenere() {
		return genere;
	}

	public void setGenere(String genere) {
		this.genere = genere;
	}

}
