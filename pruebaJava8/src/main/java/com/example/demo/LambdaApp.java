package com.example.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LambdaApp {
	
	public void ordenar () {
		List<String> lista = new ArrayList<>();
		lista.add("Persona1");
		lista.add("Arturo");
		lista.add("Jessica");
		
		//JDK < 1.7
//		Collections.sort(lista, new Comparator<String>() {
//
//			@Override
//			public int compare(String o1, String o2) {
//				return o1.compareTo(o2);
//			}
//		});
		
		//Lambda
		Collections.sort(lista, (String p1, String p2) -> p1.compareTo(p2));
		
		for(String elemento: lista) {
			System.out.println(elemento);
		}
		
	}
	
	public void calcular() {
		/**Operacion operacion = new Operacion() {
			
			@Override
			public double calcularPromedio(double n1, double n2) {
				return (n1+n2)/2;
			}
		};
		double resultado = operacion.calcularPromedio(2, 3);*/
		Operacion operacion = (double x, double y) -> (x+y)/2;
		double resultado = operacion.calcularPromedio(2, 3);
		System.out.println(resultado);
	}
	

	public static void main(String[] args) {
		
		LambdaApp app = new LambdaApp();
		//app.ordenar();
		app.calcular();
	}

}
