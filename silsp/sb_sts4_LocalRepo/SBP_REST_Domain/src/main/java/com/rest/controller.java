package com.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class controller {

	@GetMapping("test")
	public @ResponseBody String mtd1() {
		return"lemon2222";
	}
	
	@PostMapping("test")
	public @ResponseBody String mtd2() {
		return"le3333";
	}
}
