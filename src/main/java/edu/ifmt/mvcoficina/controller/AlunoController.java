package edu.ifmt.mvcoficina.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import edu.ifmt.mvcoficina.model.Aluno;

@Controller
public class AlunoController {
	

	@RequestMapping("/login")
	public ModelAndView loginPage() {
		ModelAndView mnv = new ModelAndView("Login");
		return mnv;		
	}
}
