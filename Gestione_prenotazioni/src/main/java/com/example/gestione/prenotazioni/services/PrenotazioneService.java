package com.example.gestione.prenotazioni.services;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.gestione.prenotazioni.classes.Postazione;
import com.example.gestione.prenotazioni.classes.Prenotazione;
import com.example.gestione.prenotazioni.classes.Utente;
import com.example.gestione.prenotazioni.repository.PrenotazioneRepository;

@Service
public class PrenotazioneService {

	@Autowired
	PrenotazioneRepository prenotazioneRepo;

	@Autowired
	@Qualifier("nuovaPrenotazione")
	private ObjectProvider<Prenotazione> prenotazioneProvider;

	public Prenotazione createPrenotazione(Utente u, Postazione p, LocalDate d) throws PrenotazioneException {
		if (trovaPrenotazionePerGiornoPrenotazione(u, d)) {
			return prenotazioneProvider.getObject().builder().giornoPrenotazione(d).scadenzaPrenotazione(d.plusDays(1))
					.utente(u).postazione(p).build();
		} else {

			throw new PrenotazioneException("l'utente ha gia' una prenotazione per quel giorno");
		}
	}

	public void creaPrenotazione(Prenotazione p) {
		prenotazioneRepo.save(p);
		System.out.println("la prenotazione " + p.getId() + "e' stata effettuata dall' utente " + p.getUtente()
				+ "per il giorno " + p.getGiornoPrenotazione());
	}

	public void updateUtente(Prenotazione p) {
		prenotazioneRepo.save(p);
		System.out.println("la prenotazione " + p.getId() + "e' stata modificata dall' utente " + p.getUtente());
	}

	public void removePrenotazione(Prenotazione p) {
		prenotazioneRepo.delete(p);
		System.out.println("la prenotazione " + p.getId() + "e' stata cancellata dall' utente " + p.getUtente());
	}

	public Prenotazione trovaPrenotazione(Integer id) {
		return prenotazioneRepo.findById(id).get();
	}

	public boolean trovaPrenotazionePerGiornoPrenotazione(Utente u, LocalDate d) {
		List<Prenotazione> getPrenotazioni = prenotazioneRepo.findByUtenteAndGiornoPrenotazione(u, d);
		return getPrenotazioni.isEmpty();
	}

}
