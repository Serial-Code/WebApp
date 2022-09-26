package com.api.demo.interfaces;

import org.springframework.data.repository.CrudRepository;

import com.api.demo.modelo.Proveedor;


public interface IProveedor extends CrudRepository<Proveedor, Integer> {

}
