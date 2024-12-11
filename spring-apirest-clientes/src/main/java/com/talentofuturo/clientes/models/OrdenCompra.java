package com.talentofuturo.clientes.models;

import java.util.Date;

public class OrdenCompra {
	private Integer id;
	private Date fecha;
	private Integer idProducto;
	
	public OrdenCompra() {}
	public OrdenCompra(Integer id, Date fecha, Integer idProducto) {
		this.id = id;
		this.fecha = fecha;
		this.idProducto = idProducto;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public Integer getIdProducto() {
		return idProducto;
	}
	public void setIdProducto(Integer idProducto) {
		this.idProducto = idProducto;
	}
	
}
