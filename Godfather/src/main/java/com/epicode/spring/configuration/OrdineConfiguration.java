package com.epicode.spring.configuration;

import java.time.LocalTime;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.epicode.spring.model.InformazioniNutrizionali;
import com.epicode.spring.model.Ordine;
import com.epicode.spring.model.Stato;
import com.epicode.spring.model.Tavolo;

@Configuration
public class OrdineConfiguration {

	@Bean
	@Scope("prototype")
	public Ordine nuovoOrdine(List<InformazioniNutrizionali> scontrino, Tavolo tavolo, Integer numeroOrdine,
			Stato stato, Integer numeroCoperti, LocalTime localTime) {
		return new Ordine(scontrino, tavolo, numeroOrdine, stato, numeroCoperti, localTime);
	}

	@Bean
	@Scope("prototype")
	public Tavolo nuovoTavolo(Integer numeroTavolo, Integer numeroCopertiMassimi, boolean occupato) {
		return new Tavolo(numeroTavolo, numeroCopertiMassimi, occupato);
	}

}
