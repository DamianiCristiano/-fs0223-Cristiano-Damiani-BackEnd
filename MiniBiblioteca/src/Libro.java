
public class Libro {
	
	private String titolo;
	private String autore;
	private int anno;
	private Persona persona;
	private boolean disponibile;
	private Biblioteca biblioteca;
	
	public Libro() {
		this.titolo = "";
		this.autore = "";
		this.anno = 0;
		this.biblioteca = null;
    }
	
	
	public Libro (String titolo, String autore, int anno, Biblioteca biblioteca) {
		this.titolo = titolo;
		this.autore = autore;
		this.anno = anno;
		this.disponibile = true;
		this.biblioteca = biblioteca;
		biblioteca.aggiungiLibro(this);
	}
	
	public Libro (String titolo, String autore, int anno) {
		this.titolo = titolo;
		this.autore = autore;
		this.anno = anno;
		this.disponibile = true;
		this.biblioteca = null;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		if (titolo != null || titolo != "") {			
			this.titolo = titolo;
		}
	}

	public String getAutore() {
		return autore;
	}

	public void setAutore(String autore) {
		if (autore != null || autore != "") {			
			this.autore = autore;
		}
	}

	public int getAnno() {
		return anno;
	}

	public void setAnno(int anno) {
		if(anno != 0) {
			this.anno = anno;			
		}
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}
	
	public Biblioteca getBiblioteca() {
        return biblioteca;
    }
	
	public void setBiblioteca(Biblioteca biblioteca) {
        this.biblioteca = biblioteca;
    }

	public boolean isDisponibile() {
		return disponibile;
	}

	public void setDisponibile(boolean disponibile) {
		this.disponibile = disponibile;
	}
	
	
	
	public String getLibro() {
		return this.titolo + " " + this.autore + " " + this.anno;  
	}
	
}
