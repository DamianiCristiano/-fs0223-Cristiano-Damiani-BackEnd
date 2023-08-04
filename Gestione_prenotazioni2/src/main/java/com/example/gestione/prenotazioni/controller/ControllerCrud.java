package com.example.gestione.prenotazioni.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.gestione.prenotazioni.classes.Utente;
import com.example.gestione.prenotazioni.services.UtenteService;

@RestController
@RequestMapping("/uri")
public class ControllerCrud {

	@Autowired
	UtenteService utenteService;

	@GetMapping("/utenti")
	public ResponseEntity<List<Utente>> allUtenti() {
		List<Utente> listaUtenti = utenteService.allUtenti();
		ResponseEntity<List<Utente>> resp = new ResponseEntity<List<Utente>>(listaUtenti, HttpStatus.OK);
		return resp;
	}

}
