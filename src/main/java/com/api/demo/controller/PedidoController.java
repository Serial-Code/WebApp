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

import com.api.demo.interfaceService.IpedidoService;
import com.api.demo.modelo.Pedido;

@Controller
@RequestMapping
public class PedidoController {
	
	@Autowired
	private IpedidoService service;
	
	@GetMapping("/listar/pedido")
	public String listar(Model model) {
		
		List<Pedido>pedidos = service.listar();
		model.addAttribute("pedido", pedidos);
		
		return "/Vistas/Pedido/index";
		
	}
	
	@GetMapping("/new/pedido")
	public String agregar(Model model) {
			
		model.addAttribute("pedido", new Pedido());
		return "/Vistas/Pedido/add";
		
	}
	
	@PostMapping("/save/pedido")
	public String save(@Validated Pedido pe, Model model) {
		service.save(pe);
		return "redirect:/listar/pedido";
		
	}
	
	@GetMapping("/editar/pedido/{id}")
	public String editar(@PathVariable int id, Model model) {
		
		Optional<Pedido>pedido = service.listarId(id);
		model.addAttribute("pedido", pedido);
		return "/Vistas/Pedido/editar";
		
	}
	
	@GetMapping("/eliminar/pedido/{id}")
	public String eliminar(@PathVariable int id, Model model) {
		
		service.delete(id);
		return "redirect:/listar/pedido";
		
	}

}
