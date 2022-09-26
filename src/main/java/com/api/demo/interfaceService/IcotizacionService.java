package com.api.demo.interfaceService;

import java.util.List;
import java.util.Optional;

import com.api.demo.modelo.Cotizacion;

public interface IcotizacionService {
	
	public List<Cotizacion>listar();
	public Optional<Cotizacion>listarId(int id);
	public int save(Cotizacion c);
	public void delete(int id);

}
