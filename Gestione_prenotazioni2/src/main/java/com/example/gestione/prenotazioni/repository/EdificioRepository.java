package com.example.gestione.prenotazioni.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.gestione.prenotazioni.classes.Edificio;

public interface EdificioRepository extends CrudRepository<Edificio, String> {

	@Query("Select e From Edificio e Where e.nome = :nome")
	public Edificio findByNome(String nome);
}
