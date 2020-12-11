package com.escola.escolaSistema.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.escola.escolaSistema.model.Aluno;

@Repository
public interface AlunoRepository extends JpaRepository <Aluno, Long> {

}
