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

import com.api.demo.interfaceService.Iseguimiento_envioService;
import com.api.demo.modelo.Producto;
import com.api.demo.modelo.Seguimiento_envio;

@Controller
@RequestMapping
public class Seguimiento_envioController {
	
	@Autowired
	private Iseguimiento_envioService service;
	
	@GetMapping("/listar/seguimiento_envio")
	public String listar(Model model) {
		
		List<Seguimiento_envio>seguimiento_envio = service.listar();
		model.addAttribute("seguimiento_envio", seguimiento_envio);
		
		return "/Vistas/seguimiento_envio/index";
		
	}
	
	@GetMapping("/new/seguimiento_envio")
	public String agregar(Model model) {
			
		model.addAttribute("seguimiento_envio", new Seguimiento_envio());
		return "/Vistas/seguimiento_envio/add";
		
	}
	
	@PostMapping("/save/seguimiento_envio")
	public String save(@Validated Seguimiento_envio s, Model model) {
		service.save(s);
		return "redirect:/listar/seguimiento_envio";
		
	}
	
	@GetMapping("/editar/seguimiento_envio/{id}")
	public String editar(@PathVariable int id, Model model) {
		
		Optional<Seguimiento_envio>seguimiento_envio = service.listarId(id);
		model.addAttribute("seguimiento_envio", seguimiento_envio);
		return "/Vistas/seguimiento_envio/editar";
		
	}
	
	@GetMapping("/eliminar/seguimiento_envio/{id}")
	public String eliminar(@PathVariable int id, Model model) {
		
		service.delete(id);
		return "redirect:/listar/seguimiento_envio";
		
	}
	
	

}
