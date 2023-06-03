package edu.ifmt.mvcoficina.model;

public enum StatusAtividade {

	PENDENTE("Pendente"), DEFERIDO("Deferido"), INDEFERIDO("Indeferido");

	private String descricao;

	private StatusAtividade(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}
}
