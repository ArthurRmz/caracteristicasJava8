package com.example.demo;

public interface PersonaA {

	public void caminar();
	
	default public void hablar() {
		System.out.println("Hi developer - Person A");
	}
}
