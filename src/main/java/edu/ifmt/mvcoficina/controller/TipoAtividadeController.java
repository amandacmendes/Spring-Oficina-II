package edu.ifmt.mvcoficina.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import edu.ifmt.mvcoficina.model.TipoAtividade;
import edu.ifmt.mvcoficina.repository.TiposAtividade;

@Controller
public class TipoAtividadeController {

	@Autowired
	private TiposAtividade tipos;

	@RequestMapping
	public ModelAndView getAllTiposAtividade() {
		List<TipoAtividade> allTipos = tipos.findAll();
		ModelAndView mnv = new ModelAndView("PesquisaTipoAtividade");
		mnv.addObject("listatipoatividade", allTipos);
		return mnv;
	}

}
