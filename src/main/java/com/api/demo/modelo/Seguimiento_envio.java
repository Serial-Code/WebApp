package com.api.demo.modelo;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "seguimiento_envio")
public class Seguimiento_envio {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idseguimiento_envio;
	@Column
	private int referenciaenvio;
	@Column
	private Date fechainicio;
	@Column
	private Date fechafin;
	@Column
	private String destino;
	
	
	public Seguimiento_envio() {
		super();
	}


	public Integer getIdseguimiento_envio() {
		return idseguimiento_envio;
	}


	public void setIdseguimiento_envio(Integer idseguimiento_envio) {
		this.idseguimiento_envio = idseguimiento_envio;
	}


	public int getReferenciaenvio() {
		return referenciaenvio;
	}


	public void setReferenciaenvio(int referenciaenvio) {
		this.referenciaenvio = referenciaenvio;
	}


	public Date getFechainicio() {
		return fechainicio;
	}


	public void setFechainicio(Date fechainicio) {
		this.fechainicio = fechainicio;
	}


	public Date getFechafin() {
		return fechafin;
	}


	public void setFechafin(Date fechafin) {
		this.fechafin = fechafin;
	}


	public String getDestino() {
		return destino;
	}


	public void setDestino(String destino) {
		this.destino = destino;
	}
	
	
	
	
}
