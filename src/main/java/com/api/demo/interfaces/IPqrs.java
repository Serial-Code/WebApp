package com.api.demo.interfaces;

import org.springframework.data.repository.CrudRepository;

import com.api.demo.modelo.Pqrs;

public interface IPqrs extends CrudRepository<Pqrs, Integer>{

}
