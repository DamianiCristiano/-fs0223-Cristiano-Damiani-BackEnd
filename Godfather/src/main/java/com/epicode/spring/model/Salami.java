package com.epicode.spring.model;

public class Salami extends PizzaBase {

	public Salami() {
		super(5.99, 1160);
		super.getIng().add("salami");
	}

}
