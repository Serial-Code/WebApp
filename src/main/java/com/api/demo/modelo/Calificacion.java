package com.api.demo.modelo;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "calificacion")
public class Calificacion {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idcalificacion;
	@Column
	private Date fecha;
	@Column
	private int puntuacion;
	
	public Calificacion() {
		super();
	}

	public Integer getIdcalificacion() {
		return idcalificacion;
	}

	public void setIdcalificacion(Integer idcalificacion) {
		this.idcalificacion = idcalificacion;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public int getPuntuacion() {
		return puntuacion;
	}

	public void setPuntuacion(int puntuacion) {
		this.puntuacion = puntuacion;
	}

	
}
