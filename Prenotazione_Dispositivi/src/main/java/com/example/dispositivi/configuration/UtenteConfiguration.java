package com.example.dispositivi.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.example.dispositivi.classes.Utente;
import com.example.dispositivi.repository.UtenteRepository;

@Configuration
public class UtenteConfiguration {

	@Autowired
	UtenteRepository utenteRepo;

	@Bean("customUtente")
	@Scope("prototype")
	public Utente customUtente() {
		return new Utente();
	}

	@Bean("fakeUtente")
	@Scope("prototype")
	public Utente fakeUtente() {
		Utente u = new Utente();
		return u;
	}

}
