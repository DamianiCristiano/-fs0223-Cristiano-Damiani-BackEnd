package com.example.dispositivi.classes;

import jakarta.persistence.Entity;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor

public class Smartphone extends Dispositivo {

	public Smartphone(Utente utente, Status status) {
		super(utente, status);
	}

}
