package com.api.demo.interfaceService;

import java.util.List;
import java.util.Optional;

import com.api.demo.modelo.Venta;
public interface IventaService {
	
	public List<Venta>listar();
	public Optional<Venta>listarId(int id);
	public int save(Venta v);
	public void delete(int id);

}
