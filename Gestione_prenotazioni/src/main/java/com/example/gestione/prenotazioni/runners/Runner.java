package com.example.gestione.prenotazioni.runners;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.gestione.prenotazioni.classes.Edificio;
import com.example.gestione.prenotazioni.classes.Postazione;
import com.example.gestione.prenotazioni.classes.Prenotazione;
import com.example.gestione.prenotazioni.classes.Tipo;
import com.example.gestione.prenotazioni.classes.Utente;
import com.example.gestione.prenotazioni.services.EdificioService;
import com.example.gestione.prenotazioni.services.PostazioneService;
import com.example.gestione.prenotazioni.services.PrenotazioneService;
import com.example.gestione.prenotazioni.services.UtenteService;

@Component
public class Runner implements CommandLineRunner {

	@Autowired
	PrenotazioneService prenotazioneService;

	@Autowired
	UtenteService utenteService;

	@Autowired
	PostazioneService postazioneService;

	@Autowired
	EdificioService edificioService;

	@Override
	public void run(String... args) throws Exception {

		Utente me = utenteService.createUtente("dartus", "cristiano damiani", "cristiano_dd@hotmail.it");
		utenteService.creaUtente(me);

		utenteService.trovaUtente("dartus");

		Edificio e1 = edificioService.createEdificio("Enel", "via marchese di villabianca 10", "Palermo");
		edificioService.creaEdificio(e1);

		Postazione p1 = postazioneService.createPostazione("molto bella", Tipo.PRIVATO, 1, e1);
		postazioneService.creaPostazione(p1);

		Prenotazione pr1 = prenotazioneService.createPrenotazione(me, p1, LocalDate.of(2024, 10, 20));
		prenotazioneService.creaPrenotazione(pr1);

		postazioneService.trovaPostazioneP(Tipo.PRIVATO, "Palermo");
	}

}
