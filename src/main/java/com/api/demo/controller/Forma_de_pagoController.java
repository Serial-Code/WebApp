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

import com.api.demo.interfaceService.Iforma_de_pagoService;
import com.api.demo.modelo.Forma_de_pago;


@Controller
@RequestMapping
public class Forma_de_pagoController {
	
	@Autowired
	private Iforma_de_pagoService service;
	
	@GetMapping("/listar/forma_de_pago")
	public String listar(Model model) {
		
		List<Forma_de_pago>forma_de_pagos = service.listar();
		model.addAttribute("forma_de_pago", forma_de_pagos);
		
		return "/Vistas/Forma_de_pago/index";
		
	}
	
	@GetMapping("/new/forma_de_pago")
	public String agregar(Model model) {
			
		model.addAttribute("forma_de_pago", new Forma_de_pago());
		return "/Vistas/Forma_de_pago/add";
		
	}
	
	@PostMapping("/save/forma_de_pago")
	public String save(@Validated Forma_de_pago f, Model model) {
		service.save(f);
		return "redirect:/listar/forma_de_pago";
		
	}
	
	@GetMapping("/editar/forma_de_pago/{id}")
	public String editar(@PathVariable int id, Model model) {
		
		Optional<Forma_de_pago>forma_de_pago = service.listarId(id);
		model.addAttribute("Forma_de_pago", forma_de_pago);
		return "/Vistas/Forma_de_pago/editar";
		
	}
	
	@GetMapping("/eliminar/forma_de_pago/{id}")
	public String eliminar(@PathVariable int id, Model model) {
		
		service.delete(id);
		return "redirect:/listar/forma_de_pago";
		
	}

}
