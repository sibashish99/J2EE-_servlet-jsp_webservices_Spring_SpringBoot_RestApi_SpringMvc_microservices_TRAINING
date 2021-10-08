package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ClientController {

	
	@Autowired
	private RestTemplate template;
	
	@GetMapping(path = "/client")
	public String getBooks() {
		
		// Not using the host and Port number rather calling with service Id
		// that is instead of calling http://localhost:7070/books 
		// we are calling http://BOOK-SERVICE/books => localhost:7070 => BOOK-SERVICE
		
		return this.template.getForObject("http://BOOK-SERVICE/books", String.class);
	}
}
