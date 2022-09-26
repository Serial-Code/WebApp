package com.api.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.api.demo.interfaceService.IcalificacionService;
import com.api.demo.modelo.Calificacion;

@Controller
@RequestMapping
public class CalificacionController {
	
	@Autowired
	private IcalificacionService service;
	
	@GetMapping("/listar/calificacion")
	public String listar(Model model) {
		
		List<Calificacion>calificaciones = service.listar();
		model.addAttribute("calificacion", calificaciones);
		
		return "/Vistas/Calificacion/index";
		
	}
	
	@GetMapping("/new/calificacion")
	public String agregar(Model model) {
			
		model.addAttribute("calificacion", new Calificacion());
		return "/Vistas/Calificacion/add";
		
	}
	
	@PostMapping("/save/calificacion")
	public String save(@Validated Calificacion ca, Model model) {
		service.save(ca);
		return "redirect:/listar/calificacion";
		
	}
	
	@GetMapping("/editar/calificacion/{id}")
	public String editar(@PathVariable int id, Model model) {
		
		Optional<Calificacion>calificacion = service.listarId(id);
		model.addAttribute("calificacion", calificacion);
		return "/Vistas/calificacion/editar";
		
	}
	
	@GetMapping("/eliminar/calificacion/{id}")
	public String eliminar(@PathVariable int id, Model model) {
		
		service.delete(id);
		return "redirect:/listar/calificacion";
		
	}

}
