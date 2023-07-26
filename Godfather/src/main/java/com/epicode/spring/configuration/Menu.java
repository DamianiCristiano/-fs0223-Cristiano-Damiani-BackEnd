package com.epicode.spring.configuration;

import java.util.ArrayList;
import java.util.List;

import com.epicode.spring.model.PizzaBase;

import lombok.Data;

@Data
public class Menu {

	private List<PizzaBase> menuPizza = new ArrayList<PizzaBase>();

}
