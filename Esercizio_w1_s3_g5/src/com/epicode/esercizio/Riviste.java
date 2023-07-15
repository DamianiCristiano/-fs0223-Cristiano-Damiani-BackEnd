package com.epicode.esercizio;

import javax.persistence.Entity;

@Entity
public class Riviste extends Catalogo_bibliotecario {

	public Riviste() {
	}

	private Periodicita periodicita;

	public Riviste(String codiceISBN, String titolo, Integer annoPubblicazione, Integer numeroPagine,
			Periodicita periodicita) {
		super(codiceISBN, titolo, annoPubblicazione, numeroPagine);
		this.periodicita = periodicita;
	}

	public Periodicita getPeriodicita() {
		return periodicita;
	}

	public void setPeriodicita(Periodicita periodicita) {
		this.periodicita = periodicita;
	}

}
