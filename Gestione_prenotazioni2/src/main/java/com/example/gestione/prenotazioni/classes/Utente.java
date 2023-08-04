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
public class Utente {

	@Id
	private String username;

	private String nomeCompleto;
	private String email;

}
