package com.api.demo.interfaceService;

import java.util.List;
import java.util.Optional;
import com.api.demo.modelo.Producto;


public interface IproductoService{

	public List<Producto>listar();
	public Optional<Producto>listarId(int id);
	public int save(Producto p);
	public void delete(int id);
	
}
