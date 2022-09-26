package com.api.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.demo.interfaceService.IcalificacionService;
import com.api.demo.interfaces.ICalificacion;
import com.api.demo.modelo.Calificacion;

@Service
public class CalificacionService implements IcalificacionService{

	@Autowired
	private ICalificacion data;
	
	@Override
	public List<Calificacion> listar() {
		return (List<Calificacion>)data.findAll();
	}
	
	@Override
	public Optional<Calificacion> listarId(int id) {
		return data.findById(id);
	}
	
	@Override
	public int save(Calificacion ca) {
		int res=0;
		Calificacion calificacion=data.save(ca);
		if (!calificacion.equals(null)) {
			res=1;
		}
		
		return res;
	}
	
	@Override
	public void delete(int id) {
		data.deleteById(id);
		
	}
}
