package com.example.demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionApp {
	private List<String> lista;
	
	public void llenarLista() {
		lista = new ArrayList<String>();
		lista.add("Veronica");
		lista.add("Alberto");
		lista.add("Andrea");
		lista.add("Arthur");
	}
	
	public void usarForEach() {
//		for(String elemento: lista) {
//			System.out.println(elemento);
//		}
		
//		lista.forEach(x -> System.out.println(x));
		
		lista.forEach(System.out::println);
	}
	
	public void usarRemoveIf() {
//		Iterator<String> it = lista.iterator();
//		while(it.hasNext()) {
//			if(it.next().equalsIgnoreCase("Arthur")) {
//				it.remove();
//			}
//		}
		
		lista.removeIf(x -> x.equalsIgnoreCase("Arthur"));
	}
	
	public void usarSort() {
		lista.sort((x,y)-> x.compareTo(y));
	}
	
	public void usarSortInverso() {
		lista.sort((x,y)-> y.compareTo(x));
	}

	public static void main(String[] args) {
		CollectionApp app = new CollectionApp();
		app.llenarLista();
//		app.usarRemoveIf();
		app.usarSort();
		app.usarForEach();

	}

}
