package com.api.demo.interfaceService;

import java.util.List;
import java.util.Optional;

import com.api.demo.modelo.Seguimiento_envio;

public interface Iseguimiento_envioService {

	public List<Seguimiento_envio>listar();
	public Optional<Seguimiento_envio>listarId(int id);
	public int save(Seguimiento_envio s);
	public void delete(int id);
}
