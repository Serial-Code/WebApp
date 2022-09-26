package com.api.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.demo.interfaceService.IpqrsService;
import com.api.demo.interfaces.IPqrs;
import com.api.demo.modelo.Pqrs;

@Service
public class PqrsService implements IpqrsService{
	
	@Autowired
	private IPqrs data;

	@Override
	public List<Pqrs> listar() {
		return (List<Pqrs>)data.findAll();
	}

	@Override
	public Optional<Pqrs> listarId(int id) {
		return data.findById(id);
	}

	@Override
	public int save(Pqrs p) {
		int res=0;
		Pqrs pqrs=data.save(p);
		if(!pqrs.equals(null)) {
			res=1;
		}
		return res;
	}

	@Override
	public void delete(int id) {
		data.deleteById(id);
	}

}
