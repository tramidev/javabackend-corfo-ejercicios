package com.talentofuturo.clientes.services;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.talentofuturo.clientes.models.*;

@Service
public class ClienteService {

	List<Cliente> clientes = new ArrayList<Cliente>();
	
	public ClienteService() {
		this.clientes.add(new Cliente(1,"1111111-1","Nombre 1", "Apellido 1", "uno@correo.com","Calle falsa 111", new ArrayList<OrdenCompra>()));
		this.clientes.add(new Cliente(2,"2222222-2","Nombre 2", "Apellido 2", "dos@correo.com","Calle falsa 222", new ArrayList<OrdenCompra>()));
		List<OrdenCompra> ordenes3 = new ArrayList<OrdenCompra>();
		ordenes3.add(new OrdenCompra(1, new Date(), 1));
		ordenes3.add(new OrdenCompra(2, new Date(), 2));
		this.clientes.add(new Cliente(3,"3333333-3","Nombre 3", "Apellido 3", "tres@correo.com","Calle falsa 333", ordenes3));
	}
	
	public List<Cliente> findAll(){
		return clientes;
	}
	
	public Cliente findByRut(String rut){		
		return clientes.stream().filter(e -> e.getRut().equals(rut)).findFirst().orElse(new Cliente());
	}
	
	public Cliente create(Cliente cliente){
		clientes.add(cliente);		
		return clientes.stream().filter(e -> e.getRut().equals(cliente.getRut())).findFirst().orElse(new Cliente());
	}
	
	public Cliente update(Cliente cliente){
		Cliente actualiza = clientes.stream().filter(e -> e.getRut().equals(cliente.getRut())).findFirst().orElse(new Cliente());
		Integer index = clientes.indexOf(actualiza);
		if(index > 0) {
			clientes.set(index, cliente);
			return clientes.stream().filter(e -> e.getRut().equals(cliente.getRut())).findFirst().orElse(new Cliente());
		}
		return new Cliente();
	}
	
	public Cliente deleteByRut(String rut){		
		Cliente elimina = clientes.stream().filter(e -> e.getRut().equals(rut)).findFirst().orElse(new Cliente());
		if(elimina.getRut() != null) {
			clientes.remove(elimina);
			return elimina;
		}
		return new Cliente();
	}
	
}
