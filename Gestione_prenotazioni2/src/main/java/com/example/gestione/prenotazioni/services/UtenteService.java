package com.example.gestione.prenotazioni.services;

import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.gestione.prenotazioni.classes.Utente;
import com.example.gestione.prenotazioni.repository.UtenteRepository;
import com.github.javafaker.Faker;

@Service
public class UtenteService {

	@Autowired
	UtenteRepository utenteRepo;

	@Autowired
	@Qualifier("nuovoUtente")
	private ObjectProvider<Utente> utenteProvider;

	@Autowired
	@Qualifier("utenteFake")
	private ObjectProvider<Utente> fakeProvider;

	public Utente createUtente(String username, String nomeCompleto, String email) {
		return utenteProvider.getObject().builder().username(username).nomeCompleto(nomeCompleto).email(email).build();
	}

	public void creaUtente(Utente u) {
		utenteRepo.save(u);
		System.out.println("l'utente " + u.getNomeCompleto() + " e' stato creato con l'username " + u.getUsername());
	}

	public void updateUtente(Utente u) {
		utenteRepo.save(u);
		System.out
				.println("l'utente " + u.getNomeCompleto() + " e' stato modificato con l'username " + u.getUsername());
	}

	public void removeUtente(Utente u) {
		utenteRepo.delete(u);
		System.out.println(
				"l'utente " + u.getNomeCompleto() + " con username " + u.getUsername() + " e' stato cancellato");
	}

	public Utente trovaUtente(String username) {
		System.out.println(utenteRepo.findByUsername(username));
		return utenteRepo.findByUsername(username);
	}

	public List<Utente> allUtenti() {
		return (List<Utente>) utenteRepo.findAll();
	}

	public void fakeUtente() {
		Faker f = new Faker(new Locale("it-It"));
		Utente u = fakeProvider.getObject().builder().username(f.name().username()).nomeCompleto(f.name().fullName())
				.email(f.internet().emailAddress()).build();
		utenteRepo.save(u);
	}

}
