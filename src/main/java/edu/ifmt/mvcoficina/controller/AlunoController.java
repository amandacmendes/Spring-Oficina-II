package edu.ifmt.mvcoficina.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import edu.ifmt.mvcoficina.model.Aluno;
import edu.ifmt.mvcoficina.repository.Alunos;

@Controller
public class AlunoController {

	@Autowired
	Alunos alunos;

	@RequestMapping("/login")
	public ModelAndView loginPage() {
		ModelAndView mnv = new ModelAndView("Login");
		return mnv;
	}

	@RequestMapping(path = "/login", method = RequestMethod.POST )
	public ModelAndView entrar(String email, String senha) {

		Aluno a = null;

		ModelAndView mv = null;
		
		List<Aluno> foundAluno = alunos.findByEmail(email);
		if (foundAluno.size() > 0) {
			a = foundAluno.get(0);
			if (a.getSenha().equals(senha)) {
				mv = new ModelAndView("MinhasAtividades");
				mv.addObject(a);
			} else {
				mv = loginPage();
				mv.addObject("mensagem", "E-mail ou senha incorretos.");
			}
		} else {
			mv = loginPage();
			mv.addObject("mensagem", "Aluno não encontrado.");
		}

		return mv;
	}

}
