package com.epicode.esercizio;

import javax.persistence.Entity;

@Entity
public class Libri extends Catalogo_bibliotecario {

	public Libri() {
	}

	private String autore;
	private String genere;

	public Libri(String codiceISBN, String titolo, Integer annoPubblicazione, Integer numeroPagine, String autore,
			String genere) {
		super(codiceISBN, titolo, annoPubblicazione, numeroPagine);
		this.autore = autore;
		this.genere = genere;
	}

	public String getAutore() {
		return autore;
	}

	public void setAutore(String autore) {
		this.autore = autore;
	}

	public String getGenere() {
		return genere;
	}

	public void setGenere(String genere) {
		this.genere = genere;
	}

}
