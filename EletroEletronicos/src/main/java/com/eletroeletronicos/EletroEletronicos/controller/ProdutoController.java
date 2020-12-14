package com.eletroeletronicos.EletroEletronicos.controller;

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

import com.eletroeletronicos.EletroEletronicos.model.Produto;
import com.eletroeletronicos.EletroEletronicos.repository.ProdutoRepository;


@RestController
@RequestMapping("/produto")
@CrossOrigin(value = "*", allowedHeaders = "*")
public class ProdutoController {
	
	@Autowired
	ProdutoRepository produto;

	@GetMapping("/{valor}/{valor2}")
	public ResponseEntity<List<Produto>> maiorQueMenorQue(@PathVariable long valor, @PathVariable long valor2) {
		return ResponseEntity.ok(produto.maiorQueMenorQue(valor, valor2));
	}
	
	/*@GetMapping("/filtragem/{id}/{preco}")
	public ResponseEntity<List<Produto>> filtragem(@PathVariable float preco, @PathVariable float id) {
		return ResponseEntity.ok(produto.filtragem(preco, id));
	}*/
	
	@GetMapping
	public ResponseEntity<List<Produto>> getAll() {
		return ResponseEntity.ok(produto.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Produto> getById(@PathVariable long id) {

		return produto.findById(id).map(resp -> ResponseEntity.ok(resp)).orElse(ResponseEntity.badRequest().build());

	}
	
	@PostMapping
	public ResponseEntity<Produto> posteletro(@RequestBody Produto tipo) {
		return ResponseEntity.status(HttpStatus.CREATED).body(produto.save(tipo));
	}
	
	@PutMapping
	public ResponseEntity<Produto> puteletro(@RequestBody Produto tur) {
		return ResponseEntity.status(HttpStatus.OK).body(produto.save(tur));
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable long id) {
		produto.deleteById(id);
	}
}
