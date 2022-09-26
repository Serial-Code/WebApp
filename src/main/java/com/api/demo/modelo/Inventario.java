package com.api.demo.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "inventario")
public class Inventario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idinventario;
	@Column
	private String categoria;
	@Column
	private String entradas;
	@Column
	private String salidas;
	@Column
	private String descripcion;
	
	public Inventario() {
		super();
	}

	public Integer getIdinventario() {
		return idinventario;
	}

	public void setIdinventario(Integer idinventario) {
		this.idinventario = idinventario;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getEntradas() {
		return entradas;
	}

	public void setEntradas(String entradas) {
		this.entradas = entradas;
	}

	public String getSalidas() {
		return salidas;
	}

	public void setSalidas(String salidas) {
		this.salidas = salidas;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
	
}
