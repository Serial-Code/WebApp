package com.api.demo.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.api.demo.modelo.Usuario;

@Repository
public interface IUsuario extends CrudRepository<Usuario, Integer> {

	
	
}
