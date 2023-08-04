package com.example.dispositivi.classes;

import jakarta.persistence.Entity;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
public class Laptop extends Dispositivo {

	public Laptop(Utente utente, Status status) {
		super(utente, status);
	}

}
