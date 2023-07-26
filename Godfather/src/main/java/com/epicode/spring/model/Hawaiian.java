package com.epicode.spring.model;

public class Hawaiian extends PizzaBase {

	public Hawaiian() {
		super(6.49, 1024);
		super.getIng().add("ananas");
	}

}
