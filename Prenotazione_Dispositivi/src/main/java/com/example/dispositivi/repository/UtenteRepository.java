package com.example.dispositivi.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.dispositivi.classes.Utente;

public interface UtenteRepository extends CrudRepository<Utente, Long> {

	public Utente findById(int i);

}
