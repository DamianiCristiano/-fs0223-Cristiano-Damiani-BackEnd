
public class Dipendente {
	
	public static double stipendioBase = 1000;
	private String matricola;
	private double stipendio;
	private double importoOrarioStraordinario;
	private Livello Livello;
	private Dipartimento Dipartimento;
	
	
	public double getImportoOrarioStraordinario() {
		return importoOrarioStraordinario;
	}
	
	public void setImportoOrarioStraordinario(int importoOrarioStraordinario) {
		this.importoOrarioStraordinario = importoOrarioStraordinario;
	}
	
	public Dipartimento getDipartimento() {
		return Dipartimento;
	}
	
	public void setDipartimento(Dipartimento dipartimento) {
		Dipartimento = dipartimento;
	}

	public String getMatricola() {
		return matricola;
	}
	
	public double getStipendio() {
		return stipendio;
	}
	
	public Livello getLivello() {
		return Livello;
	}
	
	public Dipendente(String matricola, Dipartimento dipartimento) {
		this.matricola = matricola;
		Dipartimento = dipartimento;
		stipendio = stipendioBase;
		importoOrarioStraordinario = 30;
		Livello = Livello.OPERAIO;
	}
	
	public Dipendente(String matricola, double stipendio, int importoOrarioStraordinario, Livello livello,
			Dipartimento dipartimento) {
		this.matricola = matricola;
		this.stipendio = stipendio;
		this.importoOrarioStraordinario = importoOrarioStraordinario;
		Livello = livello;
		Dipartimento = dipartimento;
	}
	
	public void stampaDatiDipendente () {
		System.out.println(getMatricola()
				+ " " 
				+ getStipendio() 
				+ " " 
				+ getLivello() 
				+ " " 
				+ getDipartimento()
				+ " "
				+ getImportoOrarioStraordinario()
				);
	}
	
	public Livello promuovi () {
		if(Livello == Livello.OPERAIO) {
		Livello = Livello.IMPIEGATO;
		stipendio = stipendioBase * 1.2;
		
		} else if (Livello == Livello.IMPIEGATO) {
		Livello = Livello.QUADRO;
		stipendio = stipendioBase * 1.5;
		
		} else if (Livello == Livello.QUADRO) {
		Livello = Livello.DIRIGENTE;
		stipendio = stipendioBase * 2;
		
		} else if (Livello == Livello.DIRIGENTE) {
		System.out.println("ERRORE!!");
		}
		
		else {}
		
		return this.Livello;
	}

	static double calcolaPaga (Dipendente x) {
		return x.stipendio;
	}
	
	static double calcolaPaga (Dipendente x , int ore) {
	x.stipendio = x.stipendio + (ore * x.importoOrarioStraordinario);
	return x.stipendio; 
	}
}
