package Esercizio_venerdi;

public class riviste extends catalogo {

	public riviste(String isbn, String titolo, Integer annoPublicazione, Integer numeroPagine) {
		super(isbn, titolo, annoPublicazione, numeroPagine);

	}

	public enum periodicita {
		SETTIMANALE, MENSILE, SEMESTRALE;
	}

}
