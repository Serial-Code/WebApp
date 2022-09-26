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
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.api.demo.interfaceService.IusuarioService;
import com.api.demo.modelo.Usuario;


@Controller
@RequestMapping
public class UsuarioController {

	@Autowired
	private IusuarioService service;
	
	@GetMapping("/listar/usuario")
	public String listar(Model model) {
		
		List<Usuario>usuarios = service.listar();
		model.addAttribute("usuario", usuarios);
		
		return "/Vistas/Usuario/index";
		
	}
	
	@GetMapping("/new/usuario")
	public String agregar(Model model) {
		
		model.addAttribute("usuario", new Usuario());
		return "/Vistas/Usuario/add";
	}
	
	@PostMapping("/save/usuario")
	public String save(@Validated Usuario u,  Model model) {
		service.save(u);
		return "redirect:/listar/usuario";

		
	}
	
	@GetMapping("/editar/usuario/{id}")
	public String editar(@PathVariable int id, Model model) {
		Optional<Usuario>usuario=service.listarId(id);
		model.addAttribute("usuario", usuario);
		return "/Vistas/Usuario/editar";
		
	}
	
	@GetMapping("/eliminar/usuario/{id}")
	public String delete(Model model, @PathVariable int id) {
		
		service.delete(id);
		return "redirect:/listar/usuario";
		
	}
	
	
}
