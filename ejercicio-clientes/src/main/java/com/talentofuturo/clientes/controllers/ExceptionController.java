package com.talentofuturo.clientes.controllers;

import com.talentofuturo.clientes.models.Error;
import com.talentofuturo.clientes.exceptions.*;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.resource.NoResourceFoundException;

@RestControllerAdvice
public class ExceptionController {
	
	@ExceptionHandler(NoResourceFoundException.class)
	public ResponseEntity<?> noResourceFoundException(Exception ex){
		Error error = new Error();
		error.setMessage("URL no existe");
		error.setError(ex.getMessage());
		error.setDate(new Date());
		error.setStatus(HttpStatus.NOT_FOUND.value());
		return ResponseEntity.status(HttpStatus.NOT_FOUND.value()).body(error);
	}

	@ExceptionHandler(ClienteNotFound.class)
	public ResponseEntity<?> estudianteNotFound(Exception ex){
		Error error = new Error();
		error.setMessage("Cliente no existe");
		error.setError(ex.getMessage());
		error.setDate(new Date());
		error.setStatus(HttpStatus.NOT_FOUND.value());
		return ResponseEntity.status(HttpStatus.NOT_FOUND.value()).body(error);
	}
}
