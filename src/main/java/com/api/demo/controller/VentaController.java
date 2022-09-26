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

import com.api.demo.interfaceService.IventaService;
import com.api.demo.modelo.Venta;

@Controller
@RequestMapping
public class VentaController {
	
	@Autowired
	private IventaService service;
	
	@GetMapping("/listar/venta")
	public String listar(Model model) {
		
		List<Venta>venta = service.listar();
		model.addAttribute("venta", venta);
		
		return "/Vistas/venta/index";
		
	}
	
	@GetMapping("/new/venta")
	public String agregar(Model model) {
			
		model.addAttribute("venta", new Venta());
		return "/Vistas/venta/add";
		
	}
	
	@PostMapping("/save/venta")
	public String save(@Validated Venta v, Model model) {
		service.save(v);
		return "redirect:/listar/venta";
		
	}
	
	@GetMapping("/editar/venta/{id}")
	public String editar(@PathVariable int id, Model model) {
		
		Optional<Venta>venta = service.listarId(id);
		model.addAttribute("venta", venta);
		return "/Vistas/venta/editar";
		
	}
	
	@GetMapping("/eliminar/venta/{id}")
	public String eliminar(@PathVariable int id, Model model) {
		
		service.delete(id);
		return "redirect:/listar/venta";
		
	}
	

}
