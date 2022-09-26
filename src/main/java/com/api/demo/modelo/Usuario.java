package com.api.demo.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "usuario")
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idusuario;
	@Column
	private String primer_nombre;
	@Column
	private String segundo_nombre;
	@Column
	private String primer_apellidos;
	@Column
	private String segundo_apellido;
	@Column
	private String tipoidentificacion;
	@Column
	private int noidentificacion;
	@Column
	private int telefono;
	@Column
	private String direccion;
	@Column
	private String rol;
	
	
	public Usuario() {
		super();

	}
	
	


	public Usuario(int idusuario, String primer_nombre, String segundo_nombre, String primer_apellidos,
			String segundo_apellido, String tipoidentificacion, int noidentificacion, int telefono, String direccion,
			String rol) {
		super();
		this.idusuario = idusuario;
		this.primer_nombre = primer_nombre;
		this.segundo_nombre = segundo_nombre;
		this.primer_apellidos = primer_apellidos;
		this.segundo_apellido = segundo_apellido;
		this.tipoidentificacion = tipoidentificacion;
		this.noidentificacion = noidentificacion;
		this.telefono = telefono;
		this.direccion = direccion;
		this.rol = rol;
	}




	public Integer getIdusuario() {
		return idusuario;
	}


	public void setIdusuario(Integer idusuario) {
		this.idusuario = idusuario;
	}


	public String getPrimer_nombre() {
		return primer_nombre;
	}


	public void setPrimer_nombre(String primer_nombre) {
		this.primer_nombre = primer_nombre;
	}


	public String getSegundo_nombre() {
		return segundo_nombre;
	}


	public void setSegundo_nombre(String segundo_nombre) {
		this.segundo_nombre = segundo_nombre;
	}


	public String getPrimer_apellidos() {
		return primer_apellidos;
	}


	public void setPrimer_apellidos(String primer_apellidos) {
		this.primer_apellidos = primer_apellidos;
	}


	public String getSegundo_apellido() {
		return segundo_apellido;
	}


	public void setSegundo_apellido(String segundo_apellido) {
		this.segundo_apellido = segundo_apellido;
	}


	public String getTipoidentificacion() {
		return tipoidentificacion;
	}


	public void setTipoidentificacion(String tipoidentificacion) {
		this.tipoidentificacion = tipoidentificacion;
	}


	public int getNoidentificacion() {
		return noidentificacion;
	}


	public void setNoidentificacion(int noidentificacion) {
		this.noidentificacion = noidentificacion;
	}


	public int getTelefono() {
		return telefono;
	}


	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public String getRol() {
		return rol;
	}


	public void setRol(String rol) {
		this.rol = rol;
	}
	
	
	
	
	
}
