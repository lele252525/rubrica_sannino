package com.rubrica.costa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rubrica.costa.model.Utente;
import com.rubrica.costa.repository.UtenteRepository;

import lombok.Data;

@Service
@Data
public class UtenteServiceImpl implements IUtenteService {
	
	@Autowired
	UtenteRepository repo;
	
	@Override
	public void salva(Utente utente) {
		repo.save(utente);
	}

}
