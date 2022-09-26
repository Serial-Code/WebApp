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

import com.api.demo.interfaceService.IinventarioService;
import com.api.demo.modelo.Inventario;


@Controller
@RequestMapping
public class InventarioController {
	
	@Autowired
	private IinventarioService service;
	
	@GetMapping("/listar/inventario")
	public String listar(Model model) {
		
		List<Inventario>inventarios = service.listar();
		model.addAttribute("inventario", inventarios);
		return "/Vistas/Inventario/index";
		
	}
	
	@GetMapping("/new/inventario")
	public String agregar(Model model) {
			
		model.addAttribute("inventario", new Inventario());
		return "/Vistas/Inventario/add";
	}
	
	@PostMapping("/save/inventario")
	public String save(@Validated Inventario i, Model model) {
		service.save(i);
		return "redirect:/listar/inventario";
	}
	
	@GetMapping("/editar/inventario/{id}")
	public String editar(@PathVariable int id, Model model) {
		
		Optional<Inventario>inventario = service.listarId(id);
		model.addAttribute("inventario", inventario);
		return "/Vistas/Inventario/editar";
		
	}
	
	@GetMapping("/eliminar/inventario/{id}")
	public String eliminar(@PathVariable int id, Model model) {
		
		service.delete(id);
		return "redirect:/listar/inventario";
		
	}
}
