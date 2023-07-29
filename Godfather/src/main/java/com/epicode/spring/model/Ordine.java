package com.epicode.spring.model;

import java.time.LocalTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@PropertySource("classpath:application_properties")
public class Ordine {

	@Value("costo_coperto")
	private double costoCoperto;

	private List<InformazioniNutrizionali> scontrino;
	private Tavolo tavolo;
	private String nota;
	private Integer numeroOrdine;
	private Stato stato;
	private Integer numeroCoperti;
	private LocalTime localTime;
	private Double costoTotale;

	public Ordine(List<InformazioniNutrizionali> scontrino, Tavolo tavolo, Integer numeroOrdine, Stato stato,
			Integer numeroCoperti, LocalTime localTime) {

		this.scontrino = scontrino;
		this.tavolo = tavolo;
		this.numeroOrdine = numeroOrdine;
		this.stato = stato;
		this.numeroCoperti = numeroCoperti;
		this.localTime = localTime;
		for (InformazioniNutrizionali informazioniNutrizionali : scontrino) {
			this.costoTotale += informazioniNutrizionali.getPrezzo();
		}
		this.costoTotale += this.numeroCoperti * this.costoCoperto;
	}

	public Ordine(List<InformazioniNutrizionali> scontrino, Tavolo tavolo, String nota, Integer numeroOrdine,
			Stato stato, Integer numeroCoperti, LocalTime localTime) {

		this.scontrino = scontrino;
		this.tavolo = tavolo;
		this.nota = nota;
		this.numeroOrdine = numeroOrdine;
		this.stato = stato;
		this.numeroCoperti = numeroCoperti;
		this.localTime = localTime;
		for (InformazioniNutrizionali informazioniNutrizionali : scontrino) {
			this.costoTotale += informazioniNutrizionali.getPrezzo();
		}
		this.costoTotale += this.numeroCoperti * this.costoCoperto;
	}

}
