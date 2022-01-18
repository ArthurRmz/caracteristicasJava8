package com.example.demo;

import java.io.FileReader;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

public class NashApp {
	
	private ScriptEngineManager sem;
	private ScriptEngine se;
	private Invocable invocador;
	
	public NashApp() {
		sem = new ScriptEngineManager();
		se = sem.getEngineByName("nashorn");
		invocador = (Invocable)se;
	}
	
	public void llamarFunciones() throws Exception{
		se.eval("print('Js desde Java')");
	}
	
	public void llamarFuncionesArchivoJs() throws Exception{
		se.eval(new FileReader("src/main/resources/js/archivo.js"));
		String res = (String)invocador.invokeFunction("calcular", "2","3");
		
		System.out.println(res);

		double res1 = (double) invocador.invokeFunction("calcular", 2,3);
		System.out.println(res1);
	}

	public void implementarInterfaz() throws Exception{
		se.eval(new FileReader("src/main/resources/js/archivo.js"));
		Object implementacion = se.get("hiloImpl");
		Runnable r = invocador.getInterface(implementacion, Runnable.class);
		Thread t1 = new Thread(r);
		t1.start();
		
		Thread t2 = new Thread(r);
		t2.start();
	}

	public static void main(String[] args) {
		NashApp app = new NashApp();
		try {
//			app.llamarFunciones();
//			app.llamarFuncionesArchivoJs();
			app.implementarInterfaz();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
