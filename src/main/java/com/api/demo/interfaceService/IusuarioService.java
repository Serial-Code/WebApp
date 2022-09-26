package com.api.demo.interfaceService;

import java.util.List;
import java.util.Optional;

import com.api.demo.modelo.Usuario;

public interface IusuarioService {

	public List<Usuario>listar();
	public Optional<Usuario>listarId(int id);
	public int save(Usuario u);
	public void delete(int id);
	
}
