package com.api.demo.vistasController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class loginController {

	@GetMapping("/logearse")
	public String mostrarformlogin() {
		return "/Login/formInicioS";
		
	}
	
}
