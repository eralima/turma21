package com.gen.HelloWorld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/objetivos")
public class ObjetivosController {

	@GetMapping
	public String objetivos () {
		return "OBJETIVOS DE APRENDIZAGEM\n(1) API Rest com Spring Boot\n(2) Métodos e status HTTP\n(3) Rest e RestFull\n(4) Postman";
	}

}
