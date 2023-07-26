package com.epicode.spring.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class InformazioniNutrizionali extends Prodotto {

	private Integer informazioniNutrizionali;

	public InformazioniNutrizionali(Double prezzo, Integer informazioniNutrizionali) {
		super(prezzo);
		this.informazioniNutrizionali = informazioniNutrizionali;
	}

}
