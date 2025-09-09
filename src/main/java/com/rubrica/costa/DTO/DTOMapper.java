package com.rubrica.costa.DTO;

import com.rubrica.costa.model.Utente;

public class DTOMapper {
	
	public Utente dtoToUtente (UtenteDTO utenteDTO) {
		Utente utente = new Utente();
		utente.setId(utenteDTO.getId());
		utente.setNome(utenteDTO.getNome());
		utente.setCognome(utenteDTO.getCognome());
		utente.setNumero(utenteDTO.getNumero());
		utente.setIndirizzo(utenteDTO.getIndirizzo());
		return utente;
	}
	
	public UtenteDTO utenteToDto (Utente utente) {
		UtenteDTO utenteDTO = new UtenteDTO();
		utenteDTO.setId(utente.getId());
		utenteDTO.setNome(utente.getNome());
		utenteDTO.setCognome(utente.getCognome());
		utenteDTO.setNumero(utente.getNumero());
		utenteDTO.setIndirizzo(utente.getIndirizzo());
		return utenteDTO;
	}
	
}
