package com.api.demo.vistasController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class indexControllerCliente {

	@GetMapping("/")
	public String mostrarIndex() {
			
		return "/Cliente/indexC";
	}
	
	@GetMapping("/principal")
	public String mostrarInicio() {
			
		return "/Cliente/indexCuerpoC";
	}
}
