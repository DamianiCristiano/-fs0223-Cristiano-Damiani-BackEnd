package com.example.gestione.prenotazioni.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.gestione.prenotazioni.classes.Utente;

public interface UtenteRepository extends CrudRepository<Utente, String> {

	@Query("Select u From Utente u Where u.username = :username")
	public Utente findByUsername(String username);

}
