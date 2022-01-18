package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import io.reactivex.Observable;

public class RxApp {

	private List<Integer> lista1;
	private List<Integer> lista2;
	
	public RxApp() {
		lista1 = new ArrayList<Integer>();
		lista2 = new ArrayList<Integer>();
		this.llenarListas();
		
	}
	
	public void buscar() {
		Observable<Integer> obs1 = Observable.fromIterable(lista1);
		Observable<Integer> obs2 = Observable.fromIterable(lista2);
		
//		Observable.merge(obs1, obs2).filter(numero -> numero == 1).forEach(System.out::println);
		Observable.merge(obs1, obs2).filter(numero -> numero == 1).forEach(numero ->{
			if(numero==1) {
				System.out.println("- "+numero);
			}
		});
	}
	
	private void llenarListas() {
		for(int i=0; i<10; i++) {
			lista1.add(i);
			lista2.add(i);
		}
	}

	public static void main(String[] args) {
		/**List<String> lista = new ArrayList<String>();
		lista.add("Arthur");
		lista.add("Jessica");
		lista.add("Veronica");
		lista.add("Jorge");
		
		Observable<String> obs = Observable.fromIterable(lista);
		obs.subscribe(System.out::println);*/
		
		RxApp app = new RxApp();
		app.buscar();
	}
}
