package com.api.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.demo.interfaceService.IcotizacionService;
import com.api.demo.interfaces.ICotizacion;
import com.api.demo.modelo.Cotizacion;

@Service
public class CotizacionService implements IcotizacionService {

	@Autowired
	private ICotizacion data;
	@Override
	public List<Cotizacion> listar() {
		return (List<Cotizacion>)data.findAll();
	}

	@Override
	public Optional<Cotizacion> listarId(int id) {
		return data.findById(id);
	}

	@Override
	public int save(Cotizacion c) {
		int res=0;
		Cotizacion cotizacion=data.save(c);
		if (!cotizacion.equals(null)) {
			res=1;
		}
		return res;
	}

	@Override
	public void delete(int id) {
		data.deleteById(id);
	}

}
