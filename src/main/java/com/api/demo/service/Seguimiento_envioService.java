package com.api.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.demo.interfaceService.Iseguimiento_envioService;
import com.api.demo.interfaces.ISeguimiento_envio;
import com.api.demo.modelo.Seguimiento_envio;

@Service
public class Seguimiento_envioService implements Iseguimiento_envioService{

	@Autowired
	private ISeguimiento_envio data;
	
	@Override
	public List<Seguimiento_envio> listar() {
		return (List<Seguimiento_envio>)data.findAll();
	}

	@Override
	public Optional<Seguimiento_envio> listarId(int id) {
		return data.findById(id);
	}

	@Override
	public int save(Seguimiento_envio s) {
		int res=0;
		Seguimiento_envio seguimiento_envio=data.save(s);
		if (!seguimiento_envio.equals(null)) {
			res=1;
		}
		
		return res;
	}

	@Override
	public void delete(int id) {
		data.deleteById(id);
		
	}

	

}
