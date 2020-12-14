package com.eletroeletronicos.EletroEletronicos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.eletroeletronicos.EletroEletronicos.model.Categoria;

public interface CategoriaRepository extends JpaRepository <Categoria, Long>{
	
}