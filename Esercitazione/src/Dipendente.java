import java.util.InputMismatchException;
import java.util.Scanner;

public class Dipendente{

	private String nome;
	private String cognome;
	private String email;
	private int anni;
	Scanner sc = new Scanner(System.in);
	
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
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setAnni(int anni) {
		boolean isTrue = true;

			while(isTrue)
			{
					if (anni >= 0 && anni <= 100) 
					{
						this.anni = anni;
						isTrue = false;
					} else {
						System.out.println("l'eta deve essere compresa tra 0 e 100");
						anni = sc.nextInt();
						sc.nextLine();
					}
			}
	}
	
	public int getAnni() {
		return anni;
	}
	
	public Dipendente(String nome, String cognome, int anni,  String email) {
		this.nome = nome;
        this.cognome = cognome;
        this.anni = anni;
        this.email = email;
	}
	
	public Dipendente() {
		this.nome = "";
        this.cognome = "";
        this.email = "";
        this.anni = 0;
	}
	
	@Override
    public String toString() {
        return "Dipendente [nome=" + nome + ", cognome=" + cognome + ", email=" + email + ", anni=" + anni + "]";
    }
	
	public static Dipendente createDipendente(Scanner sc) {
		System.out.println("scrivi nome dipendente: ");
		String nome = sc.nextLine();
		
		System.out.println("scrivi cognome dipendente: ");
		String cognome = sc.nextLine();
		
		System.out.println("scrivi email dipendente: ");
		String email = sc.nextLine();
		
		
		Dipendente d = new Dipendente(nome, cognome, 0, email);
		
		System.out.println("scrivi anni dipendente: ");
		int anni = sc.nextInt();
		d.setAnni(anni);
			
		sc.nextLine(); // per rimuovere il newline che viene letto dopo l'input di un int'
		return d;
	}
	

	
}
