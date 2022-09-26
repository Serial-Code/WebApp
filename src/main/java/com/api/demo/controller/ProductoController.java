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

import com.api.demo.interfaceService.IproductoService;
import com.api.demo.modelo.Producto;

@Controller
@RequestMapping
public class ProductoController {

	@Autowired
	private IproductoService service;
	
	@GetMapping("/listar/producto")
	public String listar(Model model) {
		
		List<Producto>productos = service.listar();
		model.addAttribute("producto", productos);
		
		return "/Vistas/Producto/index";
		
	}
	
	@GetMapping("/new/producto")
	public String agregar(Model model) {
			
		model.addAttribute("producto", new Producto());
		return "/Vistas/Producto/add";
		
	}
	
	@PostMapping("/save/producto")
	public String save(@Validated Producto p, Model model) {
		service.save(p);
		return "redirect:/listar/producto";
		
	}
	
	@GetMapping("/editar/producto/{id}")
	public String editar(@PathVariable int id, Model model) {
		
		Optional<Producto>producto = service.listarId(id);
		model.addAttribute("producto", producto);
		return "/Vistas/Producto/editar";
		
	}
	
	@GetMapping("/eliminar/producto/{id}")
	public String eliminar(@PathVariable int id, Model model) {
		
		service.delete(id);
		return "redirect:/listar/producto";
		
	}
	
	
}
