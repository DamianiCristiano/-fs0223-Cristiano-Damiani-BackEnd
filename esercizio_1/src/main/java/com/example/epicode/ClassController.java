package com.example.epicode;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ClassController {

	@GetMapping("/homepage")
	public String ciaone() {
		return "index";
	}
}
