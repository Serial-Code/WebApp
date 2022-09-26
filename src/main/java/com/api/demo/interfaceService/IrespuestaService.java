package com.api.demo.interfaceService;

import java.util.List;
import java.util.Optional;

import com.api.demo.modelo.Respuesta;


public interface IrespuestaService {
	
	public List<Respuesta>listar();
	public Optional<Respuesta>listarId(int id);
	public int save(Respuesta r);
	public void delete(int id);
}
