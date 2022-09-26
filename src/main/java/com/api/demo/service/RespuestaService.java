package com.api.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.demo.interfaceService.IrespuestaService;
import com.api.demo.interfaces.IRespuesta;
import com.api.demo.modelo.Respuesta;


@Service
public class RespuestaService implements IrespuestaService{

	@Autowired
	private IRespuesta data;
	
	@Override
	public List<Respuesta> listar() {
		return (List<Respuesta>)data.findAll();
	}

	@Override
	public Optional<Respuesta> listarId(int id) {
		return data.findById(id);
	}

	@Override
	public int save(Respuesta r) {
		int res=0;
		Respuesta respuesta=data.save(r);
		if (!respuesta.equals(null)) {
			res=1;
		}
		
		return res;
	}

	@Override
	public void delete(int id) {
		data.deleteById(id);
		
	}
}
