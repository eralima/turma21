package com.gen.HelloWorld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/habilidades")
public class HabilidadesController {
	
	@GetMapping
	public String habilidades () {
		return "HABILIDADES E MENTALIDADES\n(1) Persistência\n(2) Atenção aos detalhes\n(3) Proatividade";
	}

}
