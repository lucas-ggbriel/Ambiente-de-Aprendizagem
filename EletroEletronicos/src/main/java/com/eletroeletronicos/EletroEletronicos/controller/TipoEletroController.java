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
import com.eletroeletronicos.EletroEletronicos.model.TipoEletro;
import com.eletroeletronicos.EletroEletronicos.repository.TipoEletroRepository;

@RestController
@RequestMapping("/tipo.eletro")
@CrossOrigin(value = "*", allowedHeaders = "*")
public class TipoEletroController {

	@Autowired
	TipoEletroRepository tipoeletro;

	@GetMapping
	public ResponseEntity<List<TipoEletro>> getAll() {
		return ResponseEntity.ok(tipoeletro.findAll());
	}

	@GetMapping("/{id}")
	public ResponseEntity<TipoEletro> getById(@PathVariable long id) {

		return tipoeletro.findById(id).map(resp -> ResponseEntity.ok(resp)).orElse(ResponseEntity.badRequest().build());

	}

	@PostMapping
	public ResponseEntity<TipoEletro> posteletro(@RequestBody TipoEletro tipo) {
		return ResponseEntity.status(HttpStatus.CREATED).body(tipoeletro.save(tipo));
	}

	@PutMapping
	public ResponseEntity<TipoEletro> puteletro(@RequestBody TipoEletro tur) {
		return ResponseEntity.status(HttpStatus.OK).body(tipoeletro.save(tur));
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable long id) {
		tipoeletro.deleteById(id);
	}

}
