package com.example.epicode.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.epicode.classes.User;

@Configuration
public class UserConfiguration {

	@Bean("getUser")
	public User fakeUser() {
		User u = new User();
		return u;
	}

}
