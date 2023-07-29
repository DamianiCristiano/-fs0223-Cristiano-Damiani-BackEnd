package com.example.gestione.prenotazioni.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.example.gestione.prenotazioni.classes.Edificio;
import com.example.gestione.prenotazioni.classes.Postazione;
import com.example.gestione.prenotazioni.classes.Prenotazione;
import com.example.gestione.prenotazioni.classes.Utente;

@Configuration
public class PrenotazioniConfiguration {

	@Bean("nuovaPostazione")
	@Scope("prototype")
	public Postazione postazione() {
		return new Postazione();
	}

	@Bean("nuovoEdificio")
	@Scope("prototype")
	public Edificio edificio() {
		return new Edificio();
	}

	@Bean("nuovaPrenotazione")
	@Scope("prototype")
	public Prenotazione prenotazione() {
		return new Prenotazione();
	}

	@Bean("nuovoUtente")
	@Scope("prototype")
	public Utente utente() {
		return new Utente();
	}

}
