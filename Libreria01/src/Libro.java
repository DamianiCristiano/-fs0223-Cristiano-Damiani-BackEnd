
public class Libro {
	
	private Integer id;
	private String titolo;
	private String autore;
	private String editore;
	
	public Libro(Integer id, String titolo, String autore, String editore) {
		super();
		this.id = id;
		this.titolo = titolo;
		this.autore = autore;
		this.editore = editore;
	}
	
	public Libro() {
		this.id = null;
		this.titolo = "";
		this.autore = "";
		this.editore = "";
	}
	
	public Libro(String titolo, String autore, String editore) {
		this.id = null;
		this.titolo = titolo;
		this.autore = autore;
		this.editore = editore;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public String getEditore() {
		return editore;
	}

	public void setEditore(String editore) {
		this.editore = editore;
	}
	
	
}
