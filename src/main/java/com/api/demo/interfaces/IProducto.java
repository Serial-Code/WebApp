package com.api.demo.interfaces;

import org.springframework.data.repository.CrudRepository;

import com.api.demo.modelo.Producto;

public interface IProducto extends CrudRepository<Producto, Integer>{

}
