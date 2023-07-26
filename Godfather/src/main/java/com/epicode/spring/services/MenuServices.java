package com.epicode.spring.services;

import java.util.List;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.epicode.spring.configuration.Menu;
import com.epicode.spring.model.PizzaBase;

@Service
public class MenuServices {

	@Autowired
	@Qualifier("menuBean")
	private ObjectProvider<Menu> menuProvider;

	public void showMenu() {
		Menu m = menuProvider.getObject();
		List<PizzaBase> menuPizze = m.getMenuPizza();
		for (PizzaBase pizzaBase : menuPizze) {
			System.out.println(pizzaBase);
		}
	}

}
