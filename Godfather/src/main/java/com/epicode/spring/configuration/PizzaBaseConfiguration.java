package com.epicode.spring.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.epicode.spring.model.Hawaiian;
import com.epicode.spring.model.Margherita;
import com.epicode.spring.model.Salami;

@Configuration
public class PizzaBaseConfiguration {

	@Bean("menuBean")
	@Scope("singleton")
	Menu menu() {
		Menu m = new Menu();

		m.getMenuPizza().add(margherita());
		m.getMenuPizza().add(hawaiian());
		m.getMenuPizza().add(salami());
		return m;
	}

	@Bean
	@Scope("singleton")
	public Margherita margherita() {
		return new Margherita();
	}

	@Bean
	@Scope("singleton")
	public Hawaiian hawaiian() {
		return new Hawaiian();
	}

	@Bean
	@Scope("singleton")
	public Salami salami() {
		return new Salami();
	}

}
