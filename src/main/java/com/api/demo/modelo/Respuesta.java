package com.api.demo.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "respuesta")
public class Respuesta {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idrespuesta;
	@Column
	private String respuesta;
	public Integer getIdrespuesta() {
		return idrespuesta;
	}
	public void setIdrespuesta(Integer idrespuesta) {
		this.idrespuesta = idrespuesta;
	}
	public String getRespuesta() {
		return respuesta;
	}
	public void setRespuesta(String respuesta) {
		this.respuesta = respuesta;
	}
	public Respuesta() {
		super();
	}
	
}
