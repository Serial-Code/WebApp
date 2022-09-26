package com.api.demo.interfaces;

import org.springframework.data.repository.CrudRepository;

import com.api.demo.modelo.Inventario;


public interface IInventario extends CrudRepository<Inventario, Integer>{

}
