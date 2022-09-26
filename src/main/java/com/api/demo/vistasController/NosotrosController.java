package com.api.demo.vistasController;
	
import org.springframework.stereotype.Controller;	
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NosotrosController {

	@GetMapping("/nosotros")
	public String Nosotros() {
		
		return "/PaginaPrincipal/Nosotros";
	}
	

}
