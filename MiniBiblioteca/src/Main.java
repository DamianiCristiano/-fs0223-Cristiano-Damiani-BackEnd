
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main  {
  
    public static void main(String[] args) {
     
    	
    	Persone pl = new Persone();	
    	
    	Biblioteca b = new Biblioteca();
    	Libro l1 = new Libro("franco","giorgio",1990);
    	
    	Persona p = new Persona("franco", "giorgio");

    	b.aggiungiPersona(p);
    	pl.aggiungiPersona(p);
    	
    	pl.aggiungiPersona("Mario", "Rossi", b);
    	pl.aggiungiPersona("Giuseppe", "Verdi", b);
    	pl.aggiungiPersona("Anna", "Bianchi", b);
    	b.getPersone();
    	
    	
    	System.out.println(l1.isDisponibile() + " " +  l1.getLibro());
    	
    	pl.get(3).addLibro(l1, b);
    	
    	System.out.println(l1.isDisponibile());
    	
    	pl.get(3).removeLibro(l1);
    	
    	System.out.println(l1.isDisponibile());
    	
    	
    	
    	
    	
    	

    }
}