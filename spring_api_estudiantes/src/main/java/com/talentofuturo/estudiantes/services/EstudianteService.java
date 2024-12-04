package com.talentofuturo.estudiantes.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.talentofuturo.estudiantes.models.Estudiante;

@Service
public class EstudianteService {
	
	List<Estudiante> estudiantes = new ArrayList<Estudiante>();
	
	public EstudianteService() {
		this.estudiantes.add(new Estudiante("1111111-1","Nombre 1", "Apellido 1", "uno@correo.com"));
		this.estudiantes.add(new Estudiante("2222222-2","Nombre 2", "Apellido 2", "dos@correo.com"));
		this.estudiantes.add(new Estudiante("3333333-3","Nombre 3", "Apellido 3", "tres@correo.com"));
	}
	
	public List<Estudiante> findAll(){
		return estudiantes;
	}
	
	public Estudiante findByRut(String rut){		
		return estudiantes.stream().filter(e -> e.getRut().equals(rut)).findFirst().orElse(new Estudiante());
	}
	
	public Estudiante create(Estudiante estudiante){
		estudiantes.add(estudiante);		
		return estudiantes.stream().filter(e -> e.getRut().equals(estudiante.getRut())).findFirst().orElse(new Estudiante());
	}
	
	public Estudiante update(Estudiante estudiante){
		Estudiante actualiza = estudiantes.stream().filter(e -> e.getRut().equals(estudiante.getRut())).findFirst().orElse(new Estudiante());
		Integer index = estudiantes.indexOf(actualiza);
		if(index > 0) {
			estudiantes.set(index, estudiante);
			return estudiantes.stream().filter(e -> e.getRut().equals(estudiante.getRut())).findFirst().orElse(new Estudiante());
		}
		return new Estudiante();
	}
	
	public Boolean deleteByRut(String rut){
		Boolean eliminado = false;
		Estudiante actualiza = estudiantes.stream().filter(e -> e.getRut().equals(rut)).findFirst().orElse(new Estudiante());
		Integer index = estudiantes.indexOf(actualiza);
		if(index > 0) {
			estudiantes.remove(index);
			eliminado = true;
		}
		return eliminado;
	}
	
}
