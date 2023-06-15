package edu.ifmt.mvcoficina.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import edu.ifmt.mvcoficina.model.Aluno;

public interface Alunos extends JpaRepository<Aluno, Long> {

	//public List<Aluno> findByid_aluno(String id_aluno);
	public List<Aluno> findBymatricula(int matricula);
	
	public List<Aluno> findByEmail(String email);

}
