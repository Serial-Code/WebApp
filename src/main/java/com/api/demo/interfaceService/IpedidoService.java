package com.api.demo.interfaceService;

import java.util.List;
import java.util.Optional;

import com.api.demo.modelo.Pedido;

public interface IpedidoService {
	
	public List<Pedido>listar();
	public Optional<Pedido>listarId(int id);
	public int save(Pedido pe);
	public void delete(int id);
}
