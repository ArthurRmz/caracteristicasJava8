package com.example.demo;

import java.util.Arrays;

import com.example.demo.interfaces.IOperacion;
import com.example.demo.interfaces.IPersona;
import com.example.demo.interfaces.IPersona;

public class MethodRefApp {
	
	public static void referenciarMetodoStatic() {
		System.out.println("Método referido static");
	}
	
	public void operar() {
//		IOperacion op = () -> MethodRefApp.referenciarMetodoStatic();
//		op.saludar();
		
		IOperacion op2 =  MethodRefApp::referenciarMetodoStatic;
		op2.saludar();
	}
	
	public void referenciarMetodoInstanciaObjectoArbitrario() {
		String[] nombres = {"Arthur", "Jessica", "Laura"};
//		Arrays.sort(nombres, new Comparator<String>() {
//
//			@Override
//			public int compare(String o1, String o2) {
//				return o1.compareToIgnoreCase(o2);
//			}
//		});
		
//		Arrays.sort(nombres, (s1,s2)->s1.compareToIgnoreCase(s2));
		Arrays.sort(nombres, String::compareToIgnoreCase);
		System.out.println(Arrays.toString(nombres));
	}
	
	public void referenciarMetodoInstanciaObjectoParticular() {
		System.out.println("Método referido instancia de objeto en particular");
	}
	
	public void referenciarConstructor() {
//		IPersona iper = new IPersona() {
//			
//			@Override
//			public Persona crear(int id, String nombre) {
//				return new Persona(id, nombre);
//			}
//		};
//		iper.crear(1, "Arthur");
		
//		IPersona iper2 = (id, nombre) -> (new Persona(id, nombre));
//		Persona per = iper2.crear(1, "Arthur");
//		System.out.println(per.toString());
		
		IPersona iper3 = Persona::new;
		Persona per = iper3.crear(1, "Arthur");
		System.out.println(per.toString());
	}

	public static void main(String[] args) {
		MethodRefApp app = new MethodRefApp();
//		app.operar();
//		app.referenciarMetodoInstanciaObjectoArbitrario();
//		IOperacion op = app::referenciarMetodoInstanciaObjectoParticular;
//		op.saludar();
		app.referenciarConstructor();
	}
}
