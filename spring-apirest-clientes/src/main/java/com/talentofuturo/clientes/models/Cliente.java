package com.talentofuturo.clientes.models;

import java.util.List;

public class Cliente {
	private Integer id;
	private String rut;
	private String nombre;
	private String apellido;
	private String correo;
	private String direccion;
	private List<OrdenCompra> ordenes;
	
	public Cliente() {}
	
	public Cliente(Integer id, String rut, String nombre, String apellido, String correo, String direccion,
			List<OrdenCompra> ordenes) {
		super();
		this.id = id;
		this.rut = rut;
		this.nombre = nombre;
		this.apellido = apellido;
		this.correo = correo;
		this.direccion = direccion;
		this.ordenes = ordenes;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public List<OrdenCompra> getOrdenes() {
		return ordenes;
	}

	public void setOrdenes(List<OrdenCompra> ordenes) {
		this.ordenes = ordenes;
	}
	
}
