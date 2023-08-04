package com.example.dispositivi.classes;

import jakarta.persistence.Entity;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Builder
@Data
public class Tablet extends Dispositivo {

	public Tablet(Utente utente, Status status) {
		super(utente, status);
	}

}
