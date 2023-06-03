package edu.ifmt.mvcoficina.model;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class TipoAtividade {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "tipo_atividade_sequence")
	@SequenceGenerator(name="tipo_atividade_sequence", sequenceName = "tipo_atividade_sequence")
	private Long id_tipo_atividade;
	private String descricao;
	
	
	public Long getId_tipo_atividade() {
		return id_tipo_atividade;
	}
	public void setId_tipo_atividade(Long id_tipo_atividade) {
		this.id_tipo_atividade = id_tipo_atividade;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(descricao, id_tipo_atividade);
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TipoAtividade other = (TipoAtividade) obj;
		return Objects.equals(descricao, other.descricao) && Objects.equals(id_tipo_atividade, other.id_tipo_atividade);
	}
	
	@Override
	public String toString() {
		return "TipoAtividade [id_tipo_atividade=" + id_tipo_atividade + ", descricao=" + descricao + "]";
	}
	
	
}
