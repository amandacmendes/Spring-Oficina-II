package edu.ifmt.mvcoficina.model;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Aluno{

	
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "aluno_sequence")
	@SequenceGenerator(name="aluno_sequence", sequenceName = "aluno_sequence")
	@Id
	private Long id_aluno;
	
	private String cpf;
	private String nome;
	private int matricula;
	private String email;
	private String senha;
	private String telefone;
	
	public Aluno() {
	}
	
	public Aluno(int matricula) {
		super();
		this.matricula = matricula;
	}
	
	public Aluno(String email) {
		super();
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public Long getId_aluno() {
		return id_aluno;
	}
	public void setId_aluno(Long id_aluno) {
		this.id_aluno = id_aluno;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(cpf, email, id_aluno, matricula, nome, senha, telefone);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return Objects.equals(cpf, other.cpf) && Objects.equals(email, other.email)
				&& Objects.equals(id_aluno, other.id_aluno) && matricula == other.matricula
				&& Objects.equals(nome, other.nome) && Objects.equals(senha, other.senha)
				&& Objects.equals(telefone, other.telefone);
	}
	
}
