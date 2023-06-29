
public class GestioneDipendenti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dipendente Peppino = new Dipendente("N.32132", Dipartimento.PRODUZIONE);
		Dipendente Franco = new Dipendente("N.438974", Dipartimento.PRODUZIONE);
		Dipendente Francesca = new Dipendente("N.666666", 1200, 30, Livello.IMPIEGATO, Dipartimento.AMMINISTRAZIONE);
		Dipendente Elon = new Dipendente("N.MARTE", 2000, 30, Livello.DIRIGENTE, Dipartimento.VENDITE);
		
		System.out.println(Peppino.promuovi());
		System.out.println(Francesca.promuovi());
		
		Peppino.stampaDatiDipendente();
		Franco.stampaDatiDipendente();
		Francesca.stampaDatiDipendente();
		Elon.stampaDatiDipendente();
		
		System.out.println(Peppino.getStipendio() + Franco.getStipendio() + Francesca.getStipendio() + Elon.getStipendio());
		
		System.out.println(
				  (Peppino.getStipendio() + (Peppino.getImportoOrarioStraordinario() * 5))
				+ (Franco.getStipendio() + (Franco.getImportoOrarioStraordinario() * 5))
				+ (Francesca.getStipendio() + + (Peppino.getImportoOrarioStraordinario() * 5))
				+ (Elon.getStipendio() + (Peppino.getImportoOrarioStraordinario() * 5))
				);
	}

}
