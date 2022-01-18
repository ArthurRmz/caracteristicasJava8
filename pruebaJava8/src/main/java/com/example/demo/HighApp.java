package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class HighApp {
	
	
	private Function<String, String> convertirMayusculas = x -> x.toUpperCase();
	private Function<String, String> convertirMinusculas = x -> x.toLowerCase();
	private Consumer<String> imprimirDatos = elemento -> System.out.println("- "+elemento);
	
	public void imprimir(Function<String, String> funcion, String valor) {
		System.out.println(funcion.apply(valor));
	}
	
	public Function<String, String> mostrar(String mensaje){
		return (String x) -> mensaje+x;
	}
	
	public void filtrar(List<String> lista, Consumer<String> consumidor, int longitud, String cadena) {
		if(longitud==0) {
			lista.stream().filter(this.establecerLogicaFiltro(cadena)).forEach(consumidor);
		}else {
			lista.stream().filter(this.establecerLogicaFiltro(longitud)).forEach(consumidor);
		}
	}
	
	public Predicate<String> establecerLogicaFiltro(int longitud){
		return texto -> texto.length() < longitud;
	}

	public Predicate<String> establecerLogicaFiltro(String longitud){
		return texto -> texto.toLowerCase().contains(longitud.toLowerCase());
	}

	public static void main(String[] args) {
		HighApp app = new HighApp();
//		app.imprimir(app.convertirMayusculas, "arthur");
//		app.imprimir(app.convertirMinusculas, "ARTHUR");
		
//		String salida = app.mostrar("Hola ").apply("Arthur");
//		System.out.println(salida);
		
		List<String> lista = new ArrayList<>();
		lista.add("Arthur");
		lista.add("Jessica");
		lista.add("Pamela");
		lista.add("John");
		lista.add("Carlos");
		
//		app.filtrar(lista, System.out::println, 7, null);
//		app.filtrar(lista, System.out::println, 0, "a");
//		app.filtrar(lista, elemento -> System.out.println("- "+elemento), 0, "a");
		app.filtrar(lista, app.imprimirDatos, 0, "a");
		
	}

}
