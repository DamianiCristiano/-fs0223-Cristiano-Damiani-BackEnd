package com.example.gestione.prenotazioni.services;

import java.util.List;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.gestione.prenotazioni.classes.Edificio;
import com.example.gestione.prenotazioni.classes.Postazione;
import com.example.gestione.prenotazioni.classes.Tipo;
import com.example.gestione.prenotazioni.repository.PostazioneRepository;

@Service
public class PostazioneService {

	@Autowired
	PostazioneRepository postazioneRepo;

	@Autowired
	@Qualifier("nuovaPostazione")
	private ObjectProvider<Postazione> postazioneProvider;

	public List<Postazione> findPostazioneByTipoAndEdificio(Tipo tipo, Edificio edificio) {
		return postazioneRepo.findByTipoAndCitta(tipo, edificio.getCitta());
	}

	public Postazione createPostazione(String descrizione, Tipo tipo, Integer nMaxOccupanti, Edificio edificio) {
		return postazioneProvider.getObject().builder().descrizione(descrizione).tipo(tipo).nMaxOccupanti(nMaxOccupanti)
				.edificio(edificio).build();
	}

	public void creaPostazione(Postazione p) {
		postazioneRepo.save(p);
		System.out.println(
				"la postazione con id: " + p.getId() + " e' stata creata nella citta': " + p.getEdificio().getCitta());
	}

	public void updatePostazione(Postazione p) {
		postazioneRepo.save(p);
		System.out.println("la postazione con id: " + p.getId() + " e' stata modificata");
	}

	public void removePostazione(Postazione p) {
		postazioneRepo.delete(p);
		System.out.println("la postazione con id: " + p.getId() + " e' stata rimossa");
	}

	public Postazione trovaPostazione(Integer id) {
		System.out.println(postazioneRepo.findById(id).get());
		return postazioneRepo.findById(id).get();
	}

	public List<Postazione> trovaPostazioneP(Tipo tipo, String citta) {
		System.out.println(postazioneRepo.findByTipoAndCitta(tipo, citta));
		return postazioneRepo.findByTipoAndCitta(tipo, citta);
	}
}
