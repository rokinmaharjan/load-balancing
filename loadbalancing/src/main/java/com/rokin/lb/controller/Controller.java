package com.rokin.lb.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class Controller {
	
	@Value("${server.port}")
	private String port;

	@GetMapping
	public String hi() {
		return String.format("Hello from port: %s", port);
	}

}
