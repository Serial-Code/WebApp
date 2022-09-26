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

import com.api.demo.interfaceService.IcotizacionService;
import com.api.demo.modelo.Cotizacion;

@Controller
@RequestMapping
public class CotizacionController {

	@Autowired
	private IcotizacionService service;
	
	@GetMapping("/listar/cotizacion")
	public String listar(Model model) {
		
		List<Cotizacion>cotizacion = service.listar();
		model.addAttribute("cotizacion", cotizacion);
		
		return "/Vistas/cotizacion/index";
		
	}
	
	@GetMapping("/new/cotizacion")
	public String agregar(Model model) {
			
		model.addAttribute("cotizacion", new Cotizacion());
		return "/Vistas/cotizacion/add";
		
	}
	
	@PostMapping("/save/cotizacion")
	public String save(@Validated Cotizacion c, Model model) {
		service.save(c);
		return "redirect:/listar/cotizacion";
		
	}
	
	@GetMapping("/editar/cotizacion/{id}")
	public String editar(@PathVariable int id, Model model) {
		
		Optional<Cotizacion>cotizacion = service.listarId(id);
		model.addAttribute("cotizacion", cotizacion);
		return "/Vistas/cotizacion/editar";
		
	}
	
	@GetMapping("/eliminar/cotizacion/{id}")
	public String eliminar(@PathVariable int id, Model model) {
		
		service.delete(id);
		return "redirect:/listar/cotizacion";
		
	}
	
}
