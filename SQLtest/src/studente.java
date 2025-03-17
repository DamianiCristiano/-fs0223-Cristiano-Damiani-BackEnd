import java.sql.Connection;
import java.util.Scanner;

public class studente {	
	
	String nome;
	String cognome;
	String classe;
	
	
	Scanner sc = new Scanner(System.in);
	
	public studente(String nome, String cognome, String classe) {
		this.nome = nome;
		this.cognome = cognome;
		this.classe = classe;
	}
	
	public studente() {
		
	}
	
	public studente creaStudente() {
		System.out.println("Inserisco un nuovo studente");
		System.out.println("dammi il nome: ");
		this.nome = sc.nextLine();
		System.out.println("dammi il cognome: ");
		this.cognome = sc.nextLine();
		System.out.println("dammi la classe: ");
		this.classe = sc.nextLine();
		return new studente(nome, cognome, classe);
	}
	
	
	

	
}
