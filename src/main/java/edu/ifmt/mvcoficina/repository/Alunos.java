package edu.ifmt.mvcoficina.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.ifmt.mvcoficina.model.Aluno;

public interface Alunos extends JpaRepository<Aluno, Long> {

}
