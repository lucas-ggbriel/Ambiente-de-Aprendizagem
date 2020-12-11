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
import com.farmacia.farma.model.Produto;
import com.farmacia.farma.repository.ProdutoRepository;

@RestController
@RequestMapping("/produto")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ProdutoController {

	@Autowired
	private ProdutoRepository produto;
	
	@GetMapping
	public ResponseEntity<List<Produto>> getAll(){
		return ResponseEntity.ok(produto.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Produto> getById(@PathVariable long id){
		return produto.findById(id).map(resp -> ResponseEntity.ok(resp))
				.orElse(ResponseEntity.badRequest().build());
	}
	
	@PostMapping
	public ResponseEntity<Produto> postprod (@RequestBody Produto cat){
		return ResponseEntity.status(HttpStatus.CREATED).body(produto.save(cat));
	}
	
	@PutMapping
	public ResponseEntity<Produto> putprod (@RequestBody Produto cat){
		return ResponseEntity.status(HttpStatus.OK).body(produto.save(cat));
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable long id) {
		produto.deleteById(id);
	}
	
}
