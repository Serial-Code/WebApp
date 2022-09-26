package com.api.demo.modelo;



import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pqrs")
public class Pqrs {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idpqrs;
	@Column
	private String tipo;
	@Column
	private String descripcion;
	@Column
	private Date fecha;
	
	public Pqrs() {
		super();
		}

	public Integer getIdpqrs() {
		return idpqrs;
	}

	public void setIdpqrs(Integer idpqrs) {
		this.idpqrs = idpqrs;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
	
}
