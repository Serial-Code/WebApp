package com.api.demo.vistasController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CatalogoController {
	
	@GetMapping("/catalogo")
	public String Catalogo() {
		return "/PaginaPrincipal/Catalogo";
	}

}
