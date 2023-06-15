package edu.ifmt.mvcoficina.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import edu.ifmt.mvcoficina.model.Aluno;
import edu.ifmt.mvcoficina.model.Atividade;
import edu.ifmt.mvcoficina.model.TipoAtividade;
import edu.ifmt.mvcoficina.repository.Atividades;
import edu.ifmt.mvcoficina.repository.TiposAtividade;

@Controller
@RequestMapping("/atividade")
class AtividadeController {

	@Autowired
	private Atividades atividades;
	
	@Autowired
	private TiposAtividade tipos;

	@RequestMapping
	public ModelAndView allAtividades(Aluno a) {
		// List<Atividade> listaAtividades = atividades.findAllByAluno(a);
		List<Atividade> listaAtividades = atividades.findAll();
		ModelAndView mv = new ModelAndView("MinhasAtividades");
		mv.addObject("atividades", listaAtividades);
		return mv;
	}

	@RequestMapping("/novo")
	public ModelAndView novo() {
		ModelAndView mnv = new ModelAndView("CadastroAtividade");
		mnv.addObject(new Atividade());

		List<TipoAtividade> allTipos = tipos.findAll();
		mnv.addObject("tipoatividade", allTipos);

		return mnv;
	}

	@RequestMapping(method = RequestMethod.POST)
	public ModelAndView salvar(Atividade atividade) {

		atividades.save(atividade);
		ModelAndView mnv = new ModelAndView("CadastroAtividade");
		mnv.addObject("mensagem", "Salvo com sucesso.");
		return mnv;

	}

}
