package com.example.epicode.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.example.epicode.service.UserService;

@Component
public class Runner implements ApplicationRunner {

	@Autowired
	UserService userService;

	@Override
	public void run(ApplicationArguments args) throws Exception {

		for (int i = 0; i < 10; i++) {

			userService.createFakeUser();
		}

	}

}
