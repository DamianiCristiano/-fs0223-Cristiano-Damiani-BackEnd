package com.example.dispositivi.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.example.dispositivi.classes.Laptop;
import com.example.dispositivi.classes.Smartphone;
import com.example.dispositivi.classes.Tablet;

@Configuration
public class DispositivoConfiguration {

	@Bean("newTablet")
	@Scope("prototype")
	public Tablet customTablet() {
		return new Tablet();
	}

	@Bean("newSmartphone")
	@Scope("prototype")
	public Smartphone customSmartphone() {
		return new Smartphone();
	}

	@Bean("newLaptop")
	@Scope("prototype")
	public Laptop customLaptop() {
		return new Laptop();
	}

}
