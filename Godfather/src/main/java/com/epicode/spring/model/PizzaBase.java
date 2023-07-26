package com.epicode.spring.model;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class PizzaBase extends InformazioniNutrizionali {

	private List<String> ing = new ArrayList<String>();

	public PizzaBase(Double prezzo, Integer informazioniNutrizionali) {
		super(prezzo, informazioniNutrizionali);
		this.ing.add("pomodoro");
		this.ing.add("mozzarella");
	}

}
