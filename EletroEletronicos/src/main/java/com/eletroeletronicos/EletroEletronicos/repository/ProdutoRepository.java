package com.eletroeletronicos.EletroEletronicos.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.eletroeletronicos.EletroEletronicos.model.Produto;

public interface ProdutoRepository extends JpaRepository <Produto, Long>{
	@Query(value = "select * from tb_produto where preco > :valor and preco < :valor2", nativeQuery = true)
	public List<Produto> maiorQueMenorQue (@Param("valor") float valor, @Param("valor2" ) float valor2);
	
	/*
	@Query(value = "select tb_produto.id, tb_produto.marca, tb_produto.nome, tb_produto.preco, tb_produto.tipoeletro_id from tb_produto"
			+ "	inner join tb_tipo_eletro on tb_tipo_eletro.id = tb_produto.tipoeletro_id"
			+ "    where tb_produto.preco <= :valor and tb_tipo_eletro.id = :id", nativeQuery = true)
	
	public List<Produto> filtragem(@Param("preco") float valor, @Param("id" ) float id);
	
	*/
}
