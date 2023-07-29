package com.epicode.spring.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Tavolo {

	private Integer numeroTavolo;
	private Integer numeroCopertiMassimi;
	private boolean occupato = false;

}
