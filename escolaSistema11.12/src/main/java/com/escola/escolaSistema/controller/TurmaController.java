package com.escola.escolaSistema.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.escola.escolaSistema.model.Turma;
import com.escola.escolaSistema.repository.TurmaRepository;

@RestController
@RequestMapping("/sistema")
@CrossOrigin(value = "*", allowedHeaders = "*")
public class TurmaController {

	@Autowired
	private TurmaRepository turma;
	
	@GetMapping
	public ResponseEntity<List<Turma>> getAll(){
		return ResponseEntity.ok(turma.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Turma> getById(@PathVariable long id){
		
		return turma.findById(id).map(resp -> ResponseEntity.ok(resp))
				.orElse(ResponseEntity.badRequest().build());
	
	}
	
	@PostMapping
	public ResponseEntity<Turma> postcat (@RequestBody Turma tur){
		return ResponseEntity.status(HttpStatus.CREATED).body(turma.save(tur));
	}
	
	@PutMapping
	public ResponseEntity<Turma> putcat (@RequestBody Turma tur){
		return ResponseEntity.status(HttpStatus.OK).body(turma.save(tur));
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable long id) {
		turma.deleteById(id);
	}
	
}
