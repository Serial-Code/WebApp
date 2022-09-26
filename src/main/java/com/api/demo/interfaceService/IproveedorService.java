package com.api.demo.interfaceService;

import java.util.List;
import java.util.Optional;

import com.api.demo.modelo.Proveedor;

public interface IproveedorService {
	
	public List<Proveedor>listar();
	public Optional<Proveedor>listarId(int id);
	public int save(Proveedor pr);
	public void delete(int id);
}
