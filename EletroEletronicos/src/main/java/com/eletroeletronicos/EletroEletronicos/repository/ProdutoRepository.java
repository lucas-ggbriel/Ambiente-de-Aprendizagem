package com.eletroeletronicos.EletroEletronicos.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.eletroeletronicos.EletroEletronicos.model.Produto;

public interface ProdutoRepository extends JpaRepository <Produto, Long>{
	@Query(value = "select * from tb_produto where preco > :valor and preco < :valor2", nativeQuery = true)
	public List<Produto> maiorQueMenorQue (@Param("valor") float valor, @Param("valor2" ) float valor2);
	
	@Query(value = "select * from tb_produto where tipoeletro_id = :id and preco < :preco", nativeQuery = true)
	public List<Produto> filtragem (@Param("id") long id, @Param("preco" ) float preco);
	
}
