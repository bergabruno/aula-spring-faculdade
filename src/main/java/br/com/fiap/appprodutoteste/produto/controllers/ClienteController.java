package br.com.fiap.appprodutoteste.produto.controllers;

import br.com.fiap.appprodutoteste.produto.model.Cliente;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ClienteController {

	
	@GetMapping("/clientes")
	public ModelAndView index() {
		ModelAndView model = new ModelAndView("clientes/index");

		Cliente cliente  = new Cliente();
		
		return model;
	}
}
