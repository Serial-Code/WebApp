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

import com.api.demo.interfaceService.IproveedorService;
import com.api.demo.modelo.Proveedor;

@Controller
@RequestMapping
public class ProveedorController {

		@Autowired
		private IproveedorService service;
		
		@GetMapping("/listar/proveedor")
		public String listar(Model model) {
			
			List<Proveedor>proveedores = service.listar();
			model.addAttribute("proveedor", proveedores);
			
			return "/Vistas/Proveedor/index";
			
		}
		
		@GetMapping("/new/proveedor")
		public String agregar(Model model) {
				
			model.addAttribute("proveedor", new Proveedor());
			return "/Vistas/Proveedor/add";
			
		}
		
		@PostMapping("/save/proveedor")
		public String save(@Validated Proveedor pr, Model model) {
			service.save(pr);
			return "redirect:/listar/proveedor";
			
		}
		
		@GetMapping("/editar/proveedor/{id}")
		public String editar(@PathVariable int id, Model model) {
			
			Optional<Proveedor>proveedor = service.listarId(id);
			model.addAttribute("proveedor", proveedor);
			return "/Vistas/Proveedor/editar";
			
		}
		
		@GetMapping("/eliminar/proveedor/{id}")
		public String eliminar(@PathVariable int id, Model model) {
			
			service.delete(id);
			return "redirect:/listar/proveedor";
			
		}
}
