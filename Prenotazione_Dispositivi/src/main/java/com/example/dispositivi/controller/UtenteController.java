package com.example.dispositivi.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dispositivi.classes.Utente;
import com.example.dispositivi.repository.UtenteRepository;
import com.example.dispositivi.service.UtenteService;

@RestController
@RequestMapping("/api")
public class UtenteController {

	@Autowired
	UtenteService utenteServ;

	@Autowired
	UtenteRepository utenteRepo;

	@GetMapping("/utenti")
	public ResponseEntity<List<Utente>> getAllUtenti() {
		List<Utente> listaUtenti = (List<Utente>) utenteRepo.findAll();
		ResponseEntity<List<Utente>> resp = new ResponseEntity<List<Utente>>(listaUtenti, HttpStatus.OK);
		return resp;
	}

	@GetMapping("/utenti/{id}")
	public Optional<Utente> getUtenteById(@PathVariable Long id) {
		Optional<Utente> u = utenteRepo.findById(id);
		return u;
	}

	@PostMapping("/utenti")
	public ResponseEntity<?> createUtente(@RequestBody Utente utente) {
		Utente ut = utenteServ.saveUtente(utente);
		return new ResponseEntity<Utente>(ut, HttpStatus.OK);
	}

	@PutMapping("/utenti/{id}")
	public ResponseEntity<Utente> updateUtente(@PathVariable Long id, @RequestBody Utente u) {
		Utente ut = utenteServ.updateUtente(id, u);
		return new ResponseEntity<Utente>(ut, HttpStatus.OK);
	}

	@DeleteMapping("/utenti/{id}")
	public String rimuoviUtente(@PathVariable Long id) {
		utenteServ.rimuoviUtenteById(id);
		return "utente rimosso!";
	}

}
