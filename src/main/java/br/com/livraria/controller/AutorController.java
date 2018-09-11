package br.com.livraria.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.livraria.modelo.Autor;
import br.com.livraria.modelo.LivrariaTudao;
import br.com.livraria.repository.AutorRepository;

@Controller
@RequestMapping("/autor")
public class AutorController {

	@Autowired
	private AutorRepository autores;

	@RequestMapping("/novo")
	public ModelAndView novo() {
		ModelAndView mv = new ModelAndView("cadAutores");
		return mv;
	}

	@RequestMapping(method = RequestMethod.POST)
	public ModelAndView salvar(Autor autor) {
		autores.save(autor);

		ModelAndView mv = new ModelAndView("cadAutores");
		mv.addObject("mensagem", "Autor cadastrado com sucesso");
		return mv;

	}
}