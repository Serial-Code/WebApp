package com.api.demo.interfaceService;

import java.util.List;
import java.util.Optional;

import com.api.demo.modelo.Pqrs;

public interface IpqrsService {

	public List<Pqrs>listar();
	public Optional<Pqrs>listarId(int id);
	public int save(Pqrs p);
	public void delete(int id);
}
