package com.example.spring.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/os")
public class Microservice8082 {

	@GetMapping("/getString")
	public String stampResp() {
		RestTemplate rt = new RestTemplate();
		String Url = "http://localhost:8081/app/data1";
		ResponseEntity<String> resp = rt.getForEntity(Url, String.class);
		return resp.getBody();
	}

	@GetMapping("/get-people")
	public Object listUtenti() {
		RestTemplate rt = new RestTemplate();
		String Url = "http://localhost:8081/app/data2";
		ResponseEntity<Object> resp = rt.getForEntity(Url, Object.class);
		return resp.getBody();
	}

}
