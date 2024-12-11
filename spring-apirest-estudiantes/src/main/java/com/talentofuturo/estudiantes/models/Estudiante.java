package com.talentofuturo.estudiantes.models;

public class Estudiante {
	private String rut;
	private String nombre;
	private String apellido;
	private String correo;
	
	public Estudiante() {}

	public Estudiante(String rut, String nombre, String apellido, String correo) {
		this.rut = rut;
		this.nombre = nombre;
		this.apellido = apellido;
		this.correo = correo;
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

	@Override
	public String toString() {
		return "Estudiante [rut=" + rut + ", nombre=" + nombre + ", apellido=" + apellido + ", correo=" + correo + "]";
	}
	
}
