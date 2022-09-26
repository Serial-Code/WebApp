package com.api.demo.interfaceService;

import java.util.List;
import java.util.Optional;

import com.api.demo.modelo.Inventario;

public interface IinventarioService {
	public List<Inventario>listar();
	public Optional<Inventario>listarId(int id);
	public int save(Inventario i);
	public void delete(int id);
}
