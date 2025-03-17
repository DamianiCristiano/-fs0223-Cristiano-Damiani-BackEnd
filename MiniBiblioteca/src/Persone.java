import java.util.ArrayList;

public class Persone {
	 private ArrayList<Persona> PL;
	 
	 public Persone() {
         PL = new ArrayList<Persona>();
     }
	 
	 
	 public Persona getPersonaById(int id) {
		 if(PL.isEmpty()) {
			 System.out.println("non ci sono persone registrate");
		 } else {
		 	for (Persona p : PL){
             if (p.getId() == id) {
                 return p;
             }
		 }
		 	}
		 return null;
	 }
	 
	 public String printPersonaById(int id) {
		 String s = "";
		 if(PL.isEmpty()) {
			return s =  "non ci sono persone registrate";
		 }
			return  s = PL.get(id).getNome() + " " +  PL.get(id).getCognome();
	 }
	 
	 
	 
	 public Persona get(int position) {
		 return PL.get(position);
	 }
	 
	
	 public void aggiungiPersona(Persona p) {
		 int nextID = this.getNewID();
         this.PL.add(p);
     }
	 
	 public Persona aggiungiPersona(String nome, String cognome, Biblioteca b)
	 {
		 int nextID = this.getNewID();
		 Persona persona = new Persona(nextID, nome, cognome, b);
		 this.PL.add(persona);
		 return persona;
	 }
		 
	 public void rimuoviPersona(Persona p) {
		 PL.remove(p);
	 }

	 
	 public Integer getLastID() {
		 return PL.isEmpty()? null : PL.get(PL.size() - 1).getId();
		 
     }
	 
	 public int getNewID() {
		 	return getLastID() == null? 1 : getLastID() + 1;
     }
	 
	 
	 public void rimuoviPersonaById(int id) {
		 	Persona p = getPersonaById(id);
         if (p!= null) {
             PL.remove(p);
         }  else {
        	 System.out.println("persona non identificata");
         }
	 }

	public int size() {
		 return PL.size();
    }
	
	@Override
	public String toString() {
		String s = "";
		for (int i=0; i<PL.size(); i++)
		{
			s+=(PL.get(i).getId() + ") "  + PL.get(i).getNome() + " " + PL.get(i).getCognome())+"\n";
		}
		return s;	
	}
	 
}
