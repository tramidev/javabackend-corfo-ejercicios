package com.talentofuturo.clientes.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.talentofuturo.clientes.exceptions.ClienteNotFound;
import com.talentofuturo.clientes.models.Cliente;
import com.talentofuturo.clientes.services.ClienteService;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

	@Autowired
	ClienteService clienteService;
	
	@GetMapping
	public List<Cliente> findAll(){
		return clienteService.findAll();
	}
	
	@GetMapping("/{rut}")
	public Cliente findByRut(@PathVariable String rut){
		Cliente cliente = clienteService.findByRut(rut);
		if(cliente.getRut() == null) {
			throw new ClienteNotFound(String.format("El cliente con RUT %s no existe.", rut));
		}
		return clienteService.findByRut(rut);
	}
	
	@PostMapping
	public Cliente create(@RequestBody Cliente cliente){
		return clienteService.create(cliente);
	}
	
	@PutMapping
	public Cliente update(@RequestBody Cliente cliente){
		return clienteService.update(cliente);
	}
	
	@DeleteMapping("/{rut}")
	public Cliente deleteByRut(@PathVariable String rut){
		return clienteService.deleteByRut(rut);
	}
	
}
