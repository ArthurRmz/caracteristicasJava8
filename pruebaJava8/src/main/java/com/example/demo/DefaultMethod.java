package com.example.demo;

public class DefaultMethod implements PersonaA, PersonaB{

	@Override
	public void caminar() {
		System.out.println("Hi developer");
	}

	@Override
	public void hablar() {
//		PersonaA.super.hablar();
//		PersonaB.super.hablar();
		System.out.println("Suscribe to my channel");
	}

	public static void main(String[] args) {
		
		DefaultMethod app = new DefaultMethod();
		app.hablar();

	}
}
