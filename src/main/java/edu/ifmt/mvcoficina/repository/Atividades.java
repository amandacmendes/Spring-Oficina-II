package edu.ifmt.mvcoficina.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.ifmt.mvcoficina.model.Aluno;
import edu.ifmt.mvcoficina.model.Atividade;

public interface Atividades extends JpaRepository<Atividade, Long> {
	
	List<Atividade> findAllByAluno(Aluno aluno);

}
