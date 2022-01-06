package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public class StreamsApp {
	
	private List<String> lista;
	private List<String> numeros;
	
	public StreamsApp() {
		lista = new ArrayList<String>();
		lista.add("Veronica");
		lista.add("Alberto");
		lista.add("Carlos");
		lista.add("Andrea");
		lista.add("Arthur");
		
		numeros = new ArrayList<String>();
		numeros.add("1");
		numeros.add("2");
		numeros.add("3");
		
	}
	public void filtrar() {
		lista.stream().filter(x -> x.startsWith("C")).forEach(System.out::println);
	}
	
	public void ordenar() {
//		lista.stream().sorted().forEach(System.out::println);
		lista.stream().sorted((e1,e2)-> e2.compareTo(e1)).forEach(elemento -> System.out.println(elemento));
	}
	
	public void transformar() {
//		lista.stream().map(String::toUpperCase).forEach(System.out::println);
		
//		for(String x:numeros) {
//			int num = Integer.parseInt(x)+1;
//			System.out.println(num);
//		}
		
		numeros.stream().map(x -> Integer.parseInt(x)+1).forEach(System.out::println);;
	}
	
	public void limitar() {
		lista.stream().limit(3).forEach(System.out::println);
	}
	
	public void contar() {
		long x = lista.stream().count();
		System.out.println(x);
	}

	public static void main(String[] args) {
		StreamsApp app = new StreamsApp();
//		app.filtrar();
//		app.ordenar();
//		app.transformar();
//		app.limitar();
		app.contar();
	}
}
