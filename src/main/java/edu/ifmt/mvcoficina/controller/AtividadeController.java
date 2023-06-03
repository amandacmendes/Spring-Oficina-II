package edu.ifmt.mvcoficina.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.ifmt.mvcoficina.model.Atividade;
import edu.ifmt.mvcoficina.repository.Atividades;

@Controller
@RequestMapping("/atividade")
class AtividadeController {
	
	@Autowired
	private Atividades atividades;

	@RequestMapping("/novo")
	public String novo() {
		return "CadastroAtividade";
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String salvar(Atividade atividade) {
		atividades.save(atividade);
		return "CadastroAtividade";
	}
}
