package com.rubrica.costa.model;

import com.rubrica.costa.costanti.UtenteCostanti;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = UtenteCostanti.INGRESSO_TABELLA_UTENTE)
@Data
public class Utente {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name = "idutenti")
	private Long id;
	@Column (name = UtenteCostanti.NOME_UTENTE)
	private String nome;
	@Column(name = UtenteCostanti.COGNOME_UTENTE)
	private String cognome;
	@Column(name = UtenteCostanti.NUMERO_UTENTE)
	private long numero;
	@Column(name = UtenteCostanti.INDIRIZZO_UTENTE)
	private String indirizzo;

}
