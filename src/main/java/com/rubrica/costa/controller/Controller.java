package com.rubrica.costa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rubrica.costa.costanti.UtenteCostanti;
import com.rubrica.costa.model.Utente;
import com.rubrica.costa.service.UtenteServiceImpl;

@RestController
@RequestMapping (UtenteCostanti.INGRESSO_GESTIONE_UTENTE)
public class Controller {
	
	@Autowired
	UtenteServiceImpl service;
	
	@PostMapping(UtenteCostanti.INGRESSO_SALVA_UTENTE)
	public ResponseEntity<Utente> salvaUtente (@RequestBody Utente utente) {
		service.salva(utente);
		return ResponseEntity
				.status(HttpStatus.CREATED)
				.body(utente);
	}
	
}
