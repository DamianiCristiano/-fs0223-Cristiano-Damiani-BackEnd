package com.example.spring.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring.model.Utenti;

@RestController
@RequestMapping("/app")
public class Microservice8081 {

	@GetMapping("/data1")
	public Utenti response() {
		return new Utenti("giovanni", "peppe", "Palermo");
	}

	@GetMapping("/data2")
	public ResponseEntity<List<Utenti>> lista() {
		List<Utenti> utenti = new ArrayList<Utenti>();
		utenti.add(new Utenti("giovanni", "peppe", "Palermo"));
		utenti.add(new Utenti("umberto", "epicode", "Roma"));
		utenti.add(new Utenti("Mirko", "Cristofori", "Scampia"));
		utenti.add(new Utenti("daniele", "pasqueletti", "ZEN"));
		return new ResponseEntity<List<Utenti>>(utenti, HttpStatus.OK);
	}

	@GetMapping("/data3")
	public List<Utenti> listaUtenti() {
		List<Utenti> utenti = new ArrayList<Utenti>();
		utenti.add(new Utenti("giovanni", "peppe", "Palermo"));
		utenti.add(new Utenti("umberto", "epicode", "Roma"));
		utenti.add(new Utenti("Mirko", "Cristofori", "Scampia"));
		utenti.add(new Utenti("daniele", "pasqueletti", "ZEN"));
		return utenti;
	}

}
