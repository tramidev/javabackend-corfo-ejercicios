package com.talentofuturo.estudiantes.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.talentofuturo.estudiantes.exceptions.EstudianteNotFound;
import com.talentofuturo.estudiantes.models.Estudiante;
import com.talentofuturo.estudiantes.services.EstudianteService;

import java.util.List;

@RestController
@RequestMapping("/estudiantes")
public class EstudianteController {
	
	@Autowired
	EstudianteService estudianteService;
	
	@GetMapping
	public List<Estudiante> findAll(){
		return estudianteService.findAll();
	}
	
	@GetMapping("/{rut}")
	public Estudiante findByRut(@PathVariable String rut){
		Estudiante estudiante = estudianteService.findByRut(rut);
		if(estudiante.getRut() == null) {
			throw new EstudianteNotFound(String.format("El estudiante con RUT %s no existe.", rut));
		}
		return estudianteService.findByRut(rut);
	}
	
	@PostMapping
	public Estudiante create(@RequestBody Estudiante estudiante){
		return estudianteService.create(estudiante);
	}
	
	@PutMapping
	public Estudiante update(@RequestBody Estudiante estudiante){
		return estudiante;
	}
	
	@DeleteMapping
	public Boolean deleteByRut(String rut){
		Boolean eliminado = true;
		return eliminado;
	}
}