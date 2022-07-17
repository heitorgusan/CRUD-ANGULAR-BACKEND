package com.cursos.crud.cursos_crud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/hello")
public class HelloWorld {

	@GetMapping
	public String hello() {
		return "helloWorld";
	}
	
}
