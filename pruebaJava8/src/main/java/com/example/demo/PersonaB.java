package com.example.demo;

public interface PersonaB {

	public void caminar();
	
	default public void hablar() {
		System.out.println("Hi developer - Person B");
	}
}
