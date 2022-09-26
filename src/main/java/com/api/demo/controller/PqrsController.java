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

import com.api.demo.interfaceService.IpqrsService;
import com.api.demo.modelo.Pqrs;

@Controller
@RequestMapping
public class PqrsController {
	
	@Autowired
	private IpqrsService service;
	
	@GetMapping("/listar/pqrs")
	public String listar(Model model) {
		
		List<Pqrs>pqrs = service.listar();
		model.addAttribute("pqrs", pqrs);
		
		return "/Vistas/pqrs/index";
		
	}
	
	@GetMapping("/new/pqrs")
	public String agregar(Model model) {
			
		model.addAttribute("pqrs", new Pqrs());
		return "/Vistas/pqrs/add";
		
	}
	
	@PostMapping("/save/pqrs")
	public String save(@Validated Pqrs p, Model model) {
		service.save(p);
		return "redirect:/listar/pqrs";
		
	}
	
	@GetMapping("/editar/pqrs/{id}")
	public String editar(@PathVariable int id, Model model) {
		Optional<Pqrs>pqrs = service.listarId(id);
		model.addAttribute("pqrs", pqrs);
		return "/Vistas/pqrs/editar";
		
	}
	
	@GetMapping("/eliminar/pqrs/{id}")
	public String eliminar(@PathVariable int id, Model model) {
		
		service.delete(id);
		return "redirect:/listar/pqrs";
		
	}
	
	

}
