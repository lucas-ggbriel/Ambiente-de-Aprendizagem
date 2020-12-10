package com.farmacia.farma.controller;

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

import com.farmacia.farma.model.Categoria;
import com.farmacia.farma.repository.CategoriaRepository;

@RestController
@RequestMapping("/categoria")
@CrossOrigin(value = "*", allowedHeaders = "*")
public class CategoriaController {
	
	@Autowired
	private CategoriaRepository categoria;
	
	@GetMapping
	public ResponseEntity<List<Categoria>> getAll(){
		return ResponseEntity.ok(categoria.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Categoria> getById(@PathVariable long id){
		
		return categoria.findById(id).map(resp -> ResponseEntity.ok(resp))
				.orElse(ResponseEntity.badRequest().build());
	
	}
	
	@PostMapping
	public ResponseEntity<Categoria> postcat (@RequestBody Categoria cat){
		return ResponseEntity.status(HttpStatus.CREATED).body(categoria.save(cat));
	}
	
	@PutMapping
	public ResponseEntity<Categoria> putcat (@RequestBody Categoria cat){
		return ResponseEntity.status(HttpStatus.OK).body(categoria.save(cat));
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable long id) {
		categoria.deleteById(id);
	}
	
	
}