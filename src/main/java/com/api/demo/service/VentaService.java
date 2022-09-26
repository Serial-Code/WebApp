package com.api.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.demo.interfaceService.IventaService;
import com.api.demo.interfaces.IVenta;
import com.api.demo.modelo.Venta;

@Service
public class VentaService implements IventaService{
	
	@Autowired
	private IVenta data;
	
	@Override
	public List<Venta> listar() {
		return (List<Venta>)data.findAll();
	}

	@Override
	public Optional<Venta> listarId(int id) {
		return data.findById(id);
	}

	@Override
	public int save(Venta v) {
		int res=0;
		Venta venta=data.save(v);
		if (!venta.equals(null)) {
			res=1;
		}
		
		return res;
	}

	@Override
	public void delete(int id) {
		data.deleteById(id);
		
	}

	

	

}
