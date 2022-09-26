package com.api.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.demo.interfaceService.IinventarioService;
import com.api.demo.interfaces.IInventario;
import com.api.demo.modelo.Inventario;


@Service
public class InventarioService implements IinventarioService{

	@Autowired
	private IInventario data;	
	
	@Override
	public List<Inventario> listar() {
		return (List<Inventario>)data.findAll();
	}

	@Override
	public Optional<Inventario> listarId(int id) {
		return data.findById(id);
	}

	@Override
	public int save(Inventario i) {
		int res=0;
		Inventario inventario=data.save(i);
		if (!inventario.equals(null)) {
			res=1;
		}
		return res;
	}

	@Override
	public void delete(int id) {
		data.deleteById(id);
	}
	
}
