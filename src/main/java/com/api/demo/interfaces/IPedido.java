package com.api.demo.interfaces;

import org.springframework.data.repository.CrudRepository;

import com.api.demo.modelo.Pedido;

public interface IPedido extends CrudRepository<Pedido, Integer>{

}
