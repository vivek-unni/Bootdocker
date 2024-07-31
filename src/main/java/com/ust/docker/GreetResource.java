package com.ust.docker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class GreetResource {
	
	@GetMapping
	public String message() {
		return "Testing 123.......";
	}
}
