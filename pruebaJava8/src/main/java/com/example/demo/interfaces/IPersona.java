package com.example.demo.interfaces;

import com.example.demo.Persona;

@FunctionalInterface
public interface IPersona {
	
	Persona crear(int id, String nombre);
}
