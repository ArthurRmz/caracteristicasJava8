package com.example.demo;

import lombok.Data;

@Data
public class Persona {

	private int id;
	private String nombre;
	
	public Persona(int id, String nombre) {
		this.id = id;
		this.nombre = nombre;
	}

	public Persona() {
	}
	
	
}
