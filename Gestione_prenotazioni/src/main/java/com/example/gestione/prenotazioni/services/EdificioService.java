package com.example.gestione.prenotazioni.services;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.gestione.prenotazioni.classes.Edificio;
import com.example.gestione.prenotazioni.repository.EdificioRepository;

@Service
public class EdificioService {

	@Autowired
	EdificioRepository edificioRepo;

	@Autowired
	@Qualifier("nuovoEdificio")
	private ObjectProvider<Edificio> edificioProvider;

	public Edificio createEdificio(String nome, String indirizzo, String citta) {
		return edificioProvider.getObject().builder().nome(nome).indirizzo(indirizzo).citta(citta).build();
	}

	public void creaEdificio(Edificio e) {
		edificioRepo.save(e);
		System.out.println("l'edficio " + e.getNome() + " e' stato creato");
	}

	public void updateEdificio(Edificio e) {
		edificioRepo.save(e);
		System.out.println("l'edficio" + e.getNome() + "e' stato modificato");
	}

	public void removeEdifcio(Edificio e) {
		edificioRepo.delete(e);
		System.out.println("l'edficio" + e.getNome() + "e' stato rimosso");
	}

	public Edificio trovaEdificio(String nome) {
		System.out.println(edificioRepo.findByNome(nome));
		return edificioRepo.findByNome(nome);
	}
}
