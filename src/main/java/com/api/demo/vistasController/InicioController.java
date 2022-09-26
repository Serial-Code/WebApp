package com.api.demo.vistasController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InicioController {

	@GetMapping("/inicio")
	public String Inicio() {
		
		return "/PaginaPrincipal/Inicio";
	}
}
