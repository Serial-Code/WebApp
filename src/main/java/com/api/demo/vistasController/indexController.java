package com.api.demo.vistasController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class indexController {

	@GetMapping("/index")
	public String mostrarIndex() {
		
		return "/Administrador/index" ;
	}
	
	@GetMapping("/home")
	public String mostrarInicio() {
		
		return "/Administrador/indexCuerpo" ;
	}
	
}
