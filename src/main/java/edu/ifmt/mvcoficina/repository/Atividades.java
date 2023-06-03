package edu.ifmt.mvcoficina.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.ifmt.mvcoficina.model.Atividade;

public interface Atividades extends JpaRepository<Atividade, Long> {

}
