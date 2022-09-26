package com.api.demo.interfaceService;

import java.util.List;
import java.util.Optional;

import com.api.demo.modelo.Calificacion;

public interface IcalificacionService {

	public List<Calificacion>listar();
	public Optional<Calificacion>listarId(int id);
	public int save(Calificacion ca);
	public void delete(int id);
}
