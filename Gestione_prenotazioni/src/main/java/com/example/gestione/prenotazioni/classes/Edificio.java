package com.example.gestione.prenotazioni.classes;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Edificio {

	@Id
	private String nome;

	private String indirizzo;
	private String citta;

}
