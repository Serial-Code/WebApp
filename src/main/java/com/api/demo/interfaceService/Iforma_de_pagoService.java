package com.api.demo.interfaceService;

import java.util.List;
import java.util.Optional;

import org.springframework.context.annotation.Bean;

import com.api.demo.modelo.Forma_de_pago;

public interface Iforma_de_pagoService {
	public List<Forma_de_pago>listar();
	public Optional<Forma_de_pago>listarId(int id);
	public int save(Forma_de_pago f);
	public void delete(int id);
}
