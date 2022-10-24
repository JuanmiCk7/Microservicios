package com.nttdata.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RetoController {
	
	@Value("${bootcamp.alumno}")
	private String nombre;
	
	@GetMapping(path="/getNombreAlumno")
	public String getNombreAlumno() {
		return this.nombre;
	}

}
