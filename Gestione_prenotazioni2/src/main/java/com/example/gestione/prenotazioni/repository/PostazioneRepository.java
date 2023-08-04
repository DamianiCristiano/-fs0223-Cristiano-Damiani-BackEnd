package com.example.gestione.prenotazioni.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.gestione.prenotazioni.classes.Postazione;
import com.example.gestione.prenotazioni.classes.Tipo;

public interface PostazioneRepository extends CrudRepository<Postazione, Integer> {

	@Query("SELECT p FROM Postazione p WHERE p.tipo = :tipo AND p.edificio.citta = :citta")
	List<Postazione> findByTipoAndCitta(Tipo tipo, String citta);

}
