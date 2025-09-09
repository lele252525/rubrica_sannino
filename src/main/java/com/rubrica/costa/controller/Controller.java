package com.rubrica.costa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.rubrica.costa.model.Utente;
import com.rubrica.costa.service.UtenteServiceImpl;

public class Controller {
	
	@Autowired
	UtenteServiceImpl service;
	
	@PostMapping("/salva_utente")
	public ResponseEntity<Utente> salvaUtente (@RequestBody Utente utente) {
		service.salva(utente);
		return ResponseEntity
				.status(HttpStatus.OK)
				.body(utente);
		
	}
	
}
