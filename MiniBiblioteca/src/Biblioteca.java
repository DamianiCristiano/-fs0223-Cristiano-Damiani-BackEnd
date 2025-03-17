import java.util.ArrayList;

public class Biblioteca{
	
	private ArrayList<Libro> catalogoLibri;
	private ArrayList<Persona> personeRegistrate;
	
	
    public Biblioteca() {
        catalogoLibri = new ArrayList<Libro>();
        personeRegistrate = new ArrayList<Persona>();
    }
    
    public void aggiungiLibro(Libro libro) {
    	if (libro.isDisponibile()) {
            catalogoLibri.add(libro);
        } else {
            System.out.println("Il libro " + libro.getTitolo() + " non è disponibile.");
        }
    }
    
    public void rimuoviLibro(Libro libro) {
        catalogoLibri.remove(libro);
    }
    
    public Libro getLibro(Libro l) {
    	return catalogoLibri.contains(l)? l : null;
    }
    
    public void getLibri() {
    	for (int i = 0; i < catalogoLibri.size(); i++) {
    		Libro l = (Libro) catalogoLibri.get(i);
            System.out.println(l.getLibro() + " " + l.getAutore() + " " + l.getAnno());
            System.out.println("----------");
		}
    }
    
    public void getPersone() {
    	if(personeRegistrate.isEmpty()) {
    		System.out.println("Nessuna persona registrata.");
    	} else {
    		for (int i = 0; i < personeRegistrate.size(); i++) {
            Persona p = (Persona) personeRegistrate.get(i);
            System.out.println(p.getId() + " " + p.getNome() + " " + p.getCognome());
            System.out.println("----------");
    		}
    	};
    }
    
    public ArrayList<Persona> getPerson() {
    	return personeRegistrate;
    }
    
    public void aggiungiPersona(Persona p) {
    	if(personeRegistrate.contains(p)) {
    		System.out.println("La persona " + p.getNome() + " " + p.getCognome() + " è già registrata.");
    	} else {
    		personeRegistrate.add(p);
    	}
    }
	

}
