package com.api.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.demo.interfaceService.IpedidoService;
import com.api.demo.interfaces.IPedido;
import com.api.demo.modelo.Pedido;

@Service
public class PedidoService implements IpedidoService{
	
	@Autowired
	private IPedido data;
	
	@Override
	public List<Pedido> listar() {
		return (List<Pedido>)data.findAll();
	}
	
	@Override
	public Optional<Pedido> listarId(int id) {
		return data.findById(id);
	}
	
	@Override
	public int save(Pedido pe) {
		int res=0;
		Pedido pedido=data.save(pe);
		if (!pedido.equals(null)) {
			res=1;
		}
		
		return res;
	}
	
	@Override
	public void delete(int id) {
		data.deleteById(id);
		
	}

}
