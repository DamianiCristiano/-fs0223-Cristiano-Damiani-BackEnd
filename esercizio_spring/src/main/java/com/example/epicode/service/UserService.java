package com.example.epicode.service;

import java.util.List;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.epicode.classes.User;
import com.example.epicode.repository.UserRepository;
import com.github.javafaker.Faker;

@Service
public class UserService {

	@Autowired
	UserRepository userRepo;

	@Autowired
	@Qualifier("getUser")
	ObjectProvider<User> userProvider;

	public void createFakeUser() {
		Faker f = new Faker();
		User u = userProvider.getObject().builder().name(f.name().firstName()).surname(f.name().lastName())
				.username(f.name().username()).nTelefono(f.phoneNumber().cellPhone()).build();
		u.setUsername(u.getName() + "." + u.getSurname());
		userRepo.save(u);
	}

	public List<User> getAllUser() {
		return (List<User>) userRepo.findAll();
	}

}
