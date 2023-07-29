package com.example.gestione.prenotazioni.services;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.gestione.prenotazioni.classes.Utente;
import com.example.gestione.prenotazioni.repository.UtenteRepository;

@Service
public class UtenteService {

	@Autowired
	UtenteRepository utenteRepo;

	@Autowired
	@Qualifier("nuovoUtente")
	private ObjectProvider<Utente> utenteProvider;

	public Utente createUtente(String username, String nomeCompleto, String email) {
		return utenteProvider.getObject().builder().username(username).nomeCompleto(nomeCompleto).email(email).build();
	}

	public void creaUtente(Utente u) {
		utenteRepo.save(u);
		System.out.println("l'utente " + u.getNomeCompleto() + "e' stato creato con l'username " + u.getUsername());
	}

	public void updateUtente(Utente u) {
		utenteRepo.save(u);
		System.out.println("l'utente " + u.getNomeCompleto() + "e' stato modificato con l'username " + u.getUsername());
	}

	public void removeUtente(Utente u) {
		utenteRepo.delete(u);
		System.out
				.println("l'utente " + u.getNomeCompleto() + "con username " + u.getUsername() + "e' stato cancellato");
	}

	public Utente trovaUtente(String username) {
		System.out.println(utenteRepo.findByUsername(username));
		return utenteRepo.findByUsername(username);
	}

}
