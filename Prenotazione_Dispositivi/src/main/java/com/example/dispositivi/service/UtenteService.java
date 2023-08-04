package com.example.dispositivi.service;

import java.util.Locale;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.dispositivi.classes.Utente;
import com.example.dispositivi.repository.UtenteRepository;
import com.github.javafaker.Faker;

import jakarta.persistence.EntityNotFoundException;

@Service
public class UtenteService {

	@Autowired
	UtenteRepository utenteRepo;

	@Autowired
	@Qualifier("fakeUtente")
	private ObjectProvider<Utente> fakeUtenteProvider;

	@Autowired
	@Qualifier("customUtente")
	private ObjectProvider<Utente> utenteProvider;

	public void saveFakeUtente() {
		Faker f = new Faker(new Locale("it-It"));
		Utente u = fakeUtenteProvider.getObject().builder().username(f.name().username()).nome(f.name().firstName())
				.cognome(f.name().lastName()).email(f.internet().emailAddress()).build();
		utenteRepo.save(u);

	}

	public Utente createUtente(String username, String nome, String cognome, String email) {
		Utente u = utenteProvider.getObject().builder().username(username).nome(nome).cognome(cognome).email(email)
				.build();
		return utenteRepo.save(u);
	}

	public Utente saveUtente(Utente utente) {
		return utenteRepo.save(utente);
	}

	public Utente updateUtente(Long id, Utente u) {
		if (!utenteRepo.existsById(id)) {
			throw new EntityNotFoundException("l'utente non esiste!");
		}
		if (id != u.getId()) {
			throw new EntityNotFoundException("l'utente non esiste!");
		}
		return utenteRepo.save(u);
	}

	public Utente getUtenteById(Long id) {
		if (!utenteRepo.existsById(id)) {
			throw new EntityNotFoundException("l'utente non esiste!");
		}
		return utenteRepo.findById(id).get();
	}

	public String rimuoviUtenteById(Long id) {
		if (!utenteRepo.existsById(id)) {
			throw new EntityNotFoundException("l'utente non esiste!!");
		}
		Utente u = getUtenteById(id);
		utenteRepo.delete(u);
		return "Utente eliminato!";
	}

}
