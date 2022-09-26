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

import com.api.demo.interfaceService.IrespuestaService;
import com.api.demo.modelo.Respuesta;

@Controller
@RequestMapping
public class RespuestaController {

	@Autowired
	private IrespuestaService service;
	
	@GetMapping("/listar/respuesta")
	public String listar(Model model) {
		
		List<Respuesta>respuestas = service.listar();
		model.addAttribute("respuesta", respuestas);		
		return "/Vistas/Respuesta/index";
		
	}
	
	@GetMapping("/new/respuesta")
	public String agregar(Model model) {
			
		model.addAttribute("respuesta", new Respuesta());
		return "/Vistas/Respuesta/add";
		
	}
	
	@PostMapping("/save/respuesta")
	public String save(@Validated Respuesta r, Model model) {
		service.save(r);
		return "redirect:/listar/respuesta";
		
	}
	
	@GetMapping("/editar/respuesta/{id}")
	public String editar(@PathVariable int id, Model model) {
		
		Optional<Respuesta>respuesta = service.listarId(id);
		model.addAttribute("respuesta", respuesta);
		return "/Vistas/Respuesta/editar";
		
	}
	
	@GetMapping("/eliminar/respuesta/{id}")
	public String eliminar(@PathVariable int id, Model model) {
		
		service.delete(id);
		return "redirect:/listar/respuesta";
		
	}
}
