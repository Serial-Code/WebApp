package com.api.demo.vistasController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ContactoController {
	@GetMapping("/contacto")
	public String Contacto() {
		return "/PaginaPrincipal/Contacto";
	}
}
