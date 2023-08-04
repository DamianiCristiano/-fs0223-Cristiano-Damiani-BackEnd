package com.example.gestione.prenotazioni.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.gestione.prenotazioni.classes.Prenotazione;
import com.example.gestione.prenotazioni.classes.Utente;

public interface PrenotazioneRepository extends CrudRepository<Prenotazione, Integer> {

	List<Prenotazione> findByUtenteAndGiornoPrenotazione(Utente utente, LocalDate giornoPrenotazione);

}
