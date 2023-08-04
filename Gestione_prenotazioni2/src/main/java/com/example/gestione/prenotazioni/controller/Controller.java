package com.example.gestione.prenotazioni.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.gestione.prenotazioni.classes.Utente;
import com.example.gestione.prenotazioni.services.UtenteService;

@org.springframework.stereotype.Controller
public class Controller {

	@Autowired
	UtenteService utenteService;

	@GetMapping("/rubrica")
	public ModelAndView getIndex() {
		List<Utente> listaUtenti = utenteService.allUtenti();
		ModelAndView model = new ModelAndView("index");
		model.addObject("lista", listaUtenti);
		return model;
	}

}
