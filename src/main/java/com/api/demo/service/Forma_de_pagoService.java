package com.api.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.demo.interfaceService.Iforma_de_pagoService;
import com.api.demo.interfaces.IForma_de_pago;
import com.api.demo.modelo.Forma_de_pago;
import com.api.demo.modelo.Producto;

@Service
public class Forma_de_pagoService implements Iforma_de_pagoService{

	@Autowired
	private IForma_de_pago data;
	
	@Override
	public List<Forma_de_pago> listar() {
		return (List<Forma_de_pago>)data.findAll();
	}

	@Override
	public Optional<Forma_de_pago> listarId(int id) {
		return data.findById(id);
	}

	@Override
	public int save(Forma_de_pago f) {
		int res=0;
		Forma_de_pago forma_de_pago=data.save(f);
		if (!forma_de_pago.equals(null)) {
			res=1;
		}
		
		return res;
	}

	@Override
	public void delete(int id) {
		data.deleteById(id);
	}

}
