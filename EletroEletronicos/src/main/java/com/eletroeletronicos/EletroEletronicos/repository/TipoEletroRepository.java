package com.eletroeletronicos.EletroEletronicos.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.eletroeletronicos.EletroEletronicos.model.Produto;
import com.eletroeletronicos.EletroEletronicos.model.TipoEletro;

public interface TipoEletroRepository extends JpaRepository <TipoEletro, Long>{

}
