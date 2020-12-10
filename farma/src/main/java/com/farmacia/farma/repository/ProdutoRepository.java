package com.farmacia.farma.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.farmacia.farma.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{

}
