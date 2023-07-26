package com.epicode.spring.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.epicode.spring.services.MenuServices;

@Component
public class Runner implements CommandLineRunner {

	@Autowired
	MenuServices m;

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Run...");
		m.showMenu();

	}

}
