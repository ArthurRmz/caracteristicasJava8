package com.example.demo;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class App {
	
	private Map<Integer, String> map;
	
	public void poblar() {
		map = new HashMap<>();
		map.put(1, "Arthur");
		map.put(2, "Jess");
		map.put(3, "Sam");
	}
	
	public void imprimir_v7() {
		for(Entry<Integer, String> e:map.entrySet()) {
			System.out.println("Llave: "+e.getKey()+" Valor: "+e.getValue());
		}
	}
	
	public void imprimir_v8() {
//		map.forEach((key,value)->System.out.println("Llave: "+key+" Valor: "+value));
		map.entrySet().stream().forEach(System.out::println);
	}
	
	public void insertarSiAusente() {
//		map.putIfAbsent(4, "Jaime");
		map.putIfAbsent(2, "Jaime");
	}
	
	public void operarSiPresente() {
		map.computeIfPresent(3, (key,value)-> key+value);
		System.out.println(map.get(3));
	}
	
	public void obtenerOrPredeterminado() {
		String valor = map.getOrDefault(5, "Defecto");
		System.out.println(valor);
	}
	
	public void recolectar() {
		Map<Integer, String> mapaRecolectado = map.entrySet().stream()
				.filter(e -> e.getValue().contains("ss"))
				.collect(Collectors.toMap(p->p.getKey(), p -> p.getKey()+ " - "+ p.getValue()));
		
		mapaRecolectado.entrySet().stream().forEach(System.out::println);
	}

	public static void main(String[] args) {
		App app = new App();
		app.poblar();
		
//		app.imprimir_v7();
//		app.insertarSiAusente();
//		app.operarSiPresente();
//		app.obtenerOrPredeterminado();
//		app.imprimir_v8();
		
		app.recolectar();
		
	}

}
