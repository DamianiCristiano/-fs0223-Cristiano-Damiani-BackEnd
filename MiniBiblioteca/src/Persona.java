import java.util.ArrayList;

public class Persona {
	
	private int id;
	private String nome;
	private String cognome;
	ArrayList<Libro> libriInPrestito;
	
	public Persona(String nome, String cognome) {
		this.nome = nome;
        this.cognome = cognome;
        this.libriInPrestito = new ArrayList<Libro>();
    }
	
	public Persona(int id, Persona p) {
		this.id = id;
	    this.nome = p.getNome();
	    this.cognome = p.getCognome();
	    this.libriInPrestito = new ArrayList<Libro>();
	}
	
	public Persona(int id, String nome, String cognome) {
		this.id = id;
		this.nome = nome;
        this.cognome = cognome;
        this.libriInPrestito = new ArrayList<Libro>();
    }
	
	public Persona (int id, String nome, String cognome, Biblioteca b) {
		this.id = id;
        this.nome = nome;
        this.cognome = cognome;
        this.libriInPrestito = new ArrayList<Libro>();
        b.aggiungiPersona(this);
    
	}
	
	public int getId()
	{
		return id;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public ArrayList<Libro> getLibriInPrestito() {
		stampaLibriInPrestito();
		return libriInPrestito;
	}

	public void setLibriInPrestito(ArrayList<Libro> libriInPrestito) {
		this.libriInPrestito = libriInPrestito;
	}
	
	public void addLibro(Libro libro, Biblioteca b) {
		if (libro.isDisponibile() && b.getPerson().contains(this)) {
			libriInPrestito.add(libro);
			libro.setDisponibile(false);
		} else {
			System.out.println("Il libro non è disponibile");
		}
	}
	
	public Boolean getIsRegistered(Biblioteca b) {
		if(b.getPerson().contains(this) == true) {
				System.out.println("La persona è già registrata");
            return true;
		} else {
			    System.out.println("La persona non è ancora registrata");
                return false;
        }
	}



	public void removeLibro(Libro libro) {
		if (libriInPrestito.contains(libro)) {
			libriInPrestito.remove(libro);
			libro.setDisponibile(true);
			System.out.println("libro " + libro.getLibro() + " rimosso con successo");
		} else {
			System.out.println("Il libro non è presente nella lista dei libri in prestito");
		}
	}
		
	public void stampaLibriInPrestito() {
		if (this.libriInPrestito.isEmpty()) {
			System.out.println("Nessun libro preso in prestito!");
		} else {
			System.out.println("libri presi in prestito da" + this.nome + " " + this.cognome);
		}
		for (int i = 0; i < libriInPrestito.size(); i++) {
			Libro l = (Libro) libriInPrestito.get(i);
			System.out.println(l.getTitolo() + " " + l.getAutore() + " " + l.getAnno());
		}
    }
	
	
}
