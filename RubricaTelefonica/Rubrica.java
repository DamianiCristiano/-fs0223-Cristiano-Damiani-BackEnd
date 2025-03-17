import java.util.ArrayList;

public class Rubrica {
	
	private ArrayList<Contatto> Contatti;
	
	public Rubrica() {
        Contatti = new ArrayList<Contatto>();
    }
	
	public void aggiungiContatto(Contatto c) {
		if (Contatti.contains(c)) {
            System.out.println("Contatto già presente");            
        } else {
            Contatti.add(c);            
        }
    }
	
	public void rimuoviContatto(Contatto c) {
		if (Contatti.contains(c)) {
			Contatti.remove(c);			
		} else {
			System.out.println("Contatto non trovato");
		}
    }
	
	public void stampaContatti() {
		for (Contatto c : Contatti) {
            System.out.println(c.toString());
        }
	}
	
	public Contatto cercaContattoByName(String nome) {
			for (Contatto c : Contatti) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                return c;
            }
        }
        return null;
     }
}
