package com.generation.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/exercicio")
public class exercicio {

	@GetMapping("/habilidade1")
	public String habilidadeUm() {
		return "Uma das habilidades utilizadas foi a de proatividade!";
	}
	
	@GetMapping("/habilidade2")
	public String habilidadeDois() {
		return "Outra habilidade utilizada foi a de orientação ao detalhe!";
	}
	
	@GetMapping("/mentalidade1")
	public String mentalidadeUm() {
		return "Uma das mentalidades utilizadas foi a de orientação ao futuro!";
	}
	
	@GetMapping("/mentalidade2")
	public String mentalidadeDois() {
		return "Outra mentalidade utilizada foi a de persistência!";
	}
	
	@GetMapping("/levantamento")
	public String levantamento() {
		return "Vale ressaltar que a paciência, embora não seja mentalidade e nem habilidade da Generation"
				+ ", foi muita utilizada!";
	}
}
